package com.jplanes.blog.examples.model.validator;

import static com.jplanes.blog.examples.validations.helper.IntegerValidationHelpers.intBetween;
import static com.jplanes.blog.examples.validations.helper.StringValidationHelpers.between;
import static com.jplanes.blog.examples.validations.helper.StringValidationHelpers.contains;
import static com.jplanes.blog.examples.validations.helper.StringValidationHelpers.notNull;

import com.jplanes.blog.examples.model.Person;

public class LamdaPersonValidator implements PersonValidator {

	public void validate(Person person) {
		notNull.and(between(2, 12)).test(person.getFirstName()).throwIfInvalid("firstname");
		notNull.and(between(4, 30)).test(person.getLastName()).throwIfInvalid("secondname");
		notNull.and(between(3, 50)).and(contains("@")).test(person.getEmail()).throwIfInvalid("email");
		intBetween(0, 110).test(person.getAge()).throwIfInvalid("age");
	}
	
}
