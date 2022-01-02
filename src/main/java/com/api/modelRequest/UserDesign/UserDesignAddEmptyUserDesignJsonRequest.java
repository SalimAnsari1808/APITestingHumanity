package com.api.modelRequest.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignAddEmptyUserDesignJsonRequest {
	
	private String AppID;
	private String DefaultLanguage;
	private UserDesignEmptyUserDesignJSON UserDesignJSON;
	private UserDesignBannerConfigJSON BannerConfigJSON;
	private UserDesignUserTextJSON UserTextJSON;

	public String getAppID() {
		return AppID;
	}

	public void setAppID(String AppID) {
		this.AppID = AppID;
	}

	public String getDefaultLanguage() {
		return DefaultLanguage;
	}

	public void setDefaultLanguage(String DefaultLanguage) {
		this.DefaultLanguage = DefaultLanguage;
	}

	public UserDesignEmptyUserDesignJSON getUserDesignJSON() {
		return UserDesignJSON;
	}

	public void setUserDesignJSON(UserDesignEmptyUserDesignJSON UserDesignJSON) {
		this.UserDesignJSON = UserDesignJSON;
	}

	public UserDesignBannerConfigJSON getBannerConfigJSON() {
		return BannerConfigJSON;
	}

	public void setBannerConfigJSON(UserDesignBannerConfigJSON BannerConfigJSON) {
		this.BannerConfigJSON = BannerConfigJSON;
	}
	
	public UserDesignUserTextJSON getUserTextJSON() {
		return UserTextJSON;
	}

	public void setUserTextJSON(UserDesignUserTextJSON userTextJSON) {
		UserTextJSON = userTextJSON;
	}

}
