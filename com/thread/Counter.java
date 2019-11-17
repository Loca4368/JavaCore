package com.thread;

public class Counter {

	private int number;

	public Counter() {
		this.number = 0;
	}

	public int getNumber() {
		synchronized (this) {			
			number++;
			return number;
		}
	}
}
