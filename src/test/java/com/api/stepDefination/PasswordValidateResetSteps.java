package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Password.PasswordValidateResetNumberExpiryTimeRequest;
import com.api.modelRequest.Password.PasswordValidateResetNumberPasswordRequest;
import com.api.modelRequest.Password.PasswordValidateResetNumberTokenRequest;
import com.api.modelRequest.Password.PasswordValidateResetRequest;
import com.api.modelRequest.Password.PasswordValidateResetWithoutExpiryTime;
import com.api.modelRequest.Password.PasswordValidateResetWithoutPasswordRequest;
import com.api.modelRequest.Password.PasswordValidateResetWithoutToken;
import com.api.modelResponse.Password.PasswordValidateResetResponse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class PasswordValidateResetSteps extends BaseSteps{
	
	private IRestResponse<PasswordValidateResetResponse> validateResetPasswordResponse;
	
	public PasswordValidateResetSteps(TestContext testContext) {
		super(testContext);
	}
	
	
	@When("User Connect to Validate Password Reset URL")
	public void user_Connect_to_Validate_Password_Reset_URL() {
	    // do nothing
	}

	
	@When("^User enter Password \"([^\"]*)\" Token \"([^\"]*)\" and ExpiryTime \"([^\"]*)\" using Validate Reset Password JSON$")
	public void user_enter_Password_Token_and_ExpiryTime_using_Validate_Reset_Password_JSON(String password, String token, String expiryTime) throws Throwable {
		if(password.equalsIgnoreCase("NoPasswordKey")) {
			
			PasswordValidateResetWithoutPasswordRequest passwordValidateResetWithoutPasswordRequest = new PasswordValidateResetWithoutPasswordRequest();
			passwordValidateResetWithoutPasswordRequest.setToken(token);
			passwordValidateResetWithoutPasswordRequest.setExpiryTime(expiryTime);
			
			validateResetPasswordResponse = getEndPoints().passwordResetValidateWithoutPassword(passwordValidateResetWithoutPasswordRequest);
			
			return;
		}else if(token.equalsIgnoreCase("NoTokenKey")) {
			
			PasswordValidateResetWithoutToken passwordValidateResetWithoutToken = new PasswordValidateResetWithoutToken();
			passwordValidateResetWithoutToken.setPassword(password);
			passwordValidateResetWithoutToken.setExpiryTime(expiryTime);
			
			validateResetPasswordResponse = getEndPoints().passwordResetValidateWithoutToken(passwordValidateResetWithoutToken);
			
			return;
		}else if(expiryTime.equalsIgnoreCase("NoExpiryTimeKey")) {
			
			PasswordValidateResetWithoutExpiryTime passwordValidateResetWithoutExpiryTime = new PasswordValidateResetWithoutExpiryTime();
			passwordValidateResetWithoutExpiryTime.setPassword(password);
			passwordValidateResetWithoutExpiryTime.setToken(token);
			
			validateResetPasswordResponse = getEndPoints().passwordResetValidateWithoutExpiryTime(passwordValidateResetWithoutExpiryTime);
			
			return;
		}else if(password.equalsIgnoreCase("NumberPassword")) {
			
			PasswordValidateResetNumberPasswordRequest passwordValidateResetNumberPasswordRequest = new PasswordValidateResetNumberPasswordRequest();
			
			passwordValidateResetNumberPasswordRequest.setPassword(123);
			passwordValidateResetNumberPasswordRequest.setToken(token);
			passwordValidateResetNumberPasswordRequest.setExpiryTime(expiryTime);
			
			validateResetPasswordResponse = getEndPoints().passwordResetValidateNumberPassword(passwordValidateResetNumberPasswordRequest);
			
			return;
		}else if(token.equalsIgnoreCase("NumberToken")) {
			
			PasswordValidateResetNumberTokenRequest passwordValidateResetNumberTokenRequest = new PasswordValidateResetNumberTokenRequest();
			passwordValidateResetNumberTokenRequest.setPassword(password);
			passwordValidateResetNumberTokenRequest.setToken(123);
			passwordValidateResetNumberTokenRequest.setExpiryTime(expiryTime);
			
			validateResetPasswordResponse = getEndPoints().passwordResetValidateNumberToken(passwordValidateResetNumberTokenRequest);
			
			return;
		}else if(expiryTime.equalsIgnoreCase("NumberExpiryTime")) {
			
			PasswordValidateResetNumberExpiryTimeRequest passwordValidateResetNumberExpiryTimeRequest = new PasswordValidateResetNumberExpiryTimeRequest();
			passwordValidateResetNumberExpiryTimeRequest.setPassword(password);
			passwordValidateResetNumberExpiryTimeRequest.setToken(token);
			passwordValidateResetNumberExpiryTimeRequest.setExpiryTime(123);
			
			validateResetPasswordResponse = getEndPoints().passwordResetValidateNumberExpiryTime(passwordValidateResetNumberExpiryTimeRequest);
			
			return;
		}else if(password.equalsIgnoreCase("EmptyPassword")) {
			password = "";
		}else if(token.equalsIgnoreCase("EmptyToken")) {
			token = "";
		}else if(expiryTime.equalsIgnoreCase("EmptyExpiryTime")) {
			expiryTime = "";
		}else if(password.equalsIgnoreCase("NullPassword")) {
			password = null;
		}else if(token.equalsIgnoreCase("NullToken")) {
			token = null;
		}else if(expiryTime.equalsIgnoreCase("NullExpiryTime")) {
			expiryTime = null;
		}
		
		PasswordValidateResetRequest validateResetPasswordRequest = new PasswordValidateResetRequest();
		validateResetPasswordRequest.setPassword(password);
		validateResetPasswordRequest.setToken(token);
		validateResetPasswordRequest.setExpiryTime(expiryTime);
		
		validateResetPasswordResponse = getEndPoints().passwordResetValidate(validateResetPasswordRequest);
	}

	@Then("^User get valid response \"([^\"]*)\" from server for Validate Password Reset API$")
	public void user_get_valid_response_from_server_for_Validate_Password_Reset_API(String responseCode) throws Throwable {
		Assert.assertTrue(validateResetPasswordResponse.getStatusCode()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Validate Password Reset API should have \"([^\"]*)\" Error value\\.$")
	public void response_body_of_Validate_Password_Reset_API_should_have_Error_value(String errorValue) throws Throwable {
		final String PASSWORD_KEY 				= "\"Password\" is required";
		final String TOKEN_KEY					= "\"Token\" is required";
		final String EXPIRY_TIME_KEY 			= "\"ExpiryTime\" is required";
		final String PASSWORD_EMPTY_VALUE 		= "\"Password\" is not allowed to be empty";
		final String TOKEN_EMPTY_VALUE			= "\"Token\" is not allowed to be empty";
		final String EXPIRY_TIME_EMPTY_VALUE 	= "\"ExpiryTime\" is not allowed to be empty";
		final String PASSWORD_NULL_VALUE		= "\"Password\" must be a string";
		final String TOKEN_NULL_VALUE			= "\"Token\" must be a string";
		final String EXPIRY_TIME_NULL_VALUE		= "\"ExpiryTime\" must be a string";
		final String PASSWORD_NUMBER_VALUE		= "\"Password\" must be a string";
		final String TOKEN_NUMBER_VALUE			= "\"Token\" must be a string";
		final String EXPIRY_TIME_NUMBER_VALUE	= "\"ExpiryTime\" must be a string";
		
		
		String error_msg = null;
		
		if(errorValue.equalsIgnoreCase("PasswordKeyRequired")) {
			error_msg = PASSWORD_KEY;
		}else if(errorValue.equalsIgnoreCase("TokenKeyRequired")) {
			error_msg = TOKEN_KEY;
		}else if(errorValue.equalsIgnoreCase("ExpiryTimeKeyRequired")) {
			error_msg = EXPIRY_TIME_KEY;
		}else if(errorValue.equalsIgnoreCase("EmptyPasswordValue")) {
			error_msg = PASSWORD_EMPTY_VALUE;
		}else if(errorValue.equalsIgnoreCase("EmptyTokenValue")) {
			error_msg = TOKEN_EMPTY_VALUE;
		}else if(errorValue.equalsIgnoreCase("EmptyExpiryTimeValue")) {
			error_msg = EXPIRY_TIME_EMPTY_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullPasswordValue")) {
			error_msg = PASSWORD_NULL_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullTokenValue")) {
			error_msg = TOKEN_NULL_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullExpiryTimeValue")) {
			error_msg = EXPIRY_TIME_NULL_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberPasswordValue")) {
			error_msg = PASSWORD_NUMBER_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberTokenValue")) {
			error_msg = TOKEN_NUMBER_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberExpiryTimeValue")) {
			error_msg = EXPIRY_TIME_NUMBER_VALUE;
		}
		
		Assert.assertEquals(validateResetPasswordResponse.getBody().getError(), error_msg);
	}

	@When("^User enter Password \"([^\"]*)\" Token and ExpiryTime using Validate Reset Password JSON$")
	public void user_enter_Password_Token_and_ExpiryTime_using_Validate_Reset_Password_JSON(String password) throws Throwable {
		PasswordValidateResetRequest validateResetPasswordRequest = new PasswordValidateResetRequest();
		validateResetPasswordRequest.setPassword(password);
		//validateResetPasswordRequest.setToken(getScenarioContext().getContext(Context.RESET_PASSWORD_TOKEN).toString());
		//validateResetPasswordRequest.setExpiryTime(getScenarioContext().getContext(Context.RESET_PASSWORD_EXPIRE_TIME).toString());
		
		validateResetPasswordRequest.setToken("YYb1b2TDg3DnSjNUzMv");
		validateResetPasswordRequest.setExpiryTime("YYb1b2TDg3DnSjNUzMv");
		
		validateResetPasswordResponse = getEndPoints().passwordResetValidate(validateResetPasswordRequest);
		
		System.out.println(validateResetPasswordResponse.getResponse().getBody().asString());
	}
	

	@Given("Validate Reset Password request is send")
	public void validate_Reset_Password_request_is_send() {
		PasswordValidateResetRequest validateResetPasswordRequest = new PasswordValidateResetRequest();
		validateResetPasswordRequest.setPassword(getScenarioContext().getContext(Context.RESET_PASSWORD_PASSWORD).toString());
		validateResetPasswordRequest.setToken(getScenarioContext().getContext(Context.RESET_PASSWORD_TOKEN).toString());
		validateResetPasswordRequest.setExpiryTime(getScenarioContext().getContext(Context.RESET_PASSWORD_EXPIRE_TIME).toString());
		
		validateResetPasswordResponse = getEndPoints().passwordResetValidate(validateResetPasswordRequest);
		System.out.println("Current Password is:"+getScenarioContext().getContext(Context.RESET_PASSWORD_PASSWORD).toString());
		System.out.println(validateResetPasswordResponse.getBody().getStatus());
		
	}
}
