package com.encapsulprog;

public class EncapsulationProg {
	private String Name;
	private int Age;
	private String BankName;
	private String Address;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	  @Override public String toString() 
	  { 
		  return "EncapsulationProg [Name=" + Name
	  + ", Age=" + Age + ", BankName=" + BankName + ", Address=" + Address + "]"; 
	  }
	 

}
