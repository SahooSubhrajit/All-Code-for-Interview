package com.nt.babluIT;

//  https://harshitjain.home.blog/2019/06/28/solving-real-time-queries-using-java-8-features-employee-management-system/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// How many male and female employees are there in the organization?

		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect);
		System.out.println();

		// Print the name of all departments in the organization?

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		/*employeeList.stream().map(Employee::getDepartment).collect(Collectors.toCollection(TreeSet::new))
		.forEach(i -> System.out.println(i));*/
		
		// Print count of all departments in the organization?

		long deptCount = employeeList.stream().map(Employee::getDepartment).distinct().count();
		System.out.println("\n" + deptCount);

		// What is the average age of male and female employees?

		Map<String, Double> avgAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("\n" + avgAge);

		// Get the details of highest paid employee in the organization?

		Optional<Employee> highestPaidEmp = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		Employee employee = highestPaidEmp.get();
		System.out.println("\n" + employee);
		System.out.println();

		/* Optional<Employee> max =
				 employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));*/
		

		// Get the names of all employees who have joined after 2015?

		employeeList.stream().filter(i -> i.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);

		/*employeeList.stream().filter(s -> s.getYearOfJoining() > 2015).forEach(i ->
		 System.out.println(i.getName()));*/
		System.out.println();

		// Count the number of employees in each department?

		Map<String, Long> empCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("\n" + empCount);

		for (Map.Entry entry : empCount.entrySet()) {
			System.out.println(entry.getKey() + ":: " + entry.getValue());
		}
		System.out.println();

		/*Set<Entry<String, Long>> entrySet = empCount.entrySet();
		
		for (Entry<String, Long> entryy : entrySet) {
			System.out.println(entryy.getKey() + " : " + entryy.getValue());
		}
		
		}*/
		
		/*employeeList.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
					.entrySet().stream()
					.sorted(Comparator.comparing(Map.Entry::getValue))
					.forEach(i -> System.out.println(i.getKey()+"  "+i.getValue()));*/

		// What is the average salary of each department?

		Map<String, Double> eachDepartmentAvgSal = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("\n" + eachDepartmentAvgSal);
		System.out.println();

		/*Set<Entry<String, Double>> entrySet = eachDepartmentAvgSal.entrySet();
		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}*/

		// Get the details of youngest male employee in the product development
		// department?

		Optional<Employee> youngestMaleEmployee = employeeList.stream()
				.filter(i -> i.getGender().equals("Male") && i.getDepartment().equals("Product Development"))
				.min(Comparator.comparingInt(Employee::getAge));
		Employee youngestMaleEmployeeDetails = youngestMaleEmployee.get();
		System.out.println("youngestMaleEmployeeDetails================="+ youngestMaleEmployeeDetails);

		// Who has the most working experience in the organization?

		Optional<Employee> mostWorkingExperienceEmp = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println("\n" + mostWorkingExperienceEmp.get());
		System.out.println();

		// How many male and female employees are there in the sales and marketing team?

		Map<String, Long> maleAndFemaleEmployees = employeeList.stream()
				.filter(i -> i.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		Set<Entry<String, Long>> entrySet = maleAndFemaleEmployees.entrySet();

		for (Entry<String, Long> maleAndFemale : entrySet) {
			System.out.println(maleAndFemale.getKey() + "::" + maleAndFemale.getValue());
		}
		System.out.println();

		// What is the average salary of male and female employees?

		Map<String, Double> averageSalaryOfMaleAndFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(averageSalaryOfMaleAndFemale);
		System.out.println();

		// List down the names of all employees in each department?

		Map<String, List<Employee>> allEmpList = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		Set<Entry<String, List<Employee>>> entrySetAllEmpList = allEmpList.entrySet();

		for (Entry<String, List<Employee>> entry : entrySetAllEmpList) {
			System.out.println("Dept Name::" + entry.getKey());
			System.out.println("----------------------------------");
			System.out.println("Emp Name::");
			List<Employee> listEmp = entry.getValue();
			listEmp.forEach(i -> System.out.println(i.getName()));
		}

		// What is the average salary and total salary of the whole organization?

		DoubleSummaryStatistics salary = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(salary.getAverage() + "  " + salary.getSum());

		// Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years.

		Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		Set<Entry<Boolean, List<Employee>>> empAge = partitionEmployeesByAge.entrySet();

		for (Entry<Boolean, List<Employee>> entry : empAge) {
			System.out.println("----------------------------");

			if (entry.getKey()) {
				System.out.println("Employees older than 25 years :");
			} else {
				System.out.println("Employees younger than or equal to 25 years :");
			}

			System.out.println("----------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}
		System.out.println();

		// Who is the oldest employee in the organization? What is his age and which
		// department he belongs to?

		Optional<Employee> oldestEmp = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		System.out.println(oldestEmp);
		System.out.println();

		// selecting top salary employee for each department
		Map<String, Optional<Employee>> topSalaryEmployee = employeeList.stream().collect(Collectors.groupingBy(
				Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

		Set<Entry<String, Optional<Employee>>> entrySet2 = topSalaryEmployee.entrySet();

		for (Map.Entry<String, Optional<Employee>> entry : entrySet2) {
			System.out
					.println("Dept Name-> " + entry.getKey() + " " + "Salary-> " + entry.getValue().get().getSalary());
		}
		System.out.println();

	}

}
