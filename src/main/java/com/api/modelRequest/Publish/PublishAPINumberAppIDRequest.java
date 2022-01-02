package com.api.modelRequest.Publish;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class PublishAPINumberAppIDRequest {
	
	private Integer AppID;
	
	public Integer getAppID() {
		return AppID;
	}

	public void setAppID(Integer AppID) {
		this.AppID = AppID;
	}

}
