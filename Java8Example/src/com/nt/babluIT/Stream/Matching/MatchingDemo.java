package com.nt.babluIT.Stream.Matching;

import java.util.ArrayList;
import java.util.List;

public class MatchingDemo {
	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();

		list.add(new Person("David", 23, "India"));
		list.add(new Person("Joy", 25, "USA"));
		list.add(new Person("Ryan", 50, "Canada"));
		list.add(new Person("Ram", 45, "India"));
		list.add(new Person("Ching", 56, "China"));

		boolean anyMatch = list.stream().anyMatch(p -> p.country.equals("India"));
		System.out.println(anyMatch);
		System.out.println();

		boolean allMatch = list.stream().allMatch(p -> p.country.equals("India"));
		System.out.println(allMatch);
		System.out.println();

		boolean noneMatch = list.stream().noneMatch(p -> p.country.equals("India"));
		System.out.println(noneMatch);
		System.out.println();

	}

}

class Person {
	String name;
	int age;
	String country;

	public Person(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

}
