package com.api.stepDefination;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelResponse.App.AppListResponse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.*;

public class AppListSteps extends BaseSteps{
	
	private IRestResponse<AppListResponse> appListResponse;

	public AppListSteps(TestContext testContext) {
		super(testContext);
	}
	
	
	@When("User connect to List App API URL")
	public void user_connect_to_List_App_API_URL() {
		// do nothing
	}
	
	@When("^User get App List using App List JSON$")
	public void user_get_App_List_using_App_List_JSON() throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		appListResponse = getEndPoints().listApp(token);
		
		System.out.println(appListResponse.getResponse().getBody().asString());
	}

	@Then("^User get valid response code \"([^\"]*)\" in Response body of List App API$")
	public void user_get_valid_response_code_in_Response_body_of_List_App_API(String responseCode) throws Throwable {
		Assert.assertTrue(appListResponse.getBody().getStatus() == Integer.parseInt(responseCode));
	}

	@Then("^Response body of List App API should have \"([^\"]*)\" value$")
	public void response_body_of_List_App_API_should_have_value(String responseBody) throws Throwable {
		if(responseBody.equalsIgnoreCase("ValidValue")) {
			Assert.assertEquals(appListResponse.getBody().getData().get(0).getAppID(), getScenarioContext().getContext(Context.APP_ID).toString());
		}else {
			
			System.out.println(appListResponse.getBody().getData());
		}
	}

	@Then("^Response body of List App API should have \"([^\"]*)\" Message value$")
	public void response_body_of_List_App_API_should_have_Message_value(String messageValue) throws Throwable {
		final String NO_APP_MSG		= "No apps found";
		final String NO_APP_I18MSG	= "no_apps_found";
		
		String error_msg = null;
		String error_i18msg = null;
		
		if(messageValue.equalsIgnoreCase("NoAppCreated") || messageValue.equalsIgnoreCase("AppDeleted")) {
			error_msg = NO_APP_MSG;
			error_i18msg = NO_APP_I18MSG;
		}else {
			Assert.assertEquals("Hi","Hello");
		}
		
		Assert.assertEquals(appListResponse.getBody().getMessage(),error_msg);
		Assert.assertEquals(appListResponse.getBody().getI18n_msg(),error_i18msg);
	}
	

	@Given("Verify New App created")
	public void verify_New_App_created() {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		appListResponse = getEndPoints().listApp(token);
		
		Assert.assertTrue(appListResponse.getStatusCode() == 200);
		
		System.out.println("Total App added are:"+appListResponse.getBody().getData().size());
		
		int datacount = appListResponse.getBody().getData().size();
		
		//System.out.println("Expected AppID:"+getScenarioContext().getContext(Context.APP_ID).toString());
		
		System.out.println("List of APPID under User Account After adding App:");
		
		for(int count=0; count<datacount; count++) {
			System.out.println(appListResponse.getBody().getData().get(count).getAppID());
		}
	}
	
	@Given("Check App is deleted")
	public void check_App_is_deleted() {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		appListResponse = getEndPoints().listApp(token);
		
		Assert.assertTrue(appListResponse.getStatusCode() == 200);
		
		System.out.println(appListResponse.getResponse());
		System.out.println(appListResponse.getBody());
		System.out.println(appListResponse.getException());
		
		System.out.println("Total App after App Deleteion are:"+appListResponse.getBody().getData().size());
		
		int datacount = appListResponse.getBody().getData().size();
		
		//System.out.println("Expected AppID:"+getScenarioContext().getContext(Context.APP_ID).toString());
		
		System.out.println("List of APPID under User Account After deleting App:");
		
		for(int count=0; count<datacount; count++) {
			System.out.println(appListResponse.getBody().getData().get(count).getAppID());
		}
	}
}
