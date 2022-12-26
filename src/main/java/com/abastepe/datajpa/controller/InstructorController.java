package com.abastepe.datajpa.controller;

import com.abastepe.datajpa.entity.Instructor;
import com.abastepe.datajpa.service.IInstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
    @Autowired
    private IInstructorService instructorService;

    @GetMapping("/")
    public List<Instructor> getAllInstructors()  {
        return instructorService.getAllInstructors();
    }

    @GetMapping("/sorted")
    public List<Instructor> getInstructorsSorted()  {
        return instructorService.getAllInstructorsSorted();
    }

    @PostMapping("/addInstructor")
    public Instructor addInstructor(@RequestBody Instructor instructor)  {
        return instructorService.addInstructor(instructor);
    }

    @DeleteMapping(value="/delete/{firstName}")
    public void deleteAllByFirstName(@PathVariable("firstName") String firstName)  {
        instructorService.deleteAllByFirstName(firstName);
    }




}
