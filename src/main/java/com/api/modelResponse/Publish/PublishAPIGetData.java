package com.api.modelResponse.Publish;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class PublishAPIGetData {
	
	private String 	PublicBannerID;
	private Integer UserDesignID;
	private String 	AppID;
	private String 	DefaultLanguage;
	private UserDesignUserDesignJSON UserDesignJSON;
	private UserDesignBannerConfigJSON BannerConfigJSON;
	private List<UserDesignCookieJSON> CookieJSON = null;
	private List<UserDesignProviderJSON> ProviderJSON = null;
	private List<UserDesignCategoryJSON> CategoryJSON = null;
	private UserDesignUserTextJSON UserTextJSON;
	private String Language;
	private Integer UserDesignVersion;
	private Integer LastReIssueVersion;

	public String getPublicBannerID() {
		return PublicBannerID;
	}

	public void setPublicBannerID(String publicBannerID) {
		this.PublicBannerID = publicBannerID;
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

	public String getDefaultLanguage() {
		return DefaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.DefaultLanguage = defaultLanguage;
	}

	public UserDesignUserDesignJSON getUserDesignJSON() {
		return UserDesignJSON;
	}

	public void setUserDesignJSON(UserDesignUserDesignJSON userDesignJSON) {
		this.UserDesignJSON = userDesignJSON;
	}

	public UserDesignBannerConfigJSON getBannerConfigJSON() {
		return BannerConfigJSON;
	}

	public void setBannerConfigJSON(UserDesignBannerConfigJSON bannerConfigJSON) {
		this.BannerConfigJSON = bannerConfigJSON;
	}

	public List<UserDesignCookieJSON> getCookieJSON() {
		return CookieJSON;
	}

	public void setCookieJSON(List<UserDesignCookieJSON> cookieJSON) {
		this.CookieJSON = cookieJSON;
	}

	public List<UserDesignProviderJSON> getProviderJSON() {
		return ProviderJSON;
	}

	public void setProviderJSON(List<UserDesignProviderJSON> providerJSON) {
		this.ProviderJSON = providerJSON;
	}

	public List<UserDesignCategoryJSON> getCategoryJSON() {
		return CategoryJSON;
	}

	public void setCategoryJSON(List<UserDesignCategoryJSON> categoryJSON) {
		this.CategoryJSON = categoryJSON;
	}

	public UserDesignUserTextJSON getUserTextJSON() {
		return UserTextJSON;
	}

	public void setUserTextJSON(UserDesignUserTextJSON UserTextJSON) {
		this.UserTextJSON = UserTextJSON;
	}
	
	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		this.Language = language;
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
