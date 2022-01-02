package com.api.modelRequest.Email;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class EmailAccountValidateNumberTokenRequest {
	
	private Integer token;
	
	public Integer getToken() {
		return token;
	}

	public void setToken(Integer token) {
		this.token = token;
	}
}
