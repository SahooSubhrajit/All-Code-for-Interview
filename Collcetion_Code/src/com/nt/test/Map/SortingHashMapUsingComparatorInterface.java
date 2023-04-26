package com.nt.test.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingHashMapUsingComparatorInterface {
	public static void main(String[] args) {

		// Sort HashMap by Values using Comparator Interface

		Map<Integer, String> hashMap = new HashMap();
		hashMap.put(100, "Subhrajit");
		hashMap.put(11488, "Jajay123");
		hashMap.put(254, "Subhanm");
		hashMap.put(3, "Abahya");
		hashMap.put(4, "Jajay");

		List<Entry<Integer, String>> list = new ArrayList(hashMap.entrySet());

		Collections.sort(list, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> entry1, Entry<Integer, String> entry2) {
				return entry1.getValue().compareTo(entry2.getValue());
			}

		});

		for (Entry<Integer, String> entry : list) {
			System.out.println(entry.getKey());
		}

	}

}
