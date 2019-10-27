package com.inheritance;

public class Client {

	public static void main(String[] args) {

		Vehicle myVehicle;

		myVehicle = new FourDriveVehicle(10000.00, "Jeep", "Jeep -123");
		myVehicle.run();

		myVehicle = new TwoDriveVehicle(20000, "BMW", "X5");
		myVehicle.run();

	}
}
