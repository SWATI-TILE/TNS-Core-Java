package com.tnsif.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		int arr[];
		
		try //1 try block- nested try is allowed
		{
			arr = new int[] {10,20,30,40,50};
			System.out.println(arr[6]);	
		}
		
		catch (ArrayIndexOutOfBoundsException e)	//many catch allowed
		{
			System.err.println("Specified index does not exist. "+e.getMessage());
		}
		
		finally	//1 finally allowed
		{
			System.out.println("I am Finally!...");	
		}

	}

}
