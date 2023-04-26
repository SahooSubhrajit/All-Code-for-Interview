package com.babluIT.Lamdada;

public class PredicateApp1 {
	
	public boolean cal(int i , int j) {
		if(i > j) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		PredicateApp1 app = new PredicateApp1();
		System.out.println(app.cal(45,42));
		System.out.println(app.cal(-45,-7));
		
	}

}
