package com.api.modelRequest.Event;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveEventAPIStringEventRequest {

	private String SessionID;
	private String UserID;
	private String AppID;
	private String Event;
	
	public String getSessionID() {
		return SessionID;
	}
	
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
	
	public String getUserID() {
		return UserID;
	}
	
	public void setUserID(String userID) {
		UserID = userID;
	}
	
	public String getAppID() {
		return AppID;
	}
	
	public void setAppID(String appID) {
		AppID = appID;
	}
	
	public String getEvent() {
		return Event;
	}
	
	public void setEvent(String event) {
		Event = event;
	}	
}