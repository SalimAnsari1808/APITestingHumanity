package com.api.modelEngine;

import io.restassured.response.Response;

/**
 * <h1>IRestResponse for different Response class</h1>
* This class is used to take Response class and response of API
* and return extracted response values
* 
* @author	Salim Ansari
* @since	23-Oct-2020	
*/
public class RestResponse<T> implements IRestResponse<T>  {

	private T data;
	private Response response;
	private Exception e;
	 
	public RestResponse(Class<T> t, Response response){
		this.response = response;
		try {
			this.data = t.newInstance();
		}catch(Exception e) {
			throw new RuntimeException("There should be a default constructor in the Response POJO");
		}
	}

	/**
	* The getBody method is used to create a Pojo classes deserialization response
	* 
	* @param	NA
	* @return	data
	*/
	@SuppressWarnings("unchecked")
	public T getBody() {
		try {
			data = (T) response.getBody().as(data.getClass());
		}catch (Exception e) {
			System.out.println("This is the exception occur" + e);
			this.e=e;
		}
		return data;
	}

	/**
	* The getContent method is used to return the response as String
	* 
	* @param	NA
	* @return	String
	*/
	public String getContent() {
		return response.getBody().asString();
	}

	/**
	* The getStatusCode method is used to return the status code
	* 
	* @param	NA
	* @return	Integer
	*/
	public int getStatusCode() {
		return response.getStatusCode();
	}

	/**
	* The isSucessful method is used to return True value when 
	* response code lies with in range of 200 to 205
	* 
	* @param	NA
	* @return	Boolean
	*/
	public boolean isSucessful() {
		int code = response.getStatusCode();
		if( code == 200 || code == 201 || code == 202 || code == 203 || code == 204 || code == 205) {
			return true;
		 }else {
			 return false;
		 }
	}

	/**
	* The getStatusDescription method is used to return Status Line 
	* from http response
	* 
	* @param	NA
	* @return	String
	*/
	public String getStatusDescription() {
		return response.getStatusLine();
	}

	/**
	* The getResponse method is used to return http response 
	* 
	* @param	NA
	* @return	Response
	*/
	public Response getResponse() {
		return response;
	}

	/**
	* The getException method is used to return exception 
	* if occured during response creation
	* 
	* @param	NA
	* @return	Response
	*/
	public Exception getException() {
		return e;
	}

}
