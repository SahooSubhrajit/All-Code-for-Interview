package com.nt.babluIT.StringCoding;

import java.util.HashMap;

public class Test7 {
	public static void main(String[] args) {

		// frequency of string

		String str = "Pipe Line";

		String lowerCase = str.toLowerCase();

		// Approach -1

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (int i = 0; i < lowerCase.length() - 1; i++) {
				if (ch == lowerCase.charAt(i)) {
					count++;
				}
			}
		
			if (count != 0) {
				System.out.println(ch + "  " + count);
			}
		}

		System.out.println();

		// Approach -2

		HashMap<Character, Integer> hm = new HashMap<>();
		
		char ch = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}

		hm.entrySet().stream().filter(i -> i.getKey() != ch)
				.forEach(i -> System.out.println(i.getKey() + "  " + i.getValue()));
	}

}
