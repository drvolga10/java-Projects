package sampleStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterEmployee {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(10, "Amit10", 12000));
		employeeList.add(new Employee(11, "Amit11", 7000));
		employeeList.add(new Employee(13, "Amit13", 15000));
		employeeList.add(new Employee(15, "Amit15", 2000));
		employeeList.add(new Employee(12, "Amit12", 5500));
		employeeList.add(new Employee(14, "Amit14", 18000));
		employeeList.add(new Employee(16, "Amit16", 100));

		/** Get all Employees whose salary is greater than 10000 */
		
		/* employeeList.stream().filter(new Predicate<Employee>() {
		  
		  @Override public boolean test(Employee t) { 
		   return t.getSalary() > 10000; } }).forEach(t ->
		  System.out.println(t));*/
		 
		/**
		 * Print sum of salaries of employees where salary is greater than 10000
		 */
		
/*		  System.out.println("Sum of Salary is : " +
		  employeeList.stream().filter(t -> t.getSalary() > 10000).mapToInt(t-> t.getSalary()).sum());*/
	
		/** Print sum of salaries where salary */
		// System.out.println("Sum of Salary is : " +
		// employeeList.stream().mapToInt(t -> t.getSalary()).sum());

		/**
		 * Print all employees
		 * 
		 */

		// employeeList.stream().forEach(t -> System.out.println(t));

		//employeeList.stream().sorted().forEach(t -> System.out.println(t));

/*		List<Employee> sortedEmpOnSalary = employeeList.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getSalary() < o2.getSalary())
					return -1;
				else if (o1.getSalary() < o2.getSalary())
					return 1;

				return 0;
			}
		}).collect(Collectors.toList());*/
		
		employeeList.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));

	}

}
