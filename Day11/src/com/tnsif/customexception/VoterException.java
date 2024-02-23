package com.tnsif.customexception;

import java.util.Scanner;

public class VoterException {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age for voting: ");
		age = sc.nextInt();
		
		if(age<18)
		{
			throw new CantVote("You cannot cast a vote as you are underage!!");
		}
		else
		{
			System.out.println("You can cast a vote!!!");
		}
	}
}
class CantVote extends RuntimeException
{
	public CantVote(String msg)
	{
		super(msg);
	}
}