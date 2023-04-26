package com.nt.test.List;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {

		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
		
		List<Student> ll = new ArrayList();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		
		for (Student stu : ll) {
			System.out.println(stu);
		}

	}

}
