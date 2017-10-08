//Deposit thread for account

package multiThreadsAndSynchronization;

public class DepositThread implements Runnable{
	
	private Account account;
	private double money;
	
	public DepositThread(Account account, double money)
	{
		this.account = account;
		this.money = money;
		
	}
	
	//
	public void run() {
		
		account.deposit(money);
	}
		

}
