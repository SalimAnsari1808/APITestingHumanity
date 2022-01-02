package com.api.modelRequest.Payment;

public class PaymentRefundNumberTransactionIdRequest {
	
	private Integer transactionId;
	private String appID;

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getAppID() {
		return appID;
	}

	public void setAppID(String appID) {
		this.appID = appID;
	}

}
