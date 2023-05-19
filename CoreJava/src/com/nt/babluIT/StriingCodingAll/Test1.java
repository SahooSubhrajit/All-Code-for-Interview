package com.nt.babluIT.StriingCodingAll;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		String s1 = "";
		String s2 = "";
		String s3 = "a";
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String(" ");
		String s7 = new String("a");

		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println(s4.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());
		System.out.println(s7.isEmpty());
		
		/*String s8 = null;
		System.out.println(s8.isEmpty());*/
		
		/*String s9;
		System.out.println(s9.isEmpty());*/
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("\nEnter string1: ");
		System.out.println(scn.nextLine().isEmpty());
		
		System.out.println("\nEnter string2: ");
		System.out.println(scn.nextLine().isEmpty());
		
		System.out.println("\nEnter string3: ");
		System.out.println(scn.nextLine().isEmpty());
	}

}
