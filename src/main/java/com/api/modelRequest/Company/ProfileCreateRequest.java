package com.api.modelRequest.Company;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
	fieldVisibility=JsonAutoDetect.Visibility.ANY, 
	getterVisibility=JsonAutoDetect.Visibility.NONE, 
	setterVisibility=JsonAutoDetect.Visibility.NONE, 
	creatorVisibility=JsonAutoDetect.Visibility.NONE
)
public class ProfileCreateRequest {
	
	private String 	EmailRecovery;
	private String 	FirstName;
	private String 	LastName;
	private String 	PhoneNumber;
	private Integer ProfileID;
	
	public String getEmailRecovery() {
		return EmailRecovery;
	}
	
	public void setEmailRecovery(String emailRecovery) {
		EmailRecovery = emailRecovery;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	public Integer getProfileID() {
		return ProfileID;
	}
	
	public void setProfileID(Integer profileID) {
		ProfileID = profileID;
	}
}
