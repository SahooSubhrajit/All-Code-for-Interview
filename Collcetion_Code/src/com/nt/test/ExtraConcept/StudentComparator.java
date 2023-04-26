package com.nt.test.ExtraConcept;

public class StudentComparator {
	private Integer rollno;
	private String name;
	private Integer age;

	StudentComparator(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentComparable [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

}
