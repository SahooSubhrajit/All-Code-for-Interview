package com.nt.babluIT.StriingCodingAll;

public class Test13 {
	public static void main(String[] args) {

		String s1 = "Hari";

		String s2 = s1.concat("Krishna");

		System.out.println(s1 + "   " + s2);

		String s3 = "a";
		s3.concat("b");

		System.out.println(s3);

		String s4 = s3.concat("c");
		System.out.println(s3 + "   " + s4);
		System.out.println(s3 == s4);

		s3 = s3.concat("d");
		System.out.println(s3);
		System.out.println(s3.concat("e"));

		System.out.println(s3);

		System.out.println(s3 = s3.concat("f"));
		System.out.println(s3);

		String s5 = s3.concat("");

		System.out.println(s3 + "    " + s5);
		System.out.println(s3 == s5);

		String s6 = "";
		String s7 = s6.concat(s3);

		System.out.println(s6 + "    " + s7);
		System.out.println(s6 == s7);

		String s8 = "p";
		String s9 = s8 + "q";
		String s10 = s8 + "";
		String s11 = "" + s8;

		System.out.println(s8 + "   " + s9 + "   " + s10 + "    " + s11);

		System.out.println(s8 == s9);
		System.out.println(s8 == s10);
		System.out.println(s10 == s11);

		String s12 = "a";
		String s13 = "b";
		String s14 = "c";

		String s15 = "abc";
		String s16 = "a" + "b" + "c";
		String s17 = "a".concat("b").concat("c");

		System.out.println(s15 == s16);
		System.out.println(s15 == s17);

		String str = "a";
		String s18 = s1.concat("b");
		String s19 = s1.concat("b");
		System.out.println(s18 == s19);

		String s20 = s1.concat("");
		String s21 = s1.concat("");

		System.out.println(s1 == s20);
		System.out.println(s1 == s21);
		System.out.println(s20 == s21);

	}

}
