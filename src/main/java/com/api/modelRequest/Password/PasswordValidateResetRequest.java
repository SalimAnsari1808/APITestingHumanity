package com.api.modelRequest.Password;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class PasswordValidateResetRequest {
	
	private String Password;
	private String Token;
	private String ExpiryTime;
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getToken() {
		return Token;
	}
	
	public void setToken(String token) {
		Token = token;
	}
	
	public String getExpiryTime() {
		return ExpiryTime;
	}
	
	public void setExpiryTime(String expiryTime) {
		ExpiryTime = expiryTime;
	}
}
