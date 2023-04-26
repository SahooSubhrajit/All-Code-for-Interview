package com.nt.methodAndconstructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class wishSuff {
	public static void main(String[] args) {
		System.out.println("Learning Method Reference");

		Wish wish = () -> {
			System.out.println("Manually Implimentation of card method");
		};
		wish.card();
		System.out.println();
		
		Wish wish1 = WishMessage::HindiWish;
		wish1.card();
		
		System.out.println();
		
		WishMessage wmg = new WishMessage();
		Wish wish2 = wmg::EnglishWish;
		wish2.card();
		
		Wish wish3 = Student::new;
		wish3.card();
		
		System.out.println();
		
		Student studt = new Student();
		Wish wish4 = studt::display;
		wish4.card();

		/*Runnable runnable = WishMessage::Threadcount;
		Thread th = new Thread(runnable);
		th.start();*/

		/*List<String> ll = Arrays.asList("abc","bbv","vhhf");
		List<String> collect = ll.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);
		ll.stream().forEach(e -> System.out.print(e.charAt(0)));*/

		/*List<Integer> ll = Arrays.asList(1, 2, 3, 4, 25, 44, 85, 69, 200002);
		ll.stream().map(i -> i * i).filter(e -> e % 2 == 0).collect(Collectors.toList())
				.forEach(i -> System.out.print(i + " "));*/

	}

}
