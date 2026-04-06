package com.CodingShuttle.dev.CollegeManagementSystem.reposotories;

import com.CodingShuttle.dev.CollegeManagementSystem.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
