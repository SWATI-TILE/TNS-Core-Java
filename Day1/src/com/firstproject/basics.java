package com.firstproject;

public class basics {

	public static void main(String[] args) {
		int a = 10;
		float e,f = 15.5f;
		double c,d = 12d;
		char ch = 'h';
		String str = "Hello!";
		short s = 56;
		long l = 12121;
		
		e = a+f;
		c=d+s+l;
		System.out.println("Addition of " +a+ " and " +f+ " is = "+ e);
		System.out.println("Addition of " +d+","+s+" and " +l+ " is = "+ c);
		
		String newstr = str + ch;
		System.out.println("\nOriginal String: "+str+ "\nAdditional Character: "+ch+ "\nThe new string is: "+newstr);
	

	}

}
