package com.greedy.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.javaconfig.config.ContextConfiguration1;

public class Application02 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration1.class);

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
