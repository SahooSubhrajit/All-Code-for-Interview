package com.nt.babluIT.StringCoding;

public class Test6 {
	public static void main(String[] args) {

		// find length of string

		String str = "Subhrajit Sahoo";

		System.out.println(str.length());

		char[] charArray = str.toCharArray();
		System.out.println(charArray.length);

		byte[] bytes = str.getBytes();
		System.out.println(bytes + "  " + bytes.length);

		String[] split = str.split("");
		System.out.println(split.length);
	}

}
