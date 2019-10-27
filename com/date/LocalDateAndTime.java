package com.date;

import java.time.Clock;
import java.time.LocalDateTime;

public final class LocalDateAndTime {

	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;
	private long millis;

	public LocalDateAndTime() {
		LocalDateTime ldt = LocalDateTime.now();
		this.year = ldt.getYear();
		this.month = ldt.getMonthValue();
		this.day = ldt.getDayOfMonth();
		this.hour = ldt.getHour();
		this.minute = ldt.getMinute();
		this.second = ldt.getSecond();

//		this.millis = System.currentTimeMillis();
		this.millis = Clock.systemDefaultZone().millis();// Java 8

	}

//	public void showDateAndTime()
//	{
//		System.out.println("Year:"+ year);
//		System.out.println("Month:"+ month);
//		System.out.println("Day:"+ day);
//		System.out.println("Hour:"+ hour);
//		System.out.println("Minute:"+ minute);
//		System.out.println("Second:"+ second);
//		System.out.println("Millis:"+ System.currentTimeMillis());
//	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurerentZoneDateAndTime: [year=");
		builder.append(year);
		builder.append(", month=");
		builder.append(month);
		builder.append(", day=");
		builder.append(day);
		builder.append(", hour=");
		builder.append(hour);
		builder.append(", minute=");
		builder.append(minute);
		builder.append(", second=");
		builder.append(second);
		builder.append(", millis=");
		builder.append(millis);
		builder.append("]");
		return builder.toString();
	}

}
