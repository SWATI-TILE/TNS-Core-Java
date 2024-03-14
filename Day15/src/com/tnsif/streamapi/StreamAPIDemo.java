package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) 
	{
		Stream<Integer> stream = Stream.of(10,20,30,40,50,60,70,80,90);
		System.out.println("Count: "+stream.count());
		
		//array elements into stream
		Integer[] values=new Integer[] {1,2,3,4,5};
		stream = Arrays.stream(values);
		System.out.println("\nValues: "+Arrays.toString(values));
		
		stream = stream.map(m->m*m);
		System.out.println("Square: ");
		stream.forEach(System.out::println);
		
		List<String> words= Arrays.asList("Hello","Good","Evening");
		System.out.println("\nOriginal Words: "+words);
		
		Stream<String> stream1 = words.stream();
		System.out.println("\nUppercase words: ");
		List<String> s1= stream1.map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		
		stream1 = words.stream();
		System.out.println("\nLowercase words: ");
		stream1.map(str->str.toLowerCase()).forEach(System.out::println);
		
		
	}

}
