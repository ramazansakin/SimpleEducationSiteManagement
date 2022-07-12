package com.example.educationsitemanagement.model;

public class Course {

    private Integer id;
    private String title;
    private String details;
    private double price;
    private int countOfPeopleBought;
    private int countOfReview;
    private double point;
    private Instructor instructor;

    private static int idSequence = 0;

    public Course() {
    }

    public Course(String title, String details, double price,
                  int countOfPeopleBought, int countOfReview, double point, Instructor instructor) {
        this.id = ++idSequence;
        this.title = title;
        this.details = details;
        this.price = price;
        this.countOfPeopleBought = countOfPeopleBought;
        this.countOfReview = countOfReview;
        this.point = point;
        this.instructor = instructor;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCountOfPeopleBought() {
        return countOfPeopleBought;
    }

    public void setCountOfPeopleBought(int countOfPeopleBought) {
        this.countOfPeopleBought = countOfPeopleBought;
    }

    public int getCountOfReview() {
        return countOfReview;
    }

    public void setCountOfReview(int countOfReview) {
        this.countOfReview = countOfReview;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }


    // Later
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", headline='" + title + '\'' +
                ", details='" + details + '\'' +
                ", price=" + price +
                ", countOfPeopleBought=" + countOfPeopleBought +
                ", countOfReview=" + countOfReview +
                ", point=" + point +
                ", instructor=" + instructor +
                '}';
    }
}
