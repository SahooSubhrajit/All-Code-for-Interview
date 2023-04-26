package com.babluIT.Lamdada;

public class LamdaDemo1 {
	public static void main(String[] args) {
		Wish wish = () -> {
			System.out.println("Hi");
		};

		wish.card();

	}

}

interface Wish {
	public void card();
}
