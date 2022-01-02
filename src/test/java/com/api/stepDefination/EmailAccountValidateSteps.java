package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Email.EmailAccountValidateNumberTokenRequest;
import com.api.modelRequest.Email.EmailAccountValidateRequest;
import com.api.modelRequest.Email.EmailAccountValidateWithoutTokenRequest;
import com.api.modelResponse.Email.EmailAccountValidateResponse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class EmailAccountValidateSteps extends BaseSteps{
	
	private IRestResponse<EmailAccountValidateResponse> emailAccountValidateResponse;

	public EmailAccountValidateSteps(TestContext testContext) {
		super(testContext);
	}
	
	
	@Given("User connect to Email Account Validate URL")
	public void user_connect_to_Email_Account_Validate_URL() {
		//Do Nothing
	}
	
	@When("^User pass token \"([^\"]*)\" using Email Account Validate JSON$")
	public void user_pass_token_using_Email_Account_Validate_JSON(String tokenValue) throws Throwable {
		if(tokenValue.equalsIgnoreCase("NoTokenKey")) {
			
			EmailAccountValidateWithoutTokenRequest emailAccountValidateWithoutTokenRequest = new EmailAccountValidateWithoutTokenRequest();
			
			emailAccountValidateResponse = getEndPoints().emailAccountValidateWithoutToken(emailAccountValidateWithoutTokenRequest);
			
			System.out.println(emailAccountValidateResponse.getResponse().getBody().asString());
			
			return;
		}else if(tokenValue.equalsIgnoreCase("NumberTokenValue")) {
			
			EmailAccountValidateNumberTokenRequest emailAccountValidateNumberTokenRequest = new EmailAccountValidateNumberTokenRequest();
			emailAccountValidateNumberTokenRequest.setToken(123);
			
			emailAccountValidateResponse = getEndPoints().emailAccountValidateNumberToken(emailAccountValidateNumberTokenRequest);
			
			return;
		}else if(tokenValue.equalsIgnoreCase("NoTokenValue")) {
			EmailAccountValidateRequest emailAccountValidateRequest = new EmailAccountValidateRequest();
			emailAccountValidateRequest.setToken("");
			
			emailAccountValidateResponse = getEndPoints().emailAccountValidate(emailAccountValidateRequest);
			
			return;
		}else if(tokenValue.equalsIgnoreCase("NullTokenValue")) {
			EmailAccountValidateRequest emailAccountValidateRequest = new EmailAccountValidateRequest();
			emailAccountValidateRequest.setToken(null);
			
			emailAccountValidateResponse = getEndPoints().emailAccountValidate(emailAccountValidateRequest);
			
			return;
		}else if(tokenValue.equalsIgnoreCase("InvalidTokenValue")) {
			EmailAccountValidateRequest emailAccountValidateRequest = new EmailAccountValidateRequest();
			emailAccountValidateRequest.setToken("P/x8yIRPQbd0/YdJ9xF8Qq794qH6+YVBZE1JmLW9bPWJOaCOysm");
			
			emailAccountValidateResponse = getEndPoints().emailAccountValidate(emailAccountValidateRequest);
			
			return;
		}
	}

	@Then("^User get valid response \"([^\"]*)\" from server for Email Account Validate API$")
	public void user_get_valid_response_from_server_for_Email_Account_Validate_API(String responseCode) throws Throwable {
		//validate API response from server
		Assert.assertTrue(emailAccountValidateResponse.getStatusCode()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" in Response body of Email Account Validate API$")
	public void user_get_valid_response_in_Response_body_of_Email_Account_Validate_API(String responseCode) throws Throwable {
	    System.out.println("Email Account Validate Response-->"+emailAccountValidateResponse.getResponse().getBody().asString());
		
		// Validate API response in body
		Assert.assertTrue(emailAccountValidateResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Email Account Validate API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Email_Account_Validate_API_should_have_Error_value(String errorValue) throws Throwable {
		final String NO_TOKEN_KEY		= "\"token\" is required";
		final String NUMBER_TOKEN_VALUE = "\"token\" must be a string";
		final String NO_TOKEN_VALUE 	= "\"token\" is not allowed to be empty";
		final String NULL_TOKEN_VALUE 	=  "\"token\" must be a string";
		
		String err_msg = null;
		
		if(errorValue.equalsIgnoreCase("NoTokenKey")) {
			err_msg  = NO_TOKEN_KEY;
		}else if(errorValue.equalsIgnoreCase("NumberTokenValue")) {
			err_msg = NUMBER_TOKEN_VALUE;
		}else if(errorValue.equalsIgnoreCase("NoTokenValue")) {
			err_msg = NO_TOKEN_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullTokenValue")) {
			err_msg = NULL_TOKEN_VALUE;
		}
		
		Assert.assertEquals(emailAccountValidateResponse.getBody().getError(), err_msg);
	}

	@Then("^Response body of Email Account Validate API should have \"([^\"]*)\" Message value$")
	public void response_body_of_Email_Account_Validate_API_should_have_Message_value(String messageValue) throws Throwable {
		final String INVALID_TOKEN_MSG = "Account does not exist.";
		final String INVALID_TOKEN_I18MSG = "account_not_exit";
		final String ACTIVATED_ACCOUNT_MSG = "Your account is already activated.";
		final String ACTIVATED_ACCOUNT_I18MSG = "account_already_activated";
		
		String error_msg = null;
		String error_i18msg = null;
		
		if(messageValue.equalsIgnoreCase("InvalidTokenValue")) {
			error_msg = INVALID_TOKEN_MSG;
			error_i18msg = INVALID_TOKEN_I18MSG;
		}else if(messageValue.equalsIgnoreCase("ActivatedAccount")) {
			error_msg = ACTIVATED_ACCOUNT_MSG;
			error_i18msg = ACTIVATED_ACCOUNT_I18MSG;
		}
		
		Assert.assertEquals(emailAccountValidateResponse.getBody().getMessage(), error_msg);
		Assert.assertEquals(emailAccountValidateResponse.getBody().getI18n_msg(), error_i18msg);
	}

	@When("^User pass token data from email using Email Account Validate JSON$")
	public void user_pass_token_data_from_email_using_Email_Account_Validate_JSON() throws Throwable {
		String token = getScenarioContext().getContext(Context.RESET_PASSWORD_TOKEN).toString();
		
		EmailAccountValidateRequest emailAccountValidateRequest = new EmailAccountValidateRequest();
		emailAccountValidateRequest.setToken(token);
		
		emailAccountValidateResponse = getEndPoints().emailAccountValidate(emailAccountValidateRequest);
		
		System.out.println("Response Value-->"+emailAccountValidateResponse.getResponse().getBody().asString());
	}

}
