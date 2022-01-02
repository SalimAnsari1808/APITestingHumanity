package com.api.modelResponse.App;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class AppDelete {

	
	private Integer ApplicationID;
	private String 	AppID;
	private Integer CompanyID;
	private String 	SecretKey;
	private String 	DomainName;
	private String 	DomainUrl;
	private String 	DomainDescription;
	private Object  Status;
	private Integer Plan;
	private Boolean IsHttps;
	private Integer CreatedBy;
	private Integer UpdatedBy;
	private String 	CreatedDate;
	private String 	UpdatedDate;
	private Object 	InitialSubscriptionDate;
	private Object 	PaidUntil;
	private Object 	VendorID;
	private Integer StatusID;
	private Object 	SubscriptionType;
	private Object 	LastPaymentUpdate;
	private Object  PaymentStatus;
	private Object  PaymentFailDate;
	private Integer RoleID;

	public Integer getApplicationID() {
		return ApplicationID;
	}

	public void setApplicationID(Integer applicationID) {
		this.ApplicationID = applicationID;
	}

	public String getAppID() {
		return AppID;
	}

	public void setAppID(String appID) {
		this.AppID = appID;
	}

	public Integer getCompanyID() {
		return CompanyID;
	}

	public void setCompanyID(Integer companyID) {
		this.CompanyID = companyID;
	}

	public String getSecretKey() {
		return SecretKey;
	}

	public void setSecretKey(String secretKey) {
		this.SecretKey = secretKey;
	}

	public String getDomainName() {
		return DomainName;
	}

	public void setDomainName(String domainName) {
		this.DomainName = domainName;
	}

	public String getDomainUrl() {
		return DomainUrl;
	}

	public void setDomainUrl(String domainUrl) {
		this.DomainUrl = domainUrl;
	}

	public String getDomainDescription() {
		return DomainDescription;
	}

	public void setDomainDescription(String domainDescription) {
		this.DomainDescription = domainDescription;
	}
	
	public Object getStatus() {
		return Status;
	}

	public void setStatus(Object Status) {
		this.Status = Status;
	}

	public Integer getPlan() {
		return Plan;
	}

	public void setPlan(Integer plan) {
		this.Plan = plan;
	}

	public Boolean getIsHttps() {
		return IsHttps;
	}

	public void setIsHttps(Boolean isHttps) {
		this.IsHttps = isHttps;
	}

	public Integer getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.CreatedBy = createdBy;
	}

	public Integer getUpdatedBy() {
		return UpdatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.UpdatedBy = updatedBy;
	}

	public String getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(String createdDate) {
		this.CreatedDate = createdDate;
	}

	public String getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.UpdatedDate = updatedDate;
	}

	public Object getInitialSubscriptionDate() {
		return InitialSubscriptionDate;
	}

	public void setInitialSubscriptionDate(Object initialSubscriptionDate) {
		this.InitialSubscriptionDate = initialSubscriptionDate;
	}

	public Object getPaidUntil() {
		return PaidUntil;
	}

	public void setPaidUntil(Object paidUntil) {
		this.PaidUntil = paidUntil;
	}

	public Object getVendorID() {
		return VendorID;
	}

	public void setVendorID(Object vendorID) {
		this.VendorID = vendorID;
	}

	public Integer getStatusID() {
		return StatusID;
	}

	public void setStatusID(Integer statusID) {
		this.StatusID = statusID;
	}

	public Object getSubscriptionType() {
		return SubscriptionType;
	}

	public void setSubscriptionType(Object subscriptionType) {
		this.SubscriptionType = subscriptionType;
	}

	public Object getLastPaymentUpdate() {
		return LastPaymentUpdate;
	}

	public void setLastPaymentUpdate(Object lastPaymentUpdate) {
		this.LastPaymentUpdate = lastPaymentUpdate;
	}
	
	public Object getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentStatus(Object PaymentStatus) {
		this.PaymentStatus = PaymentStatus;
	}
	
	public Object getPaymentFailDate() {
		return PaymentFailDate;
	}

	public void setPaymentFailDate(Object PaymentFailDate) {
		this.PaymentFailDate = PaymentFailDate;
	}

	public Integer getRoleID() {
		return RoleID;
	}

	public void setRoleID(Integer roleID) {
		this.RoleID = roleID;
	}

}
