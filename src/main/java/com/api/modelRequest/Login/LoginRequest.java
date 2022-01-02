package com.api.modelRequest.Login;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
	fieldVisibility=JsonAutoDetect.Visibility.ANY, 
	getterVisibility=JsonAutoDetect.Visibility.NONE, 
	setterVisibility=JsonAutoDetect.Visibility.NONE, 
	creatorVisibility=JsonAutoDetect.Visibility.NONE
)
public class LoginRequest {
	
	private String AdminID;
	private String Password;

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
}
