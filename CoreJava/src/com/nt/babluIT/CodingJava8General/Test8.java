package com.nt.babluIT.CodingJava8General;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test8 {

	// find elements from array who starts with 1
	public static void main(String[] args) {

		int[] array = { 5, 12, 51, 56, 11, 1 };
		
		Arrays.stream(array)
		      .boxed()
		      .map(s -> s.toString()+"")
		      .filter(i -> i.startsWith("1"))
		      .collect(Collectors.toList())
		      .forEach(i -> System.out.print(i+"  "));

	}

}
