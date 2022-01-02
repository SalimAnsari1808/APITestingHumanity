package com.api.modelResponse.Event;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveEventData {

	private Integer ID;
	private String SessionID;
	private String UserID;
	private String AppID;
	private String TimeStamp;
	private SaveEventDataRequestJSON RequestJSON;
	
	public Integer getID() {
		return ID;
	}
	
	public void setID(Integer iD) {
		ID = iD;
	}
	
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
	
	public String getTimeStamp() {
		return TimeStamp;
	}
	
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
	
	public SaveEventDataRequestJSON getRequestJSON() {
		return RequestJSON;
	}
	
	public void setRequestJSON(SaveEventDataRequestJSON requestJSON) {
		RequestJSON = requestJSON;
	}	
}