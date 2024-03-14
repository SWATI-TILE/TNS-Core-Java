package com.tnsif.collectionframework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class StudentExecutor {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(101,"Swati",99.4f);
		studentList.add(s1);
		Student s2 = new Student(102,"Alia",88.4f);
		studentList.add(s2);
		Student s3 = new Student(103,"Preeti",78.7f);
		studentList.add(s3);
		Student s4 = new Student(104,"Tripti",91.2f);
		studentList.add(s4);
		Student s5 = new Student(105,"Gayatri",77.9f);
		studentList.add(s5);
		
		System.out.println(studentList);
		
		Comparator<Student> comp1 = (st1,st2) -> (int)(st1.getPer()-st2.getPer());
		Collections.sort(studentList, comp1);
		System.out.println(studentList);
		

	}

}
