package com.nt.babluIT.StringCoding;

import java.util.Arrays;

public class Test17 {
	public static void main(String[] args) {

		// count b occurance in string

		String[] str = { "abc", "bbc", "cas" };

		Arrays.stream(str)
		      .mapToInt(s -> (int) s.chars().filter(i -> i == 'b').count())
			  .forEach(i -> System.out.println(i));

	}

}
