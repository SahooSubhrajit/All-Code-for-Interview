package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

public class AnonymusClass {
	public static void wishMessg(Greeting greet) {
		greet.WishHindi();
	}

	public static void main(String[] args) {
		wishMessg(new Greeting() {
		
			@Override
			public void WishHindi() {
				System.out.println("NAMASTE");
			}
		});

		// by using lamda expression
		/*wishMessg(() -> {
			System.out.println("NAMASTE");
		});*/

	}
}

@FunctionalInterface
interface Greeting {
	public void WishHindi();
}
