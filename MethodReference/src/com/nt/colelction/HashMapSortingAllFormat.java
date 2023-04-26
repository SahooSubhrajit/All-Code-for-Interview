package com.nt.colelction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapSortingAllFormat {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(43, "Banana");
		map.put(40, "Grapes");

		// Comparing by key
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(i -> System.out.println(i));

		System.out.println();

		// Comparing by key reverse order
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(i -> System.out.println(i));

		System.out.println();

		// Comparing by value
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(i -> System.out.println(i));

		System.out.println();

		// Comparing by value reverse order
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(i -> System.out.println(i));

		System.out.println();

		// Using comparator
		Set<Entry<Integer, String>> entrySet = map.entrySet();

		List<Entry<Integer, String>> al = new ArrayList<Map.Entry<Integer, String>>(entrySet);

		Collections.sort(al, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				
				if (o1.getKey() == o2.getKey()) {
					return 0;
				} else if (o1.getKey() > o2.getKey()) {
					return 1;
				} else
					return -1;
			}

			/*@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getKey().compareTo(o2.getKey());
			//				return o2.getKey().compareTo(o1.getKey());
			}*/
		});

//         Collections.sort(al, (Entry<Integer, String> o1, Entry<Integer, String> o2) -> o1.getValue().compareTo(o2.getValue()));

		al.stream().collect(Collectors.toList()).forEach(i -> System.out.println(i));
	}

}
