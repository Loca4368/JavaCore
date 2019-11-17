package com.thread;

public class Task implements Runnable {

	private int taskId;

	public Task(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ":" + "I am running my task" + taskId);
	}

}
