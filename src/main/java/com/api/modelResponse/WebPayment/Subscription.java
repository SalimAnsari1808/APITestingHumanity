package com.api.modelResponse.WebPayment;

import java.util.List;

public class Subscription {
	private List<Object> addOns = null;
	private String balance;
	private Integer billingDayOfMonth;
	private String billingPeriodEndDate;
	private String billingPeriodStartDate;
	private String createdAt;
	private String updatedAt;
	private Integer currentBillingCycle;
	private Object daysPastDue;
	private List<Object> discounts = null;
	private Integer failureCount;
	private String firstBillingDate;
	private String id;
	private String merchantAccountId;
	private Boolean neverExpires;
	private String nextBillAmount;
	private String nextBillingPeriodAmount;
	private String nextBillingDate;
	private Object numberOfBillingCycles;
	private String paidThroughDate;
	private String paymentMethodToken;
	private String planId;
	private String price;
	private String status;
	private Object trialDuration;
	private Object trialDurationUnit;
	private Boolean trialPeriod;
	private Descriptor descriptor;
	private Object description;
	private List<Transaction> transactions = null;
	private List<StatusHistory_> statusHistory = null;

	public List<Object> getAddOns() {
	return addOns;
	}

	public void setAddOns(List<Object> addOns) {
	this.addOns = addOns;
	}

	public String getBalance() {
	return balance;
	}

	public void setBalance(String balance) {
	this.balance = balance;
	}

	public Integer getBillingDayOfMonth() {
	return billingDayOfMonth;
	}

	public void setBillingDayOfMonth(Integer billingDayOfMonth) {
	this.billingDayOfMonth = billingDayOfMonth;
	}

	public String getBillingPeriodEndDate() {
	return billingPeriodEndDate;
	}

	public void setBillingPeriodEndDate(String billingPeriodEndDate) {
	this.billingPeriodEndDate = billingPeriodEndDate;
	}

	public String getBillingPeriodStartDate() {
	return billingPeriodStartDate;
	}

	public void setBillingPeriodStartDate(String billingPeriodStartDate) {
	this.billingPeriodStartDate = billingPeriodStartDate;
	}

	public String getCreatedAt() {
	return createdAt;
	}

	public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
	return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
	}

	public Integer getCurrentBillingCycle() {
	return currentBillingCycle;
	}

	public void setCurrentBillingCycle(Integer currentBillingCycle) {
	this.currentBillingCycle = currentBillingCycle;
	}

	public Object getDaysPastDue() {
	return daysPastDue;
	}

	public void setDaysPastDue(Object daysPastDue) {
	this.daysPastDue = daysPastDue;
	}

	public List<Object> getDiscounts() {
	return discounts;
	}

	public void setDiscounts(List<Object> discounts) {
	this.discounts = discounts;
	}

	public Integer getFailureCount() {
	return failureCount;
	}

	public void setFailureCount(Integer failureCount) {
	this.failureCount = failureCount;
	}

	public String getFirstBillingDate() {
	return firstBillingDate;
	}

	public void setFirstBillingDate(String firstBillingDate) {
	this.firstBillingDate = firstBillingDate;
	}

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public String getMerchantAccountId() {
	return merchantAccountId;
	}

	public void setMerchantAccountId(String merchantAccountId) {
	this.merchantAccountId = merchantAccountId;
	}

	public Boolean getNeverExpires() {
	return neverExpires;
	}

	public void setNeverExpires(Boolean neverExpires) {
	this.neverExpires = neverExpires;
	}

	public String getNextBillAmount() {
	return nextBillAmount;
	}

	public void setNextBillAmount(String nextBillAmount) {
	this.nextBillAmount = nextBillAmount;
	}

	public String getNextBillingPeriodAmount() {
	return nextBillingPeriodAmount;
	}

	public void setNextBillingPeriodAmount(String nextBillingPeriodAmount) {
	this.nextBillingPeriodAmount = nextBillingPeriodAmount;
	}

	public String getNextBillingDate() {
	return nextBillingDate;
	}

	public void setNextBillingDate(String nextBillingDate) {
	this.nextBillingDate = nextBillingDate;
	}

	public Object getNumberOfBillingCycles() {
	return numberOfBillingCycles;
	}

	public void setNumberOfBillingCycles(Object numberOfBillingCycles) {
	this.numberOfBillingCycles = numberOfBillingCycles;
	}

	public String getPaidThroughDate() {
	return paidThroughDate;
	}

	public void setPaidThroughDate(String paidThroughDate) {
	this.paidThroughDate = paidThroughDate;
	}

	public String getPaymentMethodToken() {
	return paymentMethodToken;
	}

	public void setPaymentMethodToken(String paymentMethodToken) {
	this.paymentMethodToken = paymentMethodToken;
	}

	public String getPlanId() {
	return planId;
	}

	public void setPlanId(String planId) {
	this.planId = planId;
	}

	public String getPrice() {
	return price;
	}

	public void setPrice(String price) {
	this.price = price;
	}

	public String getStatus() {
	return status;
	}

	public void setStatus(String status) {
	this.status = status;
	}

	public Object getTrialDuration() {
	return trialDuration;
	}

	public void setTrialDuration(Object trialDuration) {
	this.trialDuration = trialDuration;
	}

	public Object getTrialDurationUnit() {
	return trialDurationUnit;
	}

	public void setTrialDurationUnit(Object trialDurationUnit) {
	this.trialDurationUnit = trialDurationUnit;
	}

	public Boolean getTrialPeriod() {
	return trialPeriod;
	}

	public void setTrialPeriod(Boolean trialPeriod) {
	this.trialPeriod = trialPeriod;
	}

	public Descriptor getDescriptor() {
	return descriptor;
	}

	public void setDescriptor(Descriptor descriptor) {
	this.descriptor = descriptor;
	}

	public Object getDescription() {
	return description;
	}

	public void setDescription(Object description) {
	this.description = description;
	}

	public List<Transaction> getTransactions() {
	return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
	this.transactions = transactions;
	}

	public List<StatusHistory_> getStatusHistory() {
	return statusHistory;
	}

	public void setStatusHistory(List<StatusHistory_> statusHistory) {
	this.statusHistory = statusHistory;
	}
}
