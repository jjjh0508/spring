package com.greedy.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;

/* 스프링이 스캐닝으로 인식할 수 있는 컴포너트는 @Component이며, @Configuration도 @Component를 상속받았다.
 *
 * Configuration
 * public class ContextConfiguration{
 * }
 * */

/* 추가로 설정할 것은 없다.
 * 이유는 @Component로 이미 Bean 등록을 완료하였기 때문이다.
 * 
 * */

/* basePackages에 등록 되지  않은 패키지는 스캔에서 제외하고 , 등록된 패키지 내의 @Component 어노테이션을 탐색한다.
 * 이 때 basePackage를 등록하지 않으면 현 설정 클래스가 존재하는 패키지를 자동으로 basePackage로 설정한다.
 * 문자열 배열 형태로 여러 beanPackage를 등록할 수 있다.
 * 
 * */
@ComponentScan(basePackages = "com.greedy.section01.javaconfig") // 정의를 해놨다 읽어와라
public class ContextConfiguration {
	
}
