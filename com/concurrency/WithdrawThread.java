//Deposit Thread for account

package com.concurrency;

public class WithdrawThread implements Runnable {

	private Account account;
	private double money;

	public WithdrawThread(Account account, double money) {
		this.account = account;
		this.money = money;

	}

	// Method 2: Synchronized the object
	public void run() {

		synchronized (account) {
			account.withdraw(money);
		}
	}

}
