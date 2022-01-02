package com.api.modelResponse.Account.copy;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class AccountCreate {
	
	private Integer AccountID;
	private String 	AdminID;
	private String 	Password;
	private Integer Status;
	private Integer CompanyRoleID;
	private Integer CompanyID;
	
	public Integer getAccountID() {
		return AccountID;
	}
	
	public void setAccountID(Integer accountID) {
		AccountID = accountID;
	}
	
	public String getAdminID() {
		return AdminID;
	}
	
	public void setAdminID(String adminID) {
		AdminID = adminID;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public Integer getStatus() {
		return Status;
	}
	
	public void setStatus(Integer status) {
		Status = status;
	}
	
	public Integer getCompanyRoleID() {
		return CompanyRoleID;
	}

	public void setCompanyRoleID(Integer companyRoleID) {
		CompanyRoleID = companyRoleID;
	}

	public Integer getCompanyID() {
		return CompanyID;
	}

	public void setCompanyID(Integer companyID) {
		CompanyID = companyID;
	}
}
