package com.api.modelRequest.UserDesign;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignProviderJSON {
	
	private Integer ProviderID;
	private Object ProviderURL;
	private String ProviderName;
	private String ProviderType;
	private UserDesignProviderDescriptionData ProviderDescription;

	public Integer getProviderID() {
		return ProviderID;
	}

	public void setProviderID(Integer providerID) {
		this.ProviderID = providerID;
	}

	public Object getProviderURL() {
		return ProviderURL;
	}

	public void setProviderURL(Object providerURL) {
		this.ProviderURL = providerURL;
	}

	public String getProviderName() {
		return ProviderName;
	}

	public void setProviderName(String providerName) {
		this.ProviderName = providerName;
	}

	public String getProviderType() {
		return ProviderType;
	}

	public void setProviderType(String providerType) {
		this.ProviderType = providerType;
	}

	public UserDesignProviderDescriptionData getProviderDescription() {
		return ProviderDescription;
	}

	public void setProviderDescription(UserDesignProviderDescriptionData providerDescription) {
		this.ProviderDescription = providerDescription;
	}
}
