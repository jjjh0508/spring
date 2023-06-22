package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.greedy.section01.advice.annotation.Passion;

@Aspect
@Component
public class AfterAttendingAdvice {
	/* after 의 경우 조금더 세분화 하여 afterReturning 과 afterThrowing으로 처리할 수 있다.
	 * 성공적으로 반환 한 경우 Exception이 던져진 경우 요청을 가로채 후 처리할 때 사용한다
	 * */
	@After("execution(* com.greedy.section01.advice.annotation..*(..))")
	public void afterAttending(JoinPoint joinPoint) {
		System.out.println("====================after attending====================");
		System.out.println("내일도 학원에서 열심히 공부한다는 마인드로 잠자리에 든다");
		System.out.println("수강생의 타입 : "+joinPoint.getTarget().getClass());  //타겟 클래스의 정보
		System.out.println("수강생의 행위 : "+joinPoint.getSignature());         // 리턴타입을 포함한 시그니처
		System.out.println("행위 요약 : " +joinPoint.getSignature().getName()); // 메소드의 이름만 반환
		System.out.println("수강생의 열정 : "+((Passion)joinPoint.getArgs()[0]).getScore());
		System.out.println("====================================================");
	}
	
	/*after의 경우 조금 더 세분화 하여 afterRetuning과 afterThrowing으로 처리할 수 있다.
	 * 성공적으로 반환한 경우 exception이 던져진 경우 요청을 가로채 후처리를 할 때 사용한다.
	 * 
	 * 먼저 afterReturning을 보자
	 * */
}
