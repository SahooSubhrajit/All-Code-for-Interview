package com.ct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ArrayPOC {
	public static void main(String[] args) {

		int[] intArray = new int[] { 4, 8, 6, 1, 88, 7450 };

		List<Integer> al = new ArrayList<Integer>();

		for (Integer it : intArray) {
			al.add(it);
		}

		Integer integer = al.stream().max(Integer::compare).get();
		System.out.println(integer);
		System.out.println();
		
		al.stream().sorted(Collections.reverseOrder()).forEach(i -> System.out.print(i + "  "));
		
		}

}
