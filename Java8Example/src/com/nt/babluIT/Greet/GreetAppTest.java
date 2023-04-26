package com.nt.babluIT.Greet;

public class GreetAppTest {
	public static void main(String[] args) {

		Greeting greet1 = new EnglishWish();
		greet1.wishingGreet();

		Greeting greet2 = new HindiWish();
		greet2.wishingGreet();

	}

}
