package com.tnsif.runtimepolymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		
		  SBI sbi = new SBI(); 
		  ICICI icici = new ICICI(); 
		  HDFC hdfc = new HDFC();
		  
		  System.out.println("Interest of SBI: "+sbi.getRateOfInterest());
		  System.out.println("Interest of ICICI: "+icici.getRateOfInterest());
		  System.out.println("Interest of HDFC: "+hdfc.getRateOfInterest());
		 
		
		

	}

}
