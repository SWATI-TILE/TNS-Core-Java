package com.tnsif.hasaassociation;

public class Executor {

	public static void main(String[] args) {
		Student s = new Student(1,"Swati",12,"Computer");
		
		College c = new College("Matoshri College of Engineering",s);
		
		System.out.println("Student details: "+s);
		c.display();
		//System.out.println("All details: "+c);

	}

}
