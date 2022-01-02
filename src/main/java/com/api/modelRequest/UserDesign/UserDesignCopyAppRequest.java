package com.api.modelRequest.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignCopyAppRequest {
	
	private String FromAppID;
	private String ToAppID;
	
	
	public String getFromAppID() {
		return FromAppID;
	}

	public void setFromAppID(String FromAppID) {
		this.FromAppID = FromAppID;
	}
	
	public String getToAppID() {
		return ToAppID;
	}

	public void setToAppID(String ToAppID) {
		this.ToAppID = ToAppID;
	}
}
