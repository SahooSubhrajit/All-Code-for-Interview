package com.nt.test.ExtraConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList();
		list.add(46);
		list.add(67);
		list.add(24);
		list.add(16);
		list.add(8);
		list.add(12);

		// minimum element from List
		System.out.println(Collections.min(list));

		// sorting
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);

		List<Student> ll = new ArrayList();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);

		Collections.sort(ll, Comparator.comparing(Student::getName));
		for (Student stu : ll) {
			System.out.println(stu);
		}

	}

}
