package com.jihwanshopping.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.jihwanshopping.command.service.ShoopingCart;
import com.jihwanshopping.product.Beef;
import com.jihwanshopping.product.Cabbage;
import com.jihwanshopping.product.Homerunball;
import com.jihwanshopping.product.IndianBop;
import com.jihwanshopping.product.Lettuce;
import com.jihwanshopping.product.Pork;
import com.jihwanshopping.product.Product;

@Configuration
public class ContextConfiguration {
	@Bean
	public Product sirloin() {
		return new Beef("등심", 10000, 100);
	}

	@Bean
	public Product bacon() {
		return new Pork("베이컨", 10000, 100);
	}

	@Bean
	public Product cabbage() {
		return new Cabbage("양배추", 2000, 100);
	}

	@Bean
	public Product lettuce() {
		return new Lettuce("적상추", 900, 50);
	}
	@Bean
	public Product homerun() {
		return new Homerunball("빅사이즈홈런볼", 10000, 10000);
	}
	
	@Bean
	public Product indian() {
		return new IndianBop("특가밥", 100, 200);
	}
	
	@Bean
	@Scope("prototype") 
	public ShoopingCart cart() {
		return new ShoopingCart();
	}
}
