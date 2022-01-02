package com.api.modelRequest.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignCopyAppNumberFromAppIDRequest {
	
	private Integer FromAppID;
	private String ToAppID;
	
	
	public Integer getFromAppID() {
		return FromAppID;
	}

	public void setFromAppID(Integer FromAppID) {
		this.FromAppID = FromAppID;
	}
	
	public String getToAppID() {
		return ToAppID;
	}

	public void setToAppID(String ToAppID) {
		this.ToAppID = ToAppID;
	}

}
