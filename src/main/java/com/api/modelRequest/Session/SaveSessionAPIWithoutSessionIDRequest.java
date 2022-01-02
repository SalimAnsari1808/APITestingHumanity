package com.api.modelRequest.Session;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveSessionAPIWithoutSessionIDRequest {

	private String AppID;
	private SessionJSONRequest SessionJSON = null;
		
	public String getAppID() {
		return AppID;
	}
	
	public void setAppID(String appID) {
		AppID = appID;
	}
	
	public SessionJSONRequest getSessionJSON() {
		return SessionJSON;
	}
	
	public void setSessionJSON(SessionJSONRequest sessionJSON) {
		SessionJSON = sessionJSON;
	}	
}