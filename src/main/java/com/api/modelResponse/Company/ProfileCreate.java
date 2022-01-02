package com.api.modelResponse.Company;

public class ProfileCreate {
	
	public int ProfileID;
	public String EmailRecovery;
	public String FirstName;
	public String LastName;
	public String PhoneNumber;
	public long AccountID;
	public String Title;
	
	public int getProfileID() {
		return ProfileID;
	}
	public void setProfileID(int profileID) {
		ProfileID = profileID;
	}
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
	public long getAccountID() {
		return AccountID;
	}
	public void setAccountID(long accountID) {
		AccountID = accountID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
}
