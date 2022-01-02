package com.api.modelRequest.App;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
)
public class AppEditNumberDomainDescriptionRequest {
	
	private String  AppId;
	private String 	DomainUrl;
	private String 	DomainName;
	private Integer DomainDescription;
	
	public String getAppId() {
		return AppId;
	}

	public void setAppId(String appId) {
		AppId = appId;
	}

	public String getDomainUrl() {
		return DomainUrl;
	}

	public void setDomainUrl(String domainUrl) {
		DomainUrl = domainUrl;
	}

	public String getDomainName() {
		return DomainName;
	}

	public void setDomainName(String domainName) {
		DomainName = domainName;
	}

	public Integer getDomainDescription() {
		return DomainDescription;
	}

	public void setDomainDescription(Integer domainDescription) {
		DomainDescription = domainDescription;
	}
}
