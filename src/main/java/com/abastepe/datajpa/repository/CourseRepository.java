package com.abastepe.datajpa.repository;

import com.abastepe.datajpa.entity.Course;
import com.abastepe.datajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
