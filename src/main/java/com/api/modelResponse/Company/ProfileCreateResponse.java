package com.api.modelResponse.Company;

public class ProfileCreateResponse {
	
	public ProfileCreate data;
	public String status;
	
	public ProfileCreate getData() {
		return data;
	}
	public void setData(ProfileCreate data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
