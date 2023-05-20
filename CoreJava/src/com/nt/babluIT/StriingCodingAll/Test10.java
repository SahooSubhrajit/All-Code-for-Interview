package com.nt.babluIT.StriingCodingAll;

public class Test10 {
	public static void main(String[] args) {

		String str = "abc bbc cbc";

		System.out.println(str.startsWith("abc"));
		System.out.println(str.endsWith("abc"));
		System.out.println(str.startsWith("cbc"));
		System.out.println(str.endsWith("cbc"));
		System.out.println(str.startsWith("abc bbc"));
		System.out.println(str.endsWith("abc bbc"));
		System.out.println(str.startsWith("bbc cbc"));
		System.out.println(str.endsWith("bbc cbc"));
		System.out.println(str.startsWith("abc bbc cbc"));
		System.out.println(str.endsWith("abc bbc cbc"));
		System.out.println(str.startsWith("Abc"));
		System.out.println(str.endsWith("Cbc"));
		System.out.println(str.equals("abc"));
		System.out.println(str.contains("abc"));
		System.out.println(str.startsWith("abc"));
		System.out.println(str.endsWith("abc"));
		System.out.println(str.endsWith("cbc"));

	}

}
