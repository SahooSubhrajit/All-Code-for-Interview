package com.nt.babluIT.StriingCodingAll;

public class Test14 {
	public static void main(String[] args) {

		String s1 = String.join("-", "a", "b", "c", "d", "e");
		String s2 = String.join("", "a", "b", "c", "d");
		String s3 = String.join("-");
		String s4 = String.join("-", "a");
		String s5 = String.join("-", "a", "b");
		String s6 = String.join("-", new StringBuffer("b"), new StringBuffer("c"));

		System.out.println(s1 + "   " + s2);
		System.out.println(s3 + "   " + s4);
		System.out.println(s5 + "   " + s6);

	}

}
