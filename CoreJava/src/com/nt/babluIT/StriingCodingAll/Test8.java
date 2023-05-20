package com.nt.babluIT.StriingCodingAll;

public class Test8 {
	public static void main(String[] args) {

		String str = "Java Programming Language";

		System.out.println(str.length());

		System.out.println("\n" + str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));

		System.out.println("\n" + str.indexOf('A'));
		System.out.println(str.lastIndexOf('A'));

		System.out.println("\n" + str.indexOf("Program"));
		System.out.println(str.lastIndexOf("Program"));

		System.out.println("\n" + str.indexOf('a', 5));
		System.out.println(str.lastIndexOf('a', 5));

		System.out.println("\n" + str.indexOf('a', 1));
		System.out.println(str.lastIndexOf('a', 1));

		System.out.println("\n" + str.indexOf('a', 0));
		System.out.println(str.lastIndexOf('a', 0));

		System.out.println("\n" + str.indexOf('a', 24));
		System.out.println(str.lastIndexOf('a', 24));

		System.out.println("\n" + str.indexOf('a', 30));
		System.out.println(str.lastIndexOf('a', 30));

		System.out.println("\n" + str.indexOf('a', -5));
		System.out.println(str.lastIndexOf('a', -5));

		String str1 = "JavaHariKrishna";
		System.out.println(str1.indexOf("hari"));

		String str2 = str1.toLowerCase();
		System.out.println("\n" + str2.indexOf("hari"));

		System.out.println(str1 + "   " + str2);

	}

}
