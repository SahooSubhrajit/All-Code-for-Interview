package com.babluIT.Lamdada;

public class PredicateApp2 {
	
	public static void main(String[] args) {
		call ca = (i,j) -> i > j;
		System.out.println(ca.hii(45,41));
		System.out.println(ca.hii(-5633,744));
		
	}

}

@FunctionalInterface
interface call{
	public boolean hii(int i,int j);
}
