package com.greedy.section01.filedinjection.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/* @Autowired를 이용한 의존성 주입
		 * 스프링 3.1 이후 버전부터 어노테이션을 사용한 bean 생성 및 의존성 주입을 위한 어노테이션을 제공한다.
		 * 어노테이션 방식을 이용하면 지금까지 본 생성자 주입과 setter 주입 외에 필드 주입을 추가적으로 할 수 있다.
		 * 먼저 필드 주입을 이용한 의존성 주입을 확인해본다.
		 * */
		
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext("com.greedy.section01.filedinjection.javaconfig");
		
		BookService bookService = context.getBean("bookService",BookService.class);
		
		for (BookDTO b : bookService.selectAllBooks()) {
			System.out.println(b);
		}
		
		System.out.println("================================");
		System.out.println(bookService.searchBookBySequence(1));
	}

}
