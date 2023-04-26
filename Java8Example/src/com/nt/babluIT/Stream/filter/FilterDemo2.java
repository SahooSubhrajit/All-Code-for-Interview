package com.nt.babluIT.Stream.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo2 {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Ashok", 28));
		persons.add(new Person("Dharam", 27));
		persons.add(new Person("Sabyasachi", 25));
		persons.add(new Person("Kumar", 35));
		persons.add(new Person("Srinivas", 30));

		persons.stream().filter(per -> per.age >= 26 && per.age <= 30).forEach(i -> System.out.println(i));

		System.out.println();

		persons.stream().filter(per -> per.age >= 26).filter(i -> i.age <= 30)
				.forEach(sks -> System.out.println(sks.age + " " + sks.name));

	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
