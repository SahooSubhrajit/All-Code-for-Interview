package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {

		Function<String, Integer> fun = s -> s.length();

		Integer apply = fun.apply("Subhrajit Sahoo");
		System.out.println(apply);

		Function<Integer, Integer> fun1 = i -> i * i;

		Integer apply2 = fun1.apply(4586);
		System.out.println(apply2);
		System.out.println();

		System.out.println(getValue(568582));
	}

	public static Integer getValue(Integer val) {
		Function<Integer, Integer> fun1 = i -> i * i;
		return fun1.apply(val);

	}

}
