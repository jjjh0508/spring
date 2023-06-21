package com.greedy.section01.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		
		/* Inject 어노테이션을 이용한 방법*/
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.inject");
		
		PokemonService pokemonService =  context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
		
	
	}

}
