package com.api.modelRequest.Event;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveEventEventEventDetails {
	
	private String EventForm;
	private String URL;
	private Integer CookieID;
	private Integer CookieIDVersion;
	private Integer PolicyID;
	private String MethodOfAcceptance;
	private String Language;
	private Integer UserDesignID;
	private Integer UserTextID;
	
	public String getEventForm() {
		return EventForm;
	}
	
	public void setEventForm(String eventForm) {
		EventForm = eventForm;
	}
	
	public String getURL() {
		return URL;
	}
	
	public void setURL(String uRL) {
		URL = uRL;
	}
	
	public Integer getCookieID() {
		return CookieID;
	}
	
	public void setCookieID(Integer cookieID) {
		CookieID = cookieID;
	}
	
	public Integer getCookieIDVersion() {
		return CookieIDVersion;
	}
	
	public void setCookieIDVersion(Integer cookieIDVersion) {
		CookieIDVersion = cookieIDVersion;
	}
	
	public Integer getPolicyID() {
		return PolicyID;
	}
	
	public void setPolicyID(Integer policyID) {
		PolicyID = policyID;
	}
	
	public String getMethodOfAcceptance() {
		return MethodOfAcceptance;
	}
	
	public void setMethodOfAcceptance(String methodOfAcceptance) {
		MethodOfAcceptance = methodOfAcceptance;
	}
	
	public String getLanguage() {
		return Language;
	}
	
	public void setLanguage(String language) {
		Language = language;
	}
	
	public Integer getUserDesignID() {
		return UserDesignID;
	}
	
	public void setUserDesignID(Integer userDesignID) {
		UserDesignID = userDesignID;
	}
	
	public Integer getUserTextID() {
		return UserTextID;
	}
	
	public void setUserTextID(Integer userTextID) {
		UserTextID = userTextID;
	}
}