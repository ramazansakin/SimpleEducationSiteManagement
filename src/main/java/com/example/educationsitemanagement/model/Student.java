package com.example.educationsitemanagement.model;

import java.util.List;

public class Student implements Cloneable {

    private Integer id;
    private String name;
    private String surname;
    private String about;
    private List<Course> courses;

    private static int idSequence = 0;

    public Student() {
    }

    public Student(String name, String surname, String about, List<Course> courses, boolean idCreated) {
        if (idCreated) {
            this.id = ++idSequence;
        }
        this.name = name;
        this.surname = surname;
        this.about = about;
        this.courses = courses;
    }

    // Copy Constructor
    // Shallow Copy / Deep Copy
    public Student(Student student) {
        this.name = student.getName();
        this.surname = student.getSurname();
        this.about = student.getAbout();
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

    // Can be used as Set
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    // Later
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", about='" + about + '\'' +
                ", courses=" + courses +
                '}';
    }
}
