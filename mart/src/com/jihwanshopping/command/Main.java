package com.jihwanshopping.command;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jihwanshopping.command.service.ShoopingCart;
import com.jihwanshopping.config.ContextConfiguration;
import com.jihwanshopping.product.Beef;
import com.jihwanshopping.product.Cabbage;
import com.jihwanshopping.product.Homerunball;
import com.jihwanshopping.product.IndianBop;
import com.jihwanshopping.product.Lettuce;
import com.jihwanshopping.product.Pork;
import com.jihwanshopping.product.Product;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		Product sirloin = context.getBean("sirloin", Beef.class);
		Product bacon = context.getBean("bacon", Pork.class);
		Product cabbage = context.getBean("cabbage", Cabbage.class);
		Product lettuce = context.getBean("lettuce", Lettuce.class);
		Product homerun = context.getBean("homerun", Homerunball.class);
		Product indian = context.getBean("indian", IndianBop.class);
		ShoopingCart minyoung = context.getBean("cart" ,ShoopingCart.class);
		
		
		minyoung.addItem(sirloin);
		minyoung.addItem(bacon);
		minyoung.addItem(cabbage);
		minyoung.addItem(lettuce);
		minyoung.addItem(homerun);
		minyoung.addItem(indian);
		
		minyoung.getItems();
		System.out.println(minyoung.getPriceSum());
		
	}

}
