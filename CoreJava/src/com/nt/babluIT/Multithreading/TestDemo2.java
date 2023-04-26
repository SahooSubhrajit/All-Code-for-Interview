package com.nt.babluIT.Multithreading;

public class TestDemo2 extends Thread {

	public void run() {
		for (int i = 5; i >= 1; i--) {
			System.out.println("Form Run method  " + i);
		}

	}

	public static void main(String[] args) {
		TestDemo2 demo = new TestDemo2();
		demo.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Form Main method  " + i);
		}

	}

}
