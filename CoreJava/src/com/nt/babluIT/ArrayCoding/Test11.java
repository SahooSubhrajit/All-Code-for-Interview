package com.nt.babluIT.ArrayCoding;

import java.util.Arrays;

public class Test11 {

	// 16 find the minimum absolute difference between any two elements of the given
	// array

	static void minimumAbsoluteDifference(int[] array) {

		Arrays.sort(array);

		int minDiff = Math.abs(array[1] - array[0]);
		int firstElement = array[0];
		int secondElement = array[1];

		for (int i = 2; i < array.length; i++) {
			if (Math.abs(array[i] - array[i - 1]) < minDiff) {
				minDiff = Math.abs(array[i] - array[i - 1]);
				firstElement = array[i - 1];
				secondElement = array[i];
			}
		}

		System.out.println("Sorted Input Array : " + Arrays.toString(array));

		System.out.println("Minimum Absolute Difference : " + minDiff);

		System.out.println("Pair Of Elements : (" + firstElement + ", " + secondElement + ")");

	}

	public static void main(String[] args) {
		minimumAbsoluteDifference(new int[] { 5, 8, 4, 2, 9, 0 });

		System.out.println("==========================");

		minimumAbsoluteDifference(new int[] { 45, -89, 12, -62, 31, -57 });

		System.out.println("==========================");

		minimumAbsoluteDifference(new int[] { 5, -3, 7, -2 });

	}

}
