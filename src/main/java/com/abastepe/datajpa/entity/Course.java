package com.abastepe.datajpa.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="course")
@Getter @Setter @NoArgsConstructor
public class Course {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer course_id;

	@Column(name="course_name", nullable = false)
	private String courseName;

	@Column(name="course_rating")
	private double rating;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="instructor_id", referencedColumnName = "id", nullable=false)
	@JsonIgnore
	private Instructor instructor;

	@ManyToMany(mappedBy = "courses", cascade = CascadeType.ALL)
	private List<Student> students;

	public void addStudent(Student s)  {
		if(students == null) {
			students = new ArrayList<>();
		}
		students.add(s);

	}

}
