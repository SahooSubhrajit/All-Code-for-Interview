package com.ct;

public class Demo7 {
	public static void main(String[] args) {
		
		Calculator calcu = (i,j) -> i+j;
		System.out.println(calcu.cal2(2,4));
		
		/*Calculator calcu1 = () -> System.out.println("Hi");
		calcu1.cal1();*/
		
		
		
	}

}

//@FunctionalInterface
interface Calculator{
//	public void cal1();
	public int cal2(int i, int j);
}
