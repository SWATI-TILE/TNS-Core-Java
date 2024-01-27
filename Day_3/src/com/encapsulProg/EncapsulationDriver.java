package com.encapsulProg;

public class EncapsulationDriver {

	public static void main(String[] args) {
		//Object creation using new keyword
		EncapsulationProg obj = new EncapsulationProg();
		
		obj.setName("Swati");
		obj.setAge(28);
		obj.setBankName("Union Bank");
		obj.setAddress("Palase");
		
		/*
		 * EncapsulationProg obj2 = (EncapsulationProg)obj.clone();
		 * System.out.println("Your Bank Details are: \n"+obj2);
		 */
		

		/*
		 * Class<?> clazz = Class.forName("EncapsulationProg"); EncapsulationProg
		 * obj3=(EncapsulationProg)clazz.newInstance();
		 */
		
		System.out.println("Your Bank Details are: \n"+obj);
	}

}
