package com.nt.babluIT.DateAndTimeApi;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class TestDemoLocalDate {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalDate date1 = LocalDate.of(2023, 03, 20);
		System.out.println(date1);

		date1 = LocalDate.of(2023, Month.MARCH, 15);
		System.out.println(date1);

		LocalDate plusDays = date1.plusDays(5);
		System.out.println(plusDays);

		LocalDate plusMonths = date1.plusMonths(6);
		System.out.println(plusMonths);

		boolean before = LocalDate.parse("2023-01-20").isBefore(LocalDate.parse("2023-03-28"));
		System.out.println(before);

		boolean after = LocalDate.parse("2023-03-20").isAfter(LocalDate.parse("2023-01-20"));
		System.out.println(after);

	}

}
