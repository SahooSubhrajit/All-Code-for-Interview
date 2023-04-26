package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) {
		
		Predicate<Integer> pred = (i) -> i >=10;
		System.out.println(pred.test(-10));
		System.out.println(pred.test(100));
	}

}
