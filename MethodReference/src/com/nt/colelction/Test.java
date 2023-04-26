package com.nt.colelction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(45, 85, 74, 69, 23, 87);

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		al.forEach(i -> {
			if (hm.size() <= 1) {
				hm.put(i, i);
			}

		});

		/*for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getValue() + "  ");
		}*/

		hm.forEach((k, q) -> System.out.println(k + " " + q));

	}

}
