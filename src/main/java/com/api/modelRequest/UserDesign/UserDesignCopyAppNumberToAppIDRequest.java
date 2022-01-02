package com.api.modelRequest.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignCopyAppNumberToAppIDRequest {
	
	private String FromAppID;
	private Integer ToAppID;
	
	
	public String getFromAppID() {
		return FromAppID;
	}

	public void setFromAppID(String FromAppID) {
		this.FromAppID = FromAppID;
	}
	
	public Integer getToAppID() {
		return ToAppID;
	}

	public void setToAppID(Integer ToAppID) {
		this.ToAppID = ToAppID;
	}

}
