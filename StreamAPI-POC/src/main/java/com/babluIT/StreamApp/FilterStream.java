package com.babluIT.StreamApp;

import java.util.ArrayList;
import java.util.List;

public class FilterStream {
	public static void main(String[] args) {
		List<person> persons = new ArrayList<>();

		persons.add(new person("Bablu", 25));
		persons.add(new person("Gudu", 45));
		persons.add(new person("Ashok", 28));
		persons.add(new person("Dharam", 27));
		persons.add(new person("Sabyasachi", 25));
		persons.add(new person("Kumar", 35));
		persons.add(new person("Srinivas", 30));

//		persons.stream().forEach(System.out::println);
//		persons.stream().forEach(i -> System.out.println(i));
//		persons.stream().filter(i -> i.age >30).forEach(System.out::println);
//		persons.stream().filter(i -> i.name.equals("Kumar")).forEach(System.out::println);
		
		persons.stream()
			   .filter(i -> i.name!=null)
			   .filter(i -> i.age > 20)
			   .filter(i -> i.age <=35)
			   .forEach(System.out::println);
		
//		persons.stream().map(ag -> ag.age).forEach(System.out::println);

	}

}

class person {
	String name;
	Integer age;

	public person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

}
