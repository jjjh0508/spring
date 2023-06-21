package com.greedy.section01.resource;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
	/* pokemon type의 빈이 여러개인 경우 아래와 같이 명시해준다*/
//	@Resource(name = "charmander")
//	private Pokemon pokemon;
	
//	@Autowired
//	public PokemonService(Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
//	
//	public void pokemonAttack() {
//		pokemon.attack();
//	}
	
/*	//동일 타입이 여러개인 bean을 사용하는 경우
	@Resource
	private List<Pokemon> pokemonList;
	
	
	public PokemonService(List<Pokemon> pokemonList) {
		this.pokemonList = pokemonList;
	}
	
	
	public void pokemonAttack() {
		for (Pokemon pokemon : pokemonList) {
			pokemon.attack();
		}
	}
	*/
	
	@Resource(name = "charmander")
	private Pokemon pokemon;
	
	
//	@Resource //필드 주입
//	private List<Pokemon> pokemonList;
	
//	@Resource // 생성자 주입이 불가능하다 세터는 가능
	public PokemonService(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	@Resource //세터 주입 가능하다
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		this.pokemon.attack();
		}
	
	
}
