package com.tnsif.heirarchicalinheritance;

public class Person {
	private String name;
	private String city;
	
	//constructors
	public Person() {
		super();
	}
	
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	//tostring
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	

}
