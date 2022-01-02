package com.api.stepDefination;

import java.util.LinkedHashMap;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.UserDesign.UserDesignBannerConfigJSON;
import com.api.modelRequest.UserDesign.UserDesignUpdateExtraKeyRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateStringUserDesignIDRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateStringUserDesignVersionRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateWithoutUserDesignIDRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateWithoutUserDesignVersionRequest;
import com.api.modelResponse.UserDesign.UserDesignGetResponse;
import com.api.modelResponse.UserDesign.UserDesignUpdateResponse;
import com.google.gson.Gson;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class UserDesignUpdateSteps extends BaseSteps{
	
	private IRestResponse<UserDesignGetResponse> userDesignGetResponse;
	private IRestResponse<UserDesignUpdateResponse> userDesignUpdateResponse;
	
	public UserDesignUpdateSteps(TestContext testContext) {
		super(testContext);
	}
	
	
	@When("^User update User Design using Update User Design JSON$")
	public void user_update_User_Design_using_Update_User_Design_JSON() throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGet(token, appID);
		
		//UserDesignUpdateRequest userDesignUpdateRequest = TestUtil.getUserDesignUpdateRequest(userDesignGetResponse);
		
//		System.out.println("Get User Design-->"+userDesignGetResponse.getResponse().getBody().asString());
//		
//		
		Gson gson = new Gson(); 
		String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);

		UserDesignUpdateRequest userDesignUpdateRequest  = gson.fromJson(json, UserDesignUpdateRequest.class);
