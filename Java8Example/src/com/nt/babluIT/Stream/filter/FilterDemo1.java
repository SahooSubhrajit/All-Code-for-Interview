package com.nt.babluIT.Stream.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList();

		list.add(1);
		list.add(12);
		list.add(8);
		list.add(15);
		list.add(3);

		list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

		list.stream().filter(i -> i > 10).forEach(System.out::print);
	}

}
