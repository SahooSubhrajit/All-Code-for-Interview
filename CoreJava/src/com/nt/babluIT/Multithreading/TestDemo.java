package com.nt.babluIT.Multithreading;

public class TestDemo extends Thread {

	public void run() {
		System.out.println("Run executed");
	}

	public static void main(String[] args) {

		TestDemo th = new TestDemo();
		th.start();
//		th.run();
		System.out.println("In thread");

	}

}
