package com.nt.babluIT.ArrayCoding;

import java.util.Arrays;

public class Test14 {

	// 26 Java program which finds triplets in the given array whose sum is equal to
	// given number

	private static void getArrayTriplets(int[] array, int sum) {

		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			int left = i + 1;
			int right = array.length - 1;

			if (array[i] + array[left] + array[right] == sum) {
				System.out.println(array[i] + " " + array[left] + " " + array[right]);
				left++;
				right--;

			} else if (array[i] + array[left] + array[right] < sum) {
				left++;
			} else {
				right--;
			}
		}

	}

	public static void main(String[] args) {
		getArrayTriplets(new int[] { 7, 5, 9, 3, 0, 8, 6 }, 12);

	}

}
