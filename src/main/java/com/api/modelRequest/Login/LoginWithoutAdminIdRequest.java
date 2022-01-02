package com.api.modelRequest.Login;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class LoginWithoutAdminIdRequest {
	

	private String Password;

	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}

}
