package com.nt.babluIT.ArrayCoding;

import java.util.HashMap;
import java.util.Map;

public class Test10 {

	// 15 find the most frequent element in an array

	static void getMostFrequentElement(int[] array) {

		HashMap<Integer, Integer> hm = new HashMap();

		for (int intArray : array) {
			if (hm.containsKey(intArray)) {
				hm.put(intArray, hm.get(intArray) + 1);
			} else {
				hm.put(intArray, 1);
			}
		}

		int frequecy = 1;
		int keyElement = 0;

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > frequecy) {
				frequecy = entry.getValue();
				keyElement = entry.getKey();

			}
		}

		if (frequecy > 1) {
			System.out.println(keyElement + "  " + frequecy);
		} else {
			System.out.println("No frequent element. All elements are unique.");
		}

	}

	public static void main(String[] args) {
		getMostFrequentElement(new int[] { 4, 5, 8, 7, 4, 7, 6, 7 });
		getMostFrequentElement(new int[] { 1, 2, 7, 5, 3, 6 });

	}

}
