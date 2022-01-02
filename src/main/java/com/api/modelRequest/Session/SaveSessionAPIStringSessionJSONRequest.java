package com.api.modelRequest.Session;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveSessionAPIStringSessionJSONRequest {

	private String SessionID;
	private String AppID;
	private String SessionJSON = null;
	
	public String getSessionID() {
		return SessionID;
	}
	
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
	
	public String getAppID() {
		return AppID;
	}
	
	public void setAppID(String appID) {
		AppID = appID;
	}
	
	public String getSessionJSON() {
		return SessionJSON;
	}
	
	public void setSessionJSON(String sessionJSON) {
		SessionJSON = sessionJSON;
	}	
}