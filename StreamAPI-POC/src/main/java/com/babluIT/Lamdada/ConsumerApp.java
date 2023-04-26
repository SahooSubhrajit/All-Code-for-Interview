package com.babluIT.Lamdada;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerApp {
	public static void main(String[] args) {
		
		Consumer<String> consumer = (String str) -> {
			System.out.println(str.toUpperCase());
		};
		
		consumer.accept("Subhrajit");
		consumer.accept("Sahoo");
		
		
		BiConsumer<Integer, Integer> biconsumer = (Integer a,Integer b) -> {
			System.out.println(a*b);
		};
		biconsumer.accept(2,3);
		biconsumer.accept(25,3);
	}

}
