package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

public class FunctionalInterfaceTest4 {

	public static void wish(Greetings3 greet) {
		greet.WishEnglishMsg();
	}

	public static void main(String[] args) {
		wish(() -> System.out.println("Hi: How are you ?"));
	}

}

@FunctionalInterface
interface Greetings3 {
	public void WishEnglishMsg();
}
