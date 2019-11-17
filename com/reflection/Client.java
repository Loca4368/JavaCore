package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		/*
		 * Demo on three methods to get class through reflection
		 */
		String s1 = String.class.newInstance();

		"hello".getClass();

		Class.forName("java.lang.String");

		String s2 = "hello world";

		Method m = s2.getClass().getMethod("toUpperCase");

		System.out.println(m.invoke(s2));

		/*
		 * Use Car class to demo reflection
		 */

		// Get Class
		Class<?> c = Class.forName("com.reflection.Car");

		// Get Constructor
		Constructor<?> con = c.getConstructor(String.class, double.class, int.class);

		// Create instance
		Car car = (Car) con.newInstance("BMW", 50000.00, 200);

		// Get method
		Method method = car.getClass().getDeclaredMethod("run", int.class);
		method.invoke(car, 210);

		// Access variables
		Field nameField = car.getClass().getDeclaredField("make");
		Field priceField = car.getClass().getDeclaredField("price");
		Field maxSpeedField = car.getClass().getDeclaredField("maxSpeed");

		// set variables
		nameField.setAccessible(true);
		priceField.setAccessible(true);
		maxSpeedField.setAccessible(true);

		nameField.set(car, "Benz");
		priceField.set(car, 60000.00);
		maxSpeedField.set(car, 300);

		System.out.println(car.toString());
	}

}
