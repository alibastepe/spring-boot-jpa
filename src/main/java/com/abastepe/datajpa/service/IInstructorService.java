package com.abastepe.datajpa.service;

import com.abastepe.datajpa.entity.Instructor;

import java.util.List;

public interface IInstructorService {
    List<Instructor> getAllInstructors();
    List<Instructor> getAllInstructorsSorted();
    void deleteAllByFirstName(String firstName);
    Instructor addInstructor(Instructor ins);
}
