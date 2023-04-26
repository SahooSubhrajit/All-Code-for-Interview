package com.nt.babluIT.CodingJava8General;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test2 {

	// all duplicate elements from given string
	public static void main(String[] args) {

		String str = "subhrajitsahoo";
		
		List<Entry<String,Long>> collect = Arrays.stream(str.split(""))
		      .collect(Collectors.groupingBy(String::toString, Collectors.counting()))
		      .entrySet()
		      .stream()
		      .filter(i -> i.getValue() > 1)
		      .collect(Collectors.toList());
		
		for (Entry<String, Long> entry : collect) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		/*List<String> collect = Arrays.stream(str.split(""))
			      .collect(Collectors.groupingBy(String::toString, Collectors.counting()))
			      .entrySet()
			      .stream()
			      .filter(i -> i.getValue() > 1)
			      .map(i -> i.getKey())
			      .collect(Collectors.toList());
		System.out.println(collect);*/
			
			

	}

}
