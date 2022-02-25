package com.spring.aop.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.spring.aop.aopdemo.AopDemoApplication;

@Configuration
@Aspect
public class CheckUserAccess {
	
	private Logger log = LoggerFactory.getLogger(AopDemoApplication.class);

	
	@Before("com.spring.aop.aopdemo.aspect.CommonPointCuts.BusinessLayerExecution()" )
	public void checkDBAccess(JoinPoint joinPoint) {
		log.info("Check user  ");
		log.info("Allowed execution for {}", joinPoint);
	}
	
	@AfterReturning(value="com.spring.aop.aopdemo.aspect.CommonPointCuts.BusinessLayerExecution()",returning ="result" )
	public void checkRseturn(JoinPoint joinPoint,Object result) {
		
		log.info("This is after return {}", joinPoint ,result);
	}

}
