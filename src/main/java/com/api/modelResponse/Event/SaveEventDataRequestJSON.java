package com.api.modelResponse.Event;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveEventDataRequestJSON {
	
	private String IP;
	private String City;
	private String Country;
	private String Subdivision;
	private Boolean IsInEuropeanUnion;
	
	public String getIP() {
		return IP;
	}
	
	public void setIP(String iP) {
		IP = iP;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String city) {
		City = city;
	}
	
	public String getCountry() {
		return Country;
	}
	
	public void setCountry(String country) {
		Country = country;
	}
	
	public String getSubdivision() {
		return Subdivision;
	}
	
	public void setSubdivision(String subdivision) {
		Subdivision = subdivision;
	}
	
	public Boolean getIsInEuropeanUnion() {
		return IsInEuropeanUnion;
	}
	
	public void setIsInEuropeanUnion(Boolean isInEuropeanUnion) {
		IsInEuropeanUnion = isInEuropeanUnion;
	}
}