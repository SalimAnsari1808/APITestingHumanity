package com.api.modelRequest.Account;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class AccountCreateWithoutAdminIdRequest {
	
	private String  Password;
	private String  Language;
	private Boolean requireToken;
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getLanguage() {
		return Language;
	}
	
	public void setLanguage(String language) {
		Language = language;
	}
	
	public Boolean getRequireToken() {
		return requireToken;
	}
	
	public void setRequireToken(Boolean requireToken) {
		this.requireToken = requireToken;
	}

}
