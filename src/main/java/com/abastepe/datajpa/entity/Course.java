package com.abastepe.datajpa.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="course")
@Getter @Setter @NoArgsConstructor
public class Course {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(name="course_name", nullable = false)
	private String courseName;

	@Column(name="course_rating")
	private double rating;

	@ManyToOne
	@JoinColumn(name="instructor_id", referencedColumnName = "id", nullable=false)
	private Instructor instructor;

	@ManyToMany(mappedBy = "courses")
	private Set<Student> students;

}
