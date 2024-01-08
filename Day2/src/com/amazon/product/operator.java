package com.amazon.product;

public class operator {

	public static void main(String[] args) {
		int a=10,b=11;
		int x = a++ + ++a;
		System.out.println(x);
		x = a++ + ++b;
		System.out.println(x);

	}

}
