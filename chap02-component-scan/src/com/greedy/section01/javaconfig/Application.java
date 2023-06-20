package com.greedy.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.javaconfig.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {
		
		/* ComponentScan 기능을 이용한 bean 등록 설정을 해 볼 것이다.
		 * ComponentScan 이란
		 * Base-package로 설정된 경로 하위에 특정 어노테이션을 가지고 있는 클래스를 이용하여 Bean으로 등록한다
		 * @Component 어노테이션이 작성된 클래스를 인식하여 bean으로 만들게 되며, 특수 목적에 따라 세부 기능을 제공하는
		 * @Controller, @Service, @Repository, @Configuration등을 인식한다.
		 * 
		 * BeanFactoryPostProcessor의 구현체를 적용하여 bean으로 등록해준다.
		 * 다른 모든 bean들을 만들기 이전에 컴포넌트 스캔을 해서 bean으로 등록해준다.
		 * 참고로 @Autowired는 등록된 다른 bean을 찾아 BeanPostProcessor의 구현체를 적용하여 의존성을 적용한다. (실행 시점이 다름)
		 * 
		 * BeanFactoryPostProcessor : 빈 설정정보를 불러오고 조작하는 것으로 빈 팬토리 후 처리기하고 한다 (빈 설정정보)
		 * BeanPostProcessor : 빈을 원하는 대로 조작할 수 있는 기능을 제공하는 것으로 빈 후처리기라고 한다(객체의 내용을 수정)
		 * 
		 * */
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		for(String string : beanNames) {
			System.out.println(string);
		}
		
		
		MemberDAO memberDAO = context.getBean(MemberDAO.class);
		
		System.out.println(memberDAO.selectMember(1));
		System.out.println(memberDAO.insertMember(new MemberDTO(3,"이순신","남","010-2324-6779")));
		System.out.println(memberDAO.selectMember(3));

	}
}
