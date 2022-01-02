package com.api.modelRequest.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignCookieJSON {
	
	private String Pattern;
	private Integer CookieID;
	private String CookieType;
	private Integer ProviderID;
	private String PatternType;
	private String PatternFormat;

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

	public String getCookieType() {
		return CookieType;
	}

	public void setCookieType(String CookieType) {
		this.CookieType = CookieType;
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
