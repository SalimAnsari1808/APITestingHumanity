package com.api.modelRequest.Event;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveEventAPINumberAppIDRequest {

	private String SessionID;
	private String UserID;
	private Integer AppID;
	private SaveEventEvent Event;
	
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
	
	public Integer getAppID() {
		return AppID;
	}
	
	public void setAppID(Integer appID) {
		AppID = appID;
	}
	
	public SaveEventEvent getEvent() {
		return Event;
	}
	
	public void setEvent(SaveEventEvent event) {
		Event = event;
	}	
}