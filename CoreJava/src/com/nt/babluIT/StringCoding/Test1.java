package com.nt.babluIT.StringCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {

		// Reverse String

		String str = "Bablu";

		// Approach-1
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		// Approach-2
		char[] charArray = str.toCharArray();
		for (int j = charArray.length - 1; j >= 0; j--) {
			System.out.print(charArray[j]);
		}

		System.out.println();

		// Approach-3
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
		// Approach-4
		Arrays.stream(str.split(""))
	      .sorted(Comparator.reverseOrder())
	      .collect(Collectors.toList())
	      .forEach(i -> System.out.print(i));
		
		
	}

}
