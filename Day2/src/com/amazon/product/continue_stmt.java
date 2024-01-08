package com.amazon.product;

public class continue_stmt {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i%2==0) {
				continue;
			}
		}

	}

}
