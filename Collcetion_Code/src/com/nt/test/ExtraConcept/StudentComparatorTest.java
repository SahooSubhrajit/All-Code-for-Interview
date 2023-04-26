package com.nt.test.ExtraConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparatorTest {
	public static void main(String[] args) {

		StudentComparator s1 = new StudentComparator(101, "Sonoo", 23);
		StudentComparator s2 = new StudentComparator(102, "Ravi", 21);
		StudentComparator s3 = new StudentComparator(103, "Hanumat", 25);

		List<StudentComparator> ll = new ArrayList();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);

		Collections.sort(ll, new AgeComparator());
		for (StudentComparator sc : ll) {
			System.out.println(sc);
		}

		System.out.println();

		Collections.sort(ll, new NameComparator());
		for (StudentComparator sc : ll) {
			System.out.println(sc);
		}
		System.out.println();

		// Not using extra comparator class
		Collections.sort(ll, Comparator.comparing(StudentComparator::getName));
		for (StudentComparator sc : ll) {
			System.out.println(sc);
		}
		System.out.println();

		Collections.sort(ll, new Comparator<StudentComparator>() {

			@Override
			public int compare(StudentComparator o1, StudentComparator o2) {
				return o1.getRollno().compareTo(o2.getRollno());
			}
		});

		for (StudentComparator sc : ll) {
			System.out.println(sc);
		}
		System.out.println();

	}

}
