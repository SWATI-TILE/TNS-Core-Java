package com.tnsif.abstractkeyword;

public class Circle extends Shape {

	@Override
	void findArea() {
		int radius = 15 ;
		
		float area = pi * radius * radius;
		System.out.println("Area of circle is : "+area);
	}

}
