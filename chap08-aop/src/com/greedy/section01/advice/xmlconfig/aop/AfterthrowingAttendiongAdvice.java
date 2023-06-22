package com.greedy.section01.advice.xmlconfig.aop;

import org.aspectj.lang.JoinPoint;

public class AfterthrowingAttendiongAdvice {
	public void afterThrowingAttending(JoinPoint joinPoint, Throwable exception) {
		System.out.println("=====================after throwing attending==============");
		System.out.println(exception.getMessage());
		System.out.println("============================================================");
		
		
		
		//Around Advice
	}
}
