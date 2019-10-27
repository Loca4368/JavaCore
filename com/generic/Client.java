package com.generic;

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
		Class<?> c = Class.forName("reflection.Car");

		// Get Constructor
		Constructor<?> con = c.getConstructor(String.class, int.class);

		// Create an instance
		Car car = (Car) con.newInstance("BMW", 200);

		// Get run method
		Method method = car.getClass().getDeclaredMethod("run");

		method.invoke(car);

		// Access variables
		Field name = car.getClass().getDeclaredField("name");
		Field maxSpeed = car.getClass().getDeclaredField("maxSpeed");

		// set variables
		name.setAccessible(true);
		maxSpeed.setAccessible(true);

		name.set(car, "Benz");
		maxSpeed.set(car, 300);

		method.invoke(car);
	}

}
