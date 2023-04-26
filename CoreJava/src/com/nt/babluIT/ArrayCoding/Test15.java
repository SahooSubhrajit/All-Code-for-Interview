package com.nt.babluIT.ArrayCoding;

public class Test15 {

	// 27 Java program to find array triplets such that sum of first two elements
	// equals the third element

	private static void getArrayTriplets(int[] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				for (int k = j + 1; k < array.length; k++) {

					if (array[i] + array[j] == array[k]) {
						System.out.println("[" + array[i] + ", " + array[j] + ", " + array[k] + "]");
					} else if (array[i] + array[k] == array[j]) {
						System.out.println("[" + array[i] + ", " + array[k] + ", " + array[j] + "]");
					} else if (array[j] + array[k] == array[i]) {
						System.out.println("[" + array[j] + ", " + array[k] + ", " + array[i] + "]");
					}

				}

			}
		}

	}

	public static void main(String[] args) {
		getArrayTriplets(new int[] { 21, 13, 47, 61, 34, 40, 55, 71, 87 });

	}

}
