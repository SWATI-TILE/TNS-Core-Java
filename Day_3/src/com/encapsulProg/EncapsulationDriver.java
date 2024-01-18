package com.encapsulProg;

public class EncapsulationDriver {

	public static void main(String[] args) {
		EncapsulationProg obj = new EncapsulationProg();
		
		obj.setName("Swati");
		obj.setAge(28);
		obj.setBankName("Union Bank");
		obj.setAddress("Palase");
		
		System.out.println("Your Bank Details are: \n"+obj);
	}

}
