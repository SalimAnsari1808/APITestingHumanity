package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Session.SaveSessionAPIExtraKeyRequest;
import com.api.modelRequest.Session.SaveSessionAPINumberAppIDRequest;
import com.api.modelRequest.Session.SaveSessionAPINumberSessionIDRequest;
import com.api.modelRequest.Session.SaveSessionAPINumberSessionJSONRequest;
import com.api.modelRequest.Session.SaveSessionAPIRequest;
import com.api.modelRequest.Session.SaveSessionAPIStringSessionJSONRequest;
import com.api.modelRequest.Session.SaveSessionAPIWithoutAppIDRequest;
import com.api.modelRequest.Session.SaveSessionAPIWithoutSessionIDRequest;
import com.api.modelRequest.Session.SessionJSONRequest;
import com.api.modelResponse.Session.SaveSessionResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SaveSessionSteps extends BaseSteps{
	
	private IRestResponse<SaveSessionResponse> saveSessionResponse;

	public SaveSessionSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User hit Save Session API with Correct Details using Save Session JSON\\.$")
	public void user_hit_Save_Session_API_with_Correct_Details_using_Save_Session_JSON() throws Throwable {
		
		String AppID	= getScenarioContext().getContext(Context.APP_ID).toString();
	    
		SessionJSONRequest sessionJSONRequest = new SessionJSONRequest();
		sessionJSONRequest.setData("1234");
		
		SaveSessionAPIRequest saveSessionAPIRequest = new SaveSessionAPIRequest();
		saveSessionAPIRequest.setSessionID("klslkksdklsd984309");
		saveSessionAPIRequest.setAppID(AppID);
		saveSessionAPIRequest.setSessionJSON(sessionJSONRequest);
		
		saveSessionResponse = getEndPoints().saveSession(saveSessionAPIRequest);
		
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Save Session API$")
	public void user_get_valid_response_in_Response_body_of_Save_Session_API(String responseCode) throws Throwable {
		Assert.assertTrue(saveSessionResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Save Session API should have Valid value$")
	public void response_body_of_Save_Session_API_should_have_Valid_value() throws Throwable {
	    
	}
	
	@When("^User enter \"([^\"]*)\" using Save Session JSON$")
	public void user_enter_using_Save_Session_JSON(String requestType) throws Throwable {

		String AppID	= getScenarioContext().getContext(Context.APP_ID).toString();
	    
		SessionJSONRequest sessionJSON = new SessionJSONRequest();
		sessionJSON.setData("1234");
	    
		if(requestType.equalsIgnoreCase("NoSessionID")) {
			
			SaveSessionAPIWithoutSessionIDRequest saveSessionAPIWithoutSessionIDRequest = new SaveSessionAPIWithoutSessionIDRequest();
			saveSessionAPIWithoutSessionIDRequest.setAppID(AppID);
			saveSessionAPIWithoutSessionIDRequest.setSessionJSON(sessionJSON);
			
			saveSessionResponse = getEndPoints().saveSessionWithoutSessionID(saveSessionAPIWithoutSessionIDRequest);
			return;
		}else if(requestType.equalsIgnoreCase("NoAppID")) {
			
			SaveSessionAPIWithoutAppIDRequest saveSessionAPIWithoutAppIDRequest = new SaveSessionAPIWithoutAppIDRequest();
			saveSessionAPIWithoutAppIDRequest.setSessionID("klslkksdklsd984309");
			saveSessionAPIWithoutAppIDRequest.setSessionJSON(sessionJSON);
			
			saveSessionResponse = getEndPoints().saveSessionWithoutAppID(saveSessionAPIWithoutAppIDRequest);
			return;
		}else if(requestType.equalsIgnoreCase("NullSessionID")) {
			
			SaveSessionAPIRequest saveSessionAPIRequest = new SaveSessionAPIRequest();
			saveSessionAPIRequest.setSessionID(null);
			saveSessionAPIRequest.setAppID(AppID);
			saveSessionAPIRequest.setSessionJSON(sessionJSON);
			
			saveSessionResponse = getEndPoints().saveSession(saveSessionAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("NullAppID")) {
			
			SaveSessionAPIRequest saveSessionAPIRequest = new SaveSessionAPIRequest();
			saveSessionAPIRequest.setSessionID("klslkksdklsd984309");
			saveSessionAPIRequest.setAppID(null);
			saveSessionAPIRequest.setSessionJSON(sessionJSON);
			
			saveSessionResponse = getEndPoints().saveSession(saveSessionAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("NumberSessionID")) {
			
			SaveSessionAPINumberSessionIDRequest saveSessionAPINumberSessionIDRequest = new SaveSessionAPINumberSessionIDRequest();
			saveSessionAPINumberSessionIDRequest.setSessionID(1234);
			saveSessionAPINumberSessionIDRequest.setAppID(AppID);
			saveSessionAPINumberSessionIDRequest.setSessionJSON(sessionJSON);
			
			saveSessionResponse = getEndPoints().saveSessionNumberSessionID(saveSessionAPINumberSessionIDRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("NumberAppID")) {
			
			SaveSessionAPINumberAppIDRequest saveSessionAPINumberAppIDRequest = new SaveSessionAPINumberAppIDRequest();
			saveSessionAPINumberAppIDRequest.setSessionID("klslkksdklsd984309");
			saveSessionAPINumberAppIDRequest.setAppID(1234);
			saveSessionAPINumberAppIDRequest.setSessionJSON(sessionJSON);
			
			saveSessionResponse = getEndPoints().saveSessionNumberAppID(saveSessionAPINumberAppIDRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("EmptySessionID")) {
			
			SaveSessionAPIRequest saveSessionAPIRequest = new SaveSessionAPIRequest();
			saveSessionAPIRequest.setSessionID("");
			saveSessionAPIRequest.setAppID(AppID);
			saveSessionAPIRequest.setSessionJSON(sessionJSON);
			
			saveSessionResponse = getEndPoints().saveSession(saveSessionAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("EmptyAppID")) {
			
			SaveSessionAPIRequest saveSessionAPIRequest = new SaveSessionAPIRequest();
			saveSessionAPIRequest.setSessionID("klslkksdklsd984309");
			saveSessionAPIRequest.setAppID("");
			saveSessionAPIRequest.setSessionJSON(sessionJSON);
			
			saveSessionResponse = getEndPoints().saveSession(saveSessionAPIRequest);
			return;
		}else if(requestType.equalsIgnoreCase("NullSessionJSON")) {
			
			SaveSessionAPIRequest saveSessionAPIRequest = new SaveSessionAPIRequest();
			saveSessionAPIRequest.setSessionID("klslkksdklsd984309");
			saveSessionAPIRequest.setAppID(AppID);
			saveSessionAPIRequest.setSessionJSON(null);
			
			saveSessionResponse = getEndPoints().saveSession(saveSessionAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("NumberSessionJSON")) {
			
			SaveSessionAPINumberSessionJSONRequest saveSessionAPINumberSessionJSONRequest = new SaveSessionAPINumberSessionJSONRequest();
			saveSessionAPINumberSessionJSONRequest.setSessionID("klslkksdklsd984309");
			saveSessionAPINumberSessionJSONRequest.setAppID(AppID);
			saveSessionAPINumberSessionJSONRequest.setSessionJSON(1234);
			
			saveSessionResponse = getEndPoints().saveSessionNumberSessionJSON(saveSessionAPINumberSessionJSONRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("StringSessionJSON")) {
			
			SaveSessionAPIStringSessionJSONRequest saveSessionAPIStringSessionJSONRequest = new SaveSessionAPIStringSessionJSONRequest();
			saveSessionAPIStringSessionJSONRequest.setSessionID("klslkksdklsd984309");
			saveSessionAPIStringSessionJSONRequest.setAppID(AppID);
			saveSessionAPIStringSessionJSONRequest.setSessionJSON("abcd");
			
			saveSessionResponse = getEndPoints().saveSessionStringSessionJSON(saveSessionAPIStringSessionJSONRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("ExtraKey")) {
			
			SaveSessionAPIExtraKeyRequest saveSessionAPIExtraKeyRequest = new SaveSessionAPIExtraKeyRequest();
			saveSessionAPIExtraKeyRequest.setSessionID("klslkksdklsd984309");
			saveSessionAPIExtraKeyRequest.setAppID(AppID);
			saveSessionAPIExtraKeyRequest.setSessionJSON(sessionJSON);
			saveSessionAPIExtraKeyRequest.setXyzKey("XyzValue");
			
			saveSessionResponse = getEndPoints().saveSessionExtraKey(saveSessionAPIExtraKeyRequest);
			return;
		}else if(requestType.equalsIgnoreCase("InvalidSessionID")) {
			
			SaveSessionAPIRequest saveSessionAPIRequest = new SaveSessionAPIRequest();
			saveSessionAPIRequest.setSessionID("kls");
			saveSessionAPIRequest.setAppID(AppID);
			saveSessionAPIRequest.setSessionJSON(sessionJSON);
			
			saveSessionResponse = getEndPoints().saveSession(saveSessionAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("InvalidAppID")) {
			
			SaveSessionAPIRequest saveSessionAPIRequest = new SaveSessionAPIRequest();
			saveSessionAPIRequest.setSessionID("klslkksdklsd984309");
			saveSessionAPIRequest.setAppID("abcd123");
			saveSessionAPIRequest.setSessionJSON(sessionJSON);
			
			saveSessionResponse = getEndPoints().saveSession(saveSessionAPIRequest);
			return;
		}
		
	}

	@Then("^User get valid response \"([^\"]*)\" from server for Save Session API$")
	public void user_get_valid_response_from_server_for_Save_Session_API(String responseCode) throws Throwable {
	    
	}

	@Then("^Response body of Save Session API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Save_Session_API_should_have_Error_value(String responseMessage) throws Throwable {
	    
		final String NO_SESSIONID		= "\"SessionID\" is required";
		final String NO_APPID			= "\"AppID\" is required";
		final String NULL_SESSIONID		= "\"SessionID\" must be a string";
		final String NULL_APPID			= "\"AppID\" must be a string";
		final String NUMBER_SESSIONID	= "\"SessionID\" must be a string";
		final String NUMBER_APPID		= "\"AppID\" must be a string";
		final String EMPTY_SESSIONID	= "\"SessionID\" is not allowed to be empty";
		final String EMPTY_APPID		= "\"AppID\" is not allowed to be empty";
		final String NULL_SESSIONJSON	= "\"SessionJSON\" must be of type object";
		final String NUMBER_SESSIONJSON	= "\"SessionJSON\" must be of type object";
		final String STRING_SESSIONJSON	= "\"SessionJSON\" must be of type object";
		final String EXTRA_KEY			= "\"XyzKey\" is not allowed";
		final String INVALID_SESSIONID	= "";
		final String INVALID_APPID		= "";
				
		String error_msg = null;
		
		if(responseMessage.equalsIgnoreCase("NoSessionID")) {
			error_msg = NO_SESSIONID;
		}else if(responseMessage.equalsIgnoreCase("NoAppID")) {
			error_msg = NO_APPID;
		}else if(responseMessage.equalsIgnoreCase("NullSessionID")) {
			error_msg = NULL_SESSIONID;
		}else if(responseMessage.equalsIgnoreCase("NullAppID")) {
			error_msg = NULL_APPID;
		}else if(responseMessage.equalsIgnoreCase("NumberSessionID")) {
			error_msg = NUMBER_SESSIONID;
		}else if(responseMessage.equalsIgnoreCase("NumberAppID")) {
			error_msg = NUMBER_APPID;
		}else if(responseMessage.equalsIgnoreCase("EmptySessionID")) {
			error_msg = EMPTY_SESSIONID;
		}else if(responseMessage.equalsIgnoreCase("EmptyAppID")) {
			error_msg = EMPTY_APPID;
		}else if(responseMessage.equalsIgnoreCase("NullSessionJSON")) {
			error_msg = NULL_SESSIONJSON;
		}else if(responseMessage.equalsIgnoreCase("NumberSessionJSON")) {
			error_msg = NUMBER_SESSIONJSON;
		}else if(responseMessage.equalsIgnoreCase("StringSessionJSON")) {
			error_msg = STRING_SESSIONJSON;
		}else if(responseMessage.equalsIgnoreCase("ExtraKey")) {
			error_msg = EXTRA_KEY;
		}else if(responseMessage.equalsIgnoreCase("InvalidSessionID")) {
			error_msg = INVALID_SESSIONID;
		}else if(responseMessage.equalsIgnoreCase("InvalidAppID")) {
			error_msg = INVALID_APPID;
		}
		
		System.out.println("|"+error_msg+"|");
		System.out.println("|"+saveSessionResponse.getBody().getError()+"|");
		
		
		Assert.assertEquals(saveSessionResponse.getBody().getError(), error_msg);
		
	}
}