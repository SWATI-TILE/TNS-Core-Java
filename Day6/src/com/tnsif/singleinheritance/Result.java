package com.tnsif.singleinheritance;

public class Result extends Student {
	String sub_name;
	int sub_code,marks;
	int total;
	float average;
	
	public void read()
	{
		System.out.println("Enter Subject name: ");
		sub_name=sc.next();
		
		System.out.println("Enter Subject Code: ");
		sub_code=sc.nextInt();
		
		System.out.println("Enter obtained marks: ");
		marks=sc.nextInt();
		
		System.out.println("Enter total marks: ");
		total=sc.nextInt();
		
		average= ((marks/total)*100);
		
	}
	
	public void show()
	{
		
		System.out.println("\nYour Result is: ");
		System.out.println("Subject Name: "+sub_name+"\nSubject Code: "+sub_code+"\nObtained Marks: "+marks+"\nTotal Marks: "+total+"\nPercentage: "+average);
	}
}
