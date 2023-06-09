package com.nt.babluIT.CodingJava8General;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test3 {

	// find out unique elements from string
	public static void main(String[] args) {
		
		String str = "subhrajitsahoo";
		
		Arrays.stream(str.split(""))
		      .collect(Collectors.groupingBy(String::toString, Collectors.counting()))
		      .entrySet()
		      .stream()
		      .filter(i -> i.getValue() == 1)
		      .map(s -> s.getKey())
		      .collect(Collectors.toList())
		      .forEach(i -> System.out.print(i+" "));
		
		
		/*List<String> collect = Arrays.stream(str.split(""))
			      .collect(Collectors.groupingBy(String::toString, Collectors.counting()))
			      .entrySet()
			      .stream()
			      .filter(i -> i.getValue() == 1)
			      .map(Map.Entry::getKey)
			      .collect(Collectors.toList());
			
			System.out.println(collect);*/

	}

}
