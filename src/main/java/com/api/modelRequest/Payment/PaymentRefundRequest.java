package com.api.modelRequest.Payment;

public class PaymentRefundRequest {
	
	private String transactionId;
	private String appID;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getAppID() {
		return appID;
	}

	public void setAppID(String appID) {
		this.appID = appID;
	}

}
