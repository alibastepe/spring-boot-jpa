package com.abastepe.datajpa.service;

import com.abastepe.datajpa.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    List<Student> findByFirstName(String firstName);
    void addStudent(Student s);
}
