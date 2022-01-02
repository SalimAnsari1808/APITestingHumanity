package com.api.modelRequest.Event;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveEventAPINumberSessionIDRequest {

	private Integer SessionID;
	private String UserID;
	private String AppID;
	private SaveEventEvent Event;
	
	public Integer getSessionID() {
		return SessionID;
	}
	
	public void setSessionID(Integer sessionID) {
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
	
	public SaveEventEvent getEvent() {
		return Event;
	}
	
	public void setEvent(SaveEventEvent event) {
		Event = event;
	}	
}