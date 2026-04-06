package com.CodingShuttle.dev.CollegeManagementSystem.services;

import com.CodingShuttle.dev.CollegeManagementSystem.dto.CStudentInfo;
import com.CodingShuttle.dev.CollegeManagementSystem.entities.Student;
import com.CodingShuttle.dev.CollegeManagementSystem.reposotories.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.beans.Transient;

@Service
public class StudentService {
        private final StudentRepository studentRepository;

        public StudentService(StudentRepository studentRepository) {
                this.studentRepository = studentRepository;
        }
}
