package com.nt.test.Map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap();
		hashMap.put(1, "ABC");
		hashMap.put(1, "BBC");
		hashMap.put(2, "Ram");
		hashMap.put(3, "Sam");
		hashMap.put(4, "Kam");

		// Iterate hashMap element

		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey() + "  " + next.getValue());
		}
		System.out.println();

		// Iterate hashMap element

		for (Map.Entry entryMap : hashMap.entrySet()) {
			System.out.println(entryMap.getKey() + "  " + entryMap.getValue());

		}
		System.out.println();

		// Iterate hashMap element by key
		hashMap.keySet().stream().forEach(i -> System.out.println(i));
		System.out.println();

		// Iterate hashMap element by value
		Collection<String> values = hashMap.values();
		for (String str : values) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println("comparingByKey()================");

		// comparingByKey()

		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(i -> System.out.println(i));
		System.out.println("comparingByKey() reverse order=============");

		// comparingByKey() reverse order

		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);
		System.out.println("comparingByValue()======");

		// comparingByValue()

		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(i -> System.out.println(i));
		System.out.println("comparingByValue() reverse order===============");

		// comparingByValue() reverse order

		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(i -> System.out.println(i));
		System.out.println("Tree Map interate=======");

		// Tree Map interate

		TreeMap<Integer, String> treeMap = new TreeMap(hashMap);
		for (Map.Entry entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}

	}

}
