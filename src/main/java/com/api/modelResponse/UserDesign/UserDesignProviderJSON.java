package com.api.modelResponse.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignProviderJSON {
	
	private Integer CategoryID;
	private Integer ProviderID;
	private String  ProviderURL;
	private String  ProviderName;
	private String 	ProviderDescription;

	public Integer getProviderID() {
		return ProviderID;
	}

	public void setProviderID(Integer providerID) {
		this.ProviderID = providerID;
	}

	public String getProviderURL() {
		return ProviderURL;
	}

	public void setProviderURL(String providerURL) {
		this.ProviderURL = providerURL;
	}

	public String getProviderName() {
		return ProviderName;
	}

	public void setProviderName(String providerName) {
		this.ProviderName = providerName;
	}

	public Integer getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(Integer CategoryID) {
		this.CategoryID = CategoryID;
	}

	public String getProviderDescription() {
		return ProviderDescription;
	}

	public void setProviderDescription(String providerDescription) {
		this.ProviderDescription = providerDescription;
	}
}
