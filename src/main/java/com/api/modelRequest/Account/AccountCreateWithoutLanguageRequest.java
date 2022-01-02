package com.api.modelRequest.Account;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class AccountCreateWithoutLanguageRequest {
	
	private String  AdminID;
	private String  Password;
	private Boolean requireToken;
	
	public String getAdminID() {
		return AdminID;
	}
	
	public void setAdminID(String adminID) {
		AdminID = adminID;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public Boolean getRequireToken() {
		return requireToken;
	}
	
	public void setRequireToken(Boolean requireToken) {
		this.requireToken = requireToken;
	}

}
