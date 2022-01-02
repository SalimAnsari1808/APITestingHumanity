package com.api.modelRequest.Password;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class PasswordValidateResetWithoutToken {
	
	private String Password;
	private String ExpiryTime;
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getExpiryTime() {
		return ExpiryTime;
	}
	
	public void setExpiryTime(String expiryTime) {
		ExpiryTime = expiryTime;
	}
}
