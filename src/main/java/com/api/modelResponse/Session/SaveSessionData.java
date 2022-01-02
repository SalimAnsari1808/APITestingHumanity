package com.api.modelResponse.Session;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class SaveSessionData {

	private String IP;
	private String Country;
	private Boolean IsInEuropeanUnion;
	private String City;
	private String Subdivision;
	
	public String getIP() {
		return IP;
	}
	
	public void setIP(String iP) {
		IP = iP;
	}
	
	public String getCountry() {
		return Country;
	}
	
	public void setCountry(String country) {
		Country = country;
	}
	
	public Boolean getIsInEuropeanUnion() {
		return IsInEuropeanUnion;
	}
	
	public void setIsInEuropeanUnion(Boolean isInEuropeanUnion) {
		IsInEuropeanUnion = isInEuropeanUnion;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String city) {
		City = city;
	}
	
	public String getSubdivision() {
		return Subdivision;
	}
	
	public void setSubdivision(String subdivision) {
		Subdivision = subdivision;
	}
}