package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Client {
	public static void main(String[] args) {

		System.out.println("======== Start of Map ========");

		// HashMap - display in random order
		Map<String, String> myHashMap = new HashMap<String, String>();

		myHashMap.put("Brave", "Read to face and endure dange or pain; showing courage.");
		myHashMap.put("Brilliant", "Exceptionally clever or talented.");
		myHashMap.put("Joy", "A feelling of great pleasure and happiness.");
		myHashMap.put("Confidence", "The state of feeling certain about the truth of something.");

		for (String keyString : myHashMap.keySet()) {
			System.out.println(keyString);
		}

		for (String valueString : myHashMap.values()) {
			System.out.println(valueString);
		}

		// Linked Hash Map - maintain insertion order
		Map<String, String> myLinkedHashMap = new LinkedHashMap<String, String>();

		myLinkedHashMap.put("Brave", "Read to face and endure dange or pain; showing courage.");
		myLinkedHashMap.put("Brilliant", "Exceptionally clever or talented.");
		myLinkedHashMap.put("Joy", "A feelling of great pleasure and happiness.");
		myLinkedHashMap.put("Confidence", "The state of feeling certain about the truth of something.");

		for (Entry<String, String> entry : myLinkedHashMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		// TreeMap - display in order, e.g. alphabetic for String and numeric for
		// Integer
		Map<String, String> myTreeMapMap = new TreeMap<String, String>();

		myTreeMapMap.put("Brave", "Read to face and endure dange or pain; showing courage.");
		myTreeMapMap.put("Brilliant", "Exceptionally clever or talented.");
		myTreeMapMap.put("Joy", "A feelling of great pleasure and happiness.");
		myTreeMapMap.put("Confidence", "The state of feeling certain about the truth of something.");

		Iterator<Entry<String, String>> myIterator = myTreeMapMap.entrySet().iterator();

		while (myIterator.hasNext()) {
			Map.Entry<String, String> entry = myIterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		Map<Employee, Integer> employeeMap = new TreeMap<Employee, Integer>();
		employeeMap.put(new Employee("Jason", 30, 3000), 1);
		employeeMap.put(new Employee("John", 31, 2000), 2);
		employeeMap.put(new Employee("Jack", 30, 4000), 3);

		Iterator<Entry<Employee, Integer>> employeeIterator = employeeMap.entrySet().iterator();

		while (employeeIterator.hasNext()) {
			Map.Entry<Employee, Integer> employeeEntry = employeeIterator.next();
			System.out.println(employeeEntry.getKey().getName() + " " + employeeEntry.getValue());

		}

		System.out.println("======== End of Map ========");
		System.out.println("\n");

	}
}
