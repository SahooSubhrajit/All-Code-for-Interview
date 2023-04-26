//Given a list of integers, find out all the numbers starting with 1 using Stream functions?

package com.babluIT.PracticeQuestionOnStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
	public static void main(String[] args) {
		
		List<Integer> ll = Arrays.asList(1, 25, 85, 1445, 96, 88, 72, 178, 99, 23);
		
		ll.stream()
		  .map(s -> s+"")
		  .filter(i -> i.startsWith("1"))
		  .collect(Collectors.toList())
		  .forEach(System.out::println);
		
		System.out.println();
		
		List<String> lstring = Arrays.asList("Babu","Mahi","Madhu","Madhabi");
		
		lstring.stream()
		       .filter(i -> i.startsWith("M"))
		       .forEach(str -> System.out.print(str+"  "));
		
		
	}

}
