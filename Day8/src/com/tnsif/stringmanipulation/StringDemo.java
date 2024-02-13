package com.tnsif.stringmanipulation;

public class StringDemo {

	public static void main(String[] args) {
		
		  String s1 = new String("Swati"); //way1 1 object created in heap memory &string constant pool-copy of obj is not allowed 
		  System.out.println(s1);
		  
		  String s2 = "Tile"; //way2 object is directly created String constant pool
		  System.out.println(s2);
		 
		
		
		  //String s3 = new String("hello");// 1 obj created in heap memory & 1 is created in SCP 
		  //String s4 = new String("hello");// only 1 obj is created in heap memory 
		  //String s5 = "hello";//no obj created 
		  //String s6 = "hello";//no obj created
		 
		
		//String
		String str1 = new String("Swati");
		str1.concat(" Tile");//immutable in nature
		System.out.println(str1); // output-> Swati
		
	
		
		//StringBuffer
		StringBuffer str2 = new StringBuffer("Swati");
		str2.append(" Tile");//mutable in nature
		System.out.println(str2); // output-> Swati Tile
		
		
	}

}
