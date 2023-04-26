package com.nt.InterfaceChanges;

public interface B {

	public default void m1() {
		System.out.println("Hi I am from interface B- m1()");
	}
	
	public static void m2Static() {
		System.out.println("Hi I am from Interface B -> Static()");
	}

}
