package com.tnsif.hasaassociation;

public class College {
	private String clg_name;
	private Student student;
	
	//constructors
	public College() {
		super();
	}
	
	public College(String clg_name, Student student) {
		super();
		this.clg_name = clg_name;
		this.student = student;
	}

	
	//getters and setters
	public String getClg_name() {
		return clg_name;
	}

	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	//to string
	/*
	 * @Override public String toString() { return "College [clg_name=" + clg_name +
	 * ", student=" + student + "]"; }
	 */
	
	public void display()
	{
		System.out.println("\nName of college: "+clg_name);
		System.out.println("Student Details \nID: "+student.getStud_id()+"\nName: "+student.getStud_name()+"\nRoll No: "+student.getRoll_no()+"\nDepartment: "+student.getDepartment());
	}
	
	

	
	

	
	
	

}
