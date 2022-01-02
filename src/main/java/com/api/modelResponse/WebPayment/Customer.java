package com.api.modelResponse.WebPayment;

public class Customer {
	private String id;
	private Object firstName;
	private Object lastName;
	private String company;
	private Object email;
	private Object website;
	private Object phone;
	private Object fax;
	private String globalId;

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public Object getFirstName() {
	return firstName;
	}

	public void setFirstName(Object firstName) {
	this.firstName = firstName;
	}

	public Object getLastName() {
	return lastName;
	}

	public void setLastName(Object lastName) {
	this.lastName = lastName;
	}

	public String getCompany() {
	return company;
	}

	public void setCompany(String company) {
	this.company = company;
	}

	public Object getEmail() {
	return email;
	}

	public void setEmail(Object email) {
	this.email = email;
	}

	public Object getWebsite() {
	return website;
	}

	public void setWebsite(Object website) {
	this.website = website;
	}

	public Object getPhone() {
	return phone;
	}

	public void setPhone(Object phone) {
	this.phone = phone;
	}

	public Object getFax() {
	return fax;
	}

	public void setFax(Object fax) {
	this.fax = fax;
	}

	public String getGlobalId() {
	return globalId;
	}

	public void setGlobalId(String globalId) {
	this.globalId = globalId;
	}
}
