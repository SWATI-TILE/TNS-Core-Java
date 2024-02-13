package com.tnsif.stringmanipulation;

public class StringMethods {

	public static void main(String[] args) {
		String str1 = "Welcome";
		String str2 = new String("Welcome");
		
		String str3 = "Swati";
		String str5 = "GES Polytechnic";
		String str6 = " ";	//String str6 = "";
		//String str4 = new String("Na maste");
		//int i = 65;
		
		String s = str1.concat(" "+str3);		//adds the "Swati" string at the end of "Welcome" string
		System.out.println(s);
		
		System.out.println("The length of "+str2+ " is: "+str2.length());	//returns the length of the string
		System.out.println("Index no. of character c in string Welcome is: "+str2.indexOf("c"));	//returns the index no of c in the string Welcome
		System.out.println("Character present in 5th position of string Welcome is: "+str2.charAt(5));	//returns character at the specified index no.
		System.out.println(str2.lastIndexOf("e"));	//returns the last index of character
		System.out.println(str2.substring(3, 7)); //returns the substring starting from index 3 to 7 ----> 3=include 7=exclude
		System.out.println(str2.toUpperCase()); //returns string in uppercase
		System.out.println(str2.toLowerCase()); //returns string in lowercase
		System.out.println(str2.replace("W", "S")); //replaces the old character W with new character S & returns new string 
		//System.out.println(str4.trim());	//returns new string with removing all white blank spaces
		System.out.println(str2.startsWith("W"));	//returns true if the given string starts with W -->o/p
		System.out.println(str2.endsWith("k"));	//returns true if the given string/char ends with -->o/p:false
		//System.out.println(str2.valueOf(i));	//used to convert primitive data types int/float/double/char/long into string type
		System.out.println(str5.replaceAll("Polytechnic", "Institute"));	//replaces institute word with polytechnic word
		System.out.println(str6.isEmpty());	//returns true if the given string is empty--> space is not counted as empty
		System.out.println(str6.isBlank());	//returns true if the given string is blank--> space is counted as blank
		
		
		//comparisons
		
		String s1 = "HELLO";//scp
		String s2 = "HELLO";
		String s3 = new String("HELLO");//heap area
		String s4 = new String("HELLO");
		
		System.out.println("\n\nSTRING COMPARISONS: \n");
		
		//==(double equal to)  ------> address comparison
		System.out.println("Method 1: ==");
		System.out.println("s1==s2 : "+(s1==s2));	//true: s1-scp s2-scp
		System.out.println("s1==s3 : "+(s1==s3));	//false: s1-scp s3-heap
		System.out.println("s3==s4 : "+(s3==s4));	//?
		
		//equals() -----> content comparison
		System.out.println("\nMethod 2: equals()");
		System.out.println("s1 equals s2 : "+(s1.equals(s2)));	// HELLO EQUALS HELLO : true
		System.out.println("s1 equals s3 : "+(s1.equals(s3)));	//true
		System.out.println("s3 equals s4 : "+(s3.equals(s4)));	//true
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compareTo() -----> unicode/alphabetical order(luxicographical) comparison
		System.out.println("\nMethod 3: compareTo()");
		System.out.println("s1 compareTo s2 : "+(s1.compareTo(s2)));	// HELLO same HELLO : 0
		System.out.println("s1 CompareTo hello : "+(s1.compareTo("hello")));	//-32 bcz compareTo() is case sensitive
		System.out.println("s1 compareToIgnoreCase hello : "+(s1.compareToIgnoreCase("hello")));	//0 case insensitive
		
		
	}

}
