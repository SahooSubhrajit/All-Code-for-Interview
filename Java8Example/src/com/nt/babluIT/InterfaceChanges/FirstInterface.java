package com.nt.babluIT.InterfaceChanges;

public interface FirstInterface {

	public void getName();

	public default void getTitle(String str) {
		System.out.println(str + " I am default method from FirstInterface");
	}

	public default String getStringNames(String str) {
		return str + " I am getStringName() from FirstInterface";
	}

	public default Integer getSqueareOfNumber(Integer i) {
		return i*i;
	}

	public static void getMethodName() {
		System.out.println("i am Static Method from FirstInterface");
	}

}
