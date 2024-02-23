package com.tnsif.multicatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
	
	public static void divide()
	{
		int num1, num2, divide;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter number 1: ");
			num1 = sc.nextInt();
			System.out.println("Enter number 2: ");
			num2 = sc.nextInt();
			divide = num1 / num2;
			System.out.println("Division is: "+divide);
		}
		catch (InputMismatchException e)
		{
			System.err.println("Invalid Input.. Input must be Interger only!");
		}
		catch (ArithmeticException e)
		{
			System.err.println("Exception caught.. "+e.getMessage());
		}
		catch (Exception e)
		{
			System.err.println("Exception caught.. "+e.getMessage());
		}
		finally
		{
			sc.close();
		}
	}

}
