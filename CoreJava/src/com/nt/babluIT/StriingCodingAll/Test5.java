package com.nt.babluIT.StriingCodingAll;

public class Test5 {
	public static void main(String[] args) {

		String s1 = "a";
		String s2 = "a";
		String s3 = "A";

		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));

		System.out.println();

		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s3));
		System.out.println();

		System.out.println(s3.equals(s1));
		System.out.println(s3.compareTo(s1));
		System.out.println();

		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.compareToIgnoreCase(s3));

		String s4 = "abc";
		String s5 = "aBc";

		System.out.println(s4.equals(s5));
		System.out.println(s4.compareTo(s5));
		System.out.println(s4.compareToIgnoreCase(s5));

		System.out.println();

		String s6 = "abcdef";

		System.out.println(s4.compareTo(s6));
		System.out.println(s6.compareTo(s4));

		System.out.println(s5.compareTo(s6));
		System.out.println(s6.compareTo(s5));

	}
}
