package com.api.modelRequest.Session;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveSessionAPINumberAppIDRequest {

	private String SessionID;
	private Integer AppID;
	private SessionJSONRequest SessionJSON = null;
	
	public String getSessionID() {
		return SessionID;
	}
	
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
	
	public Integer getAppID() {
		return AppID;
	}
	
	public void setAppID(Integer appID) {
		AppID = appID;
	}
	
	public SessionJSONRequest getSessionJSON() {
		return SessionJSON;
	}
	
	public void setSessionJSON(SessionJSONRequest sessionJSON) {
		SessionJSON = sessionJSON;
	}	
}