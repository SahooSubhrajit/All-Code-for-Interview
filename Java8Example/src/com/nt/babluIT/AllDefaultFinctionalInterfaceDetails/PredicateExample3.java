package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

import java.util.function.Predicate;

public class PredicateExample3 {
	public static void main(String[] args) {

		String[] names = { "Sunny", "Rashmika", "Kajal", "Kareena", "Alia" };

		Predicate<String> p = s -> s.charAt(0) == 'K';

		for (String str : names) {
			if (p.test(str)) {
				System.out.println(str);
			}
		}
	}

}
