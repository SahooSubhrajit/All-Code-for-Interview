package com.nt.test.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List1 {
	public static void main(String[] args) {

		List<String> list = new ArrayList();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// By using Iterator
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();

		// By using forloop
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();

		// sort arrayList
		Collections.sort(list);
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();

		// sort arrayList in reverse order
		Collections.sort(list, Collections.reverseOrder());
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();

		// Reverse ArrayList
		Collections.reverse(list);
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();

		// Synchronizing ArrayList in Java
		List<String> synchronizedList = Collections.synchronizedList(list);

		synchronized (synchronizedList) {
			for (String str : synchronizedList) {
				System.out.println(str);
			}
		}

	}

}
