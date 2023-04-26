package com.babluIT.Lamdada;

public class anonymousClass {
	public static void wishMessg(Wish11 wish11) {
		wish11.hindi();
	}

	public static void main(String[] args) {
		wishMessg(new Wish11() {

			@Override
			public void hindi() {
				System.out.println("Namste!!");
			}
		});

	}

}

@FunctionalInterface
interface Wish11 {
	public void hindi();
}
