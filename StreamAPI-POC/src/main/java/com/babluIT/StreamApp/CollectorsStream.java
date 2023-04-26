package com.babluIT.StreamApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsStream {
	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();

		list.add(new Employee1("Ram", 23, 20000));
		list.add(new Employee1("Ashok", 25, 30000));
		list.add(new Employee1("Suresh", 33, 25000));
		list.add(new Employee1("Charan", 26, 40000));
		
		List<Employee1> collect = list.stream()
		    .filter(sal -> sal.salary >= 25000)
		    .collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		 List<Integer> collect2 = list.stream()
		    .map(nam -> nam.salary).collect(Collectors.toList());
		System.out.println(collect2);

	}

}

class Employee1 {
	String name;
	int age;
	int salary;

	public Employee1(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
