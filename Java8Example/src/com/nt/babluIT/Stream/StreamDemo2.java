package com.nt.babluIT.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo2 {
	public static void main(String[] args) {

		List<String> names = new ArrayList();
		names.add("Java");
		names.add("Python");
		names.add("Testing");
		names.add("DevOps");
		names.add("Angular");

		names.stream().forEach(i -> System.out.println(i));
	}

}
