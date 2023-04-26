package com.nt.colelction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sortting {
	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(123, 145, 78, 69, 485, 854, 56);

		Collections.sort(al);

		for (Integer it : al) {
			System.out.println(it);
		}

		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse Order");
		for (Integer it : al) {
			System.out.println(it);
		}

		System.out.println("using stream API");
		al.stream().sorted().forEach(i -> System.out.println(i));
//		al.stream().sorted(Collections.reverseOrder()).forEach(i -> System.out.println(i));

	}

}
