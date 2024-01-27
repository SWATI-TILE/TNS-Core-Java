package com.neewd;

//import com.express.exceptionh;

public class abc {
		static int a;
		static {
			a=4;
			System.out.println("inside");
			System.out.println("a= "+a);
		}
		abc()
		{
			System.out.println("inside constructor");
			a=10;
		}
		public void func()
		{
			a=a+1;
			System.out.println("a= "+a);
		}
		public static void main(String[] args) {
			abc ob=new abc();
			ob.func();
		}

	}


