package com.threadsafecollection;

public class Client {

	public static void main(String[] args) throws InterruptedException {

		InventoryManager inventoryManager = new InventoryManager();

		inventoryManager.populateSoldProductList();
		inventoryManager.displaySoldProductList();

		Thread inventoryTaskOne = new Thread(new Runnable() {
			@Override
			public void run() {
				inventoryManager.populateSoldProductList();

			}
		});

		Thread inventoryTaskTwo = new Thread(new Runnable() {

			@Override
			public void run() {
				inventoryManager.displaySoldProductList();

			}
		});
		
		inventoryTaskOne.start();
		Thread.sleep(500);
		inventoryTaskTwo.start();
	}

}
