package com.babluIT.StreamApp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AggregateStream {
	public static void main(String[] args) {
		List<Employee3> list = new ArrayList<>();

		list.add(new Employee3("Ram", 23, 20000));
		list.add(new Employee3("Ashok", 25, 30000));
		list.add(new Employee3("Suresh", 33, 25000));
		list.add(new Employee3("Charan", 26, 40000));

		Double avgSalary = list.stream().collect(Collectors.averagingInt(emp -> emp.salary));
		System.out.println("Avg Salary For Emp :: " + avgSalary);
		
		System.out.println(list.stream().map(i -> i.salary).mapToInt(Integer::intValue).average().getAsDouble());;

		/*Optional<Employee> minSalEmp = list.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Min Salary :: " + minSalEmp.get());*/
		
		list.stream().map(i -> i.salary).min(Integer::compareTo).ifPresent(i -> System.out.println("Min Salary :: " +i));
		
		list.stream().map(i -> i.salary).max(Integer::compareTo).ifPresent(i -> System.out.println("Max Salary :: " +i));

		 list.stream()
			 .collect(Collectors.maxBy(Comparator.comparing(Employee3::getSalary)))
			 .ifPresent(i -> System.out.println(i));

	}

}

class Employee3 {
	String name;
	int age;
	int salary;

	public Employee3(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee3 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}