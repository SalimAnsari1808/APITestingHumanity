package com.api.modelResponse.Email;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class EmailAccountVerify {
	
	private EmailAccountVerifyResponseMetadata ResponseMetadata;
	private String MessageId;

	public EmailAccountVerifyResponseMetadata getResponseMetadata() {
		return ResponseMetadata;
	}

	public void setResponseMetadata(EmailAccountVerifyResponseMetadata responseMetadata) {
		this.ResponseMetadata = responseMetadata;
	}

	public String getMessageId() {
		return MessageId;
	}

	public void setMessageId(String messageId) {
		this.MessageId = messageId;
	}
}
