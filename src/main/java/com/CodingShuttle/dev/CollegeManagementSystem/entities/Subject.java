package com.CodingShuttle.dev.CollegeManagementSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String title;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Professor professor;// Owning Side

    @ManyToMany(mappedBy = "subjects")
    private List<Student> students= new ArrayList<>();
}
