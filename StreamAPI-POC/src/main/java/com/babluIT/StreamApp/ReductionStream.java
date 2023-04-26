package com.babluIT.StreamApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReductionStream {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Ram", 23, 20000));
		list.add(new Employee("Ashok", 25, 30000));
		list.add(new Employee("Suresh", 33, 25000));
		list.add(new Employee("Charan", 26, 40000));

		Stream<Employee> stream = list.stream();
		Stream<Integer> map = stream.map(e -> e.salary);
		Optional<Integer> reduce = map.reduce((p, q) -> p + q);
		if (reduce.isPresent()) {
			System.out.println(reduce.get());
		}

		int sum = list.stream().mapToInt(sal -> sal.salary).sum();

		System.out.println("Total Salary :: " + sum);

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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
