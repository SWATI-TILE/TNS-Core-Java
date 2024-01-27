package com.express;

public class exceptionh {
	static int a;
	static {
		a=4;
		System.out.println("inside");
		System.out.println("a= "+a);
	}
	exceptionh()
	{
		System.out.println("inside constructor");
		a=10;
	}
	public void func()
	{
		a=a+1;
		System.out.println("a= "+a);
	}
	public static void main(String[] args) {
		exceptionh ob=new exceptionh();
		ob.func();
	}

}
