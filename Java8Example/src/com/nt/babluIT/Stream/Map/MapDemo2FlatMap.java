package com.nt.babluIT.Stream.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo2FlatMap {
	public static void main(String[] args) {

		List<List<String>> list = new ArrayList<>();

		list.add(Arrays.asList("a", "b", "c"));
		list.add(Arrays.asList("d", "e", "f"));
		list.add(Arrays.asList("g", "h", "i"));
		list.add(Arrays.asList("j", "k", "l"));
		
		list.stream()
			.flatMap(str -> str.stream())
			.filter(i -> "a".equals(i))
			.forEach(str -> System.out.println(str));
	}

}
