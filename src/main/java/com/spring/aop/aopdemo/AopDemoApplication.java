package com.spring.aop.aopdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.aop.aopdemo.business.StudentService;
import com.spring.aop.aopdemo.business.TeacherBusiness;

@SpringBootApplication
public class AopDemoApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(AopDemoApplication.class);
	
	@Autowired
	StudentService student;
	
	@Autowired
	TeacherBusiness teacher ;
	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(student.getStudent().getDescription());
		log.info(teacher.getTeacher().getDescription());
		
	}

}
