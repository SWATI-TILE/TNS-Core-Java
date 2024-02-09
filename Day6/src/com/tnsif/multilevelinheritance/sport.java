package com.tnsif.multilevelinheritance;

public class sport extends student {
	int score;
	
	void getscore() {
		
		System.out.println("Enter your sports score: ");
		score=sc.nextInt();
	}
}
