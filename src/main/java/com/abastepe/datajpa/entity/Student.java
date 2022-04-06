package com.abastepe.datajpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="enrollment",
                joinColumns = { @JoinColumn (name="student_id")},
                inverseJoinColumns = { @JoinColumn (name="id")})
    private Set<Course> courses;
}
