package com.nt.babluIT.StringCoding;

import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) {

		// Reverse each word in String

		String str = "Java Code";

		String[] splitArray = str.split(" ");
		String outPutWord = "";

		for (String word : splitArray) {
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + word.charAt(i);
			}
			outPutWord = outPutWord + reverseWord + "  ";
		}
		System.out.println(outPutWord);

		System.out.println();

		StringBuilder sb = new StringBuilder();
		for (String word : splitArray) {
			for (int i = word.length() - 1; i >= 0; i--) {
				sb.append(word.charAt(i));
			}
			sb.append(" ");
		}
		System.out.println(sb);
		
		System.out.println();
		
		Arrays.stream(str.split(" "))
		      .sorted()
		      .forEach(i -> System.out.print(i+" "));

	}

}
