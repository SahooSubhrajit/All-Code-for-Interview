package com.nt.babluIT.CodingJava8General;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {
	public static void main(String[] args) {

		// find first non repeat element from string

		String str = "subhrajitsahoo";
		
		String string = Arrays.stream(str.split(""))
		      .collect(Collectors.groupingBy(String::toString, LinkedHashMap::new, Collectors.counting()))
		      .entrySet().stream()
		      .filter(i -> i.getValue() == 1)
		      .map(Map.Entry::getKey)
		      .findFirst()
		      .get();
		System.out.println(string);
		
		

	}

}
