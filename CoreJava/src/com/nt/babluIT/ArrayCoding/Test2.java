package com.nt.babluIT.ArrayCoding;

import java.util.HashSet;

public class Test2 {
	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 2, 5, 3, 2 };

		HashSet<Integer> hs = new HashSet();

		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}

		for (Integer it : hs) {
			System.out.print(it + "  ");
		}

	}

}
