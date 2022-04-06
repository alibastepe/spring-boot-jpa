package com.abastepe.datajpa.controller;

import com.abastepe.datajpa.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {
	/*@Autowired
    private CourseRepository repo;
	*/
	@Value("${spring.datasource.url}")
	private String url;

	/*@PostMapping("/addCourse")
	public Course addUser(@RequestBody Course course)  {
		repo.save(course);

		return course;
	}*/

/*	@GetMapping("/getCourse/{id}")
	public Course getCourse(@PathVariable(name = "id") String courseId)  {
		return repo.findById(Integer.valueOf(courseId)).get();

	}*/

}
