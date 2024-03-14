package com.tnsif.treemapclass;

import java.util.TreeMap;

public class StudentExecutor {

	public static void main(String[] args) {
		TreeMap<Student,String> students = new TreeMap<Student,String>();
		students.put(new Student(111,"Swara",93.4f), " First Year");
		students.put(new Student(112,"Hemant",85.0f), " Second Year");
		students.put(new Student(113,"Abhishek",67.8f), " Third Year");
		students.put(new Student(114,"Nitya",77.3f), " First Year");
		students.put(new Student(115,"Karan",58.2f), " Final Year");
		
		System.out.println(students);

	}

}
