package com.nt.InterfaceChanges;

public interface A {
	public default void m1() {
		System.out.println("Hi I am from interface A - m1()");
	}

	public static void m2Static() {
		System.out.println("Hi I am from Interface A -> Static()");
	}
}
