package com.nt.babluIT.DateAndTimeApi;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestDemoLocalTime {
	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		LocalTime time = LocalTime.of(12, 14, 12);
		System.out.println(time);

		LocalTime plusMinutes = time.plusMinutes(10);
		System.out.println(plusMinutes);

		time = time.plusSeconds(4);
		System.out.println(time);

		time = time.plusMinutes(10);
		System.out.println(time);

		time = time.plusHours(2);
		System.out.println(time);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}

}
