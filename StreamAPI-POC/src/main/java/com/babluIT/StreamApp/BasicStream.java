package com.babluIT.StreamApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {
	public static void main(String[] args) {
		
		//Type-1		
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		stream.forEach(i -> System.out.println(i));
		/*stream.forEach(System.out::println);
		stream.forEach(i -> System.out::println);*/
		
		
		//Type-2
		Stream<String> str = Stream.of("Rama","Hari","Kohil");
		str.forEach(System.out::println);
//		str.forEach(e -> System.out.println(e));
		
		//Type-3
		List<String> names = new ArrayList<>();
		names.add("Java");
		names.add("Python");
		names.add("Testing");
		names.add("DevOps");
		names.add("Angular");
		
		names.stream().forEach(e -> System.out.println(e));  System.out.println();
		names.stream().forEach(System.out::println); System.out.println();
		
		Stream<String> stname = names.stream();
		stname.forEach(System.out::println);
	}

}
