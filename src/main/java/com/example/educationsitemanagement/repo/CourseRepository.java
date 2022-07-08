package com.example.educationsitemanagement.repo;

import com.example.educationsitemanagement.model.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRepository {

    private List<Course> courses = new ArrayList<>();

    private CourseRepository courseRepository;

    {
        courses.addAll(
                Arrays.asList(
                        new Course("Learn Python: The Complete Python Programming Course",
                                "Learn A-Z everything about Python, from the basics, to advanced topics like Python GUI, Python Data Analysis, and more!",
                                49.99, 1000, 700, 8.5, null),
                        new Course("DevOps Beginners to Advanced | Decoding DevOps with Projects",
                                    "Begin DevOps Career As an Absolute Beginner | Linux, AWS, Scripting, Jenkins, Ansible, Docker, K8s, N-Tier Projects",
                                69.99, 500, 350, 7.8, null),
                        new Course("Google Ads for Beginners",
                                "Learn how to effectively use Google Ads to reach more customers online and grow your business.",
                                129.99, 1500, 1350, 6.8, null),
                        new Course("Learn SQL in 6 days",
                                "Learn SQL and handle databases confidently",
                                39.99, 200, 150, 9.8, null))
        );
    }

}
