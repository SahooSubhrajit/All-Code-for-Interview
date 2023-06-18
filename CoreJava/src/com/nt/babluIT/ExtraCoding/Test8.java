package com.nt.babluIT.ExtraCoding;

import java.util.HashMap;
import java.util.Map;

public class Test8 {

	// https://javaconceptoftheday.com/print-common-characters-between-two-strings-in-alphabetical-order-in-java/
	public static void main(String[] args) {
		String str = "abc";

		String str1 = "aacsd";

		HashMap<Character, Integer> hm1 = new HashMap();

		for (Character s : str.toCharArray()) {
			if (hm1.containsKey(s)) {
				hm1.put(s, hm1.get(s) + 1);
			} else {
				hm1.put(s, 0);
			}
		}

		for (Character c : str1.toCharArray()) {
			if (hm1.containsKey(c)) {
				hm1.put(c, hm1.get(c) + 1);
			} else {
				hm1.put(c, 0);
			}
		}

		hm1.entrySet().stream().filter(i -> i.getValue() >= 1).map(Map.Entry::getKey)
				.forEach(i -> System.out.print(i + "  "));
	}

}
