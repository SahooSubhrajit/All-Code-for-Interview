package com.nt.babluIT.ExtraCoding;

import java.util.Arrays;

public class Test4 {
	
	// devisibleByTwo

	static void devisibleByTwo(int[] array) {

		Arrays.stream(array).filter(i -> i % 2 != 0).forEach(i -> System.out.print(i + "  "));

	}

	public static void main(String[] args) {
		devisibleByTwo(new int[] { 2, 6, 8, 9, 7 });
	}

}
