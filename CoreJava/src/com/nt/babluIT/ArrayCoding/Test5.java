package com.nt.babluIT.ArrayCoding;

import java.util.Arrays;

public class Test5 {

	// 7 separate zeros from non-zeros in an integer array

	// Moving Zeros To The Front Of An Array


	public static void moveZerosToFront(int[] array) {
		int counter = array.length - 1;

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != 0) {
				array[counter] = array[i];
				counter--;
			}
		}

		while (counter >= 0) {
			array[counter] = 0;
			counter--;
		}

		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {

		moveZerosToFront(new int[] { 12, 0, 7, 0, 8, 0, 3 });

		moveZerosToFront(new int[] { 1, -5, 0, 0, 8, 0, 1 });

		moveZerosToFront(new int[] { 0, 1, 0, 1, -5, 0, 4 });

		moveZerosToFront(new int[] { -4, 1, 0, 0, 2, 21, 4 });

	}

}
