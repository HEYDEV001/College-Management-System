package com.CodingShuttle.dev.CollegeManagementSystem.reposotories;

import com.CodingShuttle.dev.CollegeManagementSystem.dto.CStudentInfo;
import com.CodingShuttle.dev.CollegeManagementSystem.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select new com.CodingShuttle.dev.CollegeManagementSystem.dto.CStudentInfo(s.id , s.name ) from Student s")
    List<CStudentInfo> getStudentInfo() ;
}
