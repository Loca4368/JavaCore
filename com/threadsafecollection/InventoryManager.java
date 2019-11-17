package com.threadsafecollection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

	private List<Product> soldProductList = new CopyOnWriteArrayList<Product>();
	private List<Product> storeProductList = new CopyOnWriteArrayList<Product>();

	public void intializeInventory() {

		for (int i = 0; i < 100; i++) {

			Product product = new Product(i, "product_" + i);
			storeProductList.add(product);
			System.out.println("ADDED: " + product);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void populateSoldProductList() {

		System.out.println("Initializing Inventory");
		for (int i = 0; i < 100; i++) {

			Product product = new Product(i, "product_" + i);
			soldProductList.add(product);
			System.out.println("ADDED: " + product);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void displaySoldProductList() {

		System.out.println("Inventory Details");
		for (Product product : soldProductList) {
			System.out.println("Product: " + product);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
