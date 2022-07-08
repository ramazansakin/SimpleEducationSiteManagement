package com.example.educationsitemanagement.repo;

import com.example.educationsitemanagement.model.Instructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstructorRepository {

    private List<Instructor> instructorList = new ArrayList<>();

    {
        instructorList.addAll(
                Arrays.asList(
                        new Instructor("John", "Anthony", "Im Python Instructor , 40 years-old, bla-bla", 7.8, null),
                        new Instructor("Amarnath Reddy", "Doe", "Im Java Instructor , 29 years-old, bla-bla", 7.8, null),
                        new Instructor("Rahul", "Shetty", "Im Golang Instructor , 38 years-old, bla-bla", 7.8, null),
                        new Instructor("Travis", "Cuzick", "Im UX/UI Instructor , 32 years-old, bla-bla", 7.8, null)
                )
        );
    }


}
