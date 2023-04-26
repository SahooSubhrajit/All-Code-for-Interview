package com.nt.babluIT.StringCoding;

public class Test9 {
	public static void main(String[] args) {

		// converting vowels into upper case

		String str = "subhrajit sahoo";

		char[] charArray = str.toLowerCase().toCharArray();

		System.out.print(doProcess(charArray));
	}

	private static String doProcess(char[] chStr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chStr.length; i++) {
			if (chStr[i] == 'a' || chStr[i] == 'e' || chStr[i] == 'i' || chStr[i] == 'o' || chStr[i] == 'u') {
				char upperCase = Character.toUpperCase(chStr[i]);
				chStr[i] = upperCase;
			}
		}

		for (Character ch : chStr) {
			sb.append(ch);
		}
		return sb.toString();

	}

}
