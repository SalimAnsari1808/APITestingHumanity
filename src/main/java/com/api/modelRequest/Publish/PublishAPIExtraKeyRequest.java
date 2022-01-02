package com.api.modelRequest.Publish;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class PublishAPIExtraKeyRequest {
	
	private String AppID;
	private String ExtraKey;
	
	public String getAppID() {
		return AppID;
	}

	public void setAppID(String AppID) {
		this.AppID = AppID;
	}

	public String getExtraKey() {
		return ExtraKey;
	}

	public void setExtraKey(String ExtraKey) {
		this.ExtraKey = ExtraKey;
	}
}
