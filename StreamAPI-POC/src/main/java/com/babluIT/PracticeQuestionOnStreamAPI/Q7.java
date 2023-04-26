// Given a list of integers, sort all the values present in it using Stream functions?

package com.babluIT.PracticeQuestionOnStreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		//Ascending order
		myList.stream()
		      .sorted()
		      .forEach(i -> System.out.print(i+"  "));
		
		System.out.println();
		
		//descending order
		myList.stream()
		      .sorted(Collections.reverseOrder())
		      .collect(Collectors.toList())
		      .forEach(i -> System.out.print(i+"  "));
		
		
	}

}
