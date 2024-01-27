package com.secondpackage;

import com.firstpackage.base;

public class executor extends base{

	public static void main(String[] args) {
		base b=new base();
		
		//b.methodDefault();//not accessible
		//b.methodProtected();//not accessible
		b.methodPublic();
		
		//b.varDefault=37;//not accessible
		//b.varProtected=56;//not accessible
		b.varPublic=78;
		//b.varPrivate=13;//not accessible
		
		//b.methodDefault();//not accessible
		//b.methodProtected();//not accessible
		b.display();
		b.methodPublic();
		

	}

}
