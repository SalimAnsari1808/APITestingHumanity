package com.api.modelRequest.UserDesign;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignCategoryJSON {
	
	private String Name;
	private Integer CategoryID;
	
	private List<UserDesignCategoryJSON_> CategoryJSON = null;

	public String getName() {
	return Name;
	}

	public void setName(String Name) {
	this.Name = Name;
	}

	public Integer getCategoryID() {
	return CategoryID;
	}

	public void setCategoryID(Integer CategoryID) {
	this.CategoryID = CategoryID;
	}

	public List<UserDesignCategoryJSON_> getCategoryJSON() {
	return CategoryJSON;
	}

	public void setCategoryJSON(List<UserDesignCategoryJSON_> CategoryJSON) {
	this.CategoryJSON = CategoryJSON;
	}


}
