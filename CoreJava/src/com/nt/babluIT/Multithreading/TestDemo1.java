package com.nt.babluIT.Multithreading;

public class TestDemo1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Run executed");
	}

	public static void main(String[] args) {

		Thread th = new Thread(new TestDemo1());
		th.start();
		System.out.println("5555");
		new TestDemo1().run();
		System.out.println(th.getThreadGroup() + "   " + th.currentThread() + "  " + th.getName());

		System.out.println();

		Thread th1 = new Thread(new TestDemo1());
		th1.start();
		System.out.println("5555");
		new TestDemo1().run();
		System.out.println(th1.getThreadGroup() + "   " + th1.currentThread() + "  " + th1.getName());

	}

}
