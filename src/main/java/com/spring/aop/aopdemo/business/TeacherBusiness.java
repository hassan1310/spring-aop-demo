package com.spring.aop.aopdemo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.aopdemo.data.TeacherDao;

@Service
public class TeacherBusiness {

	@Autowired
	private TeacherDao teacher;

	public TeacherDao getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherDao teacher) {
		this.teacher = teacher;
	}
}
