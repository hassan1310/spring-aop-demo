package com.spring.aop.aopdemo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.aopdemo.data.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	StudentDao student;

	public StudentDao getStudent() {
		return student;
	}

	public void setStudent(StudentDao student) {
		this.student = student;
	}

}
