package com.api.modelResponse.Session;

public class SaveSessionResponse {

	private Integer 		status;
	private String 			error;
	private String 			message;
	private String 			i18n_msg;
	private SaveSessionData data;
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
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
	
	public SaveSessionData getData() {
		return data;
	}
	
	public void setData(SaveSessionData data) {
		this.data = data;
	}	
}