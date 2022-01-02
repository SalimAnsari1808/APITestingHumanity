package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.UserDesign.UserDesignCopyAppExtraKeyRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppNumberFromAppIDRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppNumberToAppIDRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppWithoutToAppIDRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppWithoutFromAppIDRequest;
import com.api.modelResponse.UserDesign.UserDesignCopyAppResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserDesignAppCopySteps extends BaseSteps{

	private IRestResponse<UserDesignCopyAppResponse> userDesignCopyAppResponse;
	
	public UserDesignAppCopySteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User copy User Design FromApp to ToApp using User Design App Copy JSON$")
	public void user_copy_User_Design_FromApp_to_ToApp_using_User_Design_App_Copy_JSON() throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		UserDesignCopyAppRequest userDesignCopyAppRequest = new UserDesignCopyAppRequest();
		userDesignCopyAppRequest.setFromAppID(getScenarioContext().getContext(Context.FROM_APP_ID).toString());
		userDesignCopyAppRequest.setToAppID(getScenarioContext().getContext(Context.TO_APP_ID).toString());
		
		userDesignCopyAppResponse = getEndPoints().userDesignCopy(userDesignCopyAppRequest, token);
		
		System.out.println(userDesignCopyAppResponse.getResponse().getBody().asString());

	}
	
	@When("^User pass \"([^\"]*)\" using User Design Copy App JSON$")
	public void user_pass_using_User_Design_Copy_App_JSON(String fieldValue) throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		if(fieldValue.equalsIgnoreCase("NoFromAppIDKey")) {
			UserDesignCopyAppWithoutFromAppIDRequest userDesignCopyAppWithoutFromAppIDRequest = new UserDesignCopyAppWithoutFromAppIDRequest();
			userDesignCopyAppWithoutFromAppIDRequest.setToAppID(getScenarioContext().getContext(Context.TO_APP_ID).toString());
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopyWithoutFromApp(userDesignCopyAppWithoutFromAppIDRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("NoToAppIDKey")) {
			UserDesignCopyAppWithoutToAppIDRequest userDesignCopyAppToAppIDRequest = new UserDesignCopyAppWithoutToAppIDRequest();
			userDesignCopyAppToAppIDRequest.setFromAppID(getScenarioContext().getContext(Context.FROM_APP_ID).toString());
			
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopyWithoutToAppID(userDesignCopyAppToAppIDRequest, token);
	
		}else if(fieldValue.equalsIgnoreCase("NumberFromAppIDValue")) {
			UserDesignCopyAppNumberFromAppIDRequest userDesignCopyAppNumberFromAppIDRequest = new UserDesignCopyAppNumberFromAppIDRequest();
			userDesignCopyAppNumberFromAppIDRequest.setFromAppID(123);
			userDesignCopyAppNumberFromAppIDRequest.setToAppID(getScenarioContext().getContext(Context.TO_APP_ID).toString());
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopyNumberFromApp(userDesignCopyAppNumberFromAppIDRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("NumberToAppIDValue")) {
			
			UserDesignCopyAppNumberToAppIDRequest userDesignCopyAppNumberToAppIDRequest = new UserDesignCopyAppNumberToAppIDRequest();
			userDesignCopyAppNumberToAppIDRequest.setFromAppID(getScenarioContext().getContext(Context.FROM_APP_ID).toString());
			userDesignCopyAppNumberToAppIDRequest.setToAppID(123);
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopyNumberToAppID(userDesignCopyAppNumberToAppIDRequest, token);
		}else if(fieldValue.equalsIgnoreCase("NullFromAppIDValue")) {
			
			UserDesignCopyAppRequest userDesignCopyAppRequest = new UserDesignCopyAppRequest();
			userDesignCopyAppRequest.setFromAppID(null);
			userDesignCopyAppRequest.setToAppID(getScenarioContext().getContext(Context.TO_APP_ID).toString());
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopy(userDesignCopyAppRequest, token);
		}else if(fieldValue.equalsIgnoreCase("NullToAppIDValue")) {
			
			UserDesignCopyAppRequest userDesignCopyAppRequest = new UserDesignCopyAppRequest();
			userDesignCopyAppRequest.setFromAppID(getScenarioContext().getContext(Context.FROM_APP_ID).toString());
			userDesignCopyAppRequest.setToAppID(null);
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopy(userDesignCopyAppRequest, token);
		}else if(fieldValue.equalsIgnoreCase("EmptyFromAppIDValue")) {
			
			UserDesignCopyAppRequest userDesignCopyAppRequest = new UserDesignCopyAppRequest();
			userDesignCopyAppRequest.setFromAppID("");
			userDesignCopyAppRequest.setToAppID(getScenarioContext().getContext(Context.TO_APP_ID).toString());
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopy(userDesignCopyAppRequest, token);
		}else if(fieldValue.equalsIgnoreCase("EmptyToAppIDValue")) {
			
			UserDesignCopyAppRequest userDesignCopyAppRequest = new UserDesignCopyAppRequest();
			userDesignCopyAppRequest.setFromAppID(getScenarioContext().getContext(Context.FROM_APP_ID).toString());
			userDesignCopyAppRequest.setToAppID("");
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopy(userDesignCopyAppRequest, token);
		}else if(fieldValue.equalsIgnoreCase("InvalidFromAppIDValue")) {
			
			UserDesignCopyAppRequest userDesignCopyAppRequest = new UserDesignCopyAppRequest();
			userDesignCopyAppRequest.setFromAppID("InvalidFromAppID");
			userDesignCopyAppRequest.setToAppID(getScenarioContext().getContext(Context.TO_APP_ID).toString());
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopy(userDesignCopyAppRequest, token);
		}else if(fieldValue.equalsIgnoreCase("InvalidToAppIDValue")) {
			
			UserDesignCopyAppRequest userDesignCopyAppRequest = new UserDesignCopyAppRequest();
			userDesignCopyAppRequest.setFromAppID(getScenarioContext().getContext(Context.FROM_APP_ID).toString());
			userDesignCopyAppRequest.setToAppID("InvalidToAppID");
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopy(userDesignCopyAppRequest, token);
		}else if(fieldValue.equalsIgnoreCase("ExtraKey")) {
			
			UserDesignCopyAppExtraKeyRequest userDesignCopyAppExtraKeyRequest = new UserDesignCopyAppExtraKeyRequest();
			userDesignCopyAppExtraKeyRequest.setFromAppID(getScenarioContext().getContext(Context.FROM_APP_ID).toString());
			userDesignCopyAppExtraKeyRequest.setToAppID(getScenarioContext().getContext(Context.TO_APP_ID).toString());
			userDesignCopyAppExtraKeyRequest.setExtrakey("ExtraKey");
			
			userDesignCopyAppResponse = getEndPoints().userDesignCopyExtraKey(userDesignCopyAppExtraKeyRequest, token);
		}
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of User Design App Copy API$")
	public void user_get_valid_response_in_Response_body_of_User_Design_App_Copy_API(String responseCode) throws Throwable {
		Assert.assertTrue(userDesignCopyAppResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for User Design Copy App API$")
	public void user_get_valid_response_from_server_for_User_Design_Copy_App_API(String responseCode) throws Throwable {
		Assert.assertTrue(userDesignCopyAppResponse.getStatusCode()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of User Design App Copy API using valid AppId's' values$")
	public void response_body_of_User_Design_App_Copy_API_using_valid_AppId_s_values() throws Throwable {
		Assert.assertEquals(userDesignCopyAppResponse.getBody().getMessage(), "App Configuration and blocking data is successfully copied!");
	}
	
	
	@Then("^Response body of User Design Copy App API should have \"([^\"]*)\" error value$")
	public void response_body_of_User_Design_Copy_App_API_should_have_error_value(String errorValue) throws Throwable {
		
		final String NO_FROM_APP_ID_KEY = "\"FromAppID\" is required";
		final String NO_TO_APP_ID_KEY = "\"ToAppID\" is required";
		final String NUMBER_FROM_APP_ID_VALUE = "\"FromAppID\" must be a string";
		final String NUMBER_TO_APP_ID_VALUE = "\"ToAppID\" must be a string";
		final String NULL_FROM_APP_ID_VALUE = "\"FromAppID\" must be a string";
		final String NULL_TO_APP_ID_VALUE = "\"ToAppID\" must be a string";
		final String EMPTY_FROM_APP_ID_VALUE = "\"FromAppID\" is not allowed to be empty";
		final String EMPTY_TO_APP_ID_VALUE = "\"ToAppID\" is not allowed to be empty";
		final String INVALID_FROM_APP_ID_VALUE = "Cannot read property 'UserDesignID' of null";
		final String EXTRA_KEY = "\"Extrakey\" is not allowed";

		
		String err_msg = null;
		
		System.out.println(userDesignCopyAppResponse.getResponse().getBody().asString());
		
		if(errorValue.equalsIgnoreCase("NoFromAppIDKey")) {
			err_msg = NO_FROM_APP_ID_KEY;
		}else if(errorValue.equalsIgnoreCase("NoToAppIDKey")) {
			err_msg = NO_TO_APP_ID_KEY;
		}else if(errorValue.equalsIgnoreCase("NumberFromAppIDValue")) {
			err_msg = NUMBER_FROM_APP_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberToAppIDValue")) {
			err_msg = NUMBER_TO_APP_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullFromAppIDValue")) {
			err_msg = NULL_FROM_APP_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullToAppIDValue")) {
			err_msg = NULL_TO_APP_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("EmptyFromAppIDValue")) {
			err_msg = EMPTY_FROM_APP_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("EmptyToAppIDValue")) {
			err_msg = EMPTY_TO_APP_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("InvalidFromAppIDValue")) {
			err_msg = INVALID_FROM_APP_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("ExtraKey")) {
			err_msg = EXTRA_KEY;
		}
		
		Assert.assertEquals(userDesignCopyAppResponse.getBody().getError(), err_msg);

	}
	
	@Then("^Response body of User Design Copy App API should have \"([^\"]*)\" message value$")
	public void response_body_of_User_Design_Copy_App_API_should_have_message_value(String messageValue) throws Throwable {
		
		final String EMPTY_TO_APP_ID_MSG = "An unknown error occured. Please try again!";
		final String EMPTY_TO_APP_ID_I18MSG = "unknown_error_occurred";
		
		String msg = null;
		String i18_msg = null;
		
		if(messageValue.equalsIgnoreCase("InvalidToAppIDValue")) {
			msg = EMPTY_TO_APP_ID_MSG;
			i18_msg = EMPTY_TO_APP_ID_I18MSG;
		}
		
		Assert.assertEquals(userDesignCopyAppResponse.getBody().getMessage(), msg);
		Assert.assertEquals(userDesignCopyAppResponse.getBody().getI18n_msg(), i18_msg);

	}
	

}
