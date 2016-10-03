package org.ragha.hibernate.dto;

import org.apache.log4j.Logger;



public class RegistrationFormDto {


	
	final static Logger logger = Logger.getLogger(RegistrationFormDto.class);
	private String firstName;
	private String lastName;
	
	public RegistrationFormDto(){
		
	}
	
	public RegistrationFormDto(String firstName, String lastName, String empID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
