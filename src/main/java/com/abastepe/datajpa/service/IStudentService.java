package com.abastepe.datajpa.service;

import com.abastepe.datajpa.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void addStudent(Student s);
}
