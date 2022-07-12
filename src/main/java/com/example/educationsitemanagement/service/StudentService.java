package com.example.educationsitemanagement.service;

import com.example.educationsitemanagement.model.Student;
import com.example.educationsitemanagement.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // CRUD Operations
    // Business Logic implementations
//    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAll();
    }

    //    @Override
    public Student getStudent(Integer id) {
        return studentRepository.getById(id);
    }

    //    @Override
    public void addStudent(Student airport) {
        studentRepository.create(airport);
    }

    //    @Override
    public Student updateStudent(Integer id, Student student) throws CloneNotSupportedException {
        getStudent(id);
        try {
            return studentRepository.update(student, id);
        } catch (CloneNotSupportedException e) {
            // Need to handle exception or throw it to upper
//            throw new CloneNotSupportedException();
            return null;
        }
    }

    //    @Override
    public boolean deleteStudent(Integer id) {
        // check if its already there or not !
        getStudent(id);
        studentRepository.delete(id);
        return true;
    }


}