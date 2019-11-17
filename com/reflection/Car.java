package com.reflection;

public class Car {

	private String make;
	private double price;
	private int maxSpeed;

	public Car(String make, double price, int maxSpeed) {
		this.make = make;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

	public void run(int speed) {
		System.out.println("Current speed is: " + speed + "km/h.");

		if (speed > maxSpeed) {
			System.out.println("Dangerous, Over Speed.. Slow down");
		}
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
}