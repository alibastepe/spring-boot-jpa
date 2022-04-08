package com.abastepe.datajpa.controller;

import com.abastepe.datajpa.entity.Course;
import com.abastepe.datajpa.entity.Instructor;
import com.abastepe.datajpa.entity.InstructorDetail;
import com.abastepe.datajpa.entity.Student;
import com.abastepe.datajpa.service.IStudentService;
import com.abastepe.datajpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
    private IStudentService studentService;

	@Value("${spring.datasource.url}")
	private String url;

	@GetMapping(value="/{firstName}")
	public List<Student> getStudentsByFirstName(@PathVariable("firstName") String firstName)  {
		Student s = studentService.findByFirstName(firstName).get(0);
		return studentService.findByFirstName(firstName);
	}

	@PostMapping("/addStudent")
	public Student addUser(@RequestBody Student student)  {
		InstructorDetail insDetail = new InstructorDetail();
		insDetail.setMailAddress("a@a.com");
		insDetail.setYoutube_channel("hoca1");

		Instructor ins = new Instructor();
		ins.setFirstName("hoca1");
		ins.setLastName("hoca1");
		ins.setDetail(insDetail);

		insDetail.setInstructor(ins);

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
