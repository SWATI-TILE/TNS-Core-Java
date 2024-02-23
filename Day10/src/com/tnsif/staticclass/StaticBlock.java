package com.tnsif.staticclass;

public class StaticBlock 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Main...");
	}
	
	
	static
	{
		System.out.println("Static Block 1...!");
	}
	static
	{
		System.out.println("Static Block 2...!");
	}

	static
	{
		System.out.println("Static Block 3...!");
	}


}
