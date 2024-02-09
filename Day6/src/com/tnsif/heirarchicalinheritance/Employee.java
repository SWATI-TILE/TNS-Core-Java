package com.tnsif.heirarchicalinheritance;
//child 1 of Person
public class Employee extends Person {
	private int empId;
	private float salary;
	private String companyName;
	
	//constructor
	public Employee() {
		super();
	}
	
	public Employee(String name, String city, int empId, float salary, String companyName) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.companyName = companyName;
	}


	//getters and setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", companyName=" + companyName + ", toString()="
				+ super.toString() + "]";
	}
	

}
