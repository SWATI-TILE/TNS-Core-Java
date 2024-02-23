package com.tnsif.staticclass;

public class StaticVariable {
	static int a =10;
	
	public void show()
	{
		a = 23;
		System.out.println("Value of a = "+a);
	}
	
	public static void main(String[] args) 
	{
		StaticVariable s1 = new StaticVariable();
		s1.show();
	}

}
