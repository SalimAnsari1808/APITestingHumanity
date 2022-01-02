package com.api.modelResponse.WebPayment;

public class WebPaymentResponse {
	private Subscription subscription;
	private Boolean success;

	public Subscription getSubscription() {
	return subscription;
	}

	public void setSubscription(Subscription subscription) {
	this.subscription = subscription;
	}

	public Boolean getSuccess() {
	return success;
	}

	public void setSuccess(Boolean success) {
	this.success = success;
	}

}
