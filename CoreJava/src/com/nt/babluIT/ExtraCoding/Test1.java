package com.nt.babluIT.ExtraCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {

		// find all number who is starting from 1
		List<Integer> ll = Arrays.asList(1, 15, 14, 12, 55, 24, 30, 14);

		ll.stream().map(s -> s + "").filter(i -> i.startsWith("1")).distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();

		// Merge two list elements
		List<Integer> al = Arrays.asList(1, 2, 3);
		List<Integer> al1 = Arrays.asList(4, 5, 6, 2, 3);

		// 1
		Stream.concat(al.stream(), al1.stream()).collect(Collectors.toList()).forEach(i -> System.out.print(i + " "));

		System.out.println();

		// 2
		List<Integer> mergeList = Stream.concat(al.stream(), al1.stream()).collect(Collectors.toList());

		mergeList.stream().distinct().forEach(i -> System.out.print(i + "  "));
		System.out.println();

		// 3
		Set<Integer> collect = mergeList.stream().collect(Collectors.toSet());
		System.out.println(collect);

	}

}
