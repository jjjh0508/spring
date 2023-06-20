package com.greedy.section01.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application02 {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/section01/xmlconfig/config/spring-context.xml");
		MemberDTO member = context.getBean(MemberDTO.class);
		MemberDTO member2 = context.getBean(MemberDTO.class);
		MemberDTO member3 = context.getBean(MemberDTO.class);
//		MemberDTO member2 = new MemberDTO(1,"홍길동","010-2323-4252","hong1233@gmail.com");
		System.out.println(member);
		System.out.println(member2);
		System.out.println(member3);

		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().deposit(100000));
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().withDraw(5000000));
		System.out.println(member.getPersonalAccount().getBalance());
	}

}
