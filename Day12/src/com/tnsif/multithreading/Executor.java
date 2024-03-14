package com.tnsif.multithreading;

public class Executor {

	public static void main(String[] args) {
		
		ChildThread c1 = new ChildThread(3, "First Thread");
		ChildThread c2 = new ChildThread(5, "Second Thread");
		
		c1.start();
		c2.start();
	}

}
