package com.greedy.section01.advice.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.advice.annotation");
		

		
		Student normalStuduent = context.getBean("normalStudent", Student.class);
		AchievementResult normalResult = normalStuduent.study(new Passion(10));
		System.out.println("===============Normal Student==================");
		
		System.out.println("Nomal Student Result : "+ normalResult);
		
		
		Student greedyStudent = context.getBean("greedyStudent", Student.class);
		System.out.println("==============greeny Student=======");
		AchievementResult greedyResult = greedyStudent.study(new Passion(10));
		System.out.println("GreedyStudent R esult: "+greedyResult);
		
	}

}
