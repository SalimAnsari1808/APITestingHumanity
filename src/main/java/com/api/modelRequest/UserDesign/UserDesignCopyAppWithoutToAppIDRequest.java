package com.api.modelRequest.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignCopyAppWithoutToAppIDRequest {
	
	private String FromAppID;

	
	
	public String getFromAppID() {
		return FromAppID;
	}

	public void setFromAppID(String FromAppID) {
		this.FromAppID = FromAppID;
	}

}
