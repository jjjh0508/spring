package com.greedy.section01.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		/* 우선 IOC 컨테이너라 불리는 존재의 최상위 인터페이스인 bean factory부터 살펴볼 것이다.
		 * BeanFactory 란?
		 * 스프링 컨테이너의 최상위 컨테이너이며, ApplicatrionContext와 함께 스프링 컨테이너라고 한다.
		 * Bean의 생성과 설정, 관리 등의 역할을 맡고 있다.
		 * 
		 * */
	
		ApplicationContext context = 
				new GenericXmlApplicationContext("com/greedy/section01/xmlconfig/spring-context.xml");
		
		/* MemberDTO 클래스를 만들어서 BeanFactory에 설정 정보를 이용하여 인스턴스를 생성하고 사용하는 예제를 만들었다.
		 * 
		 */
		MemberDTO member  = context.getBean("member", MemberDTO.class);
		MemberDTO member2 = context.getBean("member", MemberDTO.class);
		//스프링의 BeanFactory를 사용하지 않을때
		MemberDTO member3 = new MemberDTO(1,"이름","기본주소임","상세주소임",20,'W');
		MemberDTO member4 = new MemberDTO(1,"이름","기본주소임","상세주소임",20,'W');
		MemberDTO member5 = member4;
		
		//두 인스턴스가 동일한 주소값을 같고 있으며 이는 싱글톤 패턴이다.
		System.out.println(member);
		System.out.println("member1 : "+member.hashCode());
		System.out.println("member2 : "+member2.hashCode());
		System.out.println("member3 : "+member3.hashCode());
		
		System.out.println("====================");
		System.out.println(member==member2); //싱글톤 패턴
		System.out.println(member3==member4);
		System.out.println(member==member3);
		

	}

}
