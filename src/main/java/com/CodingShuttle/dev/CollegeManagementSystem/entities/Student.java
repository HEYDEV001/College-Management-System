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
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String name;

    @ManyToMany
    private List<Subject> subjects   = new ArrayList<>();

    @ManyToMany
    private List<Professor> professors = new ArrayList<>();

    @OneToOne(mappedBy = "student")
    private AdmissionRecord admissionRecord;// Inverse Side
}
