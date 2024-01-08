package com.amazon.product;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1,b=1,x=0;
		System.out.println("Enter a choice:");
		String ch = sc.next();
		switch(ch) {
		case "+":
			x = a+b;
			break;
		case "-":
			x = a-b;
			break;
		case "*":
			x = a*b;
			break;
		}
		System.out.println("Result:"+x);
		sc.close(); 

	}

}
