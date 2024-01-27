package com.tnsif.scanner_instanceof;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person(); //default constructor
		//p1.name="Swati";	//can't access private member
		
		//printing data by accessing setter and getter methods
		p1.setName("Swati");
		p1.setAge(22);
		p1.setCity("Nashik");
		System.out.println("Name: "+p1.getName());
		System.out.println("Age: "+p1.getAge());
		System.out.println("City: "+p1.getCity());

		//using scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter Name of person: ");
		String name = sc.next();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter city: ");
		String city = sc.next();
		
		Person p2 = new Person(name,age,city);
		System.out.println(p2);
		
		sc.close();
		
		//instanceof()
		System.out.println((p1 instanceof Person)); //returns true if the p1 object belongs to Person class otherwise returns false

	}

}
