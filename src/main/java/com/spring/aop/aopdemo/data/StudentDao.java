package com.spring.aop.aopdemo.data;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	public String getDescription() {
		return "StudentDao";
	}

}
