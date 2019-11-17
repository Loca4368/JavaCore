/*
* Test for synchronization on multi-threads
* Three ways:
* 1. Synchronized the method
* 2. Synchronized the object
* 3. Use Lock
*/

package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {

		Account currentAccount = new Account();

		// Create a fixed Thread pool with thread number 100
		ExecutorService service = Executors.newFixedThreadPool(100);

		System.out.println("Processing.........");
		for (int i = 1; i <= 10; i++) {

			// Method 1: The deposit method is modified by synchronized
			service.execute(new DepositThread(currentAccount, 100));
		}

		for (int i = 1; i <= 10; i++) {

			// Method 2: The account object is synchronized in the Withdraw thread
			service.execute(new WithdrawThread(currentAccount, 50));
		}

		for (int i = 1; i <= 10; i++) {

			// Method 3: Use Lock in the pay method
			service.execute(new WithdrawThread(currentAccount, 20));
		}

		service.shutdown();

		while (!service.isTerminated()) {
		}

		System.out.println("Your Balance is : " + currentAccount.getBalance());
	}

}
