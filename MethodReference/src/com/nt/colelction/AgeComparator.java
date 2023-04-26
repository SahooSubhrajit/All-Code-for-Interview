package com.nt.colelction;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentCustomHashMap> {

	@Override
	public int compare(StudentCustomHashMap o1, StudentCustomHashMap o2) {

		if (o1.getAge() == o2.getAge()) {
			return 0;
		} else if (o1.getAge() > o2.getAge()) {
			return 1;
		} else
			return -1;

	}

}
