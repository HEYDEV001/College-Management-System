package com.CodingShuttle.dev.CollegeManagementSystem.reposotories;

import com.CodingShuttle.dev.CollegeManagementSystem.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
