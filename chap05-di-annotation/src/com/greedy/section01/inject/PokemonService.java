package com.greedy.section01.inject;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

	// Named를 이용한 의존성 주입
//	@Inject 
//	@Named("charmander")
//	@Qualifier("charmander")
//	private Pokemon pokemon; 
//	
//	public PokemonService(Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
//	
//	
//	public void pokemonAttack() {
//		this.pokemon.attack();
//	}

	// 생성자를 이용한 주입 방법
//	private Pokemon pokemon;
//	@Inject
//	@Named("charmander")
//	public PokemonService(Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
//
//	public void pokemonAttack() {
//		this.pokemon.attack();
//	}
	
	private Pokemon pokemon;
	@Inject // 파라미터 레벨에서 적용하기
	public PokemonService(@Named("charmander") Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public void pokemonAttack() {
		this.pokemon.attack();
	}
}
