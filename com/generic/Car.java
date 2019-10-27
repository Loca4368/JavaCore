package com.generic;

public class Car {

	private String name;
	private int speed;
	private int maxSpeed;

	public Car(String carName, int maxSpeed) {
		this.name = carName;
		this.speed = 0;
		this.maxSpeed = maxSpeed;
	}

	public void run() {
		speed += 10;
		System.out.println(name + " is Running at:" + speed + "km/h");
		System.out.println("MaxSpeed is " + maxSpeed);

		if (speed > maxSpeed) {
			System.out.println("Dangerous, Over Speed.. Slow down");
		}
	}
}