package com.greedy.section01.singleton.javaconfig.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.greedy.section01.singleton.javaconfig.Beverage;
import com.greedy.section01.singleton.javaconfig.Bread;
import com.greedy.section01.singleton.javaconfig.Product;
import com.greedy.section01.singleton.javaconfig.Shoopingcard;

@Configuration
public class ContextConfiguration {

	@Bean
	public Product carpBread() {
		return new Bread("붕어빵",700, 45);
	}
	
	@Bean
	public Product milk() {
		return new Beverage("바나나 우유",1300,300);
	}
	
	@Bean
	public Product water() {
		return new Beverage("삼다수",1000,1000);
		
	}
	
	@Bean
	@Scope("prototype") //요청시마다 인스턴스를 생성
	//@Scope("singleton") // 하나의 인스턴스 사용
	public Shoopingcard cart() {
		return new Shoopingcard();
	}
}
