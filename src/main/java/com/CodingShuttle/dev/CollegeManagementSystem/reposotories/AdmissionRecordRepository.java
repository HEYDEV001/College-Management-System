package com.CodingShuttle.dev.CollegeManagementSystem.reposotories;

import com.CodingShuttle.dev.CollegeManagementSystem.entities.AdmissionRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionRecordRepository extends JpaRepository<AdmissionRecord, Long> {
}
