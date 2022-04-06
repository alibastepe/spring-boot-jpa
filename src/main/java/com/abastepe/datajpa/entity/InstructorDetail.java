package com.abastepe.datajpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="instructor_detail")
@Getter
@Setter
@NoArgsConstructor
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="mail_address", nullable = false)
    private String mailAddress;

    @Column(name="youtube_channel", nullable = false)
    private String youtube_channel;

    @OneToOne(mappedBy = "detail")
    private Instructor instructor;
}
