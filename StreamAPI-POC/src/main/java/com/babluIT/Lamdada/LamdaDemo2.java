package com.babluIT.Lamdada;

public class LamdaDemo2 {
	public static void main(String[] args) {
		Name name = (str) -> str.length();
		
		Integer countLength = name.countLength("Subhrajit Sahoo");
		System.out.println(countLength);
		
	}

}

interface Name{
	public Integer countLength(String i);
}
