package com.jihwanshopping.product;

public class Cabbage extends Vegetable {
	private int capacity;

	public Cabbage(String name, int price, int capacity) {
		super(price,name);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Cabbage [capacity=" + capacity + "]";
	}
	
	
}
