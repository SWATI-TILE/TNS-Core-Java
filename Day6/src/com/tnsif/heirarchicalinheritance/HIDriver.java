package com.tnsif.heirarchicalinheritance;

public class HIDriver {

	public static void main(String[] args) {
		/*
		 * Employee e = new Employee(); 
		 * Doctor d = new Doctor(); //by this way length of line will be increased
		 * 
		 */
		
		
		Person p = new Person("Swati","Nashik"); //obj is tight coupled bcz here LHS and RHS same class name is present
		System.out.println(p); //this way we can do but we are not able to call the child class
		 
		
		Person p1; 	//create object reference --->memory is not allocated
		p1 = new Person("Swati","Nashik");		//loose coupling/dynamic binding	
		//reusing same object for child classes Employee and Doctor
		System.out.println(p1);
		
		
		p1 = new Employee("Swara","Mumbai",101,12000,"TCS");
		System.out.println(p1);
		
		p1 = new Doctor("Sakshi","Pune","Heart","Ashika Hospital");
		System.out.println(p1);
	}

}
