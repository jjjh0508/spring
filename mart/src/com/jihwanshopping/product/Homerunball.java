package com.jihwanshopping.product;

public class Homerunball extends Snack {
	private int capacity;

	public Homerunball(String name, int price, int capacity) {
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
		return "Homerunball [capacity=" + capacity + "]";
	}
	
	
}
