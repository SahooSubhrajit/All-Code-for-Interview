package com.babluIT.StreamApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MappingStream {
	public static void main(String[] args) {
		
			List<String> list = new ArrayList<>();
		
			list.add("kajal");
			list.add("anushka");
			list.add("samantha");
			list.add("alia");
			list.add("pooja");
			
			list.stream()
			    .map(name -> name.toUpperCase())
			    .forEach(System.out::println);
			
			System.out.println();
			
			
			list.stream()
			    .map(name -> name.toUpperCase()+" -->> "+name.length())
			    .forEach(System.out::println);
			
			System.out.println();
		
		
			/*List<List<String>> list1 = new ArrayList<>();
			
			list1.add(Arrays.asList("a", "b", "c"));
			list1.add(Arrays.asList("d", "e", "f"));
			list1.add(Arrays.asList("g", "h", "i"));
			list1.add(Arrays.asList("j", "k", "l"));
			
			list1.stream()
				 .flatMap(s -> s.stream())
			//			 .map(i -> i.toUpperCase())
			     .filter(i -> "a".equals(i))
			     .forEach(System.out::println);*/

	}

}
