package com.api.modelRequest.UserText;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserTextProviderJSON {
	
	private Integer ProviderID;
	private String ProviderDescription;

	public Integer getProviderID() {
		return ProviderID;
	}

	public void setProviderID(Integer providerID) {
		this.ProviderID = providerID;
	}

	public String getProviderDescription() {
		return ProviderDescription;
	}

	public void setProviderDescription(String providerDescription) {
		this.ProviderDescription = providerDescription;
	}

}
