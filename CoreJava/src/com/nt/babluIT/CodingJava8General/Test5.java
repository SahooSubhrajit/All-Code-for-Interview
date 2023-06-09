package com.nt.babluIT.CodingJava8General;

import java.util.Arrays;
import java.util.Comparator;

public class Test5 {

	// find 2nd highest element from array
	public static void main(String[] args) {

		int[] array = { 5, 8, 1, 4, 3, 7 };

		 Integer integer = Arrays.stream(array)
				                     .boxed()
				                     .sorted(Comparator.reverseOrder())
				                     .skip(1)
				                     .findFirst().get();
		System.out.println(integer);
		
		
		Integer integer1 = Arrays.stream(array)
			      .boxed()
			      .sorted((a,b) -> b.compareTo(a))
			      .skip(1)
			      .findFirst().get();
			
			System.out.println(integer1);

	}

}
