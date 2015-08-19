package com.jplanes.blog.examples.model;


public class Person {
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	
	public Person(String firstName, String lastName, String email, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

}
