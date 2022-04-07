package com.abastepe.datajpa.service;

import com.abastepe.datajpa.entity.Student;
import com.abastepe.datajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    public StudentRepository studentRepo;

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public void addStudent(Student s) {
        studentRepo.save(s);
    }


}
