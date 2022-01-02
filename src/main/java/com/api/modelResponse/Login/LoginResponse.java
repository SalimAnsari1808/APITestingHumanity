package com.api.modelResponse.Login;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class LoginResponse {
	
	private Login 	data;
	private String 	error;
	private String 	message;
	private String 	i18n_msg;
	private Integer	status;
	
	public Login getData() {
		return data;
	}
	
	public void setData(Login data) {
		this.data = data;
	}
	
	public String getError() {
		return error;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getI18n_msg() {
		return i18n_msg;
	}
	
	public void setI18n_msg(String i18n_msg) {
		this.i18n_msg = i18n_msg;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
}
