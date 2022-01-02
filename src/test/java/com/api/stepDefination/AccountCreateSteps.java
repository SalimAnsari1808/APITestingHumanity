package com.api.stepDefination;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Account.AccountCreateRequest;
import com.api.modelRequest.Account.AccountCreateWithoutAdminIdRequest;
import com.api.modelRequest.Account.AccountCreateWithoutLanguageRequest;
import com.api.modelRequest.Account.AccountCreateWithoutPasswordRequest;
import com.api.modelResponse.Account.AccountCreateResponse;
import com.api.utilities.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.*;

public class AccountCreateSteps extends BaseSteps{
	
	private IRestResponse<AccountCreateResponse> createAccountResponse;

	public AccountCreateSteps(TestContext testContext) {
		super(testContext);
	}
	
	@Given("^User connect to Create Account URL$")
	public void user_connect_to_Create_Account_URL() throws Throwable {
		//do Nothing
	}
	
	@When("^User enter AdminId \"([^\"]*)\", Password \"([^\"]*)\", Language \"([^\"]*)\" and requiredToken \"([^\"]*)\" using Create Account JSON$")
	public void user_enter_AdminId_Password_Language_and_requiredToken_using_Create_Account_JSON(String userName, String password, String language, String requireToken) throws Throwable {
		//assign valid value 
		if(userName.equalsIgnoreCase("ValidValue")) {
			userName = TestUtil.randomValidEmail();
		}else if(userName.equalsIgnoreCase("Number")) {
			userName = userName + TestUtil.randomValidEmail().replace("_", "");
		}else if(userName.equalsIgnoreCase("EmptyValue")) {
			userName = "";
		}else if(userName.equalsIgnoreCase("Alphabet")) {
			userName = TestUtil.alphabaticCharacterEmail();
		}
		
		//assign valid password
		if(password.equalsIgnoreCase("ValidValue")) {
			password = "Test@123";
		}else if(password.equalsIgnoreCase("EmptyValue")) {
			password = "";
		}
		
		//
		if(language.equalsIgnoreCase("EmptyValue")) {
			language = "";
		}
		
		getScenarioContext().setContext(Context.ADMIN_USERNAME, userName);
		getScenarioContext().setContext(Context.ADMIN_PASSWORD, password);
		
		System.out.println(userName);
		
		//create create account request API payload
		AccountCreateRequest createAccountRequest = new AccountCreateRequest();
		createAccountRequest.setAdminID(userName);
		createAccountRequest.setPassword(password);
		createAccountRequest.setRequireToken(Boolean.parseBoolean(requireToken));
		createAccountRequest.setLanguage(language.toString());
		
		//send create account API request
		createAccountResponse = getEndPoints().createAccount(createAccountRequest);
	}
	
	@When("^User enter Password \"([^\"]*)\", Language \"([^\"]*)\" and requiredToken \"([^\"]*)\" using Create Account JSON$")
	public void user_enter_Password_Language_and_requiredToken_using_Create_Account_JSON(String password, String language, String requireToken) throws Throwable {
	
		//assign valid password
		if(password.equalsIgnoreCase("ValidValue")) {
			password = "Test@123";
		}
		
		getScenarioContext().setContext(Context.ADMIN_USERNAME, TestUtil.randomValidEmail());
		getScenarioContext().setContext(Context.ADMIN_PASSWORD, password);
		
		AccountCreateWithoutAdminIdRequest accountCreateWithoutAdminIdRequest = new AccountCreateWithoutAdminIdRequest();
		accountCreateWithoutAdminIdRequest.setPassword(password);
		accountCreateWithoutAdminIdRequest.setRequireToken(Boolean.parseBoolean(requireToken));
		accountCreateWithoutAdminIdRequest.setLanguage(language.toString());
		
		//send create account API request
		createAccountResponse = getEndPoints().createAccountWithoutAdminKey(accountCreateWithoutAdminIdRequest);
	}
	
	
	@When("^User enter AdminId \"([^\"]*)\", Language \"([^\"]*)\" and requiredToken \"([^\"]*)\" using Create Account JSON$")
	public void user_enter_AdminId_Language_and_requiredToken_using_Create_Account_JSON(String userName, String language, String requireToken) throws Throwable {
		if(userName.equalsIgnoreCase("ValidValue")) {
			userName = TestUtil.randomValidEmail();
		}
		
		getScenarioContext().setContext(Context.ADMIN_USERNAME, userName);
		getScenarioContext().setContext(Context.ADMIN_PASSWORD, "");
		
		AccountCreateWithoutPasswordRequest accountCreateWithoutPasswordRequest = new AccountCreateWithoutPasswordRequest();
		accountCreateWithoutPasswordRequest.setAdminID(userName);
		accountCreateWithoutPasswordRequest.setRequireToken(Boolean.parseBoolean(requireToken));
		accountCreateWithoutPasswordRequest.setLanguage(language.toString());
		
		//send create account API request
		createAccountResponse = getEndPoints().createAccountWithoutPasswordKey(accountCreateWithoutPasswordRequest);
	}
	
	
	@When("^User enter AdminId \"([^\"]*)\", Password \"([^\"]*)\" and requiredToken \"([^\"]*)\" using Create Account JSON$")
	public void user_enter_AdminId_Password_and_requiredToken_using_Create_Account_JSON(String userName, String password, String requireToken) throws Throwable {
		//assign valid value 
		if(userName.equalsIgnoreCase("ValidValue")) {
			userName = TestUtil.randomValidEmail();
		}
		
		//assign valid password
		if(password.equalsIgnoreCase("ValidValue")) {
			password = "Test@123";
		}
		
		getScenarioContext().setContext(Context.ADMIN_USERNAME, userName);
		getScenarioContext().setContext(Context.ADMIN_PASSWORD, password);
		
		AccountCreateWithoutLanguageRequest accountCreateWithoutLanguageRequest = new AccountCreateWithoutLanguageRequest();
		accountCreateWithoutLanguageRequest.setAdminID(userName);
		accountCreateWithoutLanguageRequest.setPassword(password);
		accountCreateWithoutLanguageRequest.setRequireToken(Boolean.parseBoolean(requireToken));
		
		//send create account API request
		createAccountResponse = getEndPoints().createAccountWithoutLanguageKey(accountCreateWithoutLanguageRequest);
	}
		
