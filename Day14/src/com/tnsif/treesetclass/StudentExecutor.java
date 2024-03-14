package com.tnsif.treesetclass;

import java.util.TreeSet;

public class StudentExecutor {

	public static void main(String[] args) {
		TreeSet<Student>  students = new TreeSet<Student>();
		students.add(new Student(101,"Sharmila",88.0f));
		students.add(new Student(102,"Kaira",67.8f));
		students.add(new Student(103,"Amruta",77.0f));
		students.add(new Student(104,"Lily",90.2f));
		students.add(new Student(105,"Jennie",91.4f));
		
		System.out.println(students);

	}

}
