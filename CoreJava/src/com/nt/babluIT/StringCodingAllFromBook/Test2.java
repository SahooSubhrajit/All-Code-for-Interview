package com.nt.babluIT.StringCodingAllFromBook;

public class Test2 {
	public static void main(String[] args) {

		String s1 = "";
		String s2 = " ";
		String s3 = "ab";
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String(" ");
		String s7 = new String("ab");

		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		System.out.println(s5.length());
		System.out.println(s6.length());
		System.out.println(s7.length());

		/*String s8 = null;
		System.out.println(s8.length());*/

		String s9 = "null";
		System.out.println(s9.length());

		System.out.println(s11.isEmpty());
		System.out.println(s11.length());

	}

	static String s11;

}