	@Then("^User get valid response \"([^\"]*)\" in Response body of Create Account API$")
	public void user_get_valid_response_in_Response_body_of_Create_Account_API(String responseCode) throws Throwable {
		System.out.println("Response Code From Body-->"+createAccountResponse.getBody().getStatus());
		
		System.out.println("Response Code-->"+createAccountResponse.getResponse().asString());
		//check create account response code 
		Assert.assertTrue(createAccountResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Create Account API$")
	public void user_get_valid_response_from_server_for_Create_Account_API(String responseCode) throws Throwable {
		System.out.println("Response Code From Server-->"+createAccountResponse.getStatusCode());
		//check create account response code 
		Assert.assertTrue(createAccountResponse.getStatusCode()==Integer.parseInt(responseCode));
	}
		
	@Then("^Response body of Create Account API should have \"([^\"]*)\" Token value$")
	public void response_body_of_Create_Account_API_should_have_Token_value(String tokenValue) throws Throwable {
		if(tokenValue.equalsIgnoreCase("NotContain")) {
			//check response body not contain token value
			Assert.assertTrue(createAccountResponse.getBody().getData().getToken()==null);
			
			//check response body contain AccountID, AdminID, StatusID, CompanyRoleID, CompanyID, Status
			Assert.assertTrue(createAccountResponse.getBody().getData().getAccountID()!=null);
			Assert.assertTrue(createAccountResponse.getBody().getData().getAdminID()  !=null);
			Assert.assertTrue(createAccountResponse.getBody().getData().getStatusID() !=null);
			Assert.assertTrue(createAccountResponse.getBody().getData().getCompanyRoleID() !=null);
			Assert.assertTrue(createAccountResponse.getBody().getData().getCompanyID() !=null);
			//Assert.assertTrue(createAccountResponse.getBody().getData().getStatus() !=null);
			
		}else {
			//check response body contain token value
			Assert.assertTrue(createAccountResponse.getBody().getData().getToken()!=null);
			Assert.assertTrue(createAccountResponse.getBody().getData().getExpiryTime()!=null);
			
		}
	}
	
	@Then("^Response body of Create Account API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Create_Account_API_should_have_Error_value(String errorMessage) throws Throwable {
		//String password = getScenarioContext().getContext(Context.ADMIN_PASSWORD).toString();
		
		final String ADMIN_KEY_ERROR 		= "\"AdminID\" is required";
		final String PASSWORD_KEY_ERROR 	= "\"Password\" is required";
		final String LANGUAGE_KEY_ERROR 	= "\"Language\" is required";
		final String ADMIN_VALUE_ERROR 		= "\"AdminID\" is not allowed to be empty";
		final String PASSWORD_VALUE_ERROR 	= "\"Password\" is not allowed to be empty";
		final String LANGUAGE_VALUE_ERROR 	= "\"Language\" is not allowed to be empty";
		final String ADMIN_INVALID_ERROR	= "\"AdminID\" must be a valid email";
		final String PASSWORD_INVALID1_ERROR = "\"Password\" length must be at least 8 characters long";
		final String PASSWORD_INVALID2_ERROR = "Minimum eight characters, at least one capital letter and one number are required";
		final String LANGUAGE_INVALID_ERROR = "";
		String error_msg = null;
		
		System.out.println("Input Argument-->"+errorMessage);
		
		if(errorMessage.equalsIgnoreCase("AdminIDKey")) {
			error_msg = ADMIN_KEY_ERROR;
		}else if(errorMessage.equalsIgnoreCase("PasswordKey")) {
			error_msg = PASSWORD_KEY_ERROR;
		}else if(errorMessage.equalsIgnoreCase("LanguageKey")) {
			error_msg = LANGUAGE_KEY_ERROR;
		}else if(errorMessage.equalsIgnoreCase("AdminIDValue")) {
			error_msg = ADMIN_VALUE_ERROR;
		}else if(errorMessage.equalsIgnoreCase("PasswordValue")) {
			error_msg = PASSWORD_VALUE_ERROR;
		}else if(errorMessage.equalsIgnoreCase("LanguageValue")) {
			error_msg = LANGUAGE_VALUE_ERROR;
		}else if(errorMessage.equalsIgnoreCase("InvalidAdminID")) {
			error_msg = ADMIN_INVALID_ERROR;
		}else if(errorMessage.equalsIgnoreCase("InvalidPassword1")) {
			error_msg = PASSWORD_INVALID1_ERROR;
		}else if(errorMessage.equalsIgnoreCase("InvalidPassword2")) {
			error_msg = PASSWORD_INVALID2_ERROR;
		}else if(errorMessage.equalsIgnoreCase("InvalidLanguage")) {
			error_msg = LANGUAGE_INVALID_ERROR;
		}
		
		System.out.println("Expeted Valuer-->"+createAccountResponse.getBody().getError());
		System.out.println("Actual value-->"+error_msg);
		Assert.assertEquals(createAccountResponse.getBody().getError(), error_msg);
	}
	
	
	@Then("^Response body of Create Account API should have \"([^\"]*)\" Message value$")
	public void response_body_of_Create_Account_API_should_have_Message_value(String messageValue) throws Throwable {
		
		final String UNVERIFIED_ACCOUNT_MSG 	= "You have already an account with us. Your account status is pending.";
		final String UNVERIFIED_ACCOUNT_I18MSG 	= "api_account_status_pending";
		
		final String VERIFIED_ACCOUNT_MSG 		= "Account already exists.";
		final String VERIFIED_ACCOUNT_I18MSG	= "api_account_duplicate";
		
		System.out.println(createAccountResponse.getBody().getMessage());
		System.out.println(createAccountResponse.getBody().getI18n_msg());
		
		if(messageValue.equalsIgnoreCase("UnverifiedAccount")) {
			Assert.assertEquals(createAccountResponse.getBody().getMessage(), UNVERIFIED_ACCOUNT_MSG);
			Assert.assertEquals(createAccountResponse.getBody().getI18n_msg(), UNVERIFIED_ACCOUNT_I18MSG);
		}else {
			Assert.assertEquals(createAccountResponse.getBody().getMessage(), VERIFIED_ACCOUNT_MSG);
			Assert.assertEquals(createAccountResponse.getBody().getI18n_msg(), VERIFIED_ACCOUNT_I18MSG);
		}
	}
	
	@Given("User create new valid account")
	public void user_create_new_valid_account() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	   getScenarioContext().setContext(Context.ADMIN_USERNAME, TestUtil.randomValidEmail());
	   getScenarioContext().setContext(Context.ADMIN_PASSWORD, "Test@123");
		
		AccountCreateRequest createAccountRequest = new AccountCreateRequest();
		createAccountRequest.setAdminID(getScenarioContext().getContext(Context.ADMIN_USERNAME).toString());
		createAccountRequest.setPassword(getScenarioContext().getContext(Context.ADMIN_PASSWORD).toString());
		createAccountRequest.setRequireToken(false);
		createAccountRequest.setLanguage("en");
		
		//send create account API request
		createAccountResponse = getEndPoints().createAccount(createAccountRequest);
		
		//check create account response code 
		Assert.assertTrue(createAccountResponse.getBody().getStatus()==200);
		
		System.out.println("Account Created using API");
		System.out.println("UserName:" + getScenarioContext().getContext(Context.ADMIN_USERNAME).toString());
		System.out.println("Password:" + getScenarioContext().getContext(Context.ADMIN_PASSWORD).toString());
		
	}
	
//	@Given("Valid User Account with App added")
//	public void valid_User_Account_with_App_added() {
//		
//		Assert.assertTrue(getScenarioContext().isContains(Context.ADMIN_USERNAME));
//		
//		Assert.assertTrue(getScenarioContext().isContains(Context.APP_ID));
//		
//	}

}
