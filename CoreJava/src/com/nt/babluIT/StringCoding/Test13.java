package com.nt.babluIT.StringCoding;

public class Test13 {
	public static void main(String[] args) {

		// palindrome a string

		String str = "Madam";

		String lowerCaseString = str.toLowerCase();

		String rev = "";

		for (int i = lowerCaseString.length() - 1; i >= 0; i--) {
			rev = rev + lowerCaseString.charAt(i);
		}
		if (rev.equals(lowerCaseString)) {
			System.out.println(rev + " is a palindrome string");
		} else {
			System.out.println(str + " not a palindrome string");
		}
	}

}
