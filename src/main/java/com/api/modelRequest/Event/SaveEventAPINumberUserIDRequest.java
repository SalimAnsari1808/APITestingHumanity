package com.api.modelRequest.Event;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveEventAPINumberUserIDRequest {

	private String SessionID;
	private Integer UserID;
	private String AppID;
	private SaveEventEvent Event;
	
	public String getSessionID() {
		return SessionID;
	}
	
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
	
	public Integer getUserID() {
		return UserID;
	}
	
	public void setUserID(Integer userID) {
		UserID = userID;
	}
	
	public String getAppID() {
		return AppID;
	}
	
	public void setAppID(String appID) {
		AppID = appID;
	}
	
	public SaveEventEvent getEvent() {
		return Event;
	}
	
	public void setEvent(SaveEventEvent event) {
		Event = event;
	}	
}