package com.nt.babluIT.CodingJava8General;

import java.util.Arrays;

public class Test7 {

	// longest string from given array
	public static void main(String[] args) {

		String[] strArray = { "Subhrajit", "Citiustech123", "Sahoo", "Citiustech" };

		String string = Arrays.stream(strArray)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();

		System.out.println(string);

		int[] array = { 1, 8, 5, 9 };

		Integer integer = Arrays.stream(array).boxed().reduce((a, b) -> a > b ? a : b).get();

		System.out.println(integer);

	}

}
