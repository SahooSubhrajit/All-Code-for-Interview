package com.nt.test.Map;

import java.util.HashMap;
import java.util.Map;

public class BookClassTest {
	public static void main(String[] args) {

		Map<Integer, BookClass> map = new HashMap();

		BookClass b1 = new BookClass(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookClass b2 = new BookClass(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookClass b3 = new BookClass(103, "Operating System", "Galvin", "Wiley", 6);

		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);

		for (Map.Entry<Integer, BookClass> entry : map.entrySet()) {
			System.out.println("Key");
			System.out.println(entry.getKey());
			System.out.println("Book values");
			BookClass book = entry.getValue();
			System.out.println(book.getId() + book.getName());
		}
	}

}
