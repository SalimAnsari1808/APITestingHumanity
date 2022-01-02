package com.api.modelResponse.Password;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class PasswordResponseMetadata {
	
	private PasswordResquestId ResponseMetadata;
	private String MessageId;
	
	
	public PasswordResquestId getResponseMetadata() {
		return ResponseMetadata;
	}
	
	public void setResponseMetadata(PasswordResquestId responseMetadata) {
		ResponseMetadata = responseMetadata;
	}
	
	public String getMessageId() {
		return MessageId;
	}
	
	public void setMessageId(String messageId) {
		MessageId = messageId;
	}
}
