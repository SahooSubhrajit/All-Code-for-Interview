package com.nt.babluIT.ArrayCoding;

public class Test1 {
	public static void main(String[] args) {

		// print duplicate elements in array

		// refer Test9

		int[] a = { 5, 6, 8, 4, 5, 3, 6, 2, 3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}

	}

}
