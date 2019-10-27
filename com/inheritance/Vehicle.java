package com.inheritance;

public class Vehicle {

	public double value;
	public String model;
	public String name;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle(double value, String model, String name) {
		this.value = value;
		this.model = model;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [value=" + value + ", model=" + model + ", name=" + name + "]";
	}

	public void run() {
		System.out.println("Vehicel Running on the road.");
	}

}
