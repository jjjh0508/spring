package com.greedy.section01.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
	
	private Pokemon pokemon;
	
	//생성자 주입
	@Autowired /*@Primary로 우선권을 지정한 것 보다 더 우선권을 갖는다.*/ 
	public PokemonService(@Qualifier("charmander") Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
//	@Autowired
//	@Qualifier("pikachu")
//	public void setPokemon(@Qualifier("pikachu") Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}
}
