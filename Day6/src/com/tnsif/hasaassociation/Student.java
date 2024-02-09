package com.tnsif.hasaassociation;
// to demonstrate association between objets(has a association)
public class Student {
	private int stud_id;
	private String stud_name;
	private int roll_no;
	private String department;
	
	//constructor
	public Student() {
		super();
	}

	public Student(int stud_id, String stud_name, int roll_no, String department) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.roll_no = roll_no;
		this.department = department;
	}

	
	//getters and setters
	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	//to String
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", roll_no=" + roll_no + ", department="
				+ department + "]";
	}
	

}
