package com.api.modelRequest.UserText;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserTextUpdateWithoutUserTextIDRequest {
	
	private UserTextUserTextJSON UserTextJSON;
	private List<UserTextCategoryJSON> CategoryJSON = null;
	private Integer UserTextVersion;

	public UserTextUserTextJSON getUserTextJSON() {
		return UserTextJSON;
	}

	public void setUserTextJSON(UserTextUserTextJSON UserTextJSON) {
		this.UserTextJSON = UserTextJSON;
	}

	public List<UserTextCategoryJSON> getCategoryJSON() {
		return CategoryJSON;
	}

	public void setCategoryJSON(List<UserTextCategoryJSON> CategoryJSON) {
		this.CategoryJSON = CategoryJSON;
	}

	public Integer getUserTextVersion() {
		return UserTextVersion;
	}

	public void setUserTextVersion(Integer UserTextVersion) {
		this.UserTextVersion = UserTextVersion;
	}

}
