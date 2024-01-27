package com.firstpackage;

public class base {
	public int varPublic=10;
	int varDefault=20;
	protected int varProtected=30;
	private int varPrivate=40;
	
	public void methodPublic()
	{
		System.out.println(varPublic);
	}
	
	void methodDefault()
	{
		System.out.println(varDefault);
	}
	
	protected void methodProtected()
	{
		System.out.println(varProtected);
	}
	
	protected void methodPrivae()
	{
		System.out.println(varPrivate);
	}
	public void display()
	{
		methodProtected();
	}
}
