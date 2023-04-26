package com.nt.babluIT.StringCoding;

public class Test2 {
	public static void main(String[] args) {

		// Remove all white space from string

		// refer Test16

		String str = " S t r i n g  ";

		System.out.println(str.trim());

		String replace = str.replaceAll("\\s", "");
		System.out.println(replace);

		String str1 = "254Java25";

		System.out.println(str1.replaceAll("\\d", ""));

	}

}
