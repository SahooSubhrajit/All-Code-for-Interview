package com.nt.babluIT.ArrayCoding;

import java.util.Arrays;

public class Test8 {

	// 12 reverse an array without using an additional array

	static void reverseArray(int[] array) {
		System.out.println("Before reversing array::  " + Arrays.toString(array));

		int temp;
		System.out.println(array.length);

		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;

		}
		System.out.println("After reversing array::  " + Arrays.toString(array));

	}

	public static void main(String[] args) {
		reverseArray(new int[] { 4, 5, 8, 9, 10 });

		System.out.println("-------------------------");

		reverseArray(new int[] { 12, 9, 21, 17, 33, 7 });

		System.out.println("-------------------------");

		reverseArray(new int[] { 891, 569, 921, 187, 343, 476, 555 });

	}

}
