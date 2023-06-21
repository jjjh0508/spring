package com.jihwanshopping.product;

public class Beef extends Meat {
	private int capacity;
	
	public Beef(String name, int price, int capacity) {
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
		return "Beef [capacity=" + capacity + "]";
	}
	
	
}
