package com.babluIT.Lamdada;

import java.util.function.Supplier;

public class SupplierApp {

	public static void getRandomName() {
		String[] str = { "Sachin", "Shewag", "Ganguly", "Dravid", "Yuvraj" };

		int n = (int) (Math.random() * 5);

		System.out.println(str[n]);
	}

	public static void main(String[] args) {
		// Gives Random Name
		getRandomName();
		getRandomName();
		getRandomName();
		getRandomName();
		System.out.println();
		
		// by using Supplier Interface
		String[] str = { "Sachin", "Shewag", "Ganguly", "Dravid", "Yuvraj" };

		Supplier<String> supStr = () -> {
			int n = (int) (Math.random() * 5);
			return str[n];
		};
		
		System.out.println("by using Supplier Interface");
		System.out.println(supStr.get());
		System.out.println(supStr.get());
		System.out.println(supStr.get());
	}

}
