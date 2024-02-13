package com.tnsif.arrayhandling;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 45, 28, 59, 5, 43};
		//original array
		System.out.println("Original Array: "+Arrays.toString(arr));

		//sort
		Arrays.sort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		
		//Binary Search
		int key=20;
		System.out.println(key+" found at index "+Arrays.binarySearch(arr, key));
		

	}

}
