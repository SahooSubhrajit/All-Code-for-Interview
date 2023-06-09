package com.nt.babluIT.ExtraCoding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test7 {

	// List to Map

	public static void main(String[] args) {

		ArrayList<hii> al = new ArrayList<>();

		al.add(new hii(101, "Ram", 58566l));
		al.add(new hii(102, "Ram11", 58566l));
		al.add(new hii(103, "Ram123", 58566l));

		al.stream().collect(Collectors.toMap(hii::getId, hii::getName)).entrySet().stream()
				.forEach(i -> System.out.println(i.getKey() + "  " + i.getValue()));

	}
}

class hii {
	Integer id;
	String name;
	Long salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public hii(Integer id, String name, Long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}
