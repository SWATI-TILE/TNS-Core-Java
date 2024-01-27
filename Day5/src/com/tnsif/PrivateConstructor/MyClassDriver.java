package com.tnsif.PrivateConstructor;

public class MyClassDriver {

	public static void main(String[] args) {
		//MyClass obj = new MyClass(); //can,t accessed
		
		MyClass m = MyClass.getObject(); //object reference
		m.setId(20);
		m.display();
		
		
// 2nd object point to the first object ... only one object is pointed
		MyClass m2 = MyClass.getObject(); //object reference
		//m.setId(20);
		m2.display();
	}

}
