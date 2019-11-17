package com.generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Client {

	public static void main(String[] args) {

		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("A");
		mySet1.add("B");
		mySet1.add("C");

		Set<String> mySet2 = new HashSet<String>();
		mySet2.add("E");
		mySet2.add("F");
		mySet2.add("G");

		// Generic Method
		mySet1 = mergeSet(mySet1, mySet2);

		Iterator<String> myItrIterator = mySet1.iterator();

		while (myItrIterator.hasNext()) {
			String elementString = myItrIterator.next();
			System.out.println(elementString);
		}

		System.out.println("\n");

		// Generic Class
		Container<String, Integer> myContainer = new Container<String, Integer>();
		myContainer.add("A", 1);
		myContainer.add("B", 2);
		myContainer.add("C", 3);
		myContainer.add("D", 4);
		myContainer.add("E", 5);

		ArrayList<String> collectorA = myContainer.getCollectorA();
		ArrayList<Integer> collectorB = myContainer.getCollectorB();

		System.out.println("Collector A: ");
		for (String item : collectorA) {
			System.out.println("Item: " + item);
		}

		System.out.println("\n");

		System.out.println("Collector B: ");
		collectorB.forEach(item -> {
			System.out.println("Item: " + item);
		});
	}

	public static <E> Set<E> mergeSet(Set<E> s1, Set<E> s2) {

		s1.addAll(s2);
		return s1;
	}
}
