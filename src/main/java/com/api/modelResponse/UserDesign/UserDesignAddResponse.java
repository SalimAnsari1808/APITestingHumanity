package com.api.modelResponse.UserDesign;

public class UserDesignAddResponse {
	
	private UserDesignAddData data;
	private Integer status;
	private String error;
	
	
	public UserDesignAddData getData() {
		return data;
	}
	
	public void setData(UserDesignAddData data) {
		this.data = data;
	}
	
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
}
