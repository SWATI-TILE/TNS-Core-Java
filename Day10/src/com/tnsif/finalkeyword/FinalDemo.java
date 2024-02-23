package com.tnsif.finalkeyword;

public class FinalDemo {
	//final variable
	final int a= 23;
	
	public void change()
	{
		//a= 2; // cannot assign the value again
		System.out.println("A= "+a);
	}
	public static void main(String[] args) {
		FinalDemo f1 = new FinalDemo();
		f1.change();
	}

}
