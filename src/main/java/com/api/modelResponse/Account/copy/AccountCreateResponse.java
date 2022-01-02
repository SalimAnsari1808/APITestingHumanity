package com.api.modelResponse.Account.copy;

public class AccountCreateResponse {
	
	public AccountCreate data;
	public String error;
	public String message;
	public String i18n_msg;
	public String status;
	
	public AccountCreate getData() {
		return data;
	}
	public void setData(AccountCreate data) {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
