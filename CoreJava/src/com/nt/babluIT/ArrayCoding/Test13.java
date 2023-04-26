package com.nt.babluIT.ArrayCoding;

import java.util.Arrays;

public class Test13 {

	// 25 sort an array of 0s, 1s and 2s

	// refer Test 4,5

	static void sortArray(int[] array) {

		int low = 0;
		int mid = 0;
		int length = array.length - 1;

		while (mid <= length) {
			if (array[mid] == 0) {
				swap(array, low, mid);
				low++;
				mid++;

			}

			if (array[mid] == 2) {
				swap(array, mid, length);
				length--;
			} else {
				mid++;
			}
		}
		System.out.println(Arrays.toString(array));
	}

	private static void swap(int[] array, int low, int mid) {
		int temp;
		temp = array[low];
		array[low] = array[mid];
		array[mid] = temp;
	}

	public static void main(String[] args) {
		sortArray(new int[] { 1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0 });

	}

}
