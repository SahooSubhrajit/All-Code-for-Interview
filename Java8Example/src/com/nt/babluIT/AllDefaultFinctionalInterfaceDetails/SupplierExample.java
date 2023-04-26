package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {

		String[] names = { "Sachin", "Shewag", "Ganguly", "Dravid", "Yuvraj" };

		/*int n = (int) (Math.random() * 5);
		
		for (int i = 4; i <= 4; i++) {
			System.out.println(names[n]);
		
		}*/

		Supplier<String> s = () -> {
			int n = (int) (Math.random() * 5);
			return names[n];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
