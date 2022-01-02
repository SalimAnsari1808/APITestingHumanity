package com.api.modelRequest.Event;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveEventAPIWithoutAppIDRequest {

	private String SessionID;
	private String UserID;
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
	
	public SaveEventEvent getEvent() {
		return Event;
	}
	
	public void setEvent(SaveEventEvent event) {
		Event = event;
	}	
}