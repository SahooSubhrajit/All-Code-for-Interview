package com.ct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo11 {
	public static void main(String[] args) {

		List<String> fruitList = new ArrayList<>();

		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Pineapple");

		String[] array = fruitList.toArray(new String[fruitList.size()]);
		
		for (String str : array) {
			System.out.println(str);
		}
		
		List<String> fruitList1 = Arrays.asList(array);
		
		fruitList1.forEach(a -> System.out.print(a + "  "));
		
		fruitList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

		Optional<String> findFirst = fruitList.stream().findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
	}

}
