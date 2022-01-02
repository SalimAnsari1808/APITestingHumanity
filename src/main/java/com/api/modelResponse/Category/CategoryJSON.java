package com.api.modelResponse.Category;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class CategoryJSON {
	
	private String Name;
	private String Language;
	private String Description;

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String Language) {
		this.Language = Language;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

}
