package com.ct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapExample1 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(43, "Banana");
		map.put(40, "Grapes");

		/*for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}*/

		List<Entry<Integer, String>> al = new ArrayList(map.entrySet());

		/*Collections.sort(al,
				(Entry<Integer, String> o1, Entry<Integer, String> o2) -> o1.getKey().compareTo(o2.getKey()));*/
		
		Collections.sort(al,
				(Entry<Integer, String> o1, Entry<Integer, String> o2) -> o1.getValue().compareTo(o2.getValue()));

		al.forEach(i -> System.out.println(i));

		/*for (Integer in : map.keySet()) {
			System.out.print(in + "  ");
		}
		System.out.println();
		
		for (String str : map.values()) {
			System.out.print(str + " ");
		}*/

		System.out.println();

		/*map.entrySet()
		   .stream()
		   .sorted(Map.Entry.comparingByKey())
		   .collect(Collectors.toList())
		   .forEach(System.out::println);  System.out.println();
		
		map.entrySet()
		   .stream()
		   .sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
		   .forEach(System.out::println);  System.out.println();
		   
		
		   map.entrySet()
		      .stream()
		      .sorted(Map.Entry.comparingByValue())
		      .forEach(i -> System.out.println(i));  System.out.println();
		   
		   
		   map.entrySet()
		      .stream()
		      .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
		      .collect(Collectors.toList())
		      .forEach(i -> System.out.println(i));*/

	}

}
