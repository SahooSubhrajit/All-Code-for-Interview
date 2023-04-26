// How to find duplicate elements in a given integers list in java using Stream functions?

package com.babluIT.PracticeQuestionOnStreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q3 {
	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		Set<Integer> myset = new HashSet(myList);

		// find unique element
		myset.stream().forEach(i -> System.out.print(i + "  "));

		System.out.println();

		// finding duplicate elements
		Set<Integer> myset1 = new HashSet();

		myList.stream().filter(i2 -> !myset1.add(i2)).forEach(i -> System.out.print(i + "  "));

	}

}
