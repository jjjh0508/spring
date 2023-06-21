package com.greedy.section01.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		
		/* 여러개의 bean의 등록해서 사용하는 경우*/
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.collection");
		
		PokemonService pokemonService =  context.getBean("pokemonService", PokemonService.class);
		
//		pokemonService.pokemonAttack();
		pokemonService.pokemonAttack2();
	
	}

}
