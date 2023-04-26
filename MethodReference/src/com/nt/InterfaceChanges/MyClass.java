package com.nt.InterfaceChanges;

public class MyClass implements MyInterface {

	@Override
	public void m1() {
		System.out.println("Hi I am form m1()");
	}

	@Override
	public void m2() {
		System.out.println("Hi I am form m2()");
	}
	
	@Override
	public void m3() {
		System.out.println("Hi I am form m32()");
	}
	
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.m1();
		myclass.m2();
		myclass.m3();
		MyInterface.m4();
	}

}
