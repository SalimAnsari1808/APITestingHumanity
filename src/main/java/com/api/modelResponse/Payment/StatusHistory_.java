package com.api.modelResponse.Payment;

public class StatusHistory_ {
	private String timestamp;
	private String status;
	private String user;
	private String subscriptionSource;
	private String balance;
	private String price;
	private String currencyIsoCode;
	private String planId;

	public String getTimestamp() {
	return timestamp;
	}

	public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
	}

	public String getStatus() {
	return status;
	}

	public void setStatus(String status) {
	this.status = status;
	}

	public String getUser() {
	return user;
	}

	public void setUser(String user) {
	this.user = user;
	}

	public String getSubscriptionSource() {
	return subscriptionSource;
	}

	public void setSubscriptionSource(String subscriptionSource) {
	this.subscriptionSource = subscriptionSource;
	}

	public String getBalance() {
	return balance;
	}

	public void setBalance(String balance) {
	this.balance = balance;
	}

	public String getPrice() {
	return price;
	}

	public void setPrice(String price) {
	this.price = price;
	}

	public String getCurrencyIsoCode() {
	return currencyIsoCode;
	}

	public void setCurrencyIsoCode(String currencyIsoCode) {
	this.currencyIsoCode = currencyIsoCode;
	}

	public String getPlanId() {
	return planId;
	}

	public void setPlanId(String planId) {
	this.planId = planId;
	}
}
