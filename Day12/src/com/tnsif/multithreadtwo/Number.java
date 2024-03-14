package com.tnsif.multithreadtwo;

//multithreading by implementing Runnable interface

public class Number implements Runnable {

	@Override
	public void run() 
	{
		System.out.println("***1 to 10***");
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.println("\n\n***10 to 1***");
		for(int j=10; j>=1; j--)
		{
			System.out.println(j);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
	}

}
