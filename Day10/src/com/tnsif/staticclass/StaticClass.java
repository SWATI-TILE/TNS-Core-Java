package com.tnsif.staticclass;

public class StaticClass {

	public static void main(String[] args) {
		
	        int result = StaticNestedClass.add(5, 3);
	        System.out.println("Addition is: " + result);
	    }

	    // Static nested class
	    static class StaticNestedClass {
	        public static int add(int a, int b) {
	            return a + b;
	            
	        }
	    }
		

	}


