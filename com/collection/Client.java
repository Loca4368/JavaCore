package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {

		System.out.println("======== Start of List ========");
		List<String> myArrayList = new ArrayList<String>();
		myArrayList.add("A");
		myArrayList.add("B");
		myArrayList.add("C");
		myArrayList.add("D");
		myArrayList.add("E");
		myArrayList.add("E");
		printList(myArrayList);

		List<String> myNewArrayList = new ArrayList<String>(myArrayList);
		myNewArrayList.addAll(myArrayList);
		printList(myNewArrayList);

		String keywordString = "A";
		boolean containsAllElements = false;
		boolean containsKeyword = false;
		containsAllElements = myNewArrayList.containsAll(myArrayList);
		containsKeyword = myNewArrayList.contains(keywordString);
		System.out.println("Contains all elements: " + containsAllElements);
		System.out.println("Contains keyword: " + containsKeyword);

		List<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(1);
		myLinkedList.add(2);
		myLinkedList.add(3);
		myLinkedList.add(4);
		myLinkedList.add(5);
		myLinkedList.add(6);
		myLinkedList.add(6);

		List<Integer> myNewLinkedList = new LinkedList<Integer>();
		myNewLinkedList.addAll(myLinkedList);
		myLinkedList.remove(0);
		myNewLinkedList.retainAll(myLinkedList);

		printList(myNewLinkedList);
		myNewLinkedList.clear();
		System.out.println("My linked list size: " + myNewLinkedList.size());
		System.out.println("My linked list is empty: " + myNewLinkedList.isEmpty());
		System.out.println("======== End of List ========");
		System.out.print("\n");

		System.out.println("======== Start of Set ========");

		Set<String> myStringSet = new HashSet<String>();
		myStringSet.add("AA");
		myStringSet.add("AA");
		myStringSet.add("AA");
		myStringSet.add("CC");
		myStringSet.add("CC");
		myStringSet.add("CC");
		myStringSet.add("BB");
		myStringSet.add("BB");
		myStringSet.add("BB");

		ArrayList<String> convertArrayList = new ArrayList<String>(myStringSet);
		printList(convertArrayList);

		Set<Integer> myIntegerHashSet = new HashSet<Integer>();
		myIntegerHashSet.add(33);
		myIntegerHashSet.add(33);
		myIntegerHashSet.add(33);
		myIntegerHashSet.add(11);
		myIntegerHashSet.add(11);
		myIntegerHashSet.add(11);
		myIntegerHashSet.add(22);
		myIntegerHashSet.add(22);
		myIntegerHashSet.add(22);

		LinkedList<Integer> convertLinkedList = new LinkedList<Integer>(myIntegerHashSet);
		printList(convertLinkedList);

		Set<Integer> myIntegerTreeSet = new TreeSet<Integer>();
		myIntegerTreeSet.add(33);
		myIntegerTreeSet.add(33);
		myIntegerTreeSet.add(33);
		myIntegerTreeSet.add(11);
		myIntegerTreeSet.add(11);
		myIntegerTreeSet.add(11);
		myIntegerTreeSet.add(22);
		myIntegerTreeSet.add(22);
		myIntegerTreeSet.add(22);

		convertLinkedList = new LinkedList<Integer>(myIntegerTreeSet);
		printList(convertLinkedList);

		System.out.println("======== End of Set ========");
		System.out.print("\n");

		System.out.println("======== Start of Sorting ========");

		// Natural sorted in alphabetic order
		List<String> stringArrayList = new LinkedList<String>();
		stringArrayList.add("E");
		stringArrayList.add("D");
		stringArrayList.add("C");
		stringArrayList.add("B");
		stringArrayList.add("A");
		Collections.sort(stringArrayList);
		printList(stringArrayList);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Jason", 30, 3000));
		employees.add(new Employee("John", 31, 2000));
		employees.add(new Employee("Jack", 30, 4000));
		Collections.sort(employees);
		printList(employees);

		// Implements Comparable in Student Class
		Set<Student> studentSet = new TreeSet<Student>();

		studentSet.add(new Student("Ming", 28));
		studentSet.add(new Student("Loca", 29));
		studentSet.add(new Student("Alex", 26));
		studentSet.add(new Student("Jason", 22));
		studentSet.add(new Student("John", 20));

		LinkedList<Student> convertedStudentList = new LinkedList<Student>(studentSet);
		printList(convertedStudentList);

		// Pass Comparator as a second argument
		List<Teacher> teacherList = new ArrayList<Teacher>();

		teacherList.add(new Teacher("Dr Recep", 40));
		teacherList.add(new Teacher("Dr Qiu", 35));
		teacherList.add(new Teacher("Robin", 43));
		teacherList.add(new Teacher("Ron", 44));
		teacherList.add(new Teacher("Emma", 37));

		Collections.sort(teacherList, new Comparator<Teacher>() {

			public int compare(Teacher o1, Teacher o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		for (Teacher teacher : teacherList) {
			System.out.println(teacher);
		}
		System.out.println("======== Start of Sorting ========");
	}

	private static <T> void printList(List<T> list) {
		for (T listElement : list) {
			System.out.println(listElement);
		}
	}

}
