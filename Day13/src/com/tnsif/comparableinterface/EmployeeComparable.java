package com.tnsif.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		Employee e1 = new Employee(101,"Swati",25000.0);
		emp.add(e1);
		//OR
		emp.add(new Employee(104,"Gayatri",11000.0));
		emp.add(new Employee(102,"Pratik",34000.0));
		emp.add(new Employee(105,"Anjali",41000.0));
		emp.add(new Employee(103,"Nilima",21000.0));
		
		System.out.println("Original list: ");
		emp.forEach(System.out::println);
		
		Collections.sort(emp);
		System.out.println("\nSorted list on the basis of IDs: ");
		emp.forEach(System.out::println);

	}

}
