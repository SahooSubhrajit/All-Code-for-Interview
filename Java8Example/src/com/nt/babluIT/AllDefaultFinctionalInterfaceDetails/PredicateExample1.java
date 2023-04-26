package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

public class PredicateExample1 {
	public boolean testFun(Integer i) {
		if (i > 10) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(new PredicateExample1().testFun(10));
		System.out.println(new PredicateExample1().testFun(56));

	}

}
