package com.nt.babluIT.StringCoding;

public class Test10 {
	public static void main(String[] args) {

		// Count no. of vowel and consanants

		String str = "This is awsome Java";
		int vCount = 0;
		int cCount = 0;

		String lowerCase = str.toLowerCase();

		for (int i = 0; i < lowerCase.length(); i++) {
			if (lowerCase.charAt(i) == 'a' || lowerCase.charAt(i) == 'e' || lowerCase.charAt(i) == 'i'
					|| lowerCase.charAt(i) == 'o' || lowerCase.charAt(i) == 'u') {
				vCount++;
			} else {
				if (lowerCase.charAt(i) >= 'a' && lowerCase.charAt(i) <= 'z') {
					cCount++;
				}
			}

		}
		System.out.println(vCount + "  " + cCount);
		
		
		

		/*String str = "This is awsome Java";
		
		int vCount = 0;
		int cCount = 0;
		
		StringBuilder sb = new StringBuilder(str.toLowerCase());
		
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o'
					|| sb.charAt(i) == 'u') {
				vCount++;
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			} else if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
				cCount++;
			}
		}
		
		System.out.println(sb + "  " + vCount + "  " + cCount);*/

	}

}
