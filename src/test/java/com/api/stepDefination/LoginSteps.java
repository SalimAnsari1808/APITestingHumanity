package com.api.stepDefination;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Login.LoginRequest;
import com.api.modelRequest.Login.LoginWithoutAdminIdRequest;
import com.api.modelRequest.Login.LoginWithoutPasswordRequest;
import com.api.modelResponse.Login.LoginResponse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.*;


public class LoginSteps extends BaseSteps{
	
	private IRestResponse<LoginResponse> loginResponse;

	public LoginSteps(TestContext testContext) {
		super(testContext);
	}
	
	@Given("Given User connect to Login URL")
	public void given_User_connect_to_Login_URL() {
		//do nothing
	}
	
	@When("^User enter created AdminId and Password using Login JSON$")
	public void user_enter_created_AdminId_and_Password_using_Login_JSON() throws Throwable {
		
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setAdminID(getScenarioContext().getContext(Context.ADMIN_USERNAME).toString());
		loginRequest.setPassword(getScenarioContext().getContext(Context.ADMIN_PASSWORD).toString());

		loginResponse = getEndPoints().loginIn(loginRequest);
	}
	
	@When("^User enter AdminId \"([^\"]*)\" and Password \"([^\"]*)\" using Login JSON in Login API$")
	public void user_enter_AdminId_and_Password_using_Login_JSON_in_Login_API(String username, String password) throws Throwable {
		
		if(username.equalsIgnoreCase("ValidValue")) {
			username = getScenarioContext().getContext(Context.ADMIN_USERNAME).toString();
		}else if(username.equalsIgnoreCase("Number")) {
			//username = username + TestUtil.randomValidEmail().replace("_", "");
			username = getScenarioContext().getContext(Context.ADMIN_USERNAME).toString();
		}else if(username.equalsIgnoreCase("Empty")) {
			username = "";
		}
		
		if(password.equalsIgnoreCase("ValidValue")) {
			password = getScenarioContext().getContext(Context.ADMIN_PASSWORD).toString();
		}else if(password.equalsIgnoreCase("Empty")) {
			password = "";
		}
		
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setAdminID(username);
		loginRequest.setPassword(password);
	
		loginResponse = getEndPoints().loginIn(loginRequest);
	}
	
	@When("^User enter AdminId \"([^\"]*)\" using Login JSON$")
	public void user_enter_AdminId_using_Login_JSON(String username) throws Throwable {
		
		if(username.equalsIgnoreCase("ValidValue")) {
			username = "sample@gmail.com";
		}
		
		LoginWithoutPasswordRequest loginWithoutPasswordRequest = new LoginWithoutPasswordRequest();
		loginWithoutPasswordRequest.setAdminID(username);
		
		loginResponse = getEndPoints().loginInWithoutPassword(loginWithoutPasswordRequest);
	}
	
	@When("^User enter Password \"([^\"]*)\" using Login JSON$")
	public void user_enter_Password_using_Login_JSON(String password) throws Throwable {
		
		if(password.equalsIgnoreCase("ValidValue")) {
			password = "Test@123";
		}
		
		LoginWithoutAdminIdRequest loginWithoutAdminIdRequest = new LoginWithoutAdminIdRequest();
		loginWithoutAdminIdRequest.setPassword(password);
		
		loginResponse = getEndPoints().loginInWithoutAdminId(loginWithoutAdminIdRequest);
	}

