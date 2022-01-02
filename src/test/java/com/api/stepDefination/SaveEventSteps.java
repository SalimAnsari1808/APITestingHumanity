package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Event.SaveEventAPIExtraKeyRequest;
import com.api.modelRequest.Event.SaveEventAPINumberAppIDRequest;
import com.api.modelRequest.Event.SaveEventAPINumberEventRequest;
import com.api.modelRequest.Event.SaveEventAPINumberSessionIDRequest;
import com.api.modelRequest.Event.SaveEventAPINumberUserIDRequest;
import com.api.modelRequest.Event.SaveEventAPIRequest;
import com.api.modelRequest.Event.SaveEventAPIStringEventRequest;
import com.api.modelRequest.Event.SaveEventAPIWithoutAppIDRequest;
import com.api.modelRequest.Event.SaveEventAPIWithoutSessioIDRequest;
import com.api.modelRequest.Event.SaveEventEvent;
import com.api.modelRequest.Event.SaveEventEventEventDetails;
import com.api.modelResponse.Event.SaveEventResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SaveEventSteps extends BaseSteps{
	
	private IRestResponse<SaveEventResponse> saveEventResponse;

	public SaveEventSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User hit Save Event API with Correct Details using Save Event JSON\\.$")
	public void user_hit_Save_Event_API_with_Correct_Details_using_Save_Event_JSON() throws Throwable {
		
		int userDesignID = Integer.parseInt(getScenarioContext().getContext(Context.UserDesign_ID).toString());
		int userTextID = Integer.parseInt(getScenarioContext().getContext(Context.UserText_ID).toString());
		String UserID	= getScenarioContext().getContext(Context.ADMIN_USERNAME).toString();
		String AppID	= getScenarioContext().getContext(Context.APP_ID).toString();
	    
		SaveEventEventEventDetails saveEventEventEventDetails = new SaveEventEventEventDetails();
		saveEventEventEventDetails.setEventForm("Test Form");
		saveEventEventEventDetails.setURL("https://www.google.com");
		saveEventEventEventDetails.setCookieID(1);
		saveEventEventEventDetails.setCookieIDVersion(2);
		saveEventEventEventDetails.setPolicyID(3);
		saveEventEventEventDetails.setMethodOfAcceptance("button click");
		saveEventEventEventDetails.setLanguage("en");
		saveEventEventEventDetails.setUserDesignID(userDesignID);
		saveEventEventEventDetails.setUserTextID(userTextID);
		
		SaveEventEvent saveEventEvent = new SaveEventEvent();
		saveEventEvent.setEventID(1);
		saveEventEvent.setEventType("Cookie");
		saveEventEvent.setEventDetails(saveEventEventEventDetails);
		
		SaveEventAPIRequest saveEventAPIRequest = new SaveEventAPIRequest();
		saveEventAPIRequest.setSessionID("klslkksdklsd984309");
		saveEventAPIRequest.setUserID(UserID);
		saveEventAPIRequest.setAppID(AppID);
		saveEventAPIRequest.setEvent(saveEventEvent);
		
		saveEventResponse = getEndPoints().saveEvent(saveEventAPIRequest);
		
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Save Event API$")
	public void user_get_valid_response_in_Response_body_of_Save_Event_API(String responseCode) throws Throwable {
		Assert.assertTrue(saveEventResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Save Event API should have Valid value$")
	public void response_body_of_Save_Event_API_should_have_Valid_value() throws Throwable {
	    
	}
	
	@When("^User enter \"([^\"]*)\" using Save Event JSON$")
	public void user_enter_using_Save_Event_JSON(String requestType) throws Throwable {
		

		int userDesignID = Integer.parseInt(getScenarioContext().getContext(Context.UserDesign_ID).toString());
		int userTextID = Integer.parseInt(getScenarioContext().getContext(Context.UserText_ID).toString());
		String UserID	= getScenarioContext().getContext(Context.ADMIN_USERNAME).toString();
		String AppID	= getScenarioContext().getContext(Context.APP_ID).toString();
	    
		SaveEventEventEventDetails saveEventEventEventDetails = new SaveEventEventEventDetails();
		saveEventEventEventDetails.setEventForm("Test Form");
		saveEventEventEventDetails.setURL("https://www.google.com");
		saveEventEventEventDetails.setCookieID(1);
		saveEventEventEventDetails.setCookieIDVersion(2);
		saveEventEventEventDetails.setPolicyID(3);
		saveEventEventEventDetails.setMethodOfAcceptance("button click");
		saveEventEventEventDetails.setLanguage("en");
		saveEventEventEventDetails.setUserDesignID(userDesignID);
		saveEventEventEventDetails.setUserTextID(userTextID);
		
		SaveEventEvent saveEventEvent = new SaveEventEvent();
		saveEventEvent.setEventID(1);
		saveEventEvent.setEventType("Cookie");
		saveEventEvent.setEventDetails(saveEventEventEventDetails);
	    
		if(requestType.equalsIgnoreCase("NoSessionID")) {
			
			SaveEventAPIWithoutSessioIDRequest saveEventAPIWithoutSessioIDRequest = new SaveEventAPIWithoutSessioIDRequest();
			saveEventAPIWithoutSessioIDRequest.setUserID(UserID);
			saveEventAPIWithoutSessioIDRequest.setAppID(AppID);
			saveEventAPIWithoutSessioIDRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEventWithoutSessionID(saveEventAPIWithoutSessioIDRequest);
			return;
		}else if(requestType.equalsIgnoreCase("NoAppID")) {
			
			SaveEventAPIWithoutAppIDRequest saveEventAPIWithoutAppIDRequest = new SaveEventAPIWithoutAppIDRequest();
			saveEventAPIWithoutAppIDRequest.setUserID(UserID);
			saveEventAPIWithoutAppIDRequest.setEvent(saveEventEvent);
			saveEventAPIWithoutAppIDRequest.setSessionID("klslkksdklsd984309");
			
			saveEventResponse = getEndPoints().saveEventWithoutAppID(saveEventAPIWithoutAppIDRequest);
			return;
		}else if(requestType.equalsIgnoreCase("NullSessionID")) {
			
			SaveEventAPIRequest saveEventAPIRequest = new SaveEventAPIRequest();
			saveEventAPIRequest.setSessionID(null);
			saveEventAPIRequest.setUserID(UserID);
			saveEventAPIRequest.setAppID(AppID);
			saveEventAPIRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEvent(saveEventAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("NullAppID")) {
			
			SaveEventAPIRequest saveEventAPIRequest = new SaveEventAPIRequest();
			saveEventAPIRequest.setSessionID("klslkksdklsd984309");
			saveEventAPIRequest.setUserID(UserID);
			saveEventAPIRequest.setAppID(null);
			saveEventAPIRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEvent(saveEventAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("NumberSessionID")) {
			
			SaveEventAPINumberSessionIDRequest saveEventAPINumberSessionIDRequest = new SaveEventAPINumberSessionIDRequest();
			saveEventAPINumberSessionIDRequest.setSessionID(1234);
			saveEventAPINumberSessionIDRequest.setUserID(UserID);
			saveEventAPINumberSessionIDRequest.setAppID(AppID);
			saveEventAPINumberSessionIDRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEventNumberSessionID(saveEventAPINumberSessionIDRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("NumberAppID")) {
			
			SaveEventAPINumberAppIDRequest saveEventAPINumberAppIDRequest = new SaveEventAPINumberAppIDRequest();
			saveEventAPINumberAppIDRequest.setSessionID("klslkksdklsd984309");
			saveEventAPINumberAppIDRequest.setUserID(UserID);
			saveEventAPINumberAppIDRequest.setAppID(1234);
			saveEventAPINumberAppIDRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEventNumberAppID(saveEventAPINumberAppIDRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("EmptySessionID")) {
			
			SaveEventAPIRequest saveEventAPIRequest = new SaveEventAPIRequest();
			saveEventAPIRequest.setSessionID("");
			saveEventAPIRequest.setUserID(UserID);
			saveEventAPIRequest.setAppID(AppID);
			saveEventAPIRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEvent(saveEventAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("EmptyAppID")) {
			
			SaveEventAPIRequest saveEventAPIRequest = new SaveEventAPIRequest();
			saveEventAPIRequest.setSessionID("klslkksdklsd984309");
			saveEventAPIRequest.setUserID(UserID);
			saveEventAPIRequest.setAppID("");
			saveEventAPIRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEvent(saveEventAPIRequest);
			return;
		}else if(requestType.equalsIgnoreCase("NullUserID")) {
			
			SaveEventAPIRequest saveEventAPIRequest = new SaveEventAPIRequest();
			saveEventAPIRequest.setSessionID("klslkksdklsd984309");
			saveEventAPIRequest.setUserID(null);
			saveEventAPIRequest.setAppID(AppID);
			saveEventAPIRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEvent(saveEventAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("NumberUserID")) {
			
			SaveEventAPINumberUserIDRequest saveEventAPINumberUserIDRequest = new SaveEventAPINumberUserIDRequest();
			saveEventAPINumberUserIDRequest.setSessionID("klslkksdklsd984309");
			saveEventAPINumberUserIDRequest.setUserID(1234);
			saveEventAPINumberUserIDRequest.setAppID(AppID);
			saveEventAPINumberUserIDRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEventNumberUserID(saveEventAPINumberUserIDRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("EmptyUserID")) {
			
			SaveEventAPIRequest saveEventAPIRequest = new SaveEventAPIRequest();
			saveEventAPIRequest.setSessionID("klslkksdklsd984309");
			saveEventAPIRequest.setUserID("");
			saveEventAPIRequest.setAppID(AppID);
			saveEventAPIRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEvent(saveEventAPIRequest);
			return;
		}else if(requestType.equalsIgnoreCase("NullEvent")) {
			
			SaveEventAPIRequest saveEventAPIRequest = new SaveEventAPIRequest();
			saveEventAPIRequest.setSessionID("klslkksdklsd984309");
			saveEventAPIRequest.setUserID(UserID);
			saveEventAPIRequest.setAppID(AppID);
			saveEventAPIRequest.setEvent(null);
			
			saveEventResponse = getEndPoints().saveEvent(saveEventAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("NumberEvent")) {
			
			SaveEventAPINumberEventRequest saveEventAPINumberEventRequest = new SaveEventAPINumberEventRequest();
			saveEventAPINumberEventRequest.setSessionID("klslkksdklsd984309");
			saveEventAPINumberEventRequest.setUserID(UserID);
			saveEventAPINumberEventRequest.setAppID(AppID);
			saveEventAPINumberEventRequest.setEvent(1234);
			
			saveEventResponse = getEndPoints().saveEventNumberEvent(saveEventAPINumberEventRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("StringEvent")) {
			
			SaveEventAPIStringEventRequest saveEventAPIStringEventRequest = new SaveEventAPIStringEventRequest();
			saveEventAPIStringEventRequest.setSessionID("klslkksdklsd984309");
			saveEventAPIStringEventRequest.setUserID(UserID);
			saveEventAPIStringEventRequest.setAppID(AppID);
			saveEventAPIStringEventRequest.setEvent("abcd");
			
			saveEventResponse = getEndPoints().saveEventStringEvent(saveEventAPIStringEventRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("ExtraKey")) {
			
			SaveEventAPIExtraKeyRequest saveEventAPIExtraKeyRequest = new SaveEventAPIExtraKeyRequest();
			saveEventAPIExtraKeyRequest.setSessionID("klslkksdklsd984309");
			saveEventAPIExtraKeyRequest.setUserID(UserID);
			saveEventAPIExtraKeyRequest.setAppID(AppID);
			saveEventAPIExtraKeyRequest.setEvent(saveEventEvent);
			saveEventAPIExtraKeyRequest.setXyzKey("XyzValue");
			
			saveEventResponse = getEndPoints().saveEventExtraKey(saveEventAPIExtraKeyRequest);
			return;
		}else if(requestType.equalsIgnoreCase("InvalidSessionID")) {
			
			SaveEventAPIRequest saveEventAPIRequest = new SaveEventAPIRequest();
			saveEventAPIRequest.setSessionID("kls");
			saveEventAPIRequest.setUserID(UserID);
			saveEventAPIRequest.setAppID(AppID);
			saveEventAPIRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEvent(saveEventAPIRequest);
			return;
			
		}else if(requestType.equalsIgnoreCase("InvalidAppID")) {
			
			SaveEventAPIRequest saveEventAPIRequest = new SaveEventAPIRequest();
			saveEventAPIRequest.setSessionID("klslkksdklsd984309");
			saveEventAPIRequest.setUserID(UserID);
			saveEventAPIRequest.setAppID("abcd123");
			saveEventAPIRequest.setEvent(saveEventEvent);
			
			saveEventResponse = getEndPoints().saveEvent(saveEventAPIRequest);
			return;
		}
		
	}

	@Then("^User get valid response \"([^\"]*)\" from server for Save Event API$")
	public void user_get_valid_response_from_server_for_Save_Event_API(String responseCode) throws Throwable {
	    
	}

	@Then("^Response body of Save Event API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Save_Event_API_should_have_Error_value(String responseMessage) throws Throwable {
	    
		final String NO_SESSIONID		= "\"SessionID\" is required";
		final String NO_APPID			= "\"AppID\" is required";
		final String NULL_SESSIONID		= "\"SessionID\" must be a string";
		final String NULL_APPID			= "\"AppID\" must be a string";
		final String NUMBER_SESSIONID	= "\"SessionID\" must be a string";
		final String NUMBER_APPID		= "\"AppID\" must be a string";
		final String EMPTY_SESSIONID	= "\"SessionID\" is not allowed to be empty";
		final String EMPTY_APPID		= "\"AppID\" is not allowed to be empty";
		final String NULL_USERID		= "\"UserID\" must be a string";
		final String NUMBER_USERID		= "\"UserID\" must be a string";
		final String EMPTY_USERID		= "\"UserID\" is not allowed to be empty";
		final String NULL_EVENT			= "\"Event\" must be of type object";
		final String NUMBER_EVENT		= "\"Event\" must be of type object";
		final String STRING_EVENT		= "\"Event\" must be of type object";
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
		}else if(responseMessage.equalsIgnoreCase("NullUserID")) {
			error_msg = NULL_USERID;
		}else if(responseMessage.equalsIgnoreCase("NumberUserID")) {
			error_msg = NUMBER_USERID;
		}else if(responseMessage.equalsIgnoreCase("EmptyUserID")) {
			error_msg = EMPTY_USERID;
		}else if(responseMessage.equalsIgnoreCase("NullEvent")) {
			error_msg = NULL_EVENT;
		}else if(responseMessage.equalsIgnoreCase("NumberEvent")) {
			error_msg = NUMBER_EVENT;
		}else if(responseMessage.equalsIgnoreCase("StringEvent")) {
			error_msg = STRING_EVENT;
		}else if(responseMessage.equalsIgnoreCase("ExtraKey")) {
			error_msg = EXTRA_KEY;
		}else if(responseMessage.equalsIgnoreCase("InvalidSessionID")) {
			error_msg = INVALID_SESSIONID;
		}else if(responseMessage.equalsIgnoreCase("InvalidAppID")) {
			error_msg = INVALID_APPID;
		}
		
		Assert.assertEquals(saveEventResponse.getBody().getError(), error_msg);
		
	}
}