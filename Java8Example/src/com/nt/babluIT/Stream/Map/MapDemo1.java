package com.nt.babluIT.Stream.Map;

import java.util.ArrayList;
import java.util.List;

public class MapDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("kajal");
		list.add("anushka");
		list.add("samantha");
		list.add("alia");
		list.add("pooja");

		list.stream().map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));

		System.out.println();

		list.stream().map(i -> i.concat(" Sahoo")).forEach(System.out::println);

		System.out.println();

		list.stream().map(i -> i.toUpperCase() + "->>" + i.length()).forEach(i -> System.out.println(i));

	}

}
