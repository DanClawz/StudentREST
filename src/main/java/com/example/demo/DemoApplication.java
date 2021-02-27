package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class DemoApplication {
    ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/student")
    public ArrayList<Student> getStudent(@RequestParam(value="showAll", defaultValue = "true") boolean showAll) {
        return students;
    }

    @PostMapping("/student")
    public ArrayList<Student> addStudent(@RequestBody Student s) {
        students.add(s);
        System.out.println(s.firstname + " " + s.lastname);
        return students;
    }

}
