package com.javabykiran.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("execution(* com.javabykiran.service.*(..))")
	public void logServicemetodsBef(ProceedingJoinPoint joinpoint) {
		System.out.println("entering into method  >>>" + joinpoint.getSignature().getName());
	}

	@After("execution(* com.javabykiran.service.*(..))")
	public void logServicemetodsAft(ProceedingJoinPoint joinpoint) {
		System.out.println("exiting into method  >>>" + joinpoint.getSignature().getName());
	}
}
