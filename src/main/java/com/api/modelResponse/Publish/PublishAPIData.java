package com.api.modelResponse.Publish;

import java.util.List;

import com.api.modelResponse.UserDesign.UserDesignBannerConfigJSON;
import com.api.modelResponse.UserDesign.UserDesignCategoryJSON;
import com.api.modelResponse.UserDesign.UserDesignCookieJSON;
import com.api.modelResponse.UserDesign.UserDesignProviderJSON;
import com.api.modelResponse.UserDesign.UserDesignUserDesignJSON;
import com.api.modelResponse.UserText.UserTextUserTextJSON;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class PublishAPIData {
	
	private String PublicBannerID;
	private Integer UserDesignID;
	private String AppID;
	private String DefaultLanguage;
	private UserDesignUserDesignJSON UserDesignJSON;
	private UserDesignBannerConfigJSON BannerConfigJSON;
	private List<UserDesignCookieJSON> CookieJSON = null;
	private List<UserDesignProviderJSON> ProviderJSON = null;
	private List<UserDesignCategoryJSON> CategoryJSON = null;
	private UserTextUserTextJSON UserTextJSON;

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

	public UserTextUserTextJSON getUserTextJSON() {
		return UserTextJSON;
	}

	public void setUserTextJSON(UserTextUserTextJSON userTextJSON) {
		this.UserTextJSON = userTextJSON;
	}

}
