package com.greedy.section01.properties.xmlconfig;

public class Bread  extends Product {
	private java.util.Date bakeDate;
	

	public Bread() {
		super();
	}


	public Bread(String name, int price , java.util.Date bakeDate) {
		super(name, price);
		this.bakeDate = bakeDate;
	}






	public java.util.Date getBakeDate() {
		return bakeDate;
	}


	public void setBakeDate(java.util.Date bakeDate) {
		this.bakeDate = bakeDate;
	}


	@Override
	public String toString() {
		return "Bread [bakeDate=" + bakeDate + "]";
	}
	
	
	
}
