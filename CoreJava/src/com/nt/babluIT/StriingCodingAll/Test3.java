package com.nt.babluIT.StriingCodingAll;

public class Test3 {
	public static void main(String[] args) {

		String s1 = "Subhrajit";
		System.out.println(s1);
		System.out.println(s1.toString());

		String s2 = new String("Sahoo");
		System.out.println(s2);
		System.out.println(s2.toString());

		/*String s3 = null;
		System.out.println(s3);
		System.out.println(s3.toString());*/

		/*String s4;
		System.out.println(s4);*/

		System.out.println(s5);
		
		A a1 = new A(567);
		System.out.println(a1);
		
		A a2 = null;
		System.out.println(a2);
		
		/*A a3;
		System.out.println(a3);*/
		
		System.out.println(a4);

	}

	static String s5;
	
	static A a4;

}

class A {

	private int x;

	A(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "" + x;
	}

}
