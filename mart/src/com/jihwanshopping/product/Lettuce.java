package com.jihwanshopping.product;

public class Lettuce extends Vegetable {
	private int capacity;

	public Lettuce(String name, int price, int capacity) {
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
		return "Lettuce [capacity=" + capacity + "]";
	}
	
	
}
