package com.tnsif.multilevelinheritance;

public class result extends sport{
	float avg,total,per;
	
	void show_result()
	{
		total=m1+m2+m3+score;
		avg=total/4;
		
		System.out.println("The final total is: "+total);
		System.out.println("The average is: "+avg);
		
	}

}
