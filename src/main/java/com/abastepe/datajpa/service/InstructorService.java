package com.abastepe.datajpa.service;

import com.abastepe.datajpa.entity.Instructor;
import com.abastepe.datajpa.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService implements  IInstructorService {
    @Autowired
    InstructorRepository insRepo;

    @Override
    public List<Instructor> getAllInstructors() {
        return insRepo.findAll();
    }

    @Override
    public List<Instructor> getAllInstructorsSorted() {
        return insRepo.findByOrderByFirstNameDesc();
    }

    @Override
    public void deleteAllByFirstName(String firstName) {

        insRepo.delete( insRepo.findByOrderByFirstNameDesc().get(1));
    }

    @Override
    public Instructor addInstructor(Instructor ins) {
        return insRepo.save(ins);
    }
}
