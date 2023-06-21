package com.jihwanshopping.product;

public class Meat implements Product {
	private int price;
	private String name;
	
	public Meat() {
	}

	public Meat(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Meat [price=" + price + ", name=" + name + "]";
	}
	
	
	
	
	
}
