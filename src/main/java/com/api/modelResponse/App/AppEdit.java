package com.api.modelResponse.App;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class AppEdit {

	private Integer ApplicationID;
	private String 	AppID;
	private String 	SecretKey;
	private String 	DomainUrl;
	private String 	DomainName;
	private Boolean IsHttps;
	private String 	DomainDescription;
	private Integer CompanyID;
	private Integer StatusID;
	private Integer Plan;
	private Object 	Status;
	private Object 	InitialSubscriptionDate;
	private Object 	PaidUntil;
	private Object 	VendorID;
	private Object 	SubscriptionType;
	private Object 	LastPaymentUpdate;
	private Object  PaymentStatus;
	private Object  PaymentFailDate;
	
	public Integer getApplicationID() {
		return ApplicationID;
	}

	public void setApplicationID(Integer applicationID) {
		ApplicationID = applicationID;
	}

	public String getAppID() {
		return AppID;
	}

	public void setAppID(String appID) {
		AppID = appID;
	}

	public String getSecretKey() {
		return SecretKey;
	}

	public void setSecretKey(String secretKey) {
		SecretKey = secretKey;
	}

	public String getDomainUrl() {
		return DomainUrl;
	}

	public void setDomainUrl(String domainUrl) {
		DomainUrl = domainUrl;
	}

	public String getDomainName() {
		return DomainName;
	}

	public void setDomainName(String domainName) {
		DomainName = domainName;
	}

	public Boolean getIsHttps() {
		return IsHttps;
	}

	public void setIsHttps(Boolean isHttps) {
		IsHttps = isHttps;
	}

	public String getDomainDescription() {
		return DomainDescription;
	}

	public void setDomainDescription(String domainDescription) {
		DomainDescription = domainDescription;
	}

	public Integer getCompanyID() {
		return CompanyID;
	}

	public void setCompanyID(Integer companyID) {
		CompanyID = companyID;
	}

	public Integer getStatusID() {
		return StatusID;
	}

	public void setStatusID(Integer status) {
		StatusID = status;
	}

	public Integer getPlan() {
		return Plan;
	}

	public void setPlan(Integer plan) {
		Plan = plan;
	}
	
	public Object getStatus() {
		return Status;
	}

	public void setStatus(Object status) {
		this.Status = status;
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
}
