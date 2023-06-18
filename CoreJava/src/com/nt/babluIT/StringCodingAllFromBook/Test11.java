package com.nt.babluIT.StringCodingAllFromBook;

public class Test11 {
	public static void main(String[] args) {

		String str = "Java Programming Language";

		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 11));
		System.out.println(str.substring(5, 12));

		System.out.println();

		System.out.println(str.substring(5, 5));
//		System.out.println(str.substring(12, 5));
//		System.out.println(str.substring(-1, 12));
//		System.out.println(str.substring(4, 27));

		System.out.println();

		System.out.println(str.substring(5, 25));
//		System.out.println(str.substring(5, 26));

		String str1 = "Java Programming Language";

		System.out.println(str1.substring(5, 12));

		int start = str1.indexOf("Program");
		int end = start + 7;
		System.out.println(str1.substring(start, end));

	}

}
