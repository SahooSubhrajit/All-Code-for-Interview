package com.nt.InterfaceChanges;

public class Demo implements A, B {

	@Override
	public void m1() {
		System.out.println("Hi I am from Demo - m1()");
		A.super.m1();
		B.super.m1();
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
		A.m2Static();
		B.m2Static();

	}

}
