package com.greedy.section01.advice.annotation.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.greedy.section01.advice.annotation.GreedyStudent;

@Aspect
@Component
public class AroundAttendingAdvice {
	/* Around advice는 가장 강력한 어드바이스이다
	 * 이 어드바이스는 조인 포인트르 완전히 장학 하기 떄문에
	 * 앞에 살펴본 어드바이스 모두 Around 어드바이스로 조합할 수 있다
	 * 심지어 원본 조인포인트를 전저 실행할지 실핼자체를 안할지, 계속 실행하지 여부까지도 제어한다.
	 * AroundAdvice의 조인포인트 매개변수는 Processdingjoinpioint로 고정되어있다.
	 * joinpoint의 하위 인터페이스로 원본 조인포인트의 진행 시점을 제어할 수있다.
	 * 조인포인트 진행하는 호출을 잊는 경우가 자주 발생하기 떄문에 주의해야 하며
	 * 푀소한의 요건을 충족하면서도 가장 기능이 약한 어드바이스를 쓰는게 가장 바람직하다.
	 * 
	 * */
	@Around("execution(* com.greedy.section01.advice.annotation..*(..))")
	//동일한 클래스 내에서 사용하는 것이면 클래스명은 생략 가능하다. 단 패키지가 다르면 패키지를 포함한 클래스 명을 기술해야한다.
//	@Around("AroundAttendingAdvice.studentAroundPointcut")
	public Object aroundAttending(ProceedingJoinPoint joinPoint) throws Throwable {
		
		/*조인포인트로 처리할 수 있는 정보는 동일하며, exception이 thorws된 경우에 동작한다.*/
		System.out.println("==========around attending before======");
		System.out.println("오늘도 학원에서 열심히 공부해야지 마음을 먹습니다.");
		System.out.println("-===================================");
		
		/*공부 시간을 체크하기 위해 스탑워치를 켠다*/
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		//원본 조인포인트르 실행한다.
		Object result = joinPoint.proceed();
		
		
		System.out.println("===========================around attending after============================");
		
		//만약 Greedy 학생이면 학원 문이 닫을 때 까지 열심히 스터디를 합니다.
		if(joinPoint.getTarget() instanceof GreedyStudent) {
			System.out.println("수업이 끝나도 학원이 닫을 때 까지 끝난게 아닙니다. \n 자율적으로 스터디를 합니다.");
		}
		
		System.out.println("열심히 공부했으니 퇴실카드를 찍습니다.");
		
		//퇴실 카드를 찍고 스탑워치를 종료한다
		stopWatch.stop();
		//메소드 수행시간을 확인하는 용도로도 사용할 수 있다.
		System.out.println("총 공부 소요시간 : " + stopWatch.getTotalTimeMillis()+"(ms)");
		System.out.println("=======================================================");
		//원본 조인포인트를 호출한 쪽 혹은 다른 어드바이스가 다시 실행할 수 있 도록 반환한다.
		return result;
	}
	
	/* 지금까지 포인트컷을 사용할때 하나하나 다 작성을 해줬다.
	 * 그러나 @pointcut을 이용하면 포인트컷만 따로 정의해 여러 어드바이스에서 재사용할 수있다.
	 * 포인트 컷과 애플리케이션 로직이 뒤섞이는 것은 바람직하지 않기 떄문이다.
	 * 메소드 바디를 비운 포인트컷의 젭근제한자를 통해 포인트컷 사용 범위즐 지정한다.
	 * 이렇게 선언한 포인트 컷은 다른 어드바이스가 메소드명으로 참조한다
	 * 
	 * */
	//포인트 컷은 void형 메소드로 작성하고 표현식을 작성한 뒤 메소드 이름이 포인트컷의 이름이 된다.
	@Pointcut("execution(* com.greedy.section01.advice.annotation..*(..))")
	private void studentAroundPointcut() {}
	
	/* 이번에는 포인트컷을 다른 클래스에 작성하고 적용하는 것을 해 볼 것이다.
	 * StdudentPointcut 클래스를 만들어보자
	 * */
	
}
