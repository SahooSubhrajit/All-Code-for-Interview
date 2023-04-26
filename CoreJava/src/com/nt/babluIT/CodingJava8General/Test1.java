package com.nt.babluIT.CodingJava8General;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//  https://www.youtube.com/watch?v=1Ps5F1PU72M

public class Test1 {

	// count occurance of each character in string
	public static void main(String[] args) {

		String str = "subhrajitsahoo";

		/*Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(String::toString, Collectors.counting()));*/

		/*Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/

		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(s -> s.toString(), Collectors.counting()));

		for (Map.Entry<String, Long> entry : collect.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

}
