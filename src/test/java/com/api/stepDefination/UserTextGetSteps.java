package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelResponse.UserText.UserTextGetResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class UserTextGetSteps extends BaseSteps{
	
	private IRestResponse<UserTextGetResponse> userTextGetResponse;

	public UserTextGetSteps(TestContext testContext) {
		super(testContext);
		// TODO Auto-generated constructor stub
	}
	

	@Then("Verify New User Text is Added")
	public void verify_New_User_Text_is_Added() {
	    // Write code here that turns the phrase above into concrete actions
	    
		String token = getScenarioContext().getContext(Context.Token).toString();
		String userTextID = getScenarioContext().getContext(Context.UserText_ID).toString();
		String userDesignID = getScenarioContext().getContext(Context.UserDesign_ID).toString();
		String language = getScenarioContext().getContext(Context.Language).toString();
		
		System.out.println("UserTextID:"+userTextID);
		System.out.println("UserDesignID:"+userDesignID);
		
		userTextGetResponse = getEndPoints().userTextGet(token, userDesignID, language);
		
		System.out.println(userTextGetResponse.getBody().getStatus());
		System.out.println("********************************************");
		System.out.println("UserDesignID:"+userTextGetResponse.getBody().getData().getUserTextVersion());
		System.out.println("UserTextID:"+userTextGetResponse.getBody().getData().getUserTextID());
	}
	
	@When("^User get User Text using \"([^\"]*)\" as parameter\\.$")
	public void user_get_User_Text_using_as_parameter(String requestType) throws Throwable {
	    
		String token = getScenarioContext().getContext(Context.Token).toString();
		String userDesignID = getScenarioContext().getContext(Context.UserDesign_ID).toString();
		
		if(requestType.equalsIgnoreCase("CorrectDetails")) {
			userTextGetResponse = getEndPoints().userTextGet(token, userDesignID, "en");
			return;
		}else if(requestType.equalsIgnoreCase("NoUserDesignID")) {
			userTextGetResponse = getEndPoints().userTextGetWithoutUserDesignID(token, "en");
			return;
		}else if(requestType.equalsIgnoreCase("WithoutAnyParam")) {
			userTextGetResponse = getEndPoints().userTextGetWithoutAnyParam(token);
			return;
		}else if(requestType.equalsIgnoreCase("NoLanguage")) {
			userTextGetResponse = getEndPoints().userTextGetWithoutLanguage(token, userDesignID);
			return;
		}else if(requestType.equalsIgnoreCase("EmptyUserDesignID")) {
			userTextGetResponse = getEndPoints().userTextGet(token, "", "en");
			return;
		}else if(requestType.equalsIgnoreCase("EmptyLanguage")) {
			userTextGetResponse = getEndPoints().userTextGet(token, userDesignID, "");
			return;
		}else if(requestType.equalsIgnoreCase("StringUserDesignID")) {
			userTextGetResponse = getEndPoints().userTextGet(token, "abc", "en");
			return;
		}else if(requestType.equalsIgnoreCase("NumberLanguage")) {
			userTextGetResponse = getEndPoints().userTextGet(token, userDesignID, "12");
			return;
		}else if(requestType.equalsIgnoreCase("SpecialCharacterLanguage")) {
			userTextGetResponse = getEndPoints().userTextGet(token, userDesignID, "$%");
			return;
		}else if(requestType.equals("InValidUserDesignID")) {
			userTextGetResponse = getEndPoints().userTextGet(token, userDesignID+"1111", "en");
			return;
		}
		
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Get User Text API\\.$")
	public void user_get_valid_response_in_Response_body_of_Get_User_Text_API(String responseCode) throws Throwable {
		
		Assert.assertTrue(userTextGetResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}
	
	@Then("^Response body of Get User Text API should have Valid value\\.$")
	public void response_body_of_Get_User_Text_API_should_have_Valid_value() throws Throwable {
	    
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Get User Text API$")
	public void user_get_valid_response_from_server_for_Get_User_Text_API(String responseCode) throws Throwable {
	    
		Assert.assertTrue(userTextGetResponse.getStatusCode()==Integer.parseInt(responseCode));
		
	}

	@Then("^Response body of Get User Text API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Get_User_Text_API_should_have_Error_value(String responseMessage) throws Throwable {
		
		final String WITHOUT_ANY_PARAM			= "\"UserDesignID\" is required";
		final String NO_USER_DESIGN_ID			= "\"UserDesignID\" is required";
		final String NO_LANGUAGE				= "\"Language\" is required";
		final String EMPTY_USERDESIGNID			= "\"UserDesignID\" is not allowed to be empty";
		final String EMPTY_LANGUAGE				= "\"Language\" is not allowed to be empty";
		final String STRING_USERDESIGNID		= "invalid input syntax for integer: \"abc\"";
		final String NUMBER_LANGUAGE			= "";
		final String SPECIAL_CHARACTER_LANGUAGE	= "";
		
		String error_msg = null;
	    
		if(responseMessage.equalsIgnoreCase("WithoutAnyParam")) {
			error_msg = WITHOUT_ANY_PARAM;
		}else if(responseMessage.equalsIgnoreCase("NoUserDesignID")) {
			error_msg = NO_USER_DESIGN_ID;
		}else if(responseMessage.equalsIgnoreCase("NoLanguage")) {
			error_msg = NO_LANGUAGE;
		}else if(responseMessage.equalsIgnoreCase("EmptyUserDesignID")) {
			error_msg = EMPTY_USERDESIGNID;
		}else if(responseMessage.equalsIgnoreCase("EmptyLanguage")) {
			error_msg = EMPTY_LANGUAGE;
		}else if(responseMessage.equalsIgnoreCase("StringUserDesignID")) {
			error_msg = STRING_USERDESIGNID;
		}else if(responseMessage.equalsIgnoreCase("NumberLanguage")) {
			error_msg = NUMBER_LANGUAGE;
		}else if(responseMessage.equalsIgnoreCase("SpecialCharacterLanguage")) {
			error_msg = SPECIAL_CHARACTER_LANGUAGE;
		}else if(responseMessage.equalsIgnoreCase("InValidUserDesignID")) {
			Assert.assertEquals(userTextGetResponse.getBody().getData(), null);
			return;
		}
		
		Assert.assertEquals(userTextGetResponse.getBody().getError(), error_msg);
		
	}
}