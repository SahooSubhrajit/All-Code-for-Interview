package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

public class FunctionalInterfaceTest5 {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
			}

		};

		/*Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
				}
		
			}
		};*/

		Thread th = new Thread(r);
		th.start();
	}

}
