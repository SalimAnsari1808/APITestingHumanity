package com.api.modelRequest.Email;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class EmailAccountVerifyNumberLanguageRequest {
	
	private String AdminID;
	private Integer Language;

	public String getAdminID() {
		return AdminID;
	}

	public void setAdminID(String adminID) {
		this.AdminID = adminID;
	}

	public Integer getLanguage() {
		return Language;
	}

	public void setLanguage(Integer language) {
		this.Language = language;
	}

}
