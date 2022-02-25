package com.spring.aop.aopdemo.data;

import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao {

	public String getDescription() {
		return "TeacherDao";
	}
}
