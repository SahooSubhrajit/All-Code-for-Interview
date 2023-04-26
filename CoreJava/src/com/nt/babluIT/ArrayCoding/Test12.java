package com.nt.babluIT.ArrayCoding;

import java.util.Arrays;

public class Test12 {

	// 21 find smallest and second smallest element in an integer array
	// refer Test3.java

	static void getSmallestAndSecondSmallestElement(int[] array) {
		int smallest = array[0];
		int secondSmallest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				secondSmallest = smallest;
				smallest = array[i];
			} else {
				if (array[i] > smallest && array[i] < secondSmallest) {
					secondSmallest = array[i];
				}
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("smallest element::  " + smallest);
		System.out.println("secondSmallest element::  " + secondSmallest);

	}

	public static void main(String[] args) {
		getSmallestAndSecondSmallestElement(new int[] { 17, 11, 23, 64, 41, 88, 35 });

		System.out.println("===============================");

		getSmallestAndSecondSmallestElement(new int[] { -9, 3, 36, -25, -9, 71, 0 });

		System.out.println("===============================");

		getSmallestAndSecondSmallestElement(new int[] { 21, 21, -18, -4, -11, 85, 7 });

	}

}
