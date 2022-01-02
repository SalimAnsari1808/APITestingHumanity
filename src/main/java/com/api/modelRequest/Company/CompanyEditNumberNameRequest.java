package com.api.modelRequest.Company;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class CompanyEditNumberNameRequest {
	
	private Integer CompanyID;
	private Integer Name;
	private String 	VATID;
	private String 	FirstName;
	private String 	LastName;
	private String 	Role;
	private String 	Address;
	private String 	City;
	private String 	State;
	private String 	Country;
	private String 	ZipCode;
	private String 	Phone;
	private String 	Email;
	private String 	URL;
	private String 	PrivacyNotice;

	public Integer getCompanyID() {
		return CompanyID;
	}

	public void setCompanyID(Integer companyID) {
		this.CompanyID = companyID;
	}

	public Integer getName() {
		return Name;
	}

	public void setName(Integer name) {
		this.Name = name;
	}

	public String getVATID() {
		return VATID;
	}

	public void setVATID(String vATID) {
		this.VATID = vATID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		this.Role = role;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		this.State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		this.ZipCode = zipCode;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		this.Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		this.URL = uRL;
	}

	public String getPrivacyNotice() {
		return PrivacyNotice;
	}

	public void setPrivacyNotice(String privacyNotice) {
		this.PrivacyNotice = privacyNotice;
	}

}
