package com.nt.methodAndconstructorReference;

public class WishMessage {
	public static void HindiWish() {
		System.out.println("Inside HindiWish()");
		System.out.println("Namaste!");
	}

	public void EnglishWish() {
		System.out.println("Inside EnglishWish");
		System.out.println("Hii Good Morning!!");
	}

	public static void Threadcount() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
