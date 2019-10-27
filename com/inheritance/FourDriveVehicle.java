package com.inheritance;

public class FourDriveVehicle extends Vehicle{

	public FourDriveVehicle(double value, String model, String name) {
		super(value, model, name);
	}
	
	@Override
	public void run() {
		System.out.println("Four drive vehicle running on the mountain.");
	}

}
