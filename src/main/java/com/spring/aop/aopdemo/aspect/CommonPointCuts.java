package com.spring.aop.aopdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCuts {
	
	@Pointcut("execution(* com.spring.aop.aopdemo.business..*.* (..))")
	public void BusinessLayerExecution() {}

}
