// to demonstrate private constructor

package com.tnsif.PrivateConstructor;

public class MyClass {
	
	//to access private constructor first create private constructor and static object& method
	//singleton object/method= only can have a single object
	private static MyClass obj = new MyClass();	
	
	
	private int id;

	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//factory method = used to call a static object in another class
	public static MyClass getObject()
	{
		return obj;
	}

	//constructor
	private MyClass() //private constructor
	{
		System.out.println("Private constructor!!");
	}
	
	public void display()
	{
		System.err.println(id);
	}

	//to string
	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	

}
