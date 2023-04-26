package com.nt.babluIT.ArrayCoding;

import java.util.Arrays;

public class Test4 {

	// 7 separate zeros from non-zeros in an integer array

	// Moving Zeros To End Of An Array

	// same as Q24

	public static void moveZerosToEnd(int[] array) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[counter] = array[i];
				counter++;
			}
		}

		while (counter < array.length) {
			array[counter] = 0;
			counter++;
		}

		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {

		moveZerosToEnd(new int[] { 12, 0, 7, 0, 8, 0, 3 });

		moveZerosToEnd(new int[] { 1, -5, 0, 0, 8, 0, 1 });

		moveZerosToEnd(new int[] { 0, 1, 0, 1, -5, 0, 4 });

		moveZerosToEnd(new int[] { -4, 1, 0, 0, 2, 21, 4 });
	}

}
