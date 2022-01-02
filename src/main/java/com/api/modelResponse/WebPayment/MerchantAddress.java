package com.api.modelResponse.WebPayment;

public class MerchantAddress {
	private String streetAddress;
	private String locality;
	private String region;
	private String postalCode;
	private String phone;

	public String getStreetAddress() {
	return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
	this.streetAddress = streetAddress;
	}

	public String getLocality() {
	return locality;
	}

	public void setLocality(String locality) {
	this.locality = locality;
	}

	public String getRegion() {
	return region;
	}

	public void setRegion(String region) {
	this.region = region;
	}

	public String getPostalCode() {
	return postalCode;
	}

	public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
	}

	public String getPhone() {
	return phone;
	}

	public void setPhone(String phone) {
	this.phone = phone;
	}

}
