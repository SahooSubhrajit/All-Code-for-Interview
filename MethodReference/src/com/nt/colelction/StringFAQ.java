package com.nt.colelction;

public class StringFAQ {
	public static void main(String[] args) {

		String str = "Subhrajit";

		str.concat("Sahoo");

		System.out.print(str);

		StringBuffer sb = new StringBuffer("abc");
//		System.out.println(sb);

		sb.append("->ABC");

		System.out.println("\n" + sb);
	}

}
