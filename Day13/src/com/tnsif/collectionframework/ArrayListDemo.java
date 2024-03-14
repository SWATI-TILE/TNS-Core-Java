package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//generics<Integer>
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(345);
		list.add(1000);
		list.add(555);
		list.add(892);
		//list.add('c');
		//list.add("hello")
		//list.remove(1);
		
		System.out.println("List: "+list);
		System.out.println(" ");
		for(int element:list)
		{
			System.out.println("Elements: "+element);
		}
		
		//collections class and collection framework is different
		Collections.sort(list);
		System.out.println("\nAscending Sorted list: "+list);
		
		Collections.reverse(list);
		System.out.println("Reverse order/Descending Sorted list: "+list);
		
		//comparator class & lambda function
		Comparator<Integer> comp = (n1,n2)->n2-n1;
		Collections.sort(list,comp);
		System.out.println("\nDescending Sorted list: "+list);
		
	}

}
