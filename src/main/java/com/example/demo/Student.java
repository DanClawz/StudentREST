package com.example.demo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    String firstname, lastname, birthdate, grades;

    public Student(String firstname, String lastname, String birthdate, String grades) {

        this.birthdate = birthdate;
        this.firstname = firstname;
        this.lastname = lastname;
        this.grades = grades;
    }

    public int age() {
        LocalDate today = LocalDate.now();
        LocalDate stAge = LocalDate.parse(birthdate);
        return today.getYear() - stAge.getYear() + ((today.getDayOfYear() >= stAge.getDayOfYear()) ? 1 : 0 );
    }

    public float avg_grade() {
        int grade = 0, n = 0;
        List<String> intGrades = Arrays.asList(grades.split(", "));

        do grade += Integer.parseInt(intGrades.get(n++));
        while (n < intGrades.size());

        return grade / n;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getGrades() {
        return grades;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }



    /*public String getStudent() {
        return String.format("Nome: %s %s<br>Anno nascita: %s<br>Voti: %s<br><br>", firstname, lastname, birthdate, grades);
    }*/
}