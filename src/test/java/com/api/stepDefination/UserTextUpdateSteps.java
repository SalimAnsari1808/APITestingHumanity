package com.api.stepDefination;

import java.util.LinkedHashMap;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.UserText.UserTextUpdateExtraKeyRequest;
import com.api.modelRequest.UserText.UserTextUpdateRequest;
import com.api.modelRequest.UserText.UserTextUpdateStringUserTextIDRequest;
import com.api.modelRequest.UserText.UserTextUpdateStringUserTextVersionRequest;
import com.api.modelRequest.UserText.UserTextUpdateWithoutUserTextIDRequest;
import com.api.modelRequest.UserText.UserTextUpdateWithoutUserTextVersionRequest;
import com.api.modelRequest.UserText.UserTextUserTextJSON;
import com.api.modelResponse.UserText.UserTextGetResponse;
import com.api.modelResponse.UserText.UserTextUpdateResponse;
import com.google.gson.Gson;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class UserTextUpdateSteps extends BaseSteps{
	
	private IRestResponse<UserTextGetResponse> userTextGetResponse;
	private IRestResponse<UserTextUpdateResponse> userTextUpdateResponse;

	public UserTextUpdateSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User update User Text using Update User Text JSON$")
	public void user_update_User_Text_using_Update_User_Text_JSON$() throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String userDesignID = getScenarioContext().getContext(Context.UserDesign_ID).toString();
		String language = getScenarioContext().getContext(Context.Language).toString();
		
		userTextGetResponse = getEndPoints().userTextGet(token, userDesignID, language);
		
		Gson gson = new Gson(); 
		
		String json = gson.toJson(userTextGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);

		UserTextUpdateRequest userTextUpdateRequest  = gson.fromJson(json, UserTextUpdateRequest.class);
	
		UserTextUserTextJSON userTextUserTextJSON = userTextUpdateRequest.getUserTextJSON();
		
		userTextUserTextJSON.setHeadingText("Updated Cookie Notice");
		
		userTextUpdateRequest.setUserTextJSON(userTextUserTextJSON);
		
		userTextUpdateResponse = getEndPoints().userTextUpdate(userTextUpdateRequest, token);
		
		userTextGetResponse = getEndPoints().userTextGet(token, userDesignID, language);
	}
	
	@When("^User pass \"([^\"]*)\" in Update User Text JSON$")
	public void user_pass_in_Update_User_Text_JSON(String fieldValue) throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String userDesignID = getScenarioContext().getContext(Context.UserDesign_ID).toString();
		String language = getScenarioContext().getContext(Context.Language).toString();
		
		userTextGetResponse = getEndPoints().userTextGet(token, userDesignID, language);
		
		Gson gson = new Gson();
		
		String json = gson.toJson(userTextGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);
		
		if(fieldValue.equalsIgnoreCase("NoUserTextIdKey")) {
			UserTextUpdateWithoutUserTextIDRequest userTextUpdateWithoutUserTextIDRequest = gson.fromJson(json, UserTextUpdateWithoutUserTextIDRequest.class);
			
			userTextUpdateResponse = getEndPoints().userTextUpdateWithoutUserTextID(userTextUpdateWithoutUserTextIDRequest, token);
		}else if(fieldValue.equalsIgnoreCase("NoUserTextVersionKey")) {
			
			UserTextUpdateWithoutUserTextVersionRequest userTextUpdateWithoutUserTextVersionRequest = gson.fromJson(json, UserTextUpdateWithoutUserTextVersionRequest.class);
			
			userTextUpdateResponse = getEndPoints().userTextUpdateWithoutUserTextVersion(userTextUpdateWithoutUserTextVersionRequest, token);
		}else if(fieldValue.equalsIgnoreCase("NullUserTextIdValue")) {
			
			UserTextUpdateRequest userTextUpdateRequest  = gson.fromJson(json, UserTextUpdateRequest.class);
			
			userTextUpdateRequest.setUserTextID(null);
			
			userTextUpdateResponse = getEndPoints().userTextUpdate(userTextUpdateRequest, token);
		}else if(fieldValue.equalsIgnoreCase("NullUserTextVersionValue")) {
			
			UserTextUpdateRequest userTextUpdateRequest  = gson.fromJson(json, UserTextUpdateRequest.class);
			
			userTextUpdateRequest.setUserTextVersion(null);
			
			userTextUpdateResponse = getEndPoints().userTextUpdate(userTextUpdateRequest, token);
		}else if(fieldValue.equalsIgnoreCase("StringUserTextIdValue")) {
			
			UserTextUpdateStringUserTextIDRequest userTextUpdateStringUserTextIDRequest  = gson.fromJson(json, UserTextUpdateStringUserTextIDRequest.class);
			
			userTextUpdateStringUserTextIDRequest.setUserTextID("");
			
			userTextUpdateResponse = getEndPoints().userTextUpdateStringUserTextID(userTextUpdateStringUserTextIDRequest, token);
		}else if(fieldValue.equalsIgnoreCase("StringUserTextVersionValue")) {
			
			UserTextUpdateStringUserTextVersionRequest userTextUpdateStringUserTextVersionRequest  = gson.fromJson(json, UserTextUpdateStringUserTextVersionRequest.class);
			
			userTextUpdateStringUserTextVersionRequest.setUserTextVersion("");
			
			userTextUpdateResponse = getEndPoints().userTextUpdateStringUserTextVersion(userTextUpdateStringUserTextVersionRequest, token);
		}else if(fieldValue.equalsIgnoreCase("InvalidUserTextIdValue")) {
			
			UserTextUpdateRequest userTextUpdateRequest  = gson.fromJson(json, UserTextUpdateRequest.class);
			
			userTextUpdateRequest.setUserTextID(0);
			
			userTextUpdateResponse = getEndPoints().userTextUpdate(userTextUpdateRequest, token);
		}else if(fieldValue.equalsIgnoreCase("InvalidUserTextVersionValue")) {
			
			UserTextUpdateRequest userTextUpdateRequest  = gson.fromJson(json, UserTextUpdateRequest.class);
			
			userTextUpdateRequest.setUserTextVersion(0);
			
			userTextUpdateResponse = getEndPoints().userTextUpdate(userTextUpdateRequest, token);
		}else if(fieldValue.equalsIgnoreCase("ExtraKey")) {
			
			UserTextUpdateExtraKeyRequest userTextUpdateExtraKeyRequest  = gson.fromJson(json, UserTextUpdateExtraKeyRequest.class);
			
			userTextUpdateExtraKeyRequest.setExtraKey("ExtraKey");
			
			userTextUpdateResponse = getEndPoints().userTextUpdateExtraKey(userTextUpdateExtraKeyRequest, token);
		}

	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Update User Text API$")
	public void user_get_valid_response_in_Response_body_of_Update_User_Text_API(String responseCode) throws Throwable {
		Assert.assertTrue(userTextUpdateResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Update User Text API$")
	public void user_get_valid_response_from_server_for_Update_User_Text_API(String responseCode) throws Throwable {
		Assert.assertTrue(userTextUpdateResponse.getStatusCode()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Update User Text API should have Valid value$")
	public void response_body_of_Update_User_Text_API_should_have_Valid_value() throws Throwable {
		//check user Text Update Response
		Assert.assertEquals(userTextUpdateResponse.getBody().getMessage(), "Language text data is updated and Version is incremented by 1.");
		
		//verify field is modified in User Text
		Assert.assertEquals(userTextGetResponse.getBody().getData().getUserTextJSON().getHeadingText(), "Updated Cookie Notice");
		
		//verify User Text version is incremented by one
		Assert.assertTrue(userTextGetResponse.getBody().getData().getUserTextVersion()==2);
	}
	
	@Then("^Response body of Update User Text API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Update_User_Text_API_should_have_Error_value(String errorValue) throws Throwable {
		final String NO_USER_TEXT_VERSION_KEY = "\"UserTextVersion\" is required";
		final String NULL_USER_TEXT_ID_VALUE = "\"UserTextID\" must be a number";
		final String NULL_USER_TEXT_VERSION_VALUE = "\"UserTextVersion\" must be a number";
		final String STRING_USER_TEXT_ID_VALUE = "\"UserTextID\" must be a number";
		final String STRING_USER_TEXT_VERSION_VALUE = "\"UserTextVersion\" must be a number";
		final String EXTRA_KEY =  "\"ExtraKey\" is not allowed";
		
		String error = null;
		
		if(errorValue.equalsIgnoreCase("NoUserTextVersionKey")) {
			error = NO_USER_TEXT_VERSION_KEY;
		}else if(errorValue.equalsIgnoreCase("NullUserTextIdValue")) {
			error = NULL_USER_TEXT_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullUserTextVersionValue")) {
			error = NULL_USER_TEXT_VERSION_VALUE;
		}else if(errorValue.equalsIgnoreCase("StringUserTextIdValue")) {
			error = STRING_USER_TEXT_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("StringUserTextVersionValue")) {
			error = STRING_USER_TEXT_VERSION_VALUE;
		}else if(errorValue.equalsIgnoreCase("ExtraKey")) {
			error = EXTRA_KEY;
		}
	
		Assert.assertEquals(userTextUpdateResponse.getBody().getError(), error);
	}
	
	@Then("^Response body of Update User Text API should have \"([^\"]*)\" Message value$")
	public void response_body_of_Update_User_Text_API_should_have_Message_value(String messageValue) throws Throwable {
		

		final String NO_USER_TEXT_ID_KEY_MSG 				= "User Text not found to update";
		final String NO_USER_TEXT_ID_KEY_I18MSG 			= "user_text_update_id_not_found";
		final String INVALID_USER_TEXT_ID_VALUE_MSG 		= "User Text not found to update";
		final String INVALID_USER_TEXT_ID_VALUE_I18MSG 		=  "user_text_update_id_not_found";
		final String INVALID_USER_TEXT_VERSION_VALUE_MSG 	= "User Text version mismatch. Please refresh before updating Text.";
		final String INVALID_USER_TEXT_VERSION_VALUE_I18MSG =  "user_text_version_mismatch";
		
		String msg = null;
		String i18_msg = null;
		
		if(messageValue.equalsIgnoreCase("NoUserTextIdKey")) {
			msg = NO_USER_TEXT_ID_KEY_MSG;
			i18_msg = NO_USER_TEXT_ID_KEY_I18MSG;
		}else if(messageValue.equalsIgnoreCase("InvalidUserTextIdValue")) {
			msg = INVALID_USER_TEXT_ID_VALUE_MSG;
			i18_msg = INVALID_USER_TEXT_ID_VALUE_I18MSG;
		}else if(messageValue.equalsIgnoreCase("InvalidUserTextVersionValue")) {
			msg = INVALID_USER_TEXT_VERSION_VALUE_MSG;
			i18_msg = INVALID_USER_TEXT_VERSION_VALUE_I18MSG;
		}
		
		Assert.assertEquals(userTextUpdateResponse.getBody().getMessage(), msg);
		Assert.assertEquals(userTextUpdateResponse.getBody().getI18n_msg(), i18_msg);

	}
	
	
	@When("User Text is Updated in User Account")
	public void user_Text_is_Updated_in_User_Account() {
	    // Write code here that turns the phrase above into concrete actions
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		//String userTextID = getScenarioContext().getContext(Context.UserText_ID).toString();
		String userDesignID = getScenarioContext().getContext(Context.UserDesign_ID).toString();
		String language = getScenarioContext().getContext(Context.Language).toString();
		
		userTextGetResponse = getEndPoints().userTextGet(token, userDesignID, language);
		
		//Gson gson = new Gson(); 
		//String json = gson.toJson(userTextGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);

		//UserTextUpdateRequest userTextUpdateRequest  = gson.fromJson(json, UserTextUpdateRequest.class);
		
		//System.out.println(userTextUpdateRequest.getUserDesignID());
		
//		UserTextObjectTextJSON userTextObjectTextJSON = userTextUpdateRequest.getObjectTextJSON();
//		
//		System.out.println(userTextObjectTextJSON.getBodyText());
//		
//		userTextObjectTextJSON.setBodyText( "<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p><p>It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software. <a href='#' class='hu-link' data-hu-action='privacy-open'>View Privacy Policy.</a></p>");
//		
//		userTextUpdateRequest.setObjectTextJSON(userTextObjectTextJSON);
//		
//		userTextUpdateResponse = getEndPoints().userTextUpdate(userTextUpdateRequest, token);
//		
//		System.out.println(userTextUpdateResponse.getBody().getData().getObjectTextJSON().getBodyText());
//		System.out.println(userTextUpdateResponse.getBody().getStatus());
	    
	}	
}
