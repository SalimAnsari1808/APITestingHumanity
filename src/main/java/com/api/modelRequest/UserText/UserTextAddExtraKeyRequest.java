package com.api.modelRequest.UserText;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserTextAddExtraKeyRequest {
	
	private Integer UserDesignID;
	private String AppID;
	private String Language;
	private UserTextUserTextJSON UserTextJSON;
	private UserTextProviderJSON ProviderJSON []= null;
	private UserTextCategoryJSON CategoryJSON []= null;
	private String ExtraKey;

	public String getExtraKey() {
		return ExtraKey;
	}

	public void setExtraKey(String extraKey) {
		ExtraKey = extraKey;
	}

	public Integer getUserDesignID() {
		return UserDesignID;
	}

	public void setUserDesignID(Integer userDesignID) {
		this.UserDesignID = userDesignID;
	}

	public String getAppID() {
		return AppID;
	}

	public void setAppID(String appID) {
		this.AppID = appID;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		this.Language = language;
	}

	public UserTextUserTextJSON getUserTextJSON() {
		return UserTextJSON;
	}

	public void setUserTextJSON(UserTextUserTextJSON userTextJSON) {
		this.UserTextJSON = userTextJSON;
	}

	public UserTextProviderJSON[] getProviderJSON() {
		return ProviderJSON;
	}

	public void setProviderJSON(UserTextProviderJSON[] providerJSON) {
		ProviderJSON = providerJSON;
	}

	public UserTextCategoryJSON[] getCategoryJSON() {
		return CategoryJSON;
	}

	public void setCategoryJSON(UserTextCategoryJSON[] categoryJSON) {
		CategoryJSON = categoryJSON;
	}

}