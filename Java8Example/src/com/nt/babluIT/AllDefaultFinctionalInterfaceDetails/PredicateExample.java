package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		NumberTestInterface numberTest = (i) -> i > 10;
		System.out.println(numberTest.test(10));
		System.out.println(numberTest.test(12));

		Predicate<Integer> ageTest = (i) -> i >= 18;
		if (ageTest.test(18)) {
			System.out.println("You are eligiable for Vote");
		} else {
			System.out.println("You are not eligiable for Vote");
		}

	}

}

@FunctionalInterface
interface NumberTestInterface {
	public boolean test(Integer i);
}
