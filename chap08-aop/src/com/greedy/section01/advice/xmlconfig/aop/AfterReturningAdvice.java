package com.greedy.section01.advice.xmlconfig.aop;

import org.aspectj.lang.JoinPoint;

import com.greedy.section01.advice.xmlconfig.AchievementResult;

public class AfterReturningAdvice {
	public void afterReturningAttending(JoinPoint joinPoint, Object result) {
		System.out.println("=========after returning attending=========");
		System.out.println("보람찬 하루를 마무리하고 취침 ~~~~");
		System.out.println("오늘의 이해도 : "+((AchievementResult)result).getUnderstandingScore());
		System.out.println("오늘의 만족도  : "+((AchievementResult)result).getSatisfactionScore());
		
		
		double employeementRate = ((AchievementResult)result).getEmployeementRate();
		double percent = employeementRate /1000.0 *100;
		System.out.println("증가된 취업율 : "+percent +"%");
		
		
		((AchievementResult)result).setEmployeementRate(percent);
		System.out.println("====================================");
		
		//after throwing
	}
}
