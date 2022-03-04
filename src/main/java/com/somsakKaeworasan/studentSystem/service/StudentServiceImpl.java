package com.somsakKaeworasan.studentSystem.service;

import com.somsakKaeworasan.studentSystem.model.Student;
import com.somsakKaeworasan.studentSystem.ropository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}
