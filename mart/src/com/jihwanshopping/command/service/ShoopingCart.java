package com.jihwanshopping.command.service;

import java.util.ArrayList;
import java.util.List;

import com.jihwanshopping.product.Meat;
import com.jihwanshopping.product.Product;
import com.jihwanshopping.product.Snack;
import com.jihwanshopping.product.Vegetable;

public class ShoopingCart {
	private final List<Product> items;
	private int priceSum;

	public ShoopingCart() {
		this.items = new ArrayList<>();
	}

	public void addItem(Product item) {
		this.items.add(item);
	}

	public void getItems() {
		for (Product product : items) {
			if (product instanceof Meat) {
				Meat pro1 = (Meat) product;
				System.out.println(pro1.getName() + "\n");
			} else if (product instanceof Snack) {
				Snack pro1 = (Snack) product;
				System.out.println(pro1.getName() + "\n");
			} else if (product instanceof Vegetable) {
				Vegetable pro1 = (Vegetable) product;
				System.out.println(pro1.getName() + "\n");
			}

		}
	}

	public int getPriceSum() {
		for (Product product : items) {
			if (product instanceof Meat) {
				Meat pro1 = (Meat) product;
				priceSum += pro1.getPrice();
			} else if (product instanceof Snack) {
				Snack pro1 = (Snack) product;
				priceSum += pro1.getPrice();
			} else if (product instanceof Vegetable) {
				Vegetable pro1 = (Vegetable) product;
				priceSum += pro1.getPrice();
			}

		}

		return priceSum;
	}

	@Override
	public String toString() {
		return "Shoopingcard [items=" + items + "]";
	}

}
