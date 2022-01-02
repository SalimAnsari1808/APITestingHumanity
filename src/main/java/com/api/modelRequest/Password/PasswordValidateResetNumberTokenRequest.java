package com.api.modelRequest.Password;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class PasswordValidateResetNumberTokenRequest {
	
	private String Password;
	private Integer Token;
	private String ExpiryTime;
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public Integer getToken() {
		return Token;
	}
	
	public void setToken(Integer token) {
		Token = token;
	}
	
	public String getExpiryTime() {
		return ExpiryTime;
	}
	
	public void setExpiryTime(String expiryTime) {
		ExpiryTime = expiryTime;
	}

}
