package com.nt.babluIT.StringCoding;

public class Test8 {
	public static void main(String[] args) {

		// Number of vowels

		String str = "Subhrajit";

		int count = 0;

		char[] charArray = str.toLowerCase().toCharArray();

		for (Character ch : charArray) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("Number of vowels:  " + count);
	}

}
