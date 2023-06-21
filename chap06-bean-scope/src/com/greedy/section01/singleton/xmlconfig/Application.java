package com.greedy.section01.singleton.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		//xml 방식의 bean의 scope설정의 대하여 알아본다
		ApplicationContext context = 
				new GenericXmlApplicationContext("com/greedy/section01/singleton/xmlconfig/config/spring-context.xml");
		

		
		/* 현재 빈 구성은 singleton으로 설정 되어 있다 (기본값)
		 * singleton은 IoC 컨테이너당 하나의 인스턴스만 생성한다.
		 * 
		 * 스프링의 빈 스코프
		 * Singleton    IoC 컨테이너당 하나의 인스턴스만 생성한다.
		 * Prototype   요청할 때마다 빈 인스턴스를 새로 생성한다.
		 * requst      HTTP 요청당 하나의 빈 인스턴스를 생성한다. 웹 애플리케이션 컨텍스트에만 해당된다.
		 * session      HTTP 세션당 하나의 빈 인스턴스를 생성한다. 웹 애플리케이션 컨텍스트에만 해당된다.   
		 * globalSession  전역 HTTP 세션당 빈 인스턴스를 하나 생성한다. 포털 애플리케이션 컨텍스트에만 해당된다.
		 * 
		 * 
		 * 여기서 확인해볼 내용은 손님 두명이 각각 카드를 이용해 상품을 담았을 때
		 * Singleton으로 관리되는 cart는 두손님이 동일한 카드에 물건을 담게된다
		 * */
		
		Product carpBread = context.getBean("carpBread", Bread.class);
		Product milk = context.getBean("milk", Beverage.class);
		Product water = context.getBean("water", Beverage.class);
		
		Shoopingcard minyoung = context.getBean("cart" ,Shoopingcard.class);
		
	
		minyoung.addItem(milk);
		minyoung.addItem(carpBread);
		minyoung.addItem(carpBread);
		
		System.out.println("minyoung cart : ");
		minyoung.getItems();
		
		
		Shoopingcard jihwan = context.getBean("cart" ,Shoopingcard.class);
		
		
		jihwan.addItem(water);
		jihwan.addItem(carpBread);

		System.out.println("pay~~~~:");
		jihwan.getItems();
		

		
		
	}

}
