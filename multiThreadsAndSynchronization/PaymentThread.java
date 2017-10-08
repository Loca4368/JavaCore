package multiThreadsAndSynchronization;

public class PaymentThread implements Runnable{
	
	private Account account;
	private double amount;
	
	public PaymentThread(Account account, double amount)
	{
		this.account = account;
		this.amount = amount;
	}
	
	public void run() {
		
		account.pay(amount);
	}
	
	

}
