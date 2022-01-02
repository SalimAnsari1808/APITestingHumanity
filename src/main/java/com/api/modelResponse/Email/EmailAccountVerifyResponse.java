package com.api.modelResponse.Email;

public class EmailAccountVerifyResponse {
	
	private EmailAccountVerify data;
	private String error;
	private Integer status;

	public EmailAccountVerify getData() {
		return data;
	}

	public void setData(EmailAccountVerify data) {
		this.data = data;
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
