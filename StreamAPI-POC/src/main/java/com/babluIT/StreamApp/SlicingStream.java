package com.babluIT.StreamApp;

import java.util.ArrayList;
import java.util.List;

public class SlicingStream {
	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("China");
		countries.add("India");
		countries.add("USA");
		
		/*countries.stream()
		         .distinct()
		         .forEach(System.out::println);*/
		
		/*countries.stream()
			     .limit(2)
			     .forEach(System.out::println);*/
		
		countries.stream()
				 .skip(2)
				 .forEach(System.out::println);
	}

}
