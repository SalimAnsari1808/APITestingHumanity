package com.api.modelResponse.App;


public class AppCreateResponse {
	
	private AppCreate	data;
	private String 		error;
	private String 		message;
	private String 		i18n_msg;
	private Integer 	status;
	
	public AppCreate getData() {
		return data;
	}
	
	public void setData(AppCreate data) {
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
