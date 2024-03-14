package com.multithradrunnable;

public class ChildThreadExecutor {

	public static void main(String[] args) {
		//way1
		ChildThread c1 = new ChildThread(10,10,"hello! ");
		
		//way2 ---- Anonymous class
		Runnable r = new Runnable()
				{
						public void run()
						{
							System.out.println("Runnable With the help of Anonymous class!!!");
						}
				};
				Thread t1= new Thread(r);
				t1.start();
				
				
				//t1.setPriority(t1.MIN_PRIORITY);		//min priority=1, default=5. max=10
				

	}

}
