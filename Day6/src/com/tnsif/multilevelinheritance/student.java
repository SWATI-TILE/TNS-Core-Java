package com.tnsif.multilevelinheritance;

import java.util.Scanner;

public class student {
	String name;
	int rollno, m1, m2, m3;
	Scanner sc = new Scanner(System.in);
	void getdata()
	{
		
		System.out.println("Enter student name: ");
		name=sc.next();
		
		System.out.println("Enter student roll no.: ");
		rollno=sc.nextInt();
		
		System.out.println("Enter m1 marks: ");
		m1=sc.nextInt();
		
		System.out.println("Enter m2 marks: ");
		m2=sc.nextInt();
		
		System.out.println("Enter m3 marks: ");
		m3=sc.nextInt();
		
	}

}
