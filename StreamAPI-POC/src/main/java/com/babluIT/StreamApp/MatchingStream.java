package com.babluIT.StreamApp;

import java.util.ArrayList;
import java.util.List;

public class MatchingStream {
	public static void main(String[] args) {

		List<Person1> list = new ArrayList<>();

		list.add(new Person1("David", 23, "India"));
		list.add(new Person1("Joy", 25, "USA"));
		list.add(new Person1("Ryan", 50, "Canada"));
		list.add(new Person1("Ram", 45, "India"));
		list.add(new Person1("Ching", 56, "China"));

		boolean anyMatch = list.stream().anyMatch(person -> person.country.equals("India"));
		System.out.println("Is there any Indian in the Collection :: " + anyMatch);  System.out.println();
		
		boolean allMatch = list.stream().allMatch(person -> person.country.equals("India"));
		System.out.println("Is there any Indian in the Collection :: " + allMatch); System.out.println();
		
		boolean noneMatch = list.stream().noneMatch(person -> person.country.equals("China"));
		System.out.println("Is there any China in the Collection :: " + noneMatch);  System.out.println();

	}

}

class Person1 {
	String name;
	int age;
	String country;

	public Person1(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", country=" + country + "]";
	}

}
