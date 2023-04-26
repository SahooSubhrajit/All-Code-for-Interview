package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

import java.util.function.Supplier;

public class SupplierExample1 {
	public static void main(String[] args) {

		Supplier<String> supplier = () -> {
			StringBuilder otp = new StringBuilder("");
			for (int i = 1; i <= 5; i++) {
				otp.append((int) (Math.random() * 10));
			}
			return otp.toString();
		};
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
	}

}
