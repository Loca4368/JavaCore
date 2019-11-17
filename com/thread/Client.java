package com.thread;


public class Client {

	public static void main(String[] args) {
		
		Task myTask = new Task(1);
		myTask.run();
		
		Thread worker = new Thread(myTask);
		worker.start();
		

		Counter counter = new Counter();

		Thread firsThread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + ":" + counter.getNumber());
				}
			}
		});
		
		Thread secondThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + ":" + counter.getNumber());
				}
			}
		});
		
		
		firsThread.start();
		secondThread.start();
	}

}
