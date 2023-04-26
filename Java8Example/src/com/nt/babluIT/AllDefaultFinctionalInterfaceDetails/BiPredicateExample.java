package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static boolean isPersonEligForVote(Person person, Integer minAge, BiPredicate<Person, Integer> biPredicate) {
		return biPredicate.test(person, minAge);
	}

	public static void main(String[] args) {

		Person p = new Person("Alex", 52);

		BiPredicate<Person, Integer> biP = (Person, i) -> p.age > i;

		boolean personEligForVote = BiPredicateExample.isPersonEligForVote(p, 18, biP);

		if (personEligForVote) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Not Eligible for vote");
		}

	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
