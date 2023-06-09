package com.nt.babluIT.StringCoding;

import java.util.HashMap;

public class Test16 {
	public static void main(String[] args) {

		// Count duplicate character from two string

		String str = "abbc";
		String str1 = "abccd";

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}

		for (int j = 0; j < str1.length(); j++) {
			if (hm.containsKey(str1.charAt(j))) {
				hm.put(str1.charAt(j), hm.get(str1.charAt(j)) + 1);
			} else {
				hm.put(str1.charAt(j), 1);
			}
		}

		long count = hm.entrySet().stream().filter(i -> i.getValue() > 1).map(i -> i.getKey()).count();

		System.out.println(count);
		
		/*HashMap<Character, Integer> hm = new HashMap<>();
				
				for(int i = 0; i < str.length(); i++) {
					for (int j = 0; j < str1.length(); j++) {
						if(str.charAt(i) == str1.charAt(j)) {
							if (hm.containsKey(str.charAt(i))) {
								hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
							} else {
								hm.put(str.charAt(i), 1);
							}
						}
						
					}
					
				}*/

	}

}
