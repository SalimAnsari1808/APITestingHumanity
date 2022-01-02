package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.App.AppEditExtraKeyRequest;
import com.api.modelRequest.App.AppEditNumberAppIDRequest;
import com.api.modelRequest.App.AppEditNumberDomainDescriptionRequest;
import com.api.modelRequest.App.AppEditNumberDomainNameRequest;
import com.api.modelRequest.App.AppEditNumberDomainUrlRequest;
import com.api.modelRequest.App.AppEditRequest;
import com.api.modelRequest.App.AppEditWithoutAppIDRequest;
import com.api.modelRequest.App.AppEditWithoutDomainUrlRequest;
import com.api.modelResponse.App.AppEditResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AppEditSteps extends BaseSteps{
	
	private IRestResponse<AppEditResponse> appEditResponse;

	public AppEditSteps(TestContext testContext) {
		super(testContext);
	}
		
	@When("^User send AppId \"([^\"]*)\" DomainURL \"([^\"]*)\" DomainName \"([^\"]*)\" DomainDescription \"([^\"]*)\" using App Edit JSON$")
	public void user_send_AppId_DomainURL_DomainName_DomainDescription_using_App_Edit_JSON(String appID, String domainUrl, String domianName, String domainDescription) throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		if(appID.equalsIgnoreCase("PreCreated")) {
			appID = getScenarioContext().getContext(Context.APP_ID).toString();
		}
		
		if(domainUrl.equalsIgnoreCase("NullValue")) {
			domainUrl = null;
		}else if(domianName.equalsIgnoreCase("NullValue")) {
			domianName = null;
		}else if(domainDescription.equalsIgnoreCase("NullValue")) {
			domainDescription = null;
		}else if(appID.equalsIgnoreCase("NullValue")) {
			appID = null;
		}else if(domainUrl.equalsIgnoreCase("EmptyValue")) {
			domainUrl = "";
		}else if(domianName.equalsIgnoreCase("EmptyValue")) {
			domianName = "";
		}else if(domainDescription.equalsIgnoreCase("EmptyValue")) {
			domainDescription = "";
		}else if(appID.equalsIgnoreCase("EmptyValue")) {
			appID = "";
		}else if(domainUrl.equalsIgnoreCase("NumberValue")) {
			AppEditNumberDomainUrlRequest appEditNumberDomainUrlRequest = new AppEditNumberDomainUrlRequest();
			appEditNumberDomainUrlRequest.setAppId(appID);
			appEditNumberDomainUrlRequest.setDomainUrl(123);
			appEditNumberDomainUrlRequest.setDomainName(domianName);
			appEditNumberDomainUrlRequest.setDomainDescription(domainDescription);
			
			appEditResponse = getEndPoints().appEditNumberDomainUrl(appEditNumberDomainUrlRequest, token);
			
			return;
		}else if(domianName.equalsIgnoreCase("NumberValue")) {
			
			AppEditNumberDomainNameRequest appEditNumberDomainNameRequest = new AppEditNumberDomainNameRequest();
			appEditNumberDomainNameRequest.setAppId(appID);
			appEditNumberDomainNameRequest.setDomainUrl(domainUrl);
			appEditNumberDomainNameRequest.setDomainName(123);
			appEditNumberDomainNameRequest.setDomainDescription(domainDescription);
			
			appEditResponse = getEndPoints().appEditNumberDomainName(appEditNumberDomainNameRequest, token);	
			
			return;
		}else if(domainDescription.equalsIgnoreCase("NumberValue")) {
			
			AppEditNumberDomainDescriptionRequest appEditNumberDomainDescriptionRequest = new AppEditNumberDomainDescriptionRequest();
			appEditNumberDomainDescriptionRequest.setAppId(appID);
			appEditNumberDomainDescriptionRequest.setDomainUrl(domainUrl);
			appEditNumberDomainDescriptionRequest.setDomainName(domianName);
			appEditNumberDomainDescriptionRequest.setDomainDescription(123);
			
			appEditResponse = getEndPoints().appEditNumberDomainDescription(appEditNumberDomainDescriptionRequest, token);	
			
			return;
		}else if(appID.equalsIgnoreCase("NumberValue")) {
			AppEditNumberAppIDRequest appEditNumberAppIDRequest = new AppEditNumberAppIDRequest();
			appEditNumberAppIDRequest.setAppID(123);
			appEditNumberAppIDRequest.setDomainUrl(domainUrl);
			appEditNumberAppIDRequest.setDomainName(domianName);
			appEditNumberAppIDRequest.setDomainDescription(domainDescription);
		
			appEditResponse = getEndPoints().appEditNumberAppID(appEditNumberAppIDRequest, token);	
			
			return;
		}
		
		AppEditRequest editAppRequest = new AppEditRequest();
		editAppRequest.setAppID(appID);
		editAppRequest.setDomainUrl(domainUrl);
		editAppRequest.setDomainName(domianName);
		editAppRequest.setDomainDescription(domainDescription);
		
		getScenarioContext().setContext(Context.APP_ID, appID);
		getScenarioContext().setContext(Context.DOMAIN_URL, domainUrl);
		getScenarioContext().setContext(Context.DOMAIN_NAME, domianName);
		getScenarioContext().setContext(Context.DOMAIN_DESCRIPTION, domainDescription);
		
		appEditResponse = getEndPoints().appEdit(editAppRequest, token);	
		
		System.out.println("Edit App Response-->"+ appEditResponse.getResponse().getBody().asString());
	    
	}

	@Then("^User get valid response code \"([^\"]*)\" in Response body of App Edit API$")
	public void user_get_valid_response_code_in_Response_body_of_App_Edit_API(String responseCode) throws Throwable {
		Assert.assertTrue(appEditResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Edit App API should have \"([^\"]*)\" value$")
	public void response_body_of_Edit_App_API_should_have_value(String responseValue) throws Throwable {
	    
		if(responseValue.equalsIgnoreCase("ValidValue")) {
			Assert.assertTrue(appEditResponse.getBody().getData().getApplicationID()!= null);
			Assert.assertTrue(appEditResponse.getBody().getData().getAppID()!= null);
			Assert.assertTrue(appEditResponse.getBody().getData().getSecretKey()!= null);
			
			//App create data verification
			//Assert.assertEquals(getScenarioContext().getContext(Context.DOMAIN_URL).toString(), appCreateResponse.getBody().getData().getDomainUrl());
			Assert.assertEquals(getScenarioContext().getContext(Context.DOMAIN_NAME).toString(), appEditResponse.getBody().getData().getDomainName());
			Assert.assertEquals(getScenarioContext().getContext(Context.DOMAIN_DESCRIPTION).toString(), appEditResponse.getBody().getData().getDomainDescription());
	
			Assert.assertTrue(appEditResponse.getBody().getData().getCompanyID()!= null);
			Assert.assertTrue(appEditResponse.getBody().getData().getStatusID()!= null);
			
			getScenarioContext().setContext(Context.DOMAIN_URL, appEditResponse.getBody().getData().getDomainUrl());
			getScenarioContext().setContext(Context.DOMAIN_NAME, appEditResponse.getBody().getData().getDomainName());
			getScenarioContext().setContext(Context.DOMAIN_DESCRIPTION, appEditResponse.getBody().getData().getDomainDescription());
		}else if(responseValue.equalsIgnoreCase("DomainNameKey") || responseValue.equalsIgnoreCase("NullDomainName")) {
			Assert.assertTrue(appEditResponse.getBody().getData().getDomainName()== null);
		}else if(responseValue.equalsIgnoreCase("DomainDescriptionKey") || responseValue.equalsIgnoreCase("NullDomainName")) {
			Assert.assertTrue(appEditResponse.getBody().getData().getDomainDescription()== null);
		}else if(responseValue.equalsIgnoreCase("NullDomainName")) {
			Assert.assertTrue(appEditResponse.getBody().getData().getDomainName()== "");
		}else if(responseValue.equalsIgnoreCase("NullDomainDescription")) {
			Assert.assertTrue(appEditResponse.getBody().getData().getDomainDescription()== null);
		}else {
			Assert.assertTrue(false);
		}
		
	}
	
	@When("^User send DomainURL \"([^\"]*)\" DomainName \"([^\"]*)\", DomainDescription \"([^\"]*)\" using App Edit JSON$")
	public void user_send_DomainURL_DomainName_DomainDescription_using_App_Edit_JSON(String domainUrl, String domianName, String domainDescription) throws Throwable {
	    
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		AppEditWithoutAppIDRequest appEditWithoutAppIDRequest = new AppEditWithoutAppIDRequest();
		appEditWithoutAppIDRequest.setDomainUrl(domainUrl);
		appEditWithoutAppIDRequest.setDomainName(domianName);
		appEditWithoutAppIDRequest.setDomainDescription(domainDescription);
		
		appEditResponse = getEndPoints().appEditWithoutAppID(appEditWithoutAppIDRequest, token);
		
	}

	@Then("^User get valid response code \"([^\"]*)\" from server of App Edit API$")
	public void user_get_valid_response_code_from_server_of_App_Edit_API(String responseCode) throws Throwable {
		System.out.println(appEditResponse.getStatusCode());
		System.out.println(appEditResponse.getResponse().getBody().asString());
		Assert.assertTrue(appEditResponse.getStatusCode()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Edit App API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Edit_App_API_should_have_Error_value(String errorValue) throws Throwable {
	 
		final String APP_ID_KEY					= "\"AppID\" is required";
		final String DOMAIN_URL_KEY 			= "\"DomainUrl\" is required";
		final String APP_ID_EMPTY				= "\"AppID\" is not allowed to be empty";
		final String DOMIAN_URL_EMPTY 			= "\"DomainUrl\" is not allowed to be empty";
		final String APP_ID_NULL				= "\"AppID\" must be a string";
		final String DOMAIN_URL_NULL 			= "\"DomainUrl\" must be a string";
		final String DOMAIN_URL_NUMBER			= "\"DomainUrl\" must be a string";
		final String APP_ID_NUMBER				= "\"AppID\" must be a string";
		final String EXTRA_KEY					= "\"XyzKey\" is not allowed";
		
		String error_msg = null;
		
		if(errorValue.equalsIgnoreCase("DomainUrlKey")) {
			error_msg = DOMAIN_URL_KEY;
		}else if(errorValue.equalsIgnoreCase("AppIdKey")) {
			error_msg = APP_ID_KEY;
		}else if(errorValue.equalsIgnoreCase("AppIdEmpty")) {
			error_msg = APP_ID_EMPTY;
		}else if(errorValue.equalsIgnoreCase("DomainUrlEmpty")) {
			error_msg = DOMIAN_URL_EMPTY;
		}else if(errorValue.equalsIgnoreCase("NullDomainUrl")) {
			error_msg = DOMAIN_URL_NULL;
		}else if(errorValue.equalsIgnoreCase("NumberDomainUrl")) {
			error_msg = DOMAIN_URL_NUMBER;
		}else if(errorValue.equalsIgnoreCase("NullAppId")) {
			error_msg = APP_ID_NULL;
		}else if(errorValue.equalsIgnoreCase("NumberAppId")) {
			error_msg = APP_ID_NUMBER;
		}else if(errorValue.equalsIgnoreCase("ExtraKey")){
			error_msg = EXTRA_KEY;
		}else {
			Assert.assertTrue(false);
		}
		
		System.out.println("|"+error_msg+"|");
		System.out.println("|"+appEditResponse.getBody().getError()+"|");
		Assert.assertEquals(error_msg, appEditResponse.getBody().getError());
		
	}
	
	@When("^User send AppId \"([^\"]*)\" DomainName \"([^\"]*)\", DomainDescription \"([^\"]*)\" using App Edit JSON$")
	public void user_send_AppId_DomainName_DomainDescription_using_App_Edit_JSON(String appId, String domianName, String domainDescription) throws Throwable {
	    
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		AppEditWithoutDomainUrlRequest appEditWithoutDomainUrlRequest = new AppEditWithoutDomainUrlRequest();
		appEditWithoutDomainUrlRequest.setAppID(appId);
		appEditWithoutDomainUrlRequest.setDomainName(domianName);
		appEditWithoutDomainUrlRequest.setDomainDescription(domainDescription);
		
		appEditResponse = getEndPoints().appEditWithoutDomainUrl(appEditWithoutDomainUrlRequest, token);
		
	}
	
	@Then("^Response body of Edit App API should have \"([^\"]*)\" Message value$")
	public void response_body_of_Edit_App_API_should_have_Message_value(String errorMessage) throws Throwable {
		//"message":"DomainUrl already exist","i18n_msg":"domain_url_already_exist","status":400
		final String DUPLICATE_URL_MSG 		= "DomainUrl already exist";
		final String DUPLICATE_URL_I18MSG	= "domain_url_already_exist";
		final String TOKEN_EXPIRE_MSG		= "Token was Expired";
		final String TOKEN_EXPIRE_I18MSG	= "domain_url_already_exist";
		
		String error_msg = null;
		String error_i18msg = null;
		
		if(errorMessage.equalsIgnoreCase("DuplicateDomainUrl")) {
			error_msg 	 = DUPLICATE_URL_MSG;
			error_i18msg = DUPLICATE_URL_I18MSG;
		}else if(errorMessage.equalsIgnoreCase("TokenExpire")){
			error_msg 	 = TOKEN_EXPIRE_MSG;
			error_i18msg = TOKEN_EXPIRE_I18MSG;		
		}else if(errorMessage.equalsIgnoreCase("DataNull")) {
			
		}else {
			Assert.assertTrue(false);
		}
		
		if(!errorMessage.equalsIgnoreCase("DataNull")) {
			Assert.assertEquals(error_msg, appEditResponse.getBody().getMessage());
			
			if(!errorMessage.equalsIgnoreCase("TokenExpire")) {
				Assert.assertEquals(error_i18msg, appEditResponse.getBody().getI18n_msg());
			}
		}else {
			Assert.assertEquals(null, appEditResponse.getBody().getData());
		}
		
	}
	
	@When("^User Edit App with Expire Token$")
	public void user_Edit_App_with_Expire_Token() throws Throwable {
		
		String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJBY2NvdW50SUQiOjMzMSwiQWRtaW5JRCI6IjEzXzEyXzIwMjBfMDNfMjhfMjJAc2hyZWVwYXJ0bmVycy5jb20iLCJDb21wYW55SUQiOjMxOSwiQ29tcGFueVJvbGVJRCI6MTAwMiwiU3RhdHVzSUQiOjEwMSwiQ3JlYXRlZERhdGUiOiIyMDIwLTEyLTEyVDIxOjU3OjQ3LjE5OFoiLCJpYXQiOjE2MDc4MTAyNjcsImV4cCI6MTYwNzk4MzA2N30.viiousNHvUMaSz_9sgrXMKRSsKkgaX_t6xkJeaF3CrQ";
		
		AppEditRequest editAppRequest = new AppEditRequest();
		editAppRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
		editAppRequest.setDomainUrl("https://localhost:8040");
		editAppRequest.setDomainName("AutomationTest");
		editAppRequest.setDomainDescription("App Created using Automation Script");
		
		appEditResponse = getEndPoints().appEdit(editAppRequest, token);
		
		System.out.println("Error Message-->"+appEditResponse.getResponse().getBody().asString());
	}
	
	@Then("^Response body of Edit App API should contains isHttps value \"([^\"]*)\"\\.$")
	public void response_body_of_Edit_App_API_should_contains_isHttps_value(String isHttpsValue) throws Throwable {
	    boolean isHttpsVal = Boolean.parseBoolean(isHttpsValue);
	    Assert.assertEquals(isHttpsVal, appEditResponse.getBody().getData().getIsHttps());
	}
	
	@When("^User send extra key using App Edit JSON$")
	public void user_send_extra_key_using_App_Edit_JSON() throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
	    AppEditExtraKeyRequest appEditExtraKeyRequest = new AppEditExtraKeyRequest();
	    appEditExtraKeyRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
	    appEditExtraKeyRequest.setDomainUrl("https://localhost:8040");
	    appEditExtraKeyRequest.setDomainName("AutomationTest");
	    appEditExtraKeyRequest.setDomainDescription("App Created using Automation Script");
	    
	    appEditResponse = getEndPoints().appEditExtraKey(appEditExtraKeyRequest, token);
	}
}