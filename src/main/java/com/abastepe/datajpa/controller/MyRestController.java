package com.abastepe.datajpa.controller;

import com.abastepe.datajpa.entity.Course;
import com.abastepe.datajpa.entity.Instructor;
import com.abastepe.datajpa.entity.InstructorDetail;
import com.abastepe.datajpa.entity.Student;
import com.abastepe.datajpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {
	@Autowired
    private StudentService studentService;

	@Value("${spring.datasource.url}")
	private String url;

	@PostMapping("/addStudent")
	public Student addUser(@RequestBody Student student)  {
		InstructorDetail insDetail = new InstructorDetail();
		insDetail.setMailAddress("a@a.com");
		insDetail.setYoutube_channel("hoca1");

		Instructor ins = new Instructor();
		ins.setFirstName("hoca1");
		ins.setLastName("hoca1");
		ins.setDetail(insDetail);

		Course myCourse = new Course();
		myCourse.setCourseName("JAva101");
		myCourse.setRating(3.2);
		myCourse.setInstructor(ins);

		student.addCourse(myCourse);
		studentService.addStudent(student);
		return student;
	}

	@PostMapping
	public Instructor addInstructor(@RequestBody Instructor instructor)  {
		return instructor;
	}



/*	@GetMapping("/getCourse/{id}")
	public Course getCourse(@PathVariable(name = "id") String courseId)  {
		return repo.findById(Integer.valueOf(courseId)).get();

	}*/

}
