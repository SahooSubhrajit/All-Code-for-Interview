package com.nt.colelction;

import java.util.Arrays;
import java.util.List;

public class ArrayToObject {
	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//		List<String> al = Arrays.asList("cbcbc","vhhhfhfh");

		Object[] IntArray = al.toArray();

		for (int i = 0; i < IntArray.length; i++) {
			System.out.print(IntArray[i] + "  ");
		}

		List<Object> asList = Arrays.asList(IntArray);
		for (Object i1 : asList) {
			System.out.print(" " + i1 + "  ");
		}

		/*Map<Integer,Object> hm = (Map<Integer, Object>) Arrays.asList(IntArray);
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getValue());
		}*/

	}

}
