package com.api.modelRequest.App;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
)
public class AppCreateNumberDomainUrlRequest {
	
	private Integer DomainUrl;
	private String DomainName;
	private String DomainDescription;

	public Integer getDomainUrl() {
		return DomainUrl;
	}

	public void setDomainUrl(Integer domainUrl) {
		DomainUrl = domainUrl;
	}

	public String getDomainName() {
		return DomainName;
	}

	public void setDomainName(String domainName) {
		DomainName = domainName;
	}

	public String getDomainDescription() {
		return DomainDescription;
	}

	public void setDomainDescription(String domainDescription) {
		DomainDescription = domainDescription;
	}

}
