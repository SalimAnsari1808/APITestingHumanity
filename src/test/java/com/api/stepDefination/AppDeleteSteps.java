package com.api.stepDefination;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.App.AppDeleteNumberAppIdRequest;
import com.api.modelRequest.App.AppDeleteRequest;
import com.api.modelRequest.App.AppDeleteWithoutAppIdRequest;
import com.api.modelResponse.App.AppDeleteResponse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.*;

public class AppDeleteSteps extends BaseSteps{
	
	private IRestResponse<AppDeleteResponse> deleteAppResponse;

	public AppDeleteSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User delete App using Delete App JSON$")
	public void user_delete_App_using_Delete_App_JSON() throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		AppDeleteRequest deleteAppRequest = new AppDeleteRequest();
		deleteAppRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
		
		deleteAppResponse = getEndPoints().appDelete(deleteAppRequest, token);
		
		System.out.println("Delete App Response-->"+deleteAppResponse.getResponse().getBody().asString());
	}
	
	@When("^User send AppId \"([^\"]*)\" using Delete App JSON$")
	public void user_send_AppId_using_Delete_App_JSON(String appIdValue) throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		if(appIdValue.equalsIgnoreCase("NullValue")) {
			appIdValue = null;
		}else if(appIdValue.equalsIgnoreCase("NumberValue")) {
			appIdValue = "123";
			
			AppDeleteNumberAppIdRequest appDeleteNumberAppIdRequest = new AppDeleteNumberAppIdRequest();
			appDeleteNumberAppIdRequest.setAppID(123);;
			
			deleteAppResponse = getEndPoints().appDeleteNumberAppId(appDeleteNumberAppIdRequest, token);
			
			System.out.println(deleteAppResponse.getResponse().getBody().asString());
			
			return;
		}else if(appIdValue.equalsIgnoreCase("IncorrectAppId")) {
			
			AppDeleteRequest deleteAppRequest = new AppDeleteRequest();
			deleteAppRequest.setAppID("lo1232132");
			
			deleteAppResponse = getEndPoints().appDelete(deleteAppRequest, token);
			
			return;
		}
		
		
		AppDeleteRequest deleteAppRequest = new AppDeleteRequest();
		deleteAppRequest.setAppID(appIdValue);
		
		deleteAppResponse = getEndPoints().appDelete(deleteAppRequest, token);
		
		System.out.println(deleteAppResponse.getResponse().getBody().asString());
	}
	
	@When("^User delete App without AppID using Delete App JSON$")
	public void user_delete_App_without_AppID_using_Delete_App_JSON() throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		AppDeleteWithoutAppIdRequest appDeleteWithoutAppIdRequest = new AppDeleteWithoutAppIdRequest();
		
		deleteAppResponse = getEndPoints().appDeleteWithoutAppId(appDeleteWithoutAppIdRequest, token);
	}

	@Then("^User get valid response code \"([^\"]*)\" in Response body of App Delete API$")
	public void user_get_valid_response_code_in_Response_body_of_App_Delete_API(String responseCode) throws Throwable {
		System.out.println("--------------------------------");
		System.out.println(deleteAppResponse.getBody().getStatus());
		Assert.assertTrue(deleteAppResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of App Delete API should have \"([^\"]*)\" value$")
	public void response_body_of_App_Delete_API_should_have_value(String arg1) throws Throwable {
		Assert.assertEquals(deleteAppResponse.getBody().getData().getAppID(), getScenarioContext().getContext(Context.APP_ID));
	}

	@Then("^User get valid response code \"([^\"]*)\" from server of Delete App$")
	public void user_get_valid_response_code_from_server_of_Delete_App(String responseCode) throws Throwable {
		Assert.assertTrue(deleteAppResponse.getStatusCode()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of App Delete API should have \"([^\"]*)\" Error value$")
	public void response_body_of_App_Delete_API_should_have_Error_value(String errorValue) throws Throwable {
		final String APP_ID_KEY		= "\"AppID\" is required";
		final String APP_ID_EMPTY	= "\"AppID\" is not allowed to be empty";
		final String NULL_APP_ID	= "\"AppID\" must be a string";
		
		String error_msg = null;
		
		if(errorValue.equalsIgnoreCase("AppIDKey")) {
			error_msg = APP_ID_KEY;
		}else if(errorValue.equalsIgnoreCase("EmptyAppID")) {
			error_msg = APP_ID_EMPTY;
		}else if(errorValue.equalsIgnoreCase("NullAppID") || errorValue.equalsIgnoreCase("NumberAppID")) {
			error_msg = NULL_APP_ID;
		}
		
		Assert.assertEquals(deleteAppResponse.getBody().getError(), error_msg);
	}

	@Then("^Response body of App Delete API should have \"([^\"]*)\" Message value$")
	public void response_body_of_App_Delete_API_should_have_Message_value(String messageValue) throws Throwable {
		final String APP_ID_SPECIAL_CHARACTER_MSG 		= "App not found to delete";
		final String APP_ID_SPECIAL_CHARACTER_I18MSG 	= "app_not_found_to_delete";
		
		String error_msg = null;
		String error_i18msg = null;
		
		if(messageValue.equalsIgnoreCase("SpecialCharacterAppID")) {
			error_msg = APP_ID_SPECIAL_CHARACTER_MSG;
			error_i18msg = APP_ID_SPECIAL_CHARACTER_I18MSG;
		}else if(messageValue.equalsIgnoreCase("IncorrectAppId")) {
			error_msg = APP_ID_SPECIAL_CHARACTER_MSG;
			error_i18msg = APP_ID_SPECIAL_CHARACTER_I18MSG;
		}
		
		Assert.assertEquals(deleteAppResponse.getBody().getMessage(), error_msg);
		Assert.assertEquals(deleteAppResponse.getBody().getI18n_msg(), error_i18msg);
	}

	@Given("Delete Created App")
	public void delete_Created_App() {
		String token = getScenarioContext().getContext(Context.Token).toString();
		AppDeleteRequest deleteAppRequest = new AppDeleteRequest();
		deleteAppRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
		
		deleteAppResponse = getEndPoints().appDelete(deleteAppRequest, token);
		
	    Assert.assertTrue(deleteAppResponse.getStatusCode()==200);
	    
	    System.out.println("AppID deleted from User Account:"+getScenarioContext().getContext(Context.APP_ID).toString());
	}
}
