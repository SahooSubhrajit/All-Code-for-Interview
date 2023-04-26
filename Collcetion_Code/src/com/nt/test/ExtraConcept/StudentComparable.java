package com.nt.test.ExtraConcept;

public class StudentComparable implements Comparable<StudentComparable> {

	private Integer rollno;
	private String name;
	private Integer age;

	StudentComparable(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(StudentComparable sc) {
		if (age > sc.age) {
			return 1;
		} else if (age < sc.age) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "StudentComparable [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

}
