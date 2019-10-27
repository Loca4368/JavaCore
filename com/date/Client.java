package com.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

	public static void main(String[] args) {

		// Local date and time
		LocalDateAndTime ldt = new LocalDateAndTime();
		System.out.println(ldt.toString());

		// Format date in Java8
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate ld = LocalDate.now();

		System.out.println(ld.format(dtf));

		for (int i = 0; i < 5; i++) {

			if (i == 3) {
				continue;
			}
			System.out.println("i:" + i);
		}

		String s1 = new String("Ming");
		String s2 = new String("Ming");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
