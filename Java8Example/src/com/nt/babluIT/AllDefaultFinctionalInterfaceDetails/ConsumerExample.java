package com.nt.babluIT.AllDefaultFinctionalInterfaceDetails;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {

		Consumer<String> con = str -> System.out.println(str.toUpperCase());

		con.accept("bablu");

		Consumer<Integer> consumer2 = i -> System.out.println(i * i);
		consumer2.accept(5);

		Consumer<String> consumer1 = (arg) -> System.out.println(arg + " My Name is Subhrajit");

		Consumer<String> consumer22 = (arg) -> System.out.println(arg + " I am from India");

		consumer1.andThen(consumer22).accept("Hello, ");
	}

}