	@Then("^User get valid response code \"([^\"]*)\" from server of Login API$")
	public void user_get_valid_response_code_from_server_of_Login_API(String responseCode) throws Throwable {
		//check Login response code 
		Assert.assertTrue(loginResponse.getStatusCode()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response code \"([^\"]*)\" in Response body of Login API$")
	public void user_get_valid_response_code_in_Response_body_of_Login_API(String responseCode) throws Throwable {
		//verify Response body status code
		Assert.assertTrue(loginResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Login API should have \"([^\"]*)\" Token value$")
	public void response_body_of_Login_API_should_have_Token_value(String tokenValue) throws Throwable {
		if(tokenValue.equalsIgnoreCase("NotContain")) {
			//check response body not contain token value
			Assert.assertTrue(loginResponse.getBody().getData().getToken()==null);
			
			//check response body contain AccountID, AdminID, StatusID, CompanyRoleID, CompanyID, Status
			Assert.assertTrue(loginResponse.getBody().getData().getAccountID()!=null);
			//Assert.assertTrue(loginResponse.getBody().getData().getAdminID()  !=null);
			//Assert.assertTrue(loginResponse.getBody().getData().getStatusID() !=null);
			Assert.assertTrue(loginResponse.getBody().getData().getCompanyRoleID() !=null);
			Assert.assertTrue(loginResponse.getBody().getData().getCompanyID() !=null);
			//Assert.assertTrue(createAccountResponse.getBody().getData().getStatus() !=null);
			
		}else {
			//check response body contain token value
			Assert.assertTrue(loginResponse.getBody().getData().getToken()!=null);
			Assert.assertTrue(loginResponse.getBody().getData().getExpiryTime()!=null);
		}
	}

	@Then("^Response body of Login API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Login_API_should_have_Error_value(String errorValue) throws Throwable {
		String error_msg = null;
		final String ADMIN_KEY_ERROR 		= "\"AdminID\" is required";
		final String PASSWORD_KEY_ERROR 	= "\"Password\" is required";
		final String ADMIN_VALUE_ERROR		= "\"AdminID\" is not allowed to be empty";
		final String PASSWORD_VALUE_ERROR	= "\"Password\" is not allowed to be empty";
		
		if(errorValue.equalsIgnoreCase("AdminIdKey")) {
			error_msg = ADMIN_KEY_ERROR;
		}else if(errorValue.equalsIgnoreCase("PasswordKey")) {
			error_msg = PASSWORD_KEY_ERROR;
		}else if(errorValue.equalsIgnoreCase("AdminIdValue")) {
			error_msg = ADMIN_VALUE_ERROR;
		}else if(errorValue.equalsIgnoreCase("PasswordValue")) {
			error_msg = PASSWORD_VALUE_ERROR;
		}
		
		System.out.println("Key missing error-->"+loginResponse.getBody().getError());
		Assert.assertEquals(loginResponse.getBody().getError(), error_msg);
	}

	@Then("^Login API Response body should have \"([^\"]*)\" Message value$")
	public void login_API_Response_body_should_have_Message_value(String messageType) throws Throwable {
		String error_msg = null;
		String error_i18msg = null;
		
		final String ADMINID_PASSWORD_MISTACH_MSG 		= "Username and Password does not match";
		final String ADMINID_PASSWORD_MISTACH_I18MSG 	= "account_login_fail";
		
		if(messageType.equalsIgnoreCase("AdminIdPasswordMistach") || 
			messageType.equalsIgnoreCase("InvalidAdminId") ||
			messageType.equalsIgnoreCase("InvalidPassword")) {
			error_msg = ADMINID_PASSWORD_MISTACH_MSG;
			error_i18msg = ADMINID_PASSWORD_MISTACH_I18MSG;
		}
		
		System.out.println("Message Value-->"+loginResponse.getBody().getMessage());
		System.out.println("I18 Message Value-->"+loginResponse.getBody().getI18n_msg());
		Assert.assertEquals(loginResponse.getBody().getMessage(), error_msg);
		Assert.assertEquals(loginResponse.getBody().getI18n_msg(), error_i18msg);
	}
	
	@Given("User get token value for authorization from Login API")
	public void user_get_token_value_for_authorization_from_Login_API() {
		//store token value
		getScenarioContext().setContext(Context.Token, loginResponse.getBody().getData().getToken());
		getScenarioContext().setContext(Context.accountID, loginResponse.getBody().getData().getAccountID());
		getScenarioContext().setContext(Context.companyID, loginResponse.getBody().getData().getCompanyID());
		getScenarioContext().setContext(Context.companyRoleID, loginResponse.getBody().getData().getCompanyRoleID());
		
	}

	@Given("Login to generate Token")
	public void login_to_generate_Token() {
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setAdminID(getScenarioContext().getContext(Context.ADMIN_USERNAME).toString());
		loginRequest.setPassword(getScenarioContext().getContext(Context.ADMIN_PASSWORD).toString());

		loginResponse = getEndPoints().loginIn(loginRequest);
		
		Assert.assertTrue(loginResponse.getStatusCode()==200);
		
		//System.out.println(loginResponse.getResponse().asString());
		System.out.println(loginResponse.getBody().getStatus());
		System.out.println(loginResponse.getException());
		getScenarioContext().setContext(Context.Token, loginResponse.getBody().getData().getToken());
		
		
		System.out.println("Logged In using API");
		System.out.println("Token Value with New Account:" + getScenarioContext().getContext(Context.Token).toString());
	}
	
	@When("User Login with pervious Password")
	public void user_Login_with_pervious_Password() {
		
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setAdminID("apitestinghumanity@gmail.com");
		loginRequest.setPassword("Test@123");
		
		loginResponse = getEndPoints().loginIn(loginRequest);
	}
	
	@Then("LoginIn failed with previous password")
	public void loginin_failed_with_previous_password() {
		System.out.println(loginResponse.getBody().getMessage());
	}
	
	@Then("LoginIn sucessfull with new password")
	public void loginin_sucessfull_with_new_password() {
		
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setAdminID("apitestinghumanity@gmail.com");
		loginRequest.setPassword(getScenarioContext().getContext(Context.RESET_PASSWORD_PASSWORD).toString());
		
		loginResponse = getEndPoints().loginIn(loginRequest);
		
		System.out.println(loginResponse.getBody().getData().getToken());
		
		System.out.println("******************************************************");
		System.out.println(getScenarioContext().isContains(Context.ADMIN_USERNAME));
		System.out.println(getScenarioContext().isContains(Context.ADMIN_PASSWORD));
		System.out.println(getScenarioContext().isContains(Context.APP_ID));
		System.out.println(getScenarioContext().isContains(Context.PROFILE_ID));
		System.out.println(getScenarioContext().isContains(Context.RESET_PASSWORD_EXPIRE_TIME));
		System.out.println(getScenarioContext().isContains(Context.RESET_PASSWORD_PASSWORD));
		System.out.println("******************************************************");

	}
	
}
