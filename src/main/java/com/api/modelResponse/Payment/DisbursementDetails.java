package com.api.modelResponse.Payment;

public class DisbursementDetails {
	private Object disbursementDate;
	private Object settlementAmount;
	private Object settlementCurrencyIsoCode;
	private Object settlementCurrencyExchangeRate;
	private Object fundsHeld;
	private Object success;

	public Object getDisbursementDate() {
	return disbursementDate;
	}

	public void setDisbursementDate(Object disbursementDate) {
	this.disbursementDate = disbursementDate;
	}

	public Object getSettlementAmount() {
	return settlementAmount;
	}

	public void setSettlementAmount(Object settlementAmount) {
	this.settlementAmount = settlementAmount;
	}

	public Object getSettlementCurrencyIsoCode() {
	return settlementCurrencyIsoCode;
	}

	public void setSettlementCurrencyIsoCode(Object settlementCurrencyIsoCode) {
	this.settlementCurrencyIsoCode = settlementCurrencyIsoCode;
	}

	public Object getSettlementCurrencyExchangeRate() {
	return settlementCurrencyExchangeRate;
	}

	public void setSettlementCurrencyExchangeRate(Object settlementCurrencyExchangeRate) {
	this.settlementCurrencyExchangeRate = settlementCurrencyExchangeRate;
	}

	public Object getFundsHeld() {
	return fundsHeld;
	}

	public void setFundsHeld(Object fundsHeld) {
	this.fundsHeld = fundsHeld;
	}

	public Object getSuccess() {
	return success;
	}

	public void setSuccess(Object success) {
	this.success = success;
	}
}
