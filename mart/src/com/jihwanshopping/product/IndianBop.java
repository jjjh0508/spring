package com.jihwanshopping.product;

public class IndianBop extends Snack{
	private int capacity;

	public IndianBop(String name, int price, int capacity) {
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
		return "IndianBop [capacity=" + capacity + "]";
	}
	
	
}
