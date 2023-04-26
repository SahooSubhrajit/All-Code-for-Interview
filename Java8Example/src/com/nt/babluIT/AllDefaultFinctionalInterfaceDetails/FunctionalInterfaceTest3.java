package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

public class FunctionalInterfaceTest3 implements Greetings1 {

	@Override
	public void WishHindiMsg() {
		System.out.println("Hi:: Namaste");
	}

	public static void main(String[] args) {
		Greetings1 greet = new FunctionalInterfaceTest3();
		greet.WishHindiMsg();

	}

}

@FunctionalInterface
interface Greetings1 {
	public void WishHindiMsg();
}
