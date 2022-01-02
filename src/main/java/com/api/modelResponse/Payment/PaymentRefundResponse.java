package com.api.modelResponse.Payment;

public class PaymentRefundResponse {
	
	private Transaction transaction;
	private Boolean success;
	private String error;
	private String message;
	private String i18n_msg;
	private Integer status;

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getI18n_msg() {
		return i18n_msg;
	}

	public void setI18n_msg(String i18n_msg) {
		this.i18n_msg = i18n_msg;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
