package com.example.educationsitemanagement.service;

import com.example.educationsitemanagement.model.Course;
import com.example.educationsitemanagement.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course getCourseById(Integer id) {
        List<Course> allCourses = courseRepository.getAllCourses();

        // for i
        for (int i = 0; i < allCourses.size(); ++i) {
            if (allCourses.get(i).getId().equals(id)) {
                return allCourses.get(i);
            }
        }

        // enhanced for loop
        for (Course course : allCourses){
            if(course.getId().equals(id))
                return course;
        }

        // stream
        Optional<Course> first = allCourses.stream().filter(course -> course.getId().equals(id)).findFirst();

        return null;
    }

}
