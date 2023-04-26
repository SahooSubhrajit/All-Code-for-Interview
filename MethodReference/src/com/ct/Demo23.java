package com.ct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo23 {
	public static void main(String[] args) {

		int[] arrAyyy = new int[] { 2, 1, 0 };

		List<Integer> al = new ArrayList<Integer>();

		for (Integer abt : arrAyyy) {
			al.add(abt);
		}

//		al.stream().sorted().collect(Collectors.toList()).forEach(i -> System.out.print(i + "  "));

		Collections.sort(al, new Comparator<Integer>() {

			/*@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 == o2) {
					return 0;
				} else if (o1 > o2) {
					return 1;
				} else
					return -1;
			}*/

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});

		al.forEach(i -> System.out.print(i + "  "));

		/*Collections.sort(al, (Integer o1, Integer o2) -> o1.compareTo(o2));
		
		al.forEach(i -> System.out.print(i + "  "));*/
	}

}
