package com.nt.babluIT.StringCoding;

public class Test11 {
	public static void main(String[] args) {

		// swap two string

		// Approach -1
		String str1 = "Java";

		String str2 = "Code";

		/*String temp;
		
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println(str1 + "  " + str2);*/

		// Approach -2

		String addString = str1 + str2;

		System.out.println(addString + "  " + addString.length());

		str2 = addString.substring(0, addString.length() - str2.length());
		str1 = addString.substring(str2.length());
		System.out.println(str1 + "  " + str2);

	}

}
