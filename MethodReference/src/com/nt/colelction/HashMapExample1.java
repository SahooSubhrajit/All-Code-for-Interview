package com.nt.colelction;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapExample1 {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(43, "Banana");
		map.put(40, "Grapes");

//		map.replace(43,"Banana","Hi");
		
		
		map.entrySet()
		   .stream()
		   .sorted(Map.Entry.comparingByValue())
		   .forEach(i -> System.out.println(i));
		
		System.out.println();
		
		map.entrySet()
		   .stream()
		   .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		   .forEach(i -> System.out.println(i));

		/*for (Integer m : map.keySet()) {
			System.out.println(m);
		}
		
		System.out.println();
		
		for (String str : map.values()) {
			System.out.print(str + "  ");
		}
		
		System.out.println();
		
		System.out.println("Iterating Hashmap...");
		System.out.println();
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());
		}
		
		System.out.println();
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList())
				.forEach(System.out::println);
		
		System.out.println();
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toList())
				.forEach(System.out::println);
		
		System.out.println();
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList())
				.forEach(System.out::println);
		
		System.out.println();
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toList()).forEach(System.out::println);
		
		TreeMap<Integer,String> trmp = new TreeMap<Integer, String>(map);
		for(Map.Entry m: trmp.entrySet()) {
			System.out.println(m.getKey()+ "   "+m.getValue());
		}*/
	}
}