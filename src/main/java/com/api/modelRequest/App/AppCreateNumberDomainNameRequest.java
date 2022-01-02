package com.api.modelRequest.App;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
)
public class AppCreateNumberDomainNameRequest {
	
	private String 	DomainUrl;
	private Integer DomainName;
	private String 	DomainDescription;

	public String getDomainUrl() {
		return DomainUrl;
	}

	public void setDomainUrl(String domainUrl) {
		DomainUrl = domainUrl;
	}

	public Integer getDomainName() {
		return DomainName;
	}

	public void setDomainName(Integer domainName) {
		DomainName = domainName;
	}

	public String getDomainDescription() {
		return DomainDescription;
	}

	public void setDomainDescription(String domainDescription) {
		DomainDescription = domainDescription;
	}

}
