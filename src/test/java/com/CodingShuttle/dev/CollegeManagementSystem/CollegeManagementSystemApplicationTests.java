package com.CodingShuttle.dev.CollegeManagementSystem;

import com.CodingShuttle.dev.CollegeManagementSystem.dto.CStudentInfo;
import com.CodingShuttle.dev.CollegeManagementSystem.reposotories.StudentRepository;
import com.CodingShuttle.dev.CollegeManagementSystem.services.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CollegeManagementSystemApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentRepository studentRepository;

	@Test
	void testStudent(){
		List<CStudentInfo> studentInfos =studentRepository.getStudentInfo();
        for(CStudentInfo studentInfo : studentInfos){
			System.out.println(studentInfo);
		}
	}

}
