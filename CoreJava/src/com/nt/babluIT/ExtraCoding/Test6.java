package com.nt.babluIT.ExtraCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test6 {

	// print Country and common player name from 2 list
	public static void main(String[] args) {

		HashMap<String, List<String>> hm = new HashMap<>();

		hm.put("India1", Arrays.asList("D1", "D2"));
		hm.put("India2", Arrays.asList("D21", "D3"));
		hm.put("India3", Arrays.asList("D4", "D5"));

		HashMap<String, List<String>> hm1 = new HashMap<>();

		hm1.put("India1", Arrays.asList("D1", "D2", "D3"));
		hm1.put("India2", Arrays.asList("D21", "D3", "D"));
		hm1.put("India3", Arrays.asList("D41", "D51", "D5"));

		HashMap<String, String> hm3 = new HashMap<>();

		for (Map.Entry<String, List<String>> entry : hm.entrySet()) {
			List<String> value = entry.getValue();

			for (Map.Entry<String, List<String>> entry1 : hm1.entrySet()) {
				List<String> value1 = entry1.getValue();

				if (entry.getKey().equals(entry1.getKey())) {
					for (String s : value) {
						for (String s1 : value1) {
							if (s1.equals(s)) {
								hm3.put(entry.getKey(), s);
							}
						}
					}
				}
			}
		}

		hm.entrySet().stream().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
		System.out.println();
		hm1.entrySet().stream().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
		System.out.println();
		hm3.entrySet().stream().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
		System.out.println();

		hm3.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
				.forEach(i -> System.out.println(i.getKey() + "   " + i.getValue()));

	}

}
