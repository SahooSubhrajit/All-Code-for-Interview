package com.nt.babluIT.Stream.Collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsTestDemo {
	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student("Paul", 11, "Economics", 78.9));
		studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
		studentList.add(new Student("Harish", 13, "History", 83.7));
		studentList.add(new Student("Xiano", 14, "Literature", 71.5));
		studentList.add(new Student("Soumya", 15, "Economics", 77.5));
		studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
		studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
		studentList.add(new Student("Mitshu", 18, "History", 73.5));
		studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
		studentList.add(new Student("Harry", 20, "History", 71.9));

		// Collecting top 3 performing students into List
		studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3)
				.collect(Collectors.toList()).forEach(i -> System.out.println(i));

		// Collecting subjects offered into Set.
		Set<String> collect = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
		System.out.println("\n" + collect);

		Set<String> collect2 = studentList.stream().map(Student::getSubject)
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println("\n" + collect2 + "\n");

		// Collecting name and percentage of each student into a Map

		Map<String, Double> studentMap = studentList.stream()
				.collect(Collectors.toMap(Student::getName, Student::getPercentage));

		for (Map.Entry entry : studentMap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		// Collecting name and percentage of each student into a Map in sorted order
		Map<String, Double> collect3 = studentList.stream()
				.collect(Collectors.toMap(Student::getName, Student::getPercentage));

		Set<Entry<String, Double>> entrySet = collect3.entrySet();
		HashSet<Entry<String, Double>> collect4 = entrySet.stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toCollection(HashSet::new));

		for (Entry<String, Double> entry1 : collect4) {
			System.out.println(entry1.getKey() + "  " + entry1.getValue());
		}

		// Collecting first 3 students into LinkedList
		LinkedList<Student> linkedListCollect = studentList.stream().limit(3)
				.collect(Collectors.toCollection(LinkedList::new));
		for (Student stu : linkedListCollect) {
			System.out.println(stu);
		}

		// Collecting the names of all students joined as a string
		String collectjoin = studentList.stream().map(Student::getName).collect(Collectors.joining(","));
		System.out.println(collectjoin);

		// Counting number of students
		long count = studentList.stream().count();
		System.out.println(count);

		Long collectCount = studentList.stream().collect(Collectors.counting());
		System.out.println(collectCount);

		// Collecting highest percentage
		Optional<Student> collect123 = studentList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPercentage)));
		if (collect123.isPresent()) {
			System.out.println("highest percentage::  " + collect123.get().getPercentage());
		}

		Double double1 = studentList.stream().map(Student::getPercentage)
				.collect(Collectors.maxBy(Comparator.naturalOrder())).get();
		System.out.println("highest percentage::  " + double1);

		// Collecting lowest percentage
		Double minPercentage = studentList.stream().map(Student::getPercentage)
				.collect(Collectors.minBy(Comparator.naturalOrder())).get();
		System.out.println("minPercentage::  " + minPercentage);

		// Collecting sum of percentages <summingInt(), summingLong(), summingDouble()>

		System.out.println(studentList.stream().collect(Collectors.summingDouble(Student::getPercentage)));

		// Collecting average percentage <averagingInt(), averagingLong(),
		// averagingDouble()>

		System.out.println(studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage)));

		// Extracting highest, lowest and average of percentage of students
		// <ummarizingInt(), summarizingLong(), summarizingDouble()>
		DoubleSummaryStatistics studentStats = studentList.stream()
				.collect(Collectors.summarizingDouble(Student::getPercentage));
		System.out.println("Highest Percentage : " + studentStats.getMax());

		System.out.println("Lowest Percentage : " + studentStats.getMin());

		System.out.println("Average Percentage : " + studentStats.getAverage());

		// Grouping the students by subject
		Map<String, List<Student>> collect21 = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));

		Set<Entry<String, List<Student>>> entrySet12 = collect21.entrySet();

		for (Map.Entry<String, List<Student>> entry : entrySet12) {

			System.out.println("Student Name belonging from Subject::  " + entry.getKey());
			System.out.println("============");
			List<Student> value = entry.getValue();
			for (Student stu : value) {
				System.out.println(stu.getName());
			}
		}

		// Partitioning the students who got above 80.0% from who don’t
		Map<Boolean, List<Student>> studentspartionedByPercentage = studentList.stream()
				.collect(Collectors.partitioningBy(s -> s.getPercentage() > 85.2));
		System.out.println(studentspartionedByPercentage);

		for (Map.Entry<Boolean, List<Student>> entry : studentspartionedByPercentage.entrySet()) {
			if (entry.getKey()) {
				System.out.println(entry.getValue());
			}
		}

		// Collecting first three students into List and making it unmodifiable
		studentList.stream().limit(3)
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableCollection))
				.forEach(i -> System.out.println(i));

	}

}
