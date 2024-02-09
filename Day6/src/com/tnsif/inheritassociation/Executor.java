package com.tnsif.inheritassociation;

public class Executor {

	public static void main(String[] args) {
		Employee e = new Employee("Aria",101,"C2TC");
		
		Manager m = new Manager("Swati",001,"Salesforce",12);
		
		System.out.println(e);
		System.out.println(m);
		

	}

}
