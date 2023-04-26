package com.nt.test.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2 {
	public static void main(String[] args) {

		// convert ArrayList to Array and Array to ArrayList in java

		List<String> list = new ArrayList();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		String[] array = list.toArray(new String[list.size()]);
		for (String str : array) {
			System.out.println(str);
		}

		System.out.println();

		List<String> arrayToList = Arrays.asList(array);
		for (String str : arrayToList) {
			System.out.println(str);
		}

	}

}
