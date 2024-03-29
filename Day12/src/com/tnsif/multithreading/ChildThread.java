package com.tnsif.multithreading;

//multithreading by extending thread class

public class ChildThread extends Thread
{
	private int n;
	private String msg;
	
	//constructor
	public ChildThread(int n, String msg) 
	{
		this.n = n;
		this.msg = msg;
	}
	
	public void run()
	{
		for(int i = 1; i<=n; i++)
		{
			System.out.println(msg+ i+ " "+Thread.currentThread().getName());
		}
	}
	
	
}
