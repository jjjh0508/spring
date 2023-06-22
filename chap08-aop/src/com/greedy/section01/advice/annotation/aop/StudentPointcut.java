package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.annotation.Pointcut;

public class StudentPointcut {
	/* 다른 클래스에서 사용 가능하도록 포인트컷 메소드를 public으로 선언한다
	 * Aspectj 포인트컷 언어를 자세히 알고 싶으면 www.ecilpse.org/aspectj에서 확인한다
	 * 
	 * 포인트컷의 가장 일반적인 모습은 시그니처를 기준으로 여러메소드를 매치하는 것이다.
	 * 맨 앞의 와일드 카드는 접근 제한자와 반환형이 상관 없다는 뜻이다.
	 * *는 모든것을 뜻한다.
	 * (..)은 매개변수의 타입과 갯수에 상관 없이 매치하겠다는 뜻이다.
	 * 
	 * 
	 * */
	@Pointcut("execution(* com.greedy.section01.advice.annotation..*(..))")
	public void studyPointcut() {}
	//처음 작성한 beforeAttendingAdvice를 수정해서 확인해보자
	
}
