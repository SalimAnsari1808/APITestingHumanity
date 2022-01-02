package com.api.modelRequest.Event;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveEventEvent {

	private Integer EventID;
	private String EventType;
	private SaveEventEventEventDetails EventDetails;
		
	public Integer getEventID() {
		return EventID;
	}

	public void setEventID(Integer eventID) {
		EventID = eventID;
	}

	public String getEventType() {
		return EventType;
	}
	
	public void setEventType(String eventType) {
		EventType = eventType;
	}
	
	public SaveEventEventEventDetails getEventDetails() {
		return EventDetails;
	}
	
	public void setEventDetails(SaveEventEventEventDetails eventDetails) {
		EventDetails = eventDetails;
	}
}