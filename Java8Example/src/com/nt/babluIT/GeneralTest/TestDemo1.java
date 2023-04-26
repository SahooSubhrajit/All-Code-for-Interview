package com.nt.babluIT.GeneralTest;

public class TestDemo1 {
	public static void main(String[] args) {

		/*String str = "abc";
		System.out.println(str);
		
		str.concat("->bbc");
		System.out.println(str);
		
		String concat = str.concat("->bbc");
		System.out.println(concat);
		
		String strB = new String("Bablu");
		System.out.println(strB);
		
		strB.concat("Sahoo");
		System.out.println(strB);
		
		String contactStrb = strB.concat("Sahoo");
		System.out.println(contactStrb);
		*/
		StringBuilder sb = new StringBuilder("Subhrajit");
		System.out.println(sb + "   " + sb.hashCode());

		sb.append("->Sahoo");
		System.out.println(sb + "   " + sb.hashCode());

	}

}
