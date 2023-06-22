package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAttendingAdivce {
	//throwing 속성의 이름 이름과 매개변수의 이름이 동일해야한다
	@AfterThrowing(pointcut = "execution(* com.greedy.section01.advice.annotation..*(..))", throwing = "exception")
	public void afterThrowingAttending(JoinPoint joinPoint, Throwable exception) {
		
		/*조인포인트로 처리할 수 있는 정보는 동일하며, exception이 thorws된 경우 동작한다.*/
		System.out.println("===========after throwing attending=====================");
		System.out.println(exception.getMessage());
		System.out.println("=========================================================");
	}
	
	/* after advice는 throwing이 된 경우에도 정상 동작한다
	 * 다음은 사전, 사후 처리를 하는 AroundAdvice를 만들어보자
	 * */
	
}
