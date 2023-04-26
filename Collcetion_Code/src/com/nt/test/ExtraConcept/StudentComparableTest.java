package com.nt.test.ExtraConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableTest {
	public static void main(String[] args) {

		StudentComparable s1 = new StudentComparable(101, "Sonoo", 23);
		StudentComparable s2 = new StudentComparable(102, "Ravi", 21);
		StudentComparable s3 = new StudentComparable(103, "Hanumat", 25);

		List<StudentComparable> ll = new ArrayList();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);

		Collections.sort(ll);
		for (StudentComparable sc : ll) {
			System.out.println(sc);
		}

	}

}
