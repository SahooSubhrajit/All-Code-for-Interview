//Given a list of integers, find out all the even numbers exist in the list using Stream functions?

package com.babluIT.PracticeQuestionOnStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
	public static void main(String[] args) {

		List<Integer> ll = Arrays.asList(1, 25, 85, 45, 96, 88, 72, 78, 99, 23);

		ll.stream()
		  .filter(i -> i % 2 == 0)
		  .forEach(System.out::println);
		

		System.out.println();

		long count = ll.stream().filter(n -> n % 2 == 0).count();
		System.out.println("even numbers Count::  "+count);
		
		System.out.println();
		
		ll.stream().filter(i -> i%2 == 0)
	      .collect(Collectors.toList())
	      .forEach(i -> System.out.println(i));
	}

}
