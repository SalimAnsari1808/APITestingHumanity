package com.api.modelRequest.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignUpdateStringUserDesignIDRequest {
	
	private String UserDesignID;
	private Integer UserDesignVersion;
	private UserDesignUserDesignJSON UserDesignJSON;
	private UserDesignBannerConfigJSON BannerConfigJSON;
	private UserDesignUserTextJSON UserTextJSON;
	
	public String getUserDesignID() {
		return UserDesignID;
	}

	public void setUserDesignID(String UserDesignID) {
		this.UserDesignID = UserDesignID;
	}
	
	public Integer getUserDesignVersion() {
		return UserDesignVersion;
	}

	public void setUserDesignVersion(Integer UserDesignVersion) {
		this.UserDesignVersion = UserDesignVersion;
	}

	public UserDesignUserDesignJSON getUserDesignJSON() {
		return UserDesignJSON;
	}

	public void setUserDesignJSON(UserDesignUserDesignJSON UserDesignJSON) {
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
