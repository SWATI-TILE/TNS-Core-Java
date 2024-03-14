package com.tnsif.treemapclass;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> courses = new TreeMap<String,Integer>();
		
		courses.put("Python",60);
		courses.put("Java",58);
		courses.put("C",98);
		courses.put("HTML",76);
		courses.put("Javascript",59);
		
		System.out.println(courses);

	}

}
