package com.tnsif.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeExecutor {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		Employee em1 = new Employee(1005,"Shweta",32,32000.0);
		emp.add(em1);
		//OR
		emp.add(new Employee(1003,"Jiya",26,22000.0));
		emp.add(new Employee(1004,"Tina",23,12000.0));
		emp.add(new Employee(1001,"Riya",30,28000.0));
		emp.add(new Employee(1002,"Deepak",28,25000.0));
		
		System.out.println("Original list: ");
		emp.forEach(System.out::println);
		
		Collections.sort(emp, new EmployeeIdComparator());
		System.out.println("\nSorted list on the basis of ID: ");
		emp.forEach(System.out::println);
		
		Collections.sort(emp, new EmployeeNameComparator());
		System.out.println("\nSorted list on the basis of Name: ");
		emp.forEach(System.out::println);
		
		Collections.sort(emp, new EmployeeAgeComparator());
		System.out.println("\nSorted list on the basis of Age: ");
		emp.forEach(System.out::println);
		
		Collections.sort(emp, new EmployeeSalaryComparator());
		System.out.println("\nSorted list on the basis of Salary: ");
		emp.forEach(System.out::println);

	}

}
