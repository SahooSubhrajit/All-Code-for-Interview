package com.nt.test.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestPractice {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap();

		map.put(100, "Amit");
		map.put(102, "Rahul");
		map.put(101, "Vijay");

		Set<Entry<Integer, String>> entrySet = map.entrySet();

		List<Entry<Integer, String>> list = new ArrayList<>(entrySet);

		Collections.sort(new ArrayList<>(entrySet), new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> a1, Entry<Integer, String> a2) {
				return a1.getKey().compareTo(a2.getKey());
			}

		});

		list.stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(i -> System.out.println(i.getKey() + "   " + i.getValue()));

	}

}
