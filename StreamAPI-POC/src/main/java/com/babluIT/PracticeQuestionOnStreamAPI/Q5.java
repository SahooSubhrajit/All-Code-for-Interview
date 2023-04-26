//Given a list of integers, find the total number of elements present in the list using Stream functions?

package com.babluIT.PracticeQuestionOnStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Q5 {
	public static void main(String[] args) {
		
		  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		  
		 System.out.println("total number of elements:: "+myList.stream().count());
		 System.out.println();
		 
		 myList.stream()
		 	   .map(i -> i+i)
		       .forEach(i -> System.out.print(i + "  "));
		 
		 System.out.println();
		 
		 int sum2 = myList.stream()
			       .mapToInt(i -> i).sum();
//		           .mapToInt(Integer::intValue).sum();
			 System.out.println("total sum of elements:: "+sum2);
			 
			 System.out.println();
		 
		 
		 OptionalDouble sum21 = myList.stream()
		       .mapToInt(i -> i).average();
//         .mapToInt(Integer::intValue).average();
		 System.out.println("total Average of elements:: "+sum21.getAsDouble());
		       
	}

}
