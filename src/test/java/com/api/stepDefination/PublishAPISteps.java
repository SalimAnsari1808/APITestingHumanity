package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Publish.PublishAPIExtraKeyRequest;
import com.api.modelRequest.Publish.PublishAPINumberAppIDRequest;
import com.api.modelRequest.Publish.PublishAPIRequest;
import com.api.modelRequest.Publish.PublishAPIWithoutAppIDRequest;
import com.api.modelResponse.Publish.PublishAPIResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PublishAPISteps extends BaseSteps{
	
	private IRestResponse<PublishAPIResponse> publishAPIResponse;

	public PublishAPISteps(TestContext testContext) {
		super(testContext);
	}
	
	
	@When("^User publish new API using Publish API JSON$")
	public void user_publish_new_API_using_Publish_API_JSON() throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		PublishAPIRequest publishAPIRequest = new PublishAPIRequest();
		
		publishAPIRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
	    
		publishAPIResponse = getEndPoints().publishAPI(publishAPIRequest, token);
	}
	
	@When("^User enter \"([^\"]*)\" using Publish API JSON$")
	public void user_enter_using_Publish_API_JSON(String fieldValue) throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		if(fieldValue.equalsIgnoreCase("NoAppIDkey")) {
			
			PublishAPIWithoutAppIDRequest publishAPIWithoutAppIDRequest = new PublishAPIWithoutAppIDRequest();
		    
			publishAPIResponse = getEndPoints().publishAPIWithoutAppID(publishAPIWithoutAppIDRequest, token);
		}else if(fieldValue.equalsIgnoreCase("NullAppIDValue")) {
			
			PublishAPIRequest publishAPIRequest = new PublishAPIRequest();
			
			publishAPIRequest.setAppID(null);
		    
			publishAPIResponse = getEndPoints().publishAPI(publishAPIRequest, token);
		}else if(fieldValue.equalsIgnoreCase("NumberAppIDValue")) {
			
			PublishAPINumberAppIDRequest publishAPINumberAppIDRequest = new PublishAPINumberAppIDRequest();
			
			publishAPINumberAppIDRequest.setAppID(123);
		    
			publishAPIResponse = getEndPoints().publishAPINumberAppID(publishAPINumberAppIDRequest, token);
		}else if(fieldValue.equalsIgnoreCase("EmptyAppIDValue")) {
			PublishAPIRequest publishAPIRequest = new PublishAPIRequest();
			
			publishAPIRequest.setAppID("");
		    
			publishAPIResponse = getEndPoints().publishAPI(publishAPIRequest, token);
		}else if(fieldValue.equalsIgnoreCase("InvalidAppIDValue")) {
			PublishAPIRequest publishAPIRequest = new PublishAPIRequest();
			
			publishAPIRequest.setAppID("Invalid_APPID");
		    
			publishAPIResponse = getEndPoints().publishAPI(publishAPIRequest, token);
		}else if(fieldValue.equalsIgnoreCase("Extrakey")) {
			PublishAPIExtraKeyRequest publishAPIExtraKeyRequest = new PublishAPIExtraKeyRequest();
			
			publishAPIExtraKeyRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			publishAPIExtraKeyRequest.setExtraKey("ExtraKey");
		    
			publishAPIResponse = getEndPoints().publishAPIExtraKey(publishAPIExtraKeyRequest, token);
		}
		
		System.out.println("Publish API Response-->"+publishAPIResponse.getResponse().getBody().asString());
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Publish API$")
	public void user_get_valid_response_in_Response_body_of_Publish_API(String responseCode) throws Throwable {
		
		Assert.assertTrue(publishAPIResponse.getBody().getStatus() == Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Publish API$")
	public void user_get_valid_response_from_server_for_Publish_API(String responseCode) throws Throwable {

		Assert.assertTrue(publishAPIResponse.getStatusCode() == Integer.parseInt(responseCode));
	}

	@Then("^Response body of Publish API should have Valid value$")
	public void response_body_of_Publish_API_should_have_Valid_value() throws Throwable {
		
		System.out.println(publishAPIResponse.getBody().getMessage());

		Assert.assertEquals(publishAPIResponse.getBody().getMessage(), "Banner Configurations and blocking data is published!");
	}
	
	
	@Then("^Response body of Publish API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Publish_API_should_have_Error_value(String errorValue) throws Throwable {
		System.out.println(publishAPIResponse.getBody().getError());
		
		final String NO_APPID_KEY 		=  "\"AppID\" is required";
		final String NULL_APPID_VALUE 	=  "\"AppID\" must be a string";
		final String NUMBER_APPID_VALUE =  "\"AppID\" must be a string";
		final String EMPTY_APPID_VALUE 	=  "\"AppID\" is not allowed to be empty";
		final String INVALID_APPID_VALUE =  "Cannot read property 'UserDesignID' of null";
		final String EXTRA_KEY = "\"ExtraKey\" is not allowed";
		
		String err_value =null;
		
		if(errorValue.equalsIgnoreCase("NoAppIDkey")) {
			err_value = NO_APPID_KEY;
		}else if(errorValue.equalsIgnoreCase("NullAppIDValue")) {
			err_value = NULL_APPID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberAppIDValue")) {
			err_value = NUMBER_APPID_VALUE;
		}else if(errorValue.equalsIgnoreCase("EmptyAppIDValue")) {
			err_value = EMPTY_APPID_VALUE;
		}else if(errorValue.equalsIgnoreCase("InvalidAppIDValue")) {
			err_value = INVALID_APPID_VALUE;
		}else if(errorValue.equalsIgnoreCase("Extrakey")) {
			err_value = EXTRA_KEY;
		}
		
		Assert.assertEquals(publishAPIResponse.getBody().getError(), err_value);
	}
	
	@When("User Publish API")
	public void user_Publish_API() {
	    // Write code here that turns the phrase above into concrete actions
		
		PublishAPIRequest publishAPIRequest = new PublishAPIRequest();
		
		publishAPIRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
	    
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		publishAPIResponse = getEndPoints().publishAPI(publishAPIRequest, token);
		
		
		System.out.println(publishAPIResponse.getBody().getStatus());
		System.out.println(publishAPIResponse.getException());
		
	}

}
