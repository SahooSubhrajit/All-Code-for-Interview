package com.nt.babluIT.ExtraCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test5 {

	// print Product and product comment in count
	public static void main(String[] args) {
		List<String> al = Arrays.asList("Samsung", "Apple", "Nokia");

		List<String> alComment = Arrays.asList("Samsung com1", "Nokia com1", "Apple com1", "Apple com2", "Nokia com2",
				"Apple com3");

		HashMap<String, Integer> hm = new HashMap<>();

		for (String s : al) {
			for (String s1 : alComment) {
				if (s1.contains(s)) {
					if (hm.containsKey(s)) {
						hm.put(s, hm.get(s) + 1);
					} else {
						hm.put(s, 1);
					}
				}

			}
		}

		hm.entrySet().stream().forEach(i -> System.out.println(i.getKey() + "  " + i.getValue()));
	}

}
