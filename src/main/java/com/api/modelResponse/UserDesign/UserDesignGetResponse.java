package com.api.modelResponse.UserDesign;

public class UserDesignGetResponse {
	
	private UserDesignGetData data;
	private int status;
	private String error;
	
	
	public UserDesignGetData getData() {
		return data;
	}
	
	public void setData(UserDesignGetData data) {
		this.data = data;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getError() {
		return error;
	}
	
	public void setError(String error) {
		this.error = error;
	}

}
