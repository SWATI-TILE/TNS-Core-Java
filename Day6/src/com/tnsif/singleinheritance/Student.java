package com.tnsif.singleinheritance;

import java.util.Scanner;

public class Student {
	String name;
	int roll_no;
	String contact_no;
	String email_id;
	
	Scanner sc =new Scanner(System.in);
	 public void accept()
	 {
		 System.out.println("Enter the name of student: ");
		 name = sc.next();
		 
		 System.out.println("Enter roll number: ");
		 roll_no = sc.nextInt();
		 
		 System.out.println("Enter contact number: ");
		 contact_no = sc.next();
		 
		 System.out.println("Enter email ID: ");
		 email_id = sc.next();
	 }
	 
	 public void display()
	 {
		 System.out.println("\nSTUDENT DETAILS ARE: ");
		 System.out.println("Name: "+name+"\nRoll No.: "+roll_no+"\nContact No.: "+contact_no+"\nEmail Id: "+email_id);
	 }

}
