package com.nt.InterfaceChanges;

//@FunctionalInterface
public interface MyInterface {
	public void m1();

	public void m2();
	
	public default void m3() {
		System.out.println("Hi I am form m3()");
	}
	
	public static void m4() {
		System.out.println("Hi I am from m4()");
	}

}
