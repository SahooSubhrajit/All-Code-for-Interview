package com.nt.methodAndconstructorReference;

//All method and constructor reference in one file
public class WishMethod {

	public static void Hindi() {
		System.out.println("Namaste!!!");
	}

	public void English() {
		System.out.println("Hi Good Evening");
	}

	public WishMethod() {
		System.out.println("Wish:: 0-Param Constructer");
	}

	public static void main(String[] args) {
		// Static Mehod Reference
		Bablu bablu = WishMethod::Hindi;
		bablu.wish();

		// Non-Static Mehod Reference
		Bablu bablu1 = new WishMethod()::English;
		bablu1.wish();

		// Constructer Reference
		Bablu bablu2 = WishMethod::new;
		bablu2.wish();

		Bablu bablu3 = () -> {
			System.err.println("hii");
		};
		bablu3.wish();

	}

}

@FunctionalInterface
interface Bablu {
	public void wish();

}
