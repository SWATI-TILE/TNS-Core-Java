package com.tnsif.customexception;

import java.util.Scanner;

public class NegativeNumberException {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		number = sc.nextInt();
		
		if(number<0)
		{
			throw new Negative("Number cant be Negative!!!!");
		}
		else
		{
			System.out.println("Number is Postive! ");
		}
	}
}

class Negative extends RuntimeException
{
	public Negative(String msg)
	{
		super(msg);
	}
}