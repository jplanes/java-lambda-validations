package com.jplanes.blog.examples.model.validator;

public class LamdaPersonValidatorTest extends AbstractPersonValidationsTest {

	@Override
	protected PersonValidator getValidatorInstance() {
		return new LamdaPersonValidator();
	}

}
