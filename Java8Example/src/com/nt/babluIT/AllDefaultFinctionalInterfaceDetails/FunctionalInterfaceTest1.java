package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

public class FunctionalInterfaceTest1 {
	public static void main(String[] args) {

		Greetings greet = new Greetings() {

			@Override
			public void WishHindiMsg() {
				System.out.println("Hi:: Namaste");
			}
		};
		greet.WishHindiMsg();
	}

}

@FunctionalInterface
interface Greetings {
	public void WishHindiMsg();
}
