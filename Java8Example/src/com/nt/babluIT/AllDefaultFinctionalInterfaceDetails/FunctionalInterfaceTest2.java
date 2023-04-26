package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

public class FunctionalInterfaceTest2 {

	public static void main(String[] args) {
		Greetings2 greet = () -> System.out.println("Hi:: Namaste");
		greet.WishHindi();
	}

}

@FunctionalInterface
interface Greetings2 {
	public void WishHindi();
}
