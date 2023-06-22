package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.greedy.section01.advice.annotation.AchievementResult;

@Aspect
@Component
public class AfterReturingAttendingAdivce {
	
	
	/* returning 속성은 리턴값으로 받아올 오브젝트의 매개변수 이름과 동일해야한다.
	 * 또한 joinpoint는 반드시 첫 번쨰 매개변수로 선언해야한다.
	 * 
	 * */
	
	
		@AfterReturning(pointcut = "execution(* com.greedy.section01.advice.annotation..*(..))" , returning = "result")
		public void afterReturingAttendingAdivce(JoinPoint joinPoint, Object result) {
			
			/*조인포인트로 처리할 수 있는 정보는 동일하며, after advice보다 먼저 동작한다.*/
			System.out.println("=================after returning attending=============");
			System.out.println("보람찬 하루를 마무리 하고 취침~!~~");
			System.out.println("오늘의 이해도 : "+(((AchievementResult)result).getUderstandingScore()));
			System.out.println("오늘의 만족도 : "+(((AchievementResult)result).getSatisfactionScore()));
			
			/*취업율 수치를 백분율로 환산해서 퍼센트로 변환해보자. 1000점 만점이다.*/
			double emplyeementRate = ((AchievementResult)result).getEmployeementRate();
			double percent = emplyeementRate/ 1000.0*100;
			System.out.println("증가된 취업율  : " +percent+"%");
		
			
			/*리턴할 결곽밧을 변경해 줄 수 도 있다.*/
			((AchievementResult)result).setEmployeementRate(percent);
			System.out.println("=====================================");
		
			
			
		}
}
