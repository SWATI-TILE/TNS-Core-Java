package com.tnsif.stringmanipulation;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Welcome");
		StringBuffer str2 = new StringBuffer(" World!");
		StringBuffer str3 = new StringBuffer("NAMASTE");
		
		
		str1.append(str2);	//adds the new string with the old string
		System.out.println(str1);
		
		str2.insert(0,"Swati");	//inserts Swati string in specific position
		System.out.println(str2);
		
		str1.replace(0, 3, "Sun"); //replaces the string sun in string str1 for index 0 to 3
		System.out.println(str1);
		
		System.out.println(str3.reverse()); //return the reversed string
		
		System.out.println(str1.capacity());	//returns the capacity of current stringbuffer object
	

	}

}
