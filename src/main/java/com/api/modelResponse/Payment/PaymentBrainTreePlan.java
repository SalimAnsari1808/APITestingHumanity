package com.api.modelResponse.Payment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class PaymentBrainTreePlan {
	
	private String 	id;
	private String 	merchantId;
	private Object 	billingDayOfMonth;
	private Integer billingFrequency;
	private String 	currencyIsoCode;
	private String 	description;
	private String 	name;
	private Object 	numberOfBillingCycles;
	private String 	price;
	private Integer trialDuration;
	private String 	trialDurationUnit;
	private Boolean trialPeriod;
	private String 	createdAt;
	private String 	updatedAt;
	private List<Object> addOns = null;
	private List<Object> discounts = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Object getBillingDayOfMonth() {
		return billingDayOfMonth;
	}

	public void setBillingDayOfMonth(Object billingDayOfMonth) {
		this.billingDayOfMonth = billingDayOfMonth;
	}

	public Integer getBillingFrequency() {
		return billingFrequency;
	}

	public void setBillingFrequency(Integer billingFrequency) {
		this.billingFrequency = billingFrequency;
	}

	public String getCurrencyIsoCode() {
		return currencyIsoCode;
	}

	public void setCurrencyIsoCode(String currencyIsoCode) {
		this.currencyIsoCode = currencyIsoCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getNumberOfBillingCycles() {
		return numberOfBillingCycles;
	}

	public void setNumberOfBillingCycles(Object numberOfBillingCycles) {
		this.numberOfBillingCycles = numberOfBillingCycles;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getTrialDuration() {
		return trialDuration;
	}

	public void setTrialDuration(Integer trialDuration) {
		this.trialDuration = trialDuration;
	}

	public String getTrialDurationUnit() {
		return trialDurationUnit;
	}

	public void setTrialDurationUnit(String trialDurationUnit) {
		this.trialDurationUnit = trialDurationUnit;
	}

	public Boolean getTrialPeriod() {
		return trialPeriod;
	}

	public void setTrialPeriod(Boolean trialPeriod) {
		this.trialPeriod = trialPeriod;
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

	public List<Object> getAddOns() {
		return addOns;
	}

	public void setAddOns(List<Object> addOns) {
		this.addOns = addOns;
	}

	public List<Object> getDiscounts() {
		return discounts;
	}

	public void setDiscounts(List<Object> discounts) {
		this.discounts = discounts;
	}
}
