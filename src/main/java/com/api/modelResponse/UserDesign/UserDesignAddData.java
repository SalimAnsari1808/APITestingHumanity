package com.api.modelResponse.UserDesign;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignAddData {
	
	private Integer UserDesignID;
	private String AppID;
	private String DefaultLanguage;
	private UserDesignUserDesignJSON UserDesignJSON;
	private UserDesignBannerConfigJSON BannerConfigJSON;
	private UserDesignUserTextJSON UserTextJSON;
	private List<UserDesignCookieJSON> CookieJSON = null;
	private List<UserDesignProviderJSON> ProviderJSON = null;
	private List<UserDesignCategoryJSON> CategoryJSON = null;
	private Integer UserDesignVersion;
	private Integer LastReIssueVersion;
	
	public Integer getUserDesignID() {
		return UserDesignID;
	}

	public void setUserDesignID(Integer UserDesignID) {
		this.UserDesignID = UserDesignID;
	}

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

	public List<UserDesignCookieJSON> getCookieJSON() {
		return CookieJSON;
	}

	public void setCookieJSON(List<UserDesignCookieJSON> CookieJSON) {
		this.CookieJSON = CookieJSON;
	}

	public List<UserDesignProviderJSON> getProviderJSON() {
		return ProviderJSON;
	}

	public void setProviderJSON(List<UserDesignProviderJSON> ProviderJSON) {
		this.ProviderJSON = ProviderJSON;
	}

	public List<UserDesignCategoryJSON> getCategoryJSON() {
		return CategoryJSON;
	}

	public void setCategoryJSON(List<UserDesignCategoryJSON> CategoryJSON) {
		this.CategoryJSON = CategoryJSON;
	}

	public Integer getUserDesignVersion() {
		return UserDesignVersion;
	}

	public void setUserDesignVersion(Integer UserDesignVersion) {
		this.UserDesignVersion = UserDesignVersion;
	}
	
	public Integer getLastReIssueVersion() {
		return LastReIssueVersion;
	}

	public void setLastReIssueVersion(Integer LastReIssueVersion) {
		this.LastReIssueVersion = LastReIssueVersion;
	}
}
