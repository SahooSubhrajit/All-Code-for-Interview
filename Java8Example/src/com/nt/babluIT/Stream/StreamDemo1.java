package com.nt.babluIT.Stream;

import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {

		Stream<Integer> str = Stream.of(1, 5, 8, 6, 9);
		str.forEach(i -> System.out.print(i + " "));
	}

}
