//Given a list of integers, find the maximum value element present in it using Stream functions?

package com.babluIT.PracticeQuestionOnStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q6 {
	public static void main(String[] args) {
		
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 
		 Integer maxNum = myList.stream()
				 				 .max(Integer::compare)
				 				 .get();
		 
		 System.out.println(maxNum);
	}

}
