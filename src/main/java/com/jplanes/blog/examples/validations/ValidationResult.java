package com.jplanes.blog.examples.validations;


public class ValidationResult {
	private boolean valid;
	private String messsage;
	
	public static ValidationResult ok(){
		return new ValidationResult(true, null);
	}
	
	public static ValidationResult fail(String message){
		return new ValidationResult(false, message);
	}
	
	private ValidationResult(boolean valid, String messsage) {
		this.valid = valid;
		this.messsage = messsage;
	}

	public boolean isvalid() {
		return valid;
	}
	
	public void throwIfInvalid() {
		if(!isvalid()) throw new IllegalArgumentException(getMesssage());
	}
	
	public void throwIfInvalid(String fieldName) {
		if(!isvalid()) throw new IllegalArgumentException(fieldName + " : " + getMesssage());
	}
	
	public String getMesssage() {
		return messsage;
	}
}
