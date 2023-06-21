package com.greedy.section01.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 우선 Pokemon을 구현한 구현체 2개를 먼저 생성하고 에러를 확인한 후 입력한다.
/*@Primary 어노테이션을 설정하면 @Autowired로 동일한 타입의 여러 빈을 찾게 되는 경우 자동연경을 우선시 할 타입을 명시하는 설정이다
 * 동일한 타입(pokemon) 클래스 중 한개만 @Primay 어노테이션 사용이 가능하다.
 * */
public class Pikachu implements Pokemon {

	@Override
	public void attack() {
		System.out.println("피카츄가 전기를 발사한다.~~~~~~");
	}
 
}
