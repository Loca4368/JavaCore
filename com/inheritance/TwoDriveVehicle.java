package com.inheritance;

public class TwoDriveVehicle extends Vehicle {

	public TwoDriveVehicle(double value, String model, String name) {
		super(value, model, name);
	}

	@Override
	public void run() {
		System.out.println("Two drive vehicle running on the street.");
	}

}
