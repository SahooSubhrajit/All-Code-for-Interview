package com.nt.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {

		List<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");
		
		Collections.sort(al, new NameComparator());
		/*for (Student std : al) {
			System.out.println(std.rollno + " " + std.name + " " + std.age);
		}*/
		al.forEach(std -> System.out.println(std.rollno + " " + std.name + " " + std.age));
		
		System.out.println();
		
		System.out.println("Sorting by age");
		
		Collections.sort(al, new AgeComparator());
		for (Student std1 : al) {
			System.out.println(std1.rollno + " " + std1.name + " " + std1.age);
		}
		
		System.out.println();

		System.out.println("Sorting by Name");
		Comparator<Student> cm1 = Comparator.comparing(Student::getName);
//		Comparator<Student> cm1 = Comparator.comparing(Student::getName).reversed();

		Collections.sort(al, cm1);

		for (Student std : al) {
			System.out.println(std.rollno + " " + std.name + " " + std.age);
		}

		System.out.println();

		System.out.println("Sorting by age");

		Comparator<Student> cm2 = Comparator.comparing(Student::getAge);
//		Comparator<Student> cm2 = Comparator.comparing(Student::getAge).reversed();

		Collections.sort(al, cm2);

		al.forEach(a -> {
			System.out.println(a.rollno + " " + a.name + " " + a.age);
		});

	}

}
