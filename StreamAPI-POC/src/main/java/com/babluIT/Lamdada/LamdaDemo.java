package com.babluIT.Lamdada;

public class LamdaDemo {
	public static void main(String[] args) {
		
		Calculator lmd = (i,j) -> i+j;
		int addResult = lmd.add(45,100);
		System.out.println(addResult);
		
	}

}

@FunctionalInterface
 interface Calculator{
	public int add(int i,int j);
	
}
