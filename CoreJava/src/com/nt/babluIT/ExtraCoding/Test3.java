package com.nt.babluIT.ExtraCoding;

public class Test3 {
	
	// reverseString

	static StringBuilder reverseString(String str) {

		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();

		String result = "";

		for (int i = split.length - 1; i >= 0; i--) {
			sb.append(split[i] + " ");
			result = result + split[i];
		}
		System.out.println(result);
		return sb;
	}

	public static void main(String[] args) {
		System.out.println(reverseString("Subhrajit Sahoo"));
	}

}
