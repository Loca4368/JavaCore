//Use Bank Account class

package com.concurrence;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

	private Lock accountLock = new ReentrantLock();

	private double balance = 0;

	// Method 1: Synchronized the method
	// Deposit
	public synchronized void deposit(double amount) {

		double newBalance = balance + amount;

		try {
			Thread.sleep(2000);// Simulate processing time for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		balance = newBalance;
	}

	// Withdraw
	public void withdraw(double amount) {

		double newBalance = balance - amount;
		try {
			Thread.sleep(2000);// Simulate processing time for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		balance = newBalance;
	}

	// Method 3: Use Lock
	// Payment
	public void pay(double payAmount) {
		accountLock.lock();

//		try{
//			double newBalance = balance - payAmount;
//			try
//			{
//				Thread.sleep(2000); //Simulate processing time for 2 seconds
//			}
//			catch(InterruptedException e)
//			{
//				e.printStackTrace();
//			}
//			
//			balance = newBalance;
//			}
//		finally
//		{
//			accountLock.unlock();
//		}

		double newBalance = balance - payAmount;
		try {
			Thread.sleep(2000); // Simulate processing time for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		finally {
			accountLock.unlock();
		}

		balance = newBalance;

	}

	// Get Balance
	public double getBalance() {
		return balance;
	}

}
