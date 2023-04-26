package com.nt.babluIT.CodingJava8General;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Test9 {
	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 5, 8, 3, 8, -7);

		Integer integer = asList.stream().min((a, b) -> b.compareTo(a)).get();

		System.out.println("Max element::  " + integer);

		System.out.println("Min Element:: " + asList.stream().min((a, b) -> a.compareTo(b)).get());

		Integer integer2 = asList.stream().min(Comparator.comparing(s -> s)).get();

		System.out.println("Min element ::  " + integer2);

		Integer integer3 = asList.stream().max(Comparator.comparing(s -> s)).get();

		System.out.println("Max element ::  " + integer3);

		Integer integer4 = asList.stream().max(Comparator.comparing(Function.identity())).get();

		System.out.println("Max element ::  " + integer4);

	}

}
