package com.api.modelRequest.Email;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class EmailAccountVerifyRequest {
	
	private String AdminID;
	private String Language;

	public String getAdminID() {
		return AdminID;
	}

	public void setAdminID(String adminID) {
		this.AdminID = adminID;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		this.Language = language;
	}
}
