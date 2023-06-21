package com.greedy.section01.collection;

import org.springframework.stereotype.Component;

@Component
public class Pikachu implements Pokemon {

	@Override
	public void attack() {
		System.out.println("피카츄가 전기를 발사한다.~~~~~~");
	}
 
}
