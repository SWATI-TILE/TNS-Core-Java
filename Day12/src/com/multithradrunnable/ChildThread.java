package com.multithradrunnable;

public class ChildThread implements Runnable{

	Thread t; //reference variable
	int l, h;
	String msg;
	
	//constructor
	public ChildThread(int l, int h, String msg) {
		this.l = l;
		this.h = h;
		this.msg = msg;
		
		t = new Thread(this,"Child Thread");
		t.start();
	}
	
	
	@Override
	public void run() {
		for(int i = 1 ; i<=h ;i++)
		{
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		
			System.out.println(msg+ i);
		}
		
	}

	
	

}
