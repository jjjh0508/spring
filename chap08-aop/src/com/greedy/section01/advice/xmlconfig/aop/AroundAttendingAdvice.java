package com.greedy.section01.advice.xmlconfig.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

import com.greedy.section01.advice.xmlconfig.GreedyStudent;

public class AroundAttendingAdvice {
	
	public Object aroundAttending(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("===============around attending before================");
		System.out.println("오늘도 학원에 가서 열심히 공부해야지 라는 마음으로 아침 일찍 일어납니다");
		System.out.println("=======================================");
		
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		
		System.out.println("여기서 before 다음 기존 클래스가 가지고 있는 메소드가 실행 되는거 같다");
		/* 원본 조인포인트를 실행한다. */
		Object result = joinPoint.proceed();
		System.out.println("테스트2");
		
		System.out.println("========around attending after ================");
		
		
		if(joinPoint.getTarget() instanceof GreedyStudent) {
			System.out.println("수업이 끝나도 학원이 닫을 때 까지 끝난게 아닙니다. 자율적으로 스터디 그룹과 함꼐 다시 공부합니다 !!");
		}
		
		
		System.out.println("열심히 공부를 했으니 퇴실 카드를 찍는다.");
		
		stopWatch.stop();
		
		System.out.println("총 공부 소요 시간 : "+stopWatch.getTotalTimeMillis()+"(ms)");
		System.out.println("=====");
		
		
		return result;
	}
		
}
