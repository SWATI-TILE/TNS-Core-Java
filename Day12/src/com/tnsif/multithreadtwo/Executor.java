package com.tnsif.multithreadtwo;

public class Executor {

	public static void main(String[] args) {
		Number n = new Number();
		Thread t = new Thread(n);
		t.start();

	}

}
