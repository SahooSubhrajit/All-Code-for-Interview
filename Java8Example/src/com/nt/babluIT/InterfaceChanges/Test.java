package com.nt.babluIT.InterfaceChanges;

public class Test implements FirstInterface, SecondInterface {

	@Override
	public void getName() {
		System.out.println("I am abstract Method from FirstInterface");
	}

	@Override
	public void getTitle(String str) {
		FirstInterface.super.getTitle(str);
		SecondInterface.super.getTitle(str);
	}

	@Override
	public String getStringNames(String str) {
		return FirstInterface.super.getStringNames(str);
//		return SecondInterface.super.getStringNames(str);
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.getName();
		test.getTitle("Subhrajit");
		System.out.println(test.getSqueareOfNumber(5));
		System.out.println(test.getStringNames("BABLU"));
		FirstInterface.getMethodName();
		SecondInterface.getMethodName();

	}

}
