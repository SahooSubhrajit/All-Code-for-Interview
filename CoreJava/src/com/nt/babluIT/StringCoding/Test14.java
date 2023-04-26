package com.nt.babluIT.StringCoding;

public class Test14 {
	public static void main(String[] args) {

		// replace lowercase character to upper case and vice versa

		String str = "Great Power";

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLowerCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(sb);
	}

}
