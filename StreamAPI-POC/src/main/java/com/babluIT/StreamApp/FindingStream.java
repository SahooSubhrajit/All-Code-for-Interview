package com.babluIT.StreamApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindingStream {
	public static void main(String[] args) {
		List<Person2> list = new ArrayList<>();

		list.add(new Person2("David", 23, "India"));
		list.add(new Person2("Joy", 25, "USA"));
		list.add(new Person2("Ram", 45, "India"));
		list.add(new Person2("Ryan", 50, "Canada"));
		list.add(new Person2("Ching", 56, "China"));

		Optional<Person2> findAny = list.stream().filter(person -> person.age > 30).findAny();
		if (findAny.isPresent()) {
			System.out.println(findAny.get());
		}

		/*Stream<Person2> stream = list.stream();
		Optional<Person2> findFirst = stream.filter(person -> person.country.equals("India")).findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}*/

	}

}

class Person2 {
	String name;
	int age;
	String country;

	public Person2(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
}
