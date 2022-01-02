package com.api.modelResponse.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignCookieJSON {
	
	private String 	Pattern;
	private Integer CookieID;
	private String 	CategoryID;
	private Integer ProviderID;
	private String 	PatternType;
	private String 	PatternFormat;

	public String getPattern() {
		return Pattern;
	}

	public void setPattern(String Pattern) {
		this.Pattern = Pattern;
	}

	public Integer getCookieID() {
		return CookieID;
	}

	public void setCookieID(Integer CookieID) {
		this.CookieID = CookieID;
	}

	public String getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(String CategoryID) {
		this.CategoryID = CategoryID;
	}

	public Integer getProviderID() {
		return ProviderID;
	}

	public void setProviderID(Integer ProviderID) {
		this.ProviderID = ProviderID;
	}

	public String getPatternType() {
		return PatternType;
	}

	public void setPatternType(String PatternType) {
		this.PatternType = PatternType;
	}

	public String getPatternFormat() {
		return PatternFormat;
	}

	public void setPatternFormat(String PatternFormat) {
		this.PatternFormat = PatternFormat;
	}
}
