package com.abastepe.datajpa.repository;

import com.abastepe.datajpa.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
    List<Instructor> findByOrderByFirstNameDesc();
    void deleteByFirstName(String firstName);
}
