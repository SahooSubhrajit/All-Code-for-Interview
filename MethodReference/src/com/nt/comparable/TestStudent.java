package com.nt.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {

		List<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);

		for (Student std : al) {
			System.out.println(std.rollno + " " + std.name + " " + std.age);
		}
	}

}
