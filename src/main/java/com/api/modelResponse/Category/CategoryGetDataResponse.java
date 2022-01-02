package com.api.modelResponse.Category;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class CategoryGetDataResponse {
	
	private Integer CategoryID;
	private String Name;
	private List<CategoryJSON> CategoryJSON = null;

	public Integer getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(Integer CategoryID) {
		this.CategoryID = CategoryID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public List<CategoryJSON> getCategoryJSON() {
		return CategoryJSON;
	}

	public void setCategoryJSON(List<CategoryJSON> CategoryJSON) {
		this.CategoryJSON = CategoryJSON;
	}

}
