package com.greedy.section01.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/section01/xmlconfig/config/spring-context1.xml");
		
		
		String[] beanNames= context.getBeanDefinitionNames();
		for (String string : beanNames) {
			System.out.println(string);
		}
		
		MemberDAO memberdao = context.getBean("memberDAO",MemberDAO.class);
		
		System.out.println(memberdao.selectMember(1));
		System.out.println(memberdao.selectMember(2));

		System.out.println(memberdao.insertMember(new MemberDTO(3,"이순신","남","010-2324-6779")));
		System.out.println(memberdao.selectMember(3));
	}

}
