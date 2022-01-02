package com.api.modelEngine;

import io.restassured.response.Response;

public interface IRestResponse<T> {
	
	public T getBody();
	
	public String getContent();
	
	public int getStatusCode();
	
	public boolean isSucessful();
	
	public String getStatusDescription();
	
	public Response getResponse();
	
	public Exception getException();

}
