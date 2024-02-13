package com.tnsif.entityrelationship;

public class StudentDriver {

	public static void main(String[] args) {
		Student arr[];
		arr = new Student[5];
		
		arr[0] = new Student(1,"Swati","Nashik");
		arr[1] = new Student(2,"Shweta","Mumbai");
		arr[2] = new Student(3,"Sahil","Pune");
		arr[3] = new Student(4,"Kiara","Chennai");
		arr[4] = new Student(5,"Shraddha","Bengaluru");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Student "+i+" : "+arr[i].getRollNo()+" "+arr[i].getName());
		}

	}

}
