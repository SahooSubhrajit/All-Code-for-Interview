package com.nt.babluIT.StringCoding;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {

		// Remove duplicate character from string

		// refer Test9 from Array question

		String str = "Programming";

		// Approach -1
		StringBuilder sb = new StringBuilder();

		Set<Character> set = new LinkedHashSet();
		for (int i = 0; i < str.length() - 1; i++) {
			set.add(str.charAt(i));
		}

		for (Character ch : set) {
			sb.append(ch);
		}
		System.out.print(sb.toString());
		System.out.println();

		// Approach -2

		char[] charArray = str.toCharArray();
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			Boolean flag = false;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				sb1.append(charArray[i]);
			}
		}
		System.out.println(sb1.toString());

		// Approach -3

		StringBuilder sb2 = new StringBuilder();

		str.chars().distinct().forEach(ch -> sb2.append((char) ch));

		// Arrays.stream(str.split("")).distinct().forEach(i -> sb2.append(i));
		System.out.println(sb2);

	}

}
