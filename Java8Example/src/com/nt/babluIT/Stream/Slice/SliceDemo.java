package com.nt.babluIT.Stream.Slice;

import java.util.ArrayList;
import java.util.List;

public class SliceDemo {
	public static void main(String[] args) {

		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("China");
		countries.add("India");
		countries.add("USA");

		countries.stream().distinct().forEach(i -> System.out.println(i));

		System.out.println();

		countries.stream().limit(3).forEach(i -> System.out.println(i));

		System.out.println();

		countries.stream().skip(2).forEach(i -> System.out.println(i));
	}

}
