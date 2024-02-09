package com.tnsif.polymorphism;

public class OverloadingDemo {

	public static void main(String[] args) {
		/*
		 * MethodOverloading m = new MethodOverloading();
		 * 
		 * System.out.println(m.addition(1111, 2222));
		 */
		
		System.out.println("String + String: " +MethodOverloading.addition("Swati ", "Tile"));
		System.out.println("Int + Float: "+MethodOverloading.addition(555, 4.3f));
		System.out.println("Int + Int: "+MethodOverloading.addition(555, 4));
		System.out.println("Float + Int: "+MethodOverloading.addition(5.5f, 4));
		System.out.println("Float + Float: "+MethodOverloading.addition(8.5f, 4.3f));

	}

}
