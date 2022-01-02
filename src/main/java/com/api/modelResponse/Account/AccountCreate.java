package com.api.modelResponse.Account;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class AccountCreate {
	
	
	
	
	
	private String  token;
	private Long 	expiryTime;
	private Integer AccountID;
	private String 	AdminID;
	private Integer StatusID;
	private Integer CompanyRoleID;
	private Integer CompanyID;
	private Integer Status;
	private String  ImagePath;
	
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(Long expiryTime) {
		this.expiryTime = expiryTime;
	}
	
	public Integer getAccountID() {
		return AccountID;
	}

	public void setAccountID(Integer accountID) {
		this.AccountID = accountID;
	}

	public String getAdminID() {
		return AdminID;
	}

	public void setAdminID(String adminID) {
		this.AdminID = adminID;
	}

	public Integer getStatusID() {
		return StatusID;
	}

	public void setStatusID(Integer statusID) {
		this.StatusID = statusID;
	}

	public Integer getCompanyRoleID() {
		return CompanyRoleID;
	}

	public void setCompanyRoleID(Integer companyRoleID) {
		this.CompanyRoleID = companyRoleID;
	}

	public Integer getCompanyID() {
		return CompanyID;
	}

	public void setCompanyID(Integer companyID) {
		this.CompanyID = companyID;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		this.Status = status;
	}
	
	public String getImagePath() {
		return ImagePath;
	}

	public void setImagePath(String ImagePath) {
		this.ImagePath = ImagePath;
	}
}
