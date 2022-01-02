package com.api.modelResponse.Payment;

public class StatusHistory {
	private String timestamp;
	private String status;
	private String amount;
	private String user;
	private String transactionSource;

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

	public String getAmount() {
	return amount;
	}

	public void setAmount(String amount) {
	this.amount = amount;
	}

	public String getUser() {
	return user;
	}

	public void setUser(String user) {
	this.user = user;
	}

	public String getTransactionSource() {
	return transactionSource;
	}

	public void setTransactionSource(String transactionSource) {
	this.transactionSource = transactionSource;
	}
}
