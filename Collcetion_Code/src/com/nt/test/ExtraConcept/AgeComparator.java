package com.nt.test.ExtraConcept;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator sc1, StudentComparator sc2) {
		return sc1.getAge().compareTo(sc2.getAge());
	}

}
