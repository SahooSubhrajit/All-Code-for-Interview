package com.nt.babluIT.ArrayCoding;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
	// https://javaconceptoftheday.com/java-array-interview-programs/

	// 2 find second largest and second lowest element in an array of integers both
	// general and Java8
	// refer Test12.java

	public static int secondLargest(int[] array) {

		int firstLargest, secondLargest;
		if (array[0] > array[1]) {
			firstLargest = array[0];
			secondLargest = array[1];
		} else {
			firstLargest = array[1];
			secondLargest = array[0];
		}
		// Checking remaining elements of input array
		for (int i = 2; i < array.length; i++) {
			if (array[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = array[i];
			} else if (array[i] < firstLargest && array[i] > secondLargest) {
				secondLargest = array[i];
			}

		}
		return secondLargest;

	}

	private static int secondLowest(int[] array) {

		int firstLargest, secondLargest;

		if (array[0] < array[1]) {
			firstLargest = array[1];
			secondLargest = array[0];
		} else {
			firstLargest = array[0];
			secondLargest = array[1];
		}

		for (int i = 2; i < array.length; i++) {
			if (array[i] < firstLargest) {
				secondLargest = firstLargest;
				firstLargest = array[i];
			} else if (array[i] > firstLargest && array[i] < secondLargest) {
				secondLargest = array[i];

			}

		}
		return secondLargest;

	}

	private static int secondLargestJava8(int[] array) {

		return Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	}

	private static int secondLowestJava8(int[] array) {

		return Arrays.stream(array).boxed().sorted().skip(1).findFirst().get();
	}

	public static void main(String[] args) {

		System.out.println(secondLargest(new int[] { 45, 51, 28, 75, 49, 42 }));

		System.out.println(secondLowest(new int[] { 45, 51, 28, 75, 49, 42 }));

		System.out.println(secondLargestJava8(new int[] { 45, 51, 28, 75, 49, 42 }));

		System.out.println(secondLowestJava8(new int[] { 45, 51, 28, 75, 49, 42 }));
	}

}
