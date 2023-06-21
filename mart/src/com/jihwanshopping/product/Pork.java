package com.jihwanshopping.product;

public class Pork extends Meat {
	private int capacity;

	public Pork(String name, int price, int capacity) {
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
		return "Pork [capacity=" + capacity + "]";
	}
	
	
}
