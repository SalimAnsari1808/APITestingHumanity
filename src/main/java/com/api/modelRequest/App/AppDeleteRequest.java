package com.api.modelRequest.App;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
	fieldVisibility=JsonAutoDetect.Visibility.ANY, 
	getterVisibility=JsonAutoDetect.Visibility.NONE, 
	setterVisibility=JsonAutoDetect.Visibility.NONE, 
	creatorVisibility=JsonAutoDetect.Visibility.NONE
)
public class AppDeleteRequest {
	
	private String AppID;

	public String getAppID() {
		return AppID;
	}

	public void setAppID(String appID) {
		AppID = appID;
	}

}
