package com.CodingShuttle.dev.CollegeManagementSystem.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String title;


    @ManyToMany(mappedBy = "professors")
    private List<Student> students = new ArrayList<>();

    @OneToMany(mappedBy = "professor")
    private List<Subject> subjects = new ArrayList<>();// Inverse Side
}
