package com.nt.babluIT.ExtraCoding;

import java.util.HashMap;
import java.util.Map;

public class Test8 {

	// https://javaconceptoftheday.com/print-common-characters-between-two-strings-in-alphabetical-order-in-java/
	public static void main(String[] args) {

		String str = "abc";

		String str1 = "aacsddd";

		HashMap<Character, Integer> hm1 = new HashMap();

		HashMap<Character, Integer> hm2 = new HashMap();

		HashMap<Character, Integer> hm3 = new HashMap();

		HashMap<Character, Integer> hm4 = new HashMap();

		for (Character c : str.toCharArray()) {
			if (hm1.containsKey(c)) {
				hm1.put(c, hm1.get(c) + 1);
			} else {
				hm1.put(c, 0);
			}
		}

		for (Character c : str1.toCharArray()) {
			if (hm2.containsKey(c)) {
				hm2.put(c, hm2.get(c) + 1);
			} else {
				hm2.put(c, 0);
			}
		}

		for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
			for (Map.Entry<Character, Integer> entry1 : hm2.entrySet()) {
				if (entry.getKey().equals(entry1.getKey())) {
					hm3.put(entry.getKey(), 1);
				}

			}

		}

		hm3.entrySet().stream().map(s -> s.getKey()).forEach(i -> System.out.print(i + "   "));

		for (Character c : str.toCharArray()) {
			for (Character c1 : str1.toCharArray()) {
				if (c.equals(c1)) {
					if (hm4.containsKey(c)) {
						hm4.put(c, hm4.get(c) + 1);
					} else {
						hm4.put(c, 0);
					}
				}
			}
		}

		System.out.println();

		hm4.entrySet().stream().map(s -> s.getKey()).forEach(i -> System.out.print(i + "   "));

	}

}
