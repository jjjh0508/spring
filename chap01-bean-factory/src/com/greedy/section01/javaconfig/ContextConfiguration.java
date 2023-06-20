package com.greedy.section01.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.greedy.section01.xmlconfig.MemberDTO;
/* 이 클래스가 설정 메타 정보를 가지고 있다는 의미를 가진 어노테이션을 추가한다.
 * 컨테이너를 생성할 시 해당 어노테이션이 달린 클래스를 먼저 인식하여 컨테이너를 생성한다.
 * 
 * 
 * */
@Configuration
public class ContextConfiguration {
	/* bean을 등록하기 위해서는 @bean 어노테이션을 이용하며
	 * @Bean(name="bean의 이름")을 해도 되지만 name은 필수 값이 아니며
	 * name을 생략하는 경우 메소드 명이 bean의 이름이 된다.
	 * */
	@Bean //(name = "memberDTO") name은 필수값이 아니다
	public MemberDTO getMember() {
		return new MemberDTO(1,"자바이름","자바 기본주소","자바 상세주소",20,'M');
	}
}
