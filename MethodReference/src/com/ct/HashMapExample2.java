package com.ct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapExample2 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(9, "Apple");
		map.put(8, "Banana");
		map.put(5, "Grapes");

//		Set<Entry<Integer, String>> entrySet = map.entrySet();

		List<Entry<Integer, String>> al = new ArrayList<Entry<Integer, String>>(map.entrySet());

		Collections.sort(al, new Comparator<Entry<Integer, String>>() {

			/*@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				if (o1.getKey() == o2.getKey()) {
					return 0;
				} else if (o1.getKey() > o2.getKey()) {
					return 1;
				} else
					return -1;
			}*/

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		al.forEach(System.out::println);

	}

}
