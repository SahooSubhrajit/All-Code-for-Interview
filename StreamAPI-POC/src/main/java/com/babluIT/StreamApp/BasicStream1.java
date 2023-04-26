package com.babluIT.StreamApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(12);
		list.add(8);
		list.add(15);
		list.add(3);

		Stream<Integer> stream = list.stream();
//		stream.filter(num -> num > 10).forEach(System.out::println);
		stream.filter(num -> num > 10).forEach(i -> System.out.println(i));

		list.forEach(i -> {
			System.out.print(i + " ");
		});

		System.out.println();

		list.forEach(System.out::println);
	}

}
