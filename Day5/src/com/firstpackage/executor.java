package com.firstpackage;

public class executor {

	public static void main(String[] args) {
		base b=new base();
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		b.varDefault=37;
		b.varProtected=56;
		b.varPublic=78;
		//b.varPrivate=13;
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
	}
}
