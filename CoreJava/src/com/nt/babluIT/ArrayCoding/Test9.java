package com.nt.babluIT.ArrayCoding;

import java.util.Arrays;

public class Test9 {

	// 13 remove duplicate elements from an array

	// refer Test3 from String question

	// refer Test1

	static void removeDuplicates(int[] array) {
		System.out.println("Before removing duplecate elements::  " + Arrays.toString(array));
		int arrayLength = array.length;

		for (int i = 0; i < arrayLength; i++) {
			for (int j = i + 1; j < arrayLength; j++) {
				if (array[i] == array[j]) {
					array[j] = array[arrayLength - 1];
					arrayLength--;
					j--;
				}
			}
		}

		int[] arrayWithNoDuplecate = Arrays.copyOf(array, arrayLength);
		System.out.println("arrayWithNoDuplecate::  " + Arrays.toString(arrayWithNoDuplecate));

	}

	public static void main(String[] args) {
		removeDuplicates(new int[] { 4, 3, 2, 4, 9, 2 });

		removeDuplicates(new int[] { 1, 2, 1, 2, 1, 2 });

		removeDuplicates(new int[] { 15, 21, 11, 21, 51, 21, 11 });

		removeDuplicates(new int[] { 7, 3, 21, 7, 34, 18, 3, 21 });

	}
}
