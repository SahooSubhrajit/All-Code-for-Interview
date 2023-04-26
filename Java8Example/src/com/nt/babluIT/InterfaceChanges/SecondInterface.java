package com.nt.babluIT.InterfaceChanges;

public interface SecondInterface {

	public void getName();

	public default void getTitle(String str) {
		System.out.println(str + " I am default method from SecondInterface");
	}
	
	public default String getStringNames(String str) {
		return str + " I am getStringName() from SecondInterface";
	}

	public static void getMethodName() {
		System.out.println("i am Static Method from SecondInterface");
	}

}
