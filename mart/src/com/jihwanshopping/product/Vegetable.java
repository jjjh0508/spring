package com.jihwanshopping.product;

public class Vegetable implements Product{
	private int price;
	private String name;
	
	public Vegetable() {
	}

	public Vegetable(int price, String name) {
		super();
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
		return "Vegetable [price=" + price + ", name=" + name + "]";
	}
	
	
	
}
