package com.api.modelRequest.Session;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveSessionAPIWithoutAppIDRequest {

	private String SessionID;
	private SessionJSONRequest SessionJSON = null;
	
	public String getSessionID() {
		return SessionID;
	}
	
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
		
	public SessionJSONRequest getSessionJSON() {
		return SessionJSON;
	}
	
	public void setSessionJSON(SessionJSONRequest sessionJSON) {
		SessionJSON = sessionJSON;
	}	
}