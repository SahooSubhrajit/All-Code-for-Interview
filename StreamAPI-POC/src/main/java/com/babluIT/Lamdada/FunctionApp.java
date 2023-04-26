package com.babluIT.Lamdada;

import java.util.function.Function;

public class FunctionApp {
	public static void main(String[] args) {
		
		Function<String,Integer> function = str -> str.length();
		
		Integer calLength = function.apply("Subhrajit");
		System.out.println(calLength);
	}

}
