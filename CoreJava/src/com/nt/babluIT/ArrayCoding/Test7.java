package com.nt.babluIT.ArrayCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test7 {

	// 11 count occurrences of each element in an array and also by Java8

	static void arrayElementCount(int[] array) {
		HashMap<Integer, Integer> hm = new HashMap();

		for (int i : array) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}

		for (Map.Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

	private static void arrayElementCountJava8(int[] array) {
		Map<String, Long> collect = Arrays.stream(array).boxed().map(s -> s + "")
				.collect(Collectors.groupingBy(String::toString, Collectors.counting()));

		for (Map.Entry<String, Long> entry : collect.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "->>" + entry.getValue());
			}
		}

	}
	

	
	private static void arrayElementCountJava8String(String str) {
		
		System.out.println();
		
		Arrays.stream(str.split(""))
		      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		      .entrySet().stream()
		      .forEach(i -> System.out.println(i.getKey()+"  "+i.getValue()));
		
	}

	public static void main(String[] args) {

		arrayElementCount(new int[] { 4, 5, 4, 5, 4, 6 });

		System.out.println("-------------------------");

		arrayElementCountJava8(new int[] { 12, 9, 12, 9, 10, 9, 10, 11 });

		arrayElementCountJava8String("subhrajitsahoo");

	}

}
