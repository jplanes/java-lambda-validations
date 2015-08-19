package com.jplanes.blog.examples.model.validator;

import com.jplanes.blog.examples.model.Person;

public class OldFashionedPersonValidator implements PersonValidator {

	public void validate(Person person) {
		if(person.getFirstName() == null) throw new IllegalArgumentException("firstname : must not be null");
		if(person.getFirstName().length() < 2) throw new IllegalArgumentException("firstname : must have at least 2 characters");
		if(person.getFirstName().length() > 30) throw new IllegalArgumentException("firstname : must have less than 30 characters");
		
		if(person.getLastName() == null) throw new IllegalArgumentException("lastname : must not be null");
		if(person.getLastName().length() < 4) throw new IllegalArgumentException("lastname : must have at least 4 characters");
		if(person.getLastName().length() > 30) throw new IllegalArgumentException("lastname : must have less than 30 characters");

		if(person.getEmail() == null) throw new IllegalArgumentException("email : must not be null");
		if(person.getEmail().length() < 3) throw new IllegalArgumentException("email : must have at least 3 characters");
		if(person.getEmail().length() > 50) throw new IllegalArgumentException("email : must have less than 50 characters");
		if(!person.getEmail().contains("@")) throw new IllegalArgumentException("email : must contains @");
		
		
		if(person.getAge() < 0) throw new IllegalArgumentException("age : must be greater than 0");
		if(person.getAge() > 110) throw new IllegalArgumentException("age : must be lower than 0");
	}

}
