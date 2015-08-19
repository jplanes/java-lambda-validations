package com.jplanes.blog.examples.model.validator;

public class OldFashionedPersonValidatorTest extends AbstractPersonValidationsTest {

	@Override
	protected PersonValidator getValidatorInstance() {
		return new OldFashionedPersonValidator();
	}

}
