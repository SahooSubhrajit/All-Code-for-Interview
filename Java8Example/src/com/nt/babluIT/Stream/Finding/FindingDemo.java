package com.nt.babluIT.Stream.Finding;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingDemo {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();

		list.add(new Person("David", 23, "India"));
		list.add(new Person("Joy", 25, "USA"));
		list.add(new Person("Ryan", 50, "Canada"));
		list.add(new Person("Ram", 45, "India"));
		list.add(new Person("Ching", 56, "China"));

		Optional<Person> findAny = list.stream().findAny();
		if (findAny.isPresent()) {
			System.out.println(findAny.get());
		}
		System.out.println();

		Optional<Person> findFirst = list.stream().filter(i -> i.age > 18).findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}

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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
}
