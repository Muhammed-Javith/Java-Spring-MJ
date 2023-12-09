package com.app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	@Pointcut("execution(public * sh*(..))") // joinpoint
	public void point1() {

	}

	@Before("point1()")
	public void showLog() {
		System.out.println("I m from Before Advice()");
	}

}