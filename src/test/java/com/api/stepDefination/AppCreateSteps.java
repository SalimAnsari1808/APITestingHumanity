package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.App.AppCreateNumberDomainDescriptionRequest;
import com.api.modelRequest.App.AppCreateNumberDomainNameRequest;
import com.api.modelRequest.App.AppCreateNumberDomainUrlRequest;
import com.api.modelRequest.App.AppCreateRequest;
import com.api.modelRequest.App.AppCreateWithoutDomainDescriptionRequest;
import com.api.modelRequest.App.AppCreateWithoutDomainNameRequest;
import com.api.modelRequest.App.AppCreateWithoutDomainUrlRequest;
import com.api.modelResponse.App.AppCreateResponse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AppCreateSteps extends BaseSteps{
	
	private IRestResponse<AppCreateResponse> appCreateResponse;

	public AppCreateSteps(TestContext testContext) {
		super(testContext);
	}
	
	
	@When("^User send DomainURL \"([^\"]*)\" DomainName \"([^\"]*)\", DomainDescription \"([^\"]*)\" using App Create JSON$")
	public void user_send_DomainURL_DomainName_DomainDescription_using_App_Create_JSON(String domainUrl, String domianName, String domainDescription) throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		if(domainUrl.equalsIgnoreCase("NullValue")) {
			domainUrl = null;
		}else if(domianName.equalsIgnoreCase("NullValue")) {
			domianName = null;
		}else if(domainDescription.equalsIgnoreCase("NullValue")) {
			domainDescription = null;
		}else if(domainUrl.equalsIgnoreCase("EmptyValue")) {
			domainUrl = "";
		}else if(domianName.equalsIgnoreCase("EmptyValue")) {
			domianName = "";
		}else if(domainDescription.equalsIgnoreCase("EmptyValue")) {
			domainDescription = "";
		}else if(domainUrl.equalsIgnoreCase("NumberValue")) {
			
			AppCreateNumberDomainUrlRequest appCreateNumberDomainUrlRequest = new AppCreateNumberDomainUrlRequest();
			appCreateNumberDomainUrlRequest.setDomainUrl(123);
			appCreateNumberDomainUrlRequest.setDomainName(domianName);
			appCreateNumberDomainUrlRequest.setDomainDescription(domainDescription);
			
			appCreateResponse = getEndPoints().appCreateNumberDomainUrl(appCreateNumberDomainUrlRequest, token);	
			
			return;
		}else if(domianName.equalsIgnoreCase("NumberValue")) {
			
			AppCreateNumberDomainNameRequest appCreateNumberDomainNameRequest = new AppCreateNumberDomainNameRequest();
			appCreateNumberDomainNameRequest.setDomainUrl(domainUrl);
			appCreateNumberDomainNameRequest.setDomainName(123);
			appCreateNumberDomainNameRequest.setDomainDescription(domainDescription);
			
			appCreateResponse = getEndPoints().appCreateNumberDomainName(appCreateNumberDomainNameRequest, token);	
			
			return;
		}else if(domainDescription.equalsIgnoreCase("NumberValue")) {
			
			AppCreateNumberDomainDescriptionRequest appCreateNumberDomainDescriptionRequest = new AppCreateNumberDomainDescriptionRequest();
			appCreateNumberDomainDescriptionRequest.setDomainUrl(domainUrl);
			appCreateNumberDomainDescriptionRequest.setDomainName(domianName);
			appCreateNumberDomainDescriptionRequest.setDomainDescription(123);
			
			appCreateResponse = getEndPoints().appCreateNumberDomainDescription(appCreateNumberDomainDescriptionRequest, token);	
			
			return;
		}
		
		AppCreateRequest createAppRequest = new AppCreateRequest();
		createAppRequest.setDomainUrl(domainUrl);
		createAppRequest.setDomainName(domianName);
		createAppRequest.setDomainDescription(domainDescription);
		
		
		getScenarioContext().setContext(Context.DOMAIN_URL, domainUrl);
		getScenarioContext().setContext(Context.DOMAIN_NAME, domianName);
		getScenarioContext().setContext(Context.DOMAIN_DESCRIPTION, domainDescription);
		
		appCreateResponse = getEndPoints().appCreate(createAppRequest, token);	
		
		System.out.println("Create App Response-->"+ appCreateResponse.getResponse().getBody().asString());
	}
	
	@When("^User send DomainName \"([^\"]*)\", DomainDescription \"([^\"]*)\" using App Create JSON$")
	public void user_send_DomainName_DomainDescription_using_App_Create_JSON(String domianName, String domainDescription) throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		AppCreateWithoutDomainUrlRequest appCreateWithoutDomainUrlRequest = new AppCreateWithoutDomainUrlRequest();
		appCreateWithoutDomainUrlRequest.setDomainName(domianName);
		appCreateWithoutDomainUrlRequest.setDomainDescription(domainDescription);
		
		appCreateResponse = getEndPoints().appCreateWithoutDomainUrl(appCreateWithoutDomainUrlRequest, token);
	}
	
	@When("^User send DomainURL \"([^\"]*)\" and DomainDescription \"([^\"]*)\" using App Create JSON$")
	public void user_send_DomainURL_and_DomainDescription_using_App_Create_JSON(String domainUrl, String domainDescription) throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		AppCreateWithoutDomainNameRequest appCreateWithoutDomainNameRequest = new AppCreateWithoutDomainNameRequest();
		appCreateWithoutDomainNameRequest.setDomainUrl(domainUrl);
		appCreateWithoutDomainNameRequest.setDomainDescription(domainDescription);
		
		appCreateResponse = getEndPoints().appCreateWithoutDomainName(appCreateWithoutDomainNameRequest, token);
	}

	@When("^User send DomainURL \"([^\"]*)\" and DomainName \"([^\"]*)\" using App Create JSON$")
	public void user_send_DomainURL_and_DomainName_using_App_Create_JSON(String domainUrl, String domainName) throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		AppCreateWithoutDomainDescriptionRequest appCreateWithoutDomainDescriptionRequest = new AppCreateWithoutDomainDescriptionRequest();
		appCreateWithoutDomainDescriptionRequest.setDomainUrl(domainUrl);
		appCreateWithoutDomainDescriptionRequest.setDomainName(domainName);
		
		appCreateResponse = getEndPoints().appCreateWithoutDomainDescription(appCreateWithoutDomainDescriptionRequest, token);
	}
	
	@When("^User create new App with Expire Token$")
	public void user_create_new_App_with_Expire_Token() throws Throwable {
		//String token = getScenarioContext().getContext(Context.Token).toString();
		
		String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJBY2NvdW50SUQiOjMzMSwiQWRtaW5JRCI6IjEzXzEyXzIwMjBfMDNfMjhfMjJAc2hyZWVwYXJ0bmVycy5jb20iLCJDb21wYW55SUQiOjMxOSwiQ29tcGFueVJvbGVJRCI6MTAwMiwiU3RhdHVzSUQiOjEwMSwiQ3JlYXRlZERhdGUiOiIyMDIwLTEyLTEyVDIxOjU3OjQ3LjE5OFoiLCJpYXQiOjE2MDc4MTAyNjcsImV4cCI6MTYwNzk4MzA2N30.viiousNHvUMaSz_9sgrXMKRSsKkgaX_t6xkJeaF3CrQ";
		
		AppCreateRequest createAppRequest = new AppCreateRequest();
		createAppRequest.setDomainUrl("https://localhost:8040");
		createAppRequest.setDomainName("AutomationTest");
		createAppRequest.setDomainDescription("App Created using Automation Script");
		
		appCreateResponse = getEndPoints().appCreate(createAppRequest, token);
		
		System.out.println("Error Message-->"+appCreateResponse.getResponse().getBody().asString());
	}
	
	@Then("^User get valid response code \"([^\"]*)\" in Response body of App Create API$")
	public void user_get_valid_response_code_in_Response_body_of_App_Create_API(String responseCode) throws Throwable {
		System.out.println("|"+appCreateResponse.getBody().getStatus()+"|");
		System.out.println("|"+Integer.parseInt(responseCode)+"|");
		Assert.assertTrue(appCreateResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response code \"([^\"]*)\" from server of App Create API$")
	public void user_get_valid_response_code_from_server_of_App_Create_API(String responseCode) throws Throwable {
		System.out.println(appCreateResponse.getStatusCode());
		System.out.println(appCreateResponse.getResponse().getBody().asString());
		Assert.assertTrue(appCreateResponse.getStatusCode()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Create App API should have \"([^\"]*)\" value$")
	public void response_body_of_Create_App_API_should_have_value(String responseValue) throws Throwable {
		if(responseValue.equalsIgnoreCase("ValidValue")) {
			Assert.assertTrue(appCreateResponse.getBody().getData().getApplicationID()!= null);
			Assert.assertTrue(appCreateResponse.getBody().getData().getAppID()!= null);
			Assert.assertTrue(appCreateResponse.getBody().getData().getSecretKey()!= null);
			
			//App create data verification
			//Assert.assertEquals(getScenarioContext().getContext(Context.DOMAIN_URL).toString(), appCreateResponse.getBody().getData().getDomainUrl());
			Assert.assertEquals(getScenarioContext().getContext(Context.DOMAIN_NAME).toString(), appCreateResponse.getBody().getData().getDomainName());
			Assert.assertEquals(getScenarioContext().getContext(Context.DOMAIN_DESCRIPTION).toString(), appCreateResponse.getBody().getData().getDomainDescription());
	
			Assert.assertTrue(appCreateResponse.getBody().getData().getCompanyID()!= null);
			Assert.assertTrue(appCreateResponse.getBody().getData().getStatusID()!= null);
			
			getScenarioContext().setContext(Context.DOMAIN_URL, appCreateResponse.getBody().getData().getDomainUrl());
			getScenarioContext().setContext(Context.DOMAIN_NAME, appCreateResponse.getBody().getData().getDomainName());
			getScenarioContext().setContext(Context.DOMAIN_DESCRIPTION, appCreateResponse.getBody().getData().getDomainDescription());
		}else if(responseValue.equalsIgnoreCase("DomainNameKey") || responseValue.equalsIgnoreCase("NullDomainName")) {
			Assert.assertTrue(appCreateResponse.getBody().getData().getDomainName()== null);
		}else if(responseValue.equalsIgnoreCase("DomainDescriptionKey") || responseValue.equalsIgnoreCase("NullDomainName")) {
			Assert.assertTrue(appCreateResponse.getBody().getData().getDomainDescription()== null);
		}else if(responseValue.equalsIgnoreCase("NullDomainName")) {
			Assert.assertTrue(appCreateResponse.getBody().getData().getDomainName()== "");
		}else if(responseValue.equalsIgnoreCase("NullDomainDescription")) {
			Assert.assertTrue(appCreateResponse.getBody().getData().getDomainDescription()== null);
		}else {
			Assert.assertTrue(false);
		}
	}

	@Then("^Response body of Create App API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Create_App_API_should_have_Error_value(String errorValue) throws Throwable {
		final String DOMAIN_URL_KEY 			= "\"DomainUrl\" is required";
		final String DOMAIN_NAME_KEY 			= "\"DomainName\" is required";
		final String DOMAIN_NAME_NULL			= "\"DomainName\" must be a string";
		final String DOMAIN_DESCRIPTION_KEY 	= "\"DomainDescription\" is required";
		final String DOMIAN_URL_EMPTY 			= "\"DomainUrl\" is not allowed to be empty";
		final String DOMAIN_URL_NULL 			= "\"DomainUrl\" must be a string";
		final String DOMAIN_URL_NUMBER			= "\"DomainUrl\" must be a string";
		final String DOMAIN_NAME_NUMBER			= "\"DomainName\" must be a string";
		final String DOMAIN_DESCRIPTION_NUMBER	= "\"DomainDescription\" must be a string";
		final String DOMIAN_NAME_EMPTY 			= "\"DomainName\" is not allowed to be empty";
		
		String error_msg = null;
		
		if(errorValue.equalsIgnoreCase("DomainUrlKey")) {
			error_msg = DOMAIN_URL_KEY;
		}else if(errorValue.equalsIgnoreCase("DomainNameKey")) {
			error_msg = DOMAIN_NAME_KEY;
		}else if(errorValue.equalsIgnoreCase("DomainDescriptionKey")) {
			error_msg = DOMAIN_DESCRIPTION_KEY;
		}else if(errorValue.equalsIgnoreCase("EmptyDomainUrl")) {
			error_msg = DOMIAN_URL_EMPTY;
		}else if(errorValue.equalsIgnoreCase("NullDomainUrl")) {
			error_msg = DOMAIN_URL_NULL;
		}else if(errorValue.equalsIgnoreCase("NumberDomainUrl")) {
			error_msg = DOMAIN_URL_NUMBER;
		}else if(errorValue.equalsIgnoreCase("NumberDomainName")) {
			error_msg = DOMAIN_NAME_NUMBER;
		}else if(errorValue.equalsIgnoreCase("NumberDomainDescription")) {
			error_msg = DOMAIN_DESCRIPTION_NUMBER;
		}else if(errorValue.equalsIgnoreCase("NullDomainName")) {
			error_msg = DOMAIN_NAME_NULL;
		}else if(errorValue.equalsIgnoreCase("EmptyDomainName")) {
			error_msg = DOMIAN_NAME_EMPTY;
		}
		
		else {
			Assert.assertTrue(false);
		}
		
		System.out.println("App Create Error-->"+appCreateResponse.getBody().getError());
		Assert.assertEquals(error_msg, appCreateResponse.getBody().getError());
	}

	@Then("^Response body of Create App API should have \"([^\"]*)\" Message value$")
	public void response_body_of_Create_App_API_should_have_Message_value(String errorMessage) throws Throwable {
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
		}else {
			Assert.assertTrue(false);
		}
		
		Assert.assertEquals(error_msg, appCreateResponse.getBody().getMessage());
		
		if(!errorMessage.equalsIgnoreCase("TokenExpire")) {
			Assert.assertEquals(error_i18msg, appCreateResponse.getBody().getI18n_msg());
		}
	}

	@When("User Create an App using App create JSON")
	public void user_Create_an_App_using_App_create_JSON() {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		AppCreateRequest createAppRequest = new AppCreateRequest();
		createAppRequest.setDomainUrl("https://localhost:8040");
		createAppRequest.setDomainName("AutomationTest");
		createAppRequest.setDomainDescription("App Created using Automation Script");
		
		appCreateResponse = getEndPoints().appCreate(createAppRequest, token);
		
		//store App ID of created App
		getScenarioContext().setContext(Context.APP_ID, appCreateResponse.getBody().getData().getAppID());
	}
	
	@Given("^User Create an new From App using App create JSON$")
	public void user_Create_an_new_From_App_using_App_create_JSON() throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		AppCreateRequest createAppRequest = new AppCreateRequest();
		createAppRequest.setDomainUrl("https://localhost:8080");
		createAppRequest.setDomainName("From App AutomationTest");
		createAppRequest.setDomainDescription("From App Created using Automation Script");
		
		appCreateResponse = getEndPoints().appCreate(createAppRequest, token);
		
		//store App ID of created App
		getScenarioContext().setContext(Context.FROM_APP_ID, appCreateResponse.getBody().getData().getAppID());
	}

	@Given("^User Create an new To App using App create JSON$")
	public void user_Create_an_new_To_App_using_App_create_JSON() throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		AppCreateRequest createAppRequest = new AppCreateRequest();
		createAppRequest.setDomainUrl("https://localhost:4040");
		createAppRequest.setDomainName("To App AutomationTest");
		createAppRequest.setDomainDescription("To App Created using Automation Script");
		
		appCreateResponse = getEndPoints().appCreate(createAppRequest, token);
		
		//store App ID of created App
		getScenarioContext().setContext(Context.TO_APP_ID, appCreateResponse.getBody().getData().getAppID());
	}
	
	
//	
//	@Given("Create New App")
//	public void create_New_App() {
//		String token = getScenarioContext().getContext(Context.Token).toString();
//		AppCreateRequest createAppRequest = new AppCreateRequest();
//		createAppRequest.setDomainUrl("http://localhost:8001");
//		createAppRequest.setDomainName("Automation Testing");
//		createAppRequest.setDomainDescription("Sample App created by Automation");
//		
//		appCreateResponse = getEndPoints().appCreate(createAppRequest, token);
//		
//		System.out.println(appCreateResponse.getResponse().asString());
//		System.out.println(appCreateResponse.getBody());
//		System.out.println(appCreateResponse.getException());
//		
//		System.out.println("New App is created with AppID:"+appCreateResponse.getBody().getData().getAppID());
//		
//		getScenarioContext().setContext(Context.APP_ID, appCreateResponse.getBody().getData().getAppID());
//
//	}

}
