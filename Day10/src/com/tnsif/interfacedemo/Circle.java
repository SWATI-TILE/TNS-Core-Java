package com.tnsif.interfacedemo;

import java.util.Scanner;

public class Circle implements Shape{
	Double area, radius;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void findArea() {
		System.out.println("Enter Radius of circle: ");
		radius = sc.nextDouble();
		
		area = pi * radius * radius;
		System.out.println("Area of circle is : "+area);
		
	}

	@Override
	public void findVolume() {
		double volume;
		System.out.println("\n\nEnter Radius of Sphere: ");
		radius = sc.nextDouble();
		
		volume = (4/3) * pi * (radius * radius * radius);
		System.out.println("Area of circle is : "+volume);

		
	}

}
