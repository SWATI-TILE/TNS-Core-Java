package com.tnsif.scanner_instanceof;
//demonstrate scanner class, instanceof() and get and set methods
public class Person {
	private String name;
	private int age;
	private String city;
	
	
	//constructors	
	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Person() {
		super();
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
	
	
	

}
