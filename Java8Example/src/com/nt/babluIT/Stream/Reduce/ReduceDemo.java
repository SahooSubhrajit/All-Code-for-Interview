package com.nt.babluIT.Stream.Reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceDemo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Ram", 23, 20000));
		list.add(new Employee("Ashok", 25, 30000));
		list.add(new Employee("Suresh", 33, 25000));
		list.add(new Employee("Charan", 26, 40000));

		Optional<Integer> reduce = list.stream().map(i -> i.salary).reduce((p, q) -> p + q);
		if (reduce.isPresent()) {
			System.out.println(reduce.get());
		}

		System.out.println();

		double sum = list.stream().mapToDouble(i -> i.salary).sum();
		System.out.println(sum);

		System.out.println();

		System.out.println(list.stream().collect(Collectors.toMap(s -> s.name, s -> s.name.length())));

	}

}

class Employee {
	String name;
	int age;
	int salary;

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

}
