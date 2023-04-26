//Given the list of integers, find the first element of the list using Stream functions?


package com.babluIT.PracticeQuestionOnStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q4 {
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		myList.stream()
		      .findFirst()
		      .ifPresent(System.out::println);
		
		System.out.println();
		
		Optional<Integer> findFirst = myList.stream().findFirst();
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
	      
		
	}

}
