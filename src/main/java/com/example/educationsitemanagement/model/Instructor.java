package com.example.educationsitemanagement.model;

import java.util.List;

public class Instructor {

    private Integer id;
    private String name;
    private String surname;
    private String about;
    private double generalScore;
    // sub Lists differentiations
    private List<Course> courses;

    private static int idSequence = 0;

    public Instructor() {
    }

    public Instructor(String name, String surname, String about, double generalScore, List<Course> courses) {
        this.id = ++idSequence;
        this.name = name;
        this.surname = surname;
        this.about = about;
        this.generalScore = generalScore;
        this.courses = courses;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public double getGeneralScore() {
        return generalScore;
    }

    public void setGeneralScore(double generalScore) {
        this.generalScore = generalScore;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
