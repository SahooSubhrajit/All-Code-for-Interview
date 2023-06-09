package com.nt.babluIT.StringCoding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test4 {
	public static void main(String[] args) {

		// sort string in alphabetical order

		String str = "rock";

		// Approach - 1

		char[] charArray = str.toCharArray();
		char temp;

		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] > charArray[j]) {
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		System.out.println(new String(charArray));

		// Approach - 2
		Arrays.sort(charArray);
		System.out.println(charArray);
		
		
		// Approach - 3
		Arrays.stream(str.split(""))
		      .sorted()
		      .collect(Collectors.toList())
		      .forEach(i -> System.out.print(i));
	}

}
