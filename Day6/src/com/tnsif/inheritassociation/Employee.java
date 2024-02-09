package com.tnsif.inheritassociation;
//demonstrate IS A association
public class Employee {
	private String emp_name;
	private int emp_id;
	private String department;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String emp_name, int emp_id, String department) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.department = department;
	}

	//getters and setters
	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	//toostring()
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_id=" + emp_id + ", department=" + department + "]";
	}
	
	
	

}
