package com.tnsif.inheritassociation;

public class Manager extends Employee {
	private int teamsize;

	//constructors
	public Manager() {
		super();
	}
	
	public Manager(String emp_name, int emp_id, String department, int teamsize) {
		super(emp_name,emp_id,department);
		this.teamsize = teamsize;
	}


	//getters and setters
	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}


	//toostring
	@Override
	public String toString() {
		return "Manager [teamsize=" + teamsize + ", getEmp_name()=" + getEmp_name() + ", getEmp_id()=" + getEmp_id()
				+ ", getDepartment()=" + getDepartment() + "\n, toString()=" + super.toString() +  "]";
	}
	
	
}
