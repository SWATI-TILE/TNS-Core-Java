package com.tnsif.heirarchicalinheritance;

public class Doctor extends Person{
	private String specialization;
	private String hospitalName;
	
	//constructors
	public Doctor() {
		super();
	}
	public Doctor(String name, String city, String specialization, String hospitalName) {
		super();
		this.specialization = specialization;
		this.hospitalName = hospitalName;
	}
	
	//getters and setters
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Doctor [specialization=" + specialization + ", hospitalName=" + hospitalName + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
