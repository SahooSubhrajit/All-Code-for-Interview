package com.nt.babluIT.CodingJava8General;

import java.util.Arrays;

public class Test6 {
	// find 2nd lowest element from array
		public static void main(String[] args) {

			int[] array = { 5, 8, 1, 4, 3, 7 };

			 Integer integer = Arrays.stream(array)
					                     .boxed()
					                     .sorted()
					                     .skip(1)
					                     .findFirst().get();
			System.out.println(integer);

		}

}