//		
//		System.out.println("AppID-->"+userDesignUpdateRequest.getUserDesignID());
		
		UserDesignBannerConfigJSON userDesignBannerConfigJSON = userDesignUpdateRequest.getBannerConfigJSON();
		
		
		//System.out.println("Before OnScroll-->"+userDesignBannerConfigJSON.getOnScroll());
		
		userDesignBannerConfigJSON.setOnScroll(true);
		
		userDesignUpdateRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
		
		
		userDesignUpdateResponse = getEndPoints().userDesignUpdate(userDesignUpdateRequest, token);
		
		//System.out.println("Update User Design"+userDesignUpdateResponse.getResponse().getBody().asString());

	}
	
	@When("^User pass \"([^\"]*)\" using Update User Design JSON$")
	public void user_pass_using_Update_User_Design_JSON(String fieldValue) throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGet(token, appID);
		
		Gson gson = new Gson();
		
		if(fieldValue.equalsIgnoreCase("NoUserDesignIDKey")) {
			 
			String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);
	
			UserDesignUpdateWithoutUserDesignIDRequest userDesignUpdateWithoutUserDesignIDRequest  = gson.fromJson(json, UserDesignUpdateWithoutUserDesignIDRequest.class);
			
			userDesignUpdateResponse = getEndPoints().userDesignUpdateWithoutUserDesignID(userDesignUpdateWithoutUserDesignIDRequest, token);
			
			//System.out.println(userDesignUpdateResponse.getResponse().getBody().asString());
		}else if(fieldValue.equalsIgnoreCase("NullUserDesignIDValue")) {
			String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);
			
			UserDesignUpdateRequest userDesignUpdateRequest  = gson.fromJson(json, UserDesignUpdateRequest.class);
			
			userDesignUpdateRequest.setUserDesignID(null);
			
			userDesignUpdateResponse = getEndPoints().userDesignUpdate(userDesignUpdateRequest, token);
			
			//System.out.println(userDesignUpdateResponse.getResponse().getBody().asString());
		}else if(fieldValue.equalsIgnoreCase("NoUserDesignVersionKey")) {
			
			String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);
			
			UserDesignUpdateWithoutUserDesignVersionRequest userDesignUpdateWithoutUserDesignVersionRequest  = gson.fromJson(json, UserDesignUpdateWithoutUserDesignVersionRequest.class);
			
			userDesignUpdateResponse = getEndPoints().userDesignUpdateWithoutUserDesignVersion(userDesignUpdateWithoutUserDesignVersionRequest, token);
			
			//System.out.println(userDesignUpdateResponse.getResponse().getBody().asString());
		}else if(fieldValue.equalsIgnoreCase("NullUserDesignVersionValue")) {
			String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);
			
			UserDesignUpdateRequest userDesignUpdateRequest  = gson.fromJson(json, UserDesignUpdateRequest.class);
			
			userDesignUpdateRequest.setUserDesignVersion(null);
			
			userDesignUpdateResponse = getEndPoints().userDesignUpdate(userDesignUpdateRequest, token);
			
			//System.out.println(userDesignUpdateResponse.getResponse().getBody().asString());
		}else if(fieldValue.equalsIgnoreCase("StringUserDesignIDValue")) {
			String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);
			
			UserDesignUpdateStringUserDesignIDRequest userDesignUpdateStringUserDesignIDRequest  = gson.fromJson(json, UserDesignUpdateStringUserDesignIDRequest.class);
			
			//System.out.println("UserDesignID Value-->"+userDesignUpdateStringUserDesignIDRequest.getUserDesignID());
			//userDesignUpdateStringUserDesignIDRequest.setUserDesignID("123");
			
			userDesignUpdateResponse = getEndPoints().userDesignUpdateStringUserDesignID(userDesignUpdateStringUserDesignIDRequest, token);
			
			//System.out.println(userDesignUpdateResponse.getResponse().getBody().asString());
		}else if(fieldValue.equalsIgnoreCase("StringUserDesignVersionValue")) {
			String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);
			
			UserDesignUpdateStringUserDesignVersionRequest userDesignUpdateStringUserDesignVersionRequest  = gson.fromJson(json, UserDesignUpdateStringUserDesignVersionRequest.class);
			
			//System.out.println("UserDesignVersion Value-->"+userDesignUpdateStringUserDesignVersionRequest.getUserDesignVersion());
			//userDesignUpdateStringUserDesignIDRequest.setUserDesignID("123");
			
			userDesignUpdateResponse = getEndPoints().userDesignUpdateStringUserDesignVersion(userDesignUpdateStringUserDesignVersionRequest, token);
			
			//System.out.println(userDesignUpdateResponse.getResponse().getBody().asString());
		}else if(fieldValue.equalsIgnoreCase("InvalidUserDesignIDValue")) {
			String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);
			
			UserDesignUpdateRequest userDesignUpdateRequest  = gson.fromJson(json, UserDesignUpdateRequest.class);
			
			userDesignUpdateRequest.setUserDesignID(0001);
			
			userDesignUpdateResponse = getEndPoints().userDesignUpdate(userDesignUpdateRequest, token);
			
			//System.out.println(userDesignUpdateResponse.getResponse().getBody().asString());
		}else if(fieldValue.equalsIgnoreCase("InvalidUserDesignVersionValue")) {
			String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);
			
			UserDesignUpdateRequest userDesignUpdateRequest  = gson.fromJson(json, UserDesignUpdateRequest.class);
			
			userDesignUpdateRequest.setUserDesignVersion(0);
			
			userDesignUpdateResponse = getEndPoints().userDesignUpdate(userDesignUpdateRequest, token);
			
			//System.out.println(userDesignUpdateResponse.getResponse().getBody().asString());
		}else if(fieldValue.equalsIgnoreCase("ExtraKey")) {
			String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);
			
			UserDesignUpdateExtraKeyRequest userDesignUpdateExtraKeyRequest  = gson.fromJson(json, UserDesignUpdateExtraKeyRequest.class);
			
			userDesignUpdateExtraKeyRequest.setExtraKey(123);
			
			userDesignUpdateResponse = getEndPoints().userDesignUpdateExtraKey(userDesignUpdateExtraKeyRequest, token);
			
			System.out.println(userDesignUpdateResponse.getResponse().getBody().asString());
		}
	
		
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Update User Design API$")
	public void user_get_valid_response_in_Response_body_of_Update_User_Design_API(String responseCode) throws Throwable {
		
		Assert.assertTrue(userDesignUpdateResponse.getBody().getStatus()== Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Update User Design API$")
	public void user_get_valid_response_from_server_for_Update_User_Design_API(String responseCode) throws Throwable {

		Assert.assertTrue(userDesignUpdateResponse.getStatusCode()== Integer.parseInt(responseCode));
	}

	@Then("^Response body of Update User Design API should have \"([^\"]*)\" message value$")
	public void response_body_of_Update_User_Design_API_should_have_message_value(String messageValue) throws Throwable {
		
		final String UPDATE_DONE = "Configuration or blocking data is updated and Version is incremented by 1.";
		final String INVALID_USER_DESIGN_ID_MSG = "User Design not found to update";
		final String INVALID_USER_DESIGN_ID_I18MSG = "user_design_update_id_not_found";
		final String INVALID_USER_DESIGN_VERSION_MSG = "Configurations version mismatch. Please refresh before updating configurations.";
		final String INVALID_USER_DESIGN_VERSION_I18MSG = "user_design_version_mismatch";
		
		String msg_value = null;
		String i18n_msg_value = null;
		
		if(messageValue.equalsIgnoreCase("UpdateDone")) {
			msg_value = UPDATE_DONE;
			
			Assert.assertEquals(userDesignUpdateResponse.getBody().getMessage(), msg_value);
			
			return;
		}else if(messageValue.equalsIgnoreCase("InvalidUserDesignIDValue")) {
			msg_value = INVALID_USER_DESIGN_ID_MSG;
			i18n_msg_value = INVALID_USER_DESIGN_ID_I18MSG;
		}else if(messageValue.equalsIgnoreCase("InvalidUserDesignVersionValue")) {
			msg_value = INVALID_USER_DESIGN_VERSION_MSG;
			i18n_msg_value = INVALID_USER_DESIGN_VERSION_I18MSG;
		}

		Assert.assertEquals(userDesignUpdateResponse.getBody().getMessage(), msg_value);
		Assert.assertEquals(userDesignUpdateResponse.getBody().getI18n_msg(), i18n_msg_value);
	}
	
	@Then("^Response body of Update User Design API should have \"([^\"]*)\" error value$")
	public void response_body_of_Update_User_Design_API_should_have_error_value(String errorValue) throws Throwable {
	    final String NO_USER_DESIGN_ID_KEY = "\"UserDesignID\" is required";
	    final String NULL_USER_DESIGN_ID_VALUE = "\"UserDesignID\" must be a number";
	    final String NO_USER_DESIGN_VERSION_KEY = "\"UserDesignVersion\" is required";
	    final String NULL_USER_DESIGN_VERSION_VALUE = "\"UserDesignVersion\" must be a number";
	    final String STRING_USER_DESIGN_ID_VALUE = "\"UserDesignID\" must be a number";
	    final String STRING_USER_DESIGN_VERSION_VALUE = "\"UserDesignVersion\" must be a number";
	    final String EXTRA_KEY = "\"ExtraKey\" is not allowed";
	    
	    String err_msg = null;
	    
	    if(errorValue.equalsIgnoreCase("NoUserDesignIDKey")) {
	    	err_msg = NO_USER_DESIGN_ID_KEY;
	    }else if(errorValue.equalsIgnoreCase("NullUserDesignIDValue")) {
	    	err_msg = NULL_USER_DESIGN_ID_VALUE;
	    }else if(errorValue.equalsIgnoreCase("NoUserDesignVersionKey")) {
	    	err_msg = NO_USER_DESIGN_VERSION_KEY;
	    }else if(errorValue.equalsIgnoreCase("NullUserDesignVersionValue")) {
	    	err_msg = NULL_USER_DESIGN_VERSION_VALUE;
	    }else if(errorValue.equalsIgnoreCase("StringUserDesignIDValue")) {
	    	err_msg = STRING_USER_DESIGN_ID_VALUE;
	    }else if(errorValue.equalsIgnoreCase("StringUserDesignVersionValue")) {
	    	err_msg = STRING_USER_DESIGN_VERSION_VALUE;
	    }else if(errorValue.equalsIgnoreCase("ExtraKey")) {
	    	err_msg = EXTRA_KEY;
	    }
	    
	    Assert.assertEquals(userDesignUpdateResponse.getBody().getError(), err_msg);
	}

	
	
	@When("User Design is Updated in User Account")
	public void user_Design_is_Updated_in_User_Account() {
	    // Write code here that turns the phrase above into concrete actions
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGet(token, appID);
		
		Gson gson = new Gson(); 
		String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);

		UserDesignUpdateRequest userDesignUpdateRequest  = gson.fromJson(json, UserDesignUpdateRequest.class);
		
		UserDesignBannerConfigJSON userDesignBannerConfigJSON = userDesignUpdateRequest.getBannerConfigJSON();
		
		
		System.out.println("Before OnScroll"+userDesignBannerConfigJSON.getOnScroll());
		
		userDesignBannerConfigJSON.setOnScroll(false);
		
		userDesignUpdateRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
		
		
		System.out.println("Updated OnScroll"+userDesignUpdateRequest.getBannerConfigJSON().getOnScroll());
		System.out.println("Updated User Design ID"+userDesignUpdateRequest.getUserDesignID());
		//System.out.println(userDesignUpdateRequest.getAppID());
		
		userDesignUpdateResponse = getEndPoints().userDesignUpdate(userDesignUpdateRequest, token);
		
		System.out.println(userDesignUpdateResponse.getBody().getStatus());
		System.out.println(userDesignUpdateResponse.getResponse().getBody().asString());
		System.out.println(userDesignUpdateResponse.getException());
	}

}
