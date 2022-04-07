package com.abastepe.datajpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;



    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="enrollment",
                joinColumns = { @JoinColumn (name="student_id")},
                inverseJoinColumns = { @JoinColumn (name="course_id")})
    private List<Course> courses;

    public void addCourse(Course c) {
        if(courses ==  null) {
            courses = new ArrayList<>();
        }
        courses.add(c);
    }

}
