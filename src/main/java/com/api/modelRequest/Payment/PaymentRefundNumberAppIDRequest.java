package com.api.modelRequest.Payment;

public class PaymentRefundNumberAppIDRequest {
	
	private String transactionId;
	private Integer appID;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getAppID() {
		return appID;
	}

	public void setAppID(Integer appID) {
		this.appID = appID;
	}

}
