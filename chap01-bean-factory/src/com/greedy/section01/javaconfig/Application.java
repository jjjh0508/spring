package com.greedy.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.greedy.section01.xmlconfig.MemberDTO;

public class Application {

	public static void main(String[] args) {
		/* xml 설정한 것과 동일하게 진행 할 것이다.
		 * 
		 */
		/*@Configuration 어노테이션이 달린 설정 클래스의 메타정보를 전달하여 인스턴스를 생성한다.*/
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		/*container 를 생성하는 구현체만 다르고 사용하는 방법은 동일하다.
		 * 이 상태로 실행하면 에러가 발생하는데 Annotation을 이용하는 방식은 대상 클래스의 요청을 가로채 처리하는 aop 기능을 이용한 것이기 때문이다.
		 * aop 모듈은 buildpath에 추가해준다.
		 */
		MemberDTO member = context.getBean("getMember", MemberDTO.class);
		System.out.println(member);
	}

}
