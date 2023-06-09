package com.nt.babluIT.StringCoding;

import java.util.Arrays;

public class Test12 {
	public static void main(String[] args) {

		// Find longest and smallest word from string

		String str = "This is Subhrajit Sahoo IT world";

		// Approach - 1
		String[] splitArray = str.split(" ");

		String smallestString = splitArray[0];
		String longestString = "";

		for (String strR : splitArray) {
			if (strR.length() < smallestString.length()) {
				smallestString = strR;
			} else if (strR.length() > smallestString.length()) {
				longestString = strR;
			}
		}
		System.out.println(smallestString + "   " + longestString);

		// Approach - 2
		
		String string = Arrays.stream(str.split(" "))
		      .reduce((a,b) -> a.length() > b.length() ? a : b)
		      .get();
		
		System.out.println(string);

	}

}
