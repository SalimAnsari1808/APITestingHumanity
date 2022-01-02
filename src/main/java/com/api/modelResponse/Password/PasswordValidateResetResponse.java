package com.api.modelResponse.Password;

import java.util.List;

public class PasswordValidateResetResponse {
	
	private List<Integer> data;
	private String message;
	private String i18n_msg;
	private String error;
	private Integer status;
	
	
	public List<Integer> getData() {
		return data;
	}
	
	public void setData(List<Integer> data) {
		this.data = data;
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
	
	public String getError() {
		return error;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
