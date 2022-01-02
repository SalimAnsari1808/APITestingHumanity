package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.UserText.UserTextAddExtraKeyRequest;
import com.api.modelRequest.UserText.UserTextAddNumberAppIDRequest;
import com.api.modelRequest.UserText.UserTextAddNumberCategoryJSONRequest;
import com.api.modelRequest.UserText.UserTextAddNumberLanguageRequest;
import com.api.modelRequest.UserText.UserTextAddNumberProviderJSONRequest;
import com.api.modelRequest.UserText.UserTextAddNumberUserTextJSONRequest;
import com.api.modelRequest.UserText.UserTextAddRequest;
import com.api.modelRequest.UserText.UserTextAddStringCategoryJSONRequest;
import com.api.modelRequest.UserText.UserTextAddStringProviderJSONRequest;
import com.api.modelRequest.UserText.UserTextAddStringUserTextJSONRequest;
import com.api.modelRequest.UserText.UserTextAddWithoutAppIDRequest;
import com.api.modelRequest.UserText.UserTextAddWithoutLanguageRequest;
import com.api.modelRequest.UserText.UserTextAddWithoutUserDesignIDRequest;
import com.api.modelRequest.UserText.UserTextAddWithoutUserTextJSONRequest;
import com.api.modelRequest.UserText.UserTextCategoryJSON;
import com.api.modelRequest.UserText.UserTextProviderJSON;
import com.api.modelRequest.UserText.UserTextUserTextJSON;
import com.api.modelResponse.UserText.UserTextAddResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserTextAddSteps extends BaseSteps{
	
	private IRestResponse<UserTextAddResponse> userTextAddResponse;
	
	public UserTextAddSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("Add New User Text to User Account")
	public void add_New_User_Text_to_User_Account() {
	    // Write code here that turns the phrase above into concrete actions
		
//		UserTextObjectTextJSON userTextObjectTextJSON = new UserTextObjectTextJSON();
//		userTextObjectTextJSON.setBodyText("User Text is Updated By Automation Script");
//		userTextObjectTextJSON.setHeadingText("Notice Tra");
//		userTextObjectTextJSON.setAcceptBtnText("Accept");
//		userTextObjectTextJSON.setRefuseBtnText("");
//		userTextObjectTextJSON.setRevokeBtnText("Revoke");
//		userTextObjectTextJSON.setRevokeMessage("");
//		userTextObjectTextJSON.setCookiesBtnText("Yo!");
//		userTextObjectTextJSON.setDeclineBtnText("Reject");
//		userTextObjectTextJSON.setPrivacyBtnText("Ooew");
//		userTextObjectTextJSON.setPrivacyPolicyBtnText("Privacy");
		
//		UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
//		userTextAddRequest.setUserDesignID(Integer.parseInt(getScenarioContext().getContext(Context.UserDesign_ID).toString()));
//		userTextAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
//		userTextAddRequest.setLanguage("en-US");
//		userTextAddRequest.setObjectTextJSON(userTextObjectTextJSON);
		
//		String token = getScenarioContext().getContext(Context.Token).toString();
//		
//		userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
//		
//		getScenarioContext().setContext(Context.UserText_ID, userTextAddResponse.getBody().getData().getUserTextID());
//		getScenarioContext().setContext(Context.Language, userTextAddResponse.getBody().getData().getLanguage());
//		
//		System.out.println(userTextAddResponse.getBody().getStatus());
//		System.out.println(userTextAddResponse.getBody().getData().getUserDesignID());
//		System.out.println(userTextAddResponse.getBody().getData().getUserTextID());
	}

	@When("^User enter correct details using Add User Text JSON$")
	public void user_enter_correct_details_using_Add_User_Text_JSON() throws Throwable {
	    
		
		
	}
	
	@When("^User create User Text of correct details using Add User Text JSON$")
	public void user_create_User_Text_of_correct_details_using_Add_User_Text_JSON() throws Throwable {
	    
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		UserTextUserTextJSON userTextUserTextJSON = new UserTextUserTextJSON();
		userTextUserTextJSON.setBodyText("");
		userTextUserTextJSON.setHeadingText("Cookie Notice");
		userTextUserTextJSON.setAcceptBtnText("Accept");
		userTextUserTextJSON.setRejectBtnText("Reject");
		userTextUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
		userTextUserTextJSON.setPrivacyBtnText("Privacy policy");
		userTextUserTextJSON.setDontSellBtnText("Do Not Sell");
		userTextUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
		userTextUserTextJSON.setCustomizeBtnText("Customize");
		userTextUserTextJSON.setDontSellBodyText("");
		userTextUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
		userTextUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
		
		
		UserTextCategoryJSON userTextCategoryJSON1 = new UserTextCategoryJSON();
		userTextCategoryJSON1.setCategoryID(1);
		userTextCategoryJSON1.setName("frEssential");
		userTextCategoryJSON1.setDescription("Category fr Essential description");
		
		UserTextCategoryJSON userTextCategoryJSON2 = new UserTextCategoryJSON();
		userTextCategoryJSON2.setCategoryID(2);
		userTextCategoryJSON2.setName("frFunctional");
		userTextCategoryJSON2.setDescription("Category fr Functional description");
		
		UserTextProviderJSON userTextProviderJSON = new UserTextProviderJSON();
		userTextProviderJSON.setProviderID(1);
		userTextProviderJSON.setProviderDescription("Provider Description");
		
		UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
		userTextAddRequest.setUserDesignID(Integer.parseInt(getScenarioContext().getContext(Context.UserDesign_ID).toString()));
		userTextAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
		userTextAddRequest.setLanguage("en");
		userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
		userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
		userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
		
		userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
		
		System.out.println(userTextAddResponse.getResponse().getBody().asString());
		
		getScenarioContext().setContext(Context.UserText_ID, userTextAddResponse.getBody().getData().getUserTextID());
		
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Add User Text API$")
	public void user_get_valid_response_in_Response_body_of_Add_User_Text_API(String responseCode) throws Throwable {
	    
		Assert.assertTrue(userTextAddResponse.getBody().getStatus()==Integer.parseInt(responseCode));
		
	}

	@Then("^Response body of Add User Text API should have Valid value$")
	public void response_body_of_Add_User_Text_API_should_have_Valid_value() throws Throwable {
	    
	}
	
	@When("^User enter \"([^\"]*)\" using Add User Text JSON$")
	public void user_enter_using_Add_User_Text_JSON(String bodyValue) throws Throwable {
	    
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		int userDesignID = Integer.parseInt(getScenarioContext().getContext(Context.UserDesign_ID).toString());
		
		UserTextUserTextJSON userTextUserTextJSON = new UserTextUserTextJSON();
		userTextUserTextJSON.setBodyText("");
		userTextUserTextJSON.setHeadingText("Cookie Notice");
		userTextUserTextJSON.setAcceptBtnText("Accept");
		userTextUserTextJSON.setRejectBtnText("Reject");
		userTextUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
		userTextUserTextJSON.setPrivacyBtnText("Privacy policy");
		userTextUserTextJSON.setDontSellBtnText("Do Not Sell");
		userTextUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
		userTextUserTextJSON.setCustomizeBtnText("Customize");
		userTextUserTextJSON.setDontSellBodyText("");
		userTextUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
		userTextUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
		
		UserTextCategoryJSON userTextCategoryJSON1 = new UserTextCategoryJSON();
		userTextCategoryJSON1.setCategoryID(1);
		userTextCategoryJSON1.setName("frEssential");
		userTextCategoryJSON1.setDescription("Category fr Essential description");
		
		UserTextCategoryJSON userTextCategoryJSON2 = new UserTextCategoryJSON();
		userTextCategoryJSON2.setCategoryID(2);
		userTextCategoryJSON2.setName("frFunctional");
		userTextCategoryJSON2.setDescription("Category fr Functional description");
		
		UserTextProviderJSON userTextProviderJSON = new UserTextProviderJSON();
		userTextProviderJSON.setProviderID(1);
		userTextProviderJSON.setProviderDescription("Provider Description");
		
		if(bodyValue.equalsIgnoreCase("NoUserDesignID")) {
			
			UserTextAddWithoutUserDesignIDRequest userTextAddWithoutUserDesignIDRequest = new UserTextAddWithoutUserDesignIDRequest();
			userTextAddWithoutUserDesignIDRequest.setAppID(appID);
			userTextAddWithoutUserDesignIDRequest.setLanguage("en");
			userTextAddWithoutUserDesignIDRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddWithoutUserDesignIDRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddWithoutUserDesignIDRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAddWithoutUserDesignID(userTextAddWithoutUserDesignIDRequest, token);
			
			return;
		}else if(bodyValue.equalsIgnoreCase("NoAppID")) {
			
			UserTextAddWithoutAppIDRequest userTextAddWithoutAppIDRequest = new UserTextAddWithoutAppIDRequest();
			userTextAddWithoutAppIDRequest.setUserDesignID(userDesignID);
			userTextAddWithoutAppIDRequest.setLanguage("en");
			userTextAddWithoutAppIDRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddWithoutAppIDRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddWithoutAppIDRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAddWithoutAppID(userTextAddWithoutAppIDRequest, token);
			
			return;
		}else if(bodyValue.equalsIgnoreCase("NoLanguage")) {
			
			UserTextAddWithoutLanguageRequest userTextAddWithoutLanguageRequest = new UserTextAddWithoutLanguageRequest();
			userTextAddWithoutLanguageRequest.setUserDesignID(userDesignID);
			userTextAddWithoutLanguageRequest.setAppID(appID);
			userTextAddWithoutLanguageRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddWithoutLanguageRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddWithoutLanguageRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAddWithoutLanguage(userTextAddWithoutLanguageRequest, token);
			
			return;
		}else if(bodyValue.equalsIgnoreCase("NoUserTextJSON")) {
			
			UserTextAddWithoutUserTextJSONRequest userTextAddWithoutUserTextJSONRequest = new UserTextAddWithoutUserTextJSONRequest();
			userTextAddWithoutUserTextJSONRequest.setUserDesignID(userDesignID);
			userTextAddWithoutUserTextJSONRequest.setAppID(appID);
			userTextAddWithoutUserTextJSONRequest.setLanguage("en");
			userTextAddWithoutUserTextJSONRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddWithoutUserTextJSONRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAddWithoutUserTextJSON(userTextAddWithoutUserTextJSONRequest, token);
			return;
		} else if(bodyValue.equalsIgnoreCase("NullUserDesignId")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(null);
			userTextAddRequest.setAppID(appID);
			userTextAddRequest.setLanguage("en");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
		} else if(bodyValue.equalsIgnoreCase("NullAppID")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID(null);
			userTextAddRequest.setLanguage("en");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
		} else if(bodyValue.equalsIgnoreCase("NullLanguage")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID(appID);
			userTextAddRequest.setLanguage(null);
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
			
		} else if(bodyValue.equalsIgnoreCase("NullUserTextJSON")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID(appID);
			userTextAddRequest.setLanguage("en");
			userTextAddRequest.setUserTextJSON(null);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
			
		} else if(bodyValue.equalsIgnoreCase("NullCategoryJSON")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID(appID);
			userTextAddRequest.setLanguage("en");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(null);
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
			
		} else if(bodyValue.equalsIgnoreCase("NullProviderJSON")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID(appID);
			userTextAddRequest.setLanguage("en");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(null);
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
			
		} else if(bodyValue.equalsIgnoreCase("NumberAppID")) {
			
			UserTextAddNumberAppIDRequest userTextAddNumberAppIDRequest = new UserTextAddNumberAppIDRequest();
			userTextAddNumberAppIDRequest.setUserDesignID(userDesignID);
			userTextAddNumberAppIDRequest.setAppID(1234);
			userTextAddNumberAppIDRequest.setLanguage("en");
			userTextAddNumberAppIDRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddNumberAppIDRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddNumberAppIDRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAddNumberAppID(userTextAddNumberAppIDRequest, token);
			
			return;
		} else if(bodyValue.equalsIgnoreCase("NumberLanguage")) {
			UserTextAddNumberLanguageRequest userTextAddNumberLanguageRequest = new UserTextAddNumberLanguageRequest();
			userTextAddNumberLanguageRequest.setUserDesignID(userDesignID);
			userTextAddNumberLanguageRequest.setAppID(appID);
			userTextAddNumberLanguageRequest.setLanguage(123);
			userTextAddNumberLanguageRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddNumberLanguageRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddNumberLanguageRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAddNumberLanguage(userTextAddNumberLanguageRequest, token);
			
			return;
		} else if(bodyValue.equalsIgnoreCase("NumberUserTextJSON")) {
			
			UserTextAddNumberUserTextJSONRequest userTextAddNumberUserTextJSONRequest = new UserTextAddNumberUserTextJSONRequest();
			userTextAddNumberUserTextJSONRequest.setUserDesignID(userDesignID);
			userTextAddNumberUserTextJSONRequest.setAppID(appID);
			userTextAddNumberUserTextJSONRequest.setLanguage("en");
			userTextAddNumberUserTextJSONRequest.setUserTextJSON(1234);
			userTextAddNumberUserTextJSONRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddNumberUserTextJSONRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAddNumberUserTextJSON(userTextAddNumberUserTextJSONRequest, token);
			
			return;
		} else if(bodyValue.equalsIgnoreCase("NumberCategoryJSON")) {
			
			UserTextAddNumberCategoryJSONRequest userTextAddNumberCategoryJSONRequest = new UserTextAddNumberCategoryJSONRequest();
			userTextAddNumberCategoryJSONRequest.setUserDesignID(userDesignID);
			userTextAddNumberCategoryJSONRequest.setAppID(appID);
			userTextAddNumberCategoryJSONRequest.setLanguage("en");
			userTextAddNumberCategoryJSONRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddNumberCategoryJSONRequest.setCategoryJSON(123);
			userTextAddNumberCategoryJSONRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAddNumberCategoryJSON(userTextAddNumberCategoryJSONRequest, token);
			return;
		} else if(bodyValue.equalsIgnoreCase("NumberProviderJSON")) {
			
			UserTextAddNumberProviderJSONRequest userTextAddNumberProviderJSONRequest = new UserTextAddNumberProviderJSONRequest();
			userTextAddNumberProviderJSONRequest.setUserDesignID(userDesignID);
			userTextAddNumberProviderJSONRequest.setAppID(appID);
			userTextAddNumberProviderJSONRequest.setLanguage("en");
			userTextAddNumberProviderJSONRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddNumberProviderJSONRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddNumberProviderJSONRequest.setProviderJSON(123);
			
			userTextAddResponse = getEndPoints().userTextAddNumberProviderJSON(userTextAddNumberProviderJSONRequest, token);
			return;
		} else if(bodyValue.equalsIgnoreCase("StringUserTextJSON")) {
			
			UserTextAddStringUserTextJSONRequest userTextAddStringUserTextJSONRequest = new UserTextAddStringUserTextJSONRequest();
			userTextAddStringUserTextJSONRequest.setUserDesignID(userDesignID);
			userTextAddStringUserTextJSONRequest.setAppID(appID);
			userTextAddStringUserTextJSONRequest.setLanguage("en");
			userTextAddStringUserTextJSONRequest.setUserTextJSON("Test");
			userTextAddStringUserTextJSONRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddStringUserTextJSONRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAddStringUserTextJSON(userTextAddStringUserTextJSONRequest, token);
			return;
		} else if(bodyValue.equalsIgnoreCase("StringCategoryJSON")) {
			
			UserTextAddStringCategoryJSONRequest userTextAddStringCategoryJSONRequest = new UserTextAddStringCategoryJSONRequest();
			userTextAddStringCategoryJSONRequest.setUserDesignID(userDesignID);
			userTextAddStringCategoryJSONRequest.setAppID(appID);
			userTextAddStringCategoryJSONRequest.setLanguage("en");
			userTextAddStringCategoryJSONRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddStringCategoryJSONRequest.setCategoryJSON("Test");
			userTextAddStringCategoryJSONRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAddStringCategoryJSON(userTextAddStringCategoryJSONRequest, token);
			return;
		} else if(bodyValue.equalsIgnoreCase("StringProviderJSON")) {
			
			UserTextAddStringProviderJSONRequest userTextAddStringProviderJSONRequest = new UserTextAddStringProviderJSONRequest();
			userTextAddStringProviderJSONRequest.setUserDesignID(userDesignID);
			userTextAddStringProviderJSONRequest.setAppID(appID);
			userTextAddStringProviderJSONRequest.setLanguage("en");
			userTextAddStringProviderJSONRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddStringProviderJSONRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddStringProviderJSONRequest.setProviderJSON("Test");
			
			userTextAddResponse = getEndPoints().userTextAddStringProviderJSON(userTextAddStringProviderJSONRequest, token);
			return;
		} else if(bodyValue.equalsIgnoreCase("EmptyAppID")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID("");
			userTextAddRequest.setLanguage("en");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
		} else if(bodyValue.equalsIgnoreCase("EmptyLanguage")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID(appID);
			userTextAddRequest.setLanguage("");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
		}else if(bodyValue.equalsIgnoreCase("ExtraKey")) {
			
			UserTextAddExtraKeyRequest userTextAddExtraKeyRequest = new UserTextAddExtraKeyRequest();
			userTextAddExtraKeyRequest.setUserDesignID(userDesignID);
			userTextAddExtraKeyRequest.setAppID(appID);
			userTextAddExtraKeyRequest.setLanguage("en");
			userTextAddExtraKeyRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddExtraKeyRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddExtraKeyRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			userTextAddExtraKeyRequest.setExtraKey("Extra Value");
			
			userTextAddResponse = getEndPoints().userTextAddExtraKey(userTextAddExtraKeyRequest, token);
			return;
		}else if(bodyValue.equalsIgnoreCase("InValidUserDesignID")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID+1111111);
			userTextAddRequest.setAppID(appID);
			userTextAddRequest.setLanguage("en");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
		}else if(bodyValue.equalsIgnoreCase("InValidAppId")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID("localho-123");
			userTextAddRequest.setLanguage("en");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
		}else if(bodyValue.equalsIgnoreCase("SpecialCharacterLanguageValue")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID(appID);
			userTextAddRequest.setLanguage("$%");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
			
		}else if(bodyValue.equalsIgnoreCase("StringFormatNumberLanguageValue")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID(appID);
			userTextAddRequest.setLanguage("12");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			return;
			
		}else if(bodyValue.equalsIgnoreCase("AlreadyConfigure")) {
			
			UserTextAddRequest userTextAddRequest = new UserTextAddRequest();
			userTextAddRequest.setUserDesignID(userDesignID);
			userTextAddRequest.setAppID(appID);
			userTextAddRequest.setLanguage("en");
			userTextAddRequest.setUserTextJSON(userTextUserTextJSON);
			userTextAddRequest.setCategoryJSON(new UserTextCategoryJSON[] {userTextCategoryJSON1,userTextCategoryJSON2});
			userTextAddRequest.setProviderJSON(new UserTextProviderJSON[] {userTextProviderJSON});
			
			getEndPoints().userTextAdd(userTextAddRequest, token);
			userTextAddResponse = getEndPoints().userTextAdd(userTextAddRequest, token);
			
			return;
		}
		
	}

	@Then("^User get valid response \"([^\"]*)\" from server for Add User Text API$")
	public void user_get_valid_response_from_server_for_Add_User_Text_API(String responseCode) throws Throwable {
	    
		Assert.assertTrue(userTextAddResponse.getStatusCode()==Integer.parseInt(responseCode));
		
	}

	@Then("^Response body of Add User Text API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Add_User_Text_API_should_have_Error_value(String response) throws Throwable {
	    
		final String NO_USER_DESIGN_ID 				= "\"UserDesignID\" is required";
		final String NO_APP_ID 						= "\"AppID\" is required";
		final String NO_LANGUAGE 					= "\"Language\" is required";
		final String NO_USER_TEXT_JSON 				= "\"UserTextJSON\" is required";
		final String NULL_USER_DESIGN_ID			= "\"UserDesignID\" must be a number";
		final String NULL_APP_ID					= "\"AppID\" must be a string";
		final String NULL_LANGUAGE					= "\"Language\" must be a string";
		final String NULL_USER_TEXT_JSON			= "\"UserTextJSON\" must be of type object";
		final String NULL_CATEGORY_JSON				= "\"CategoryJSON\" must be an array";
		final String NULL_PROVIDER_JSON				= "\"ProviderJSON\" must be an array";
		final String NUMBER_APP_ID					= "\"AppID\" must be a string";
		final String NUMBER_LANGUAGE				= "\"Language\" must be a string";
		final String NUMBER_USER_TEXT_JSON			= "\"UserTextJSON\" must be of type object";
		final String NUMBER_CATEGORY_JSON			= "\"CategoryJSON\" must be an array";
		final String NUMBER_PROVIDER_JSON			= "\"ProviderJSON\" must be an array";
		final String STRING_USER_TEXT_JSON			= "\"UserTextJSON\" must be of type object";
		final String STRING_CATEGORY_JSON			= "\"CategoryJSON\" must be an array";
		final String STRING_PROVIDER_JSON			= "\"ProviderJSON\" must be an array";
		final String EMPTY_APP_ID					= "\"AppID\" is not allowed to be empty";
		final String EMPTY_LANGUAGE					= "\"Language\" is not allowed to be empty";
		final String EXTRA_KEY						= "\"ExtraKey\" is not allowed";
		final String INVALID_USERDESIGNID			= "Configuration not found";
		final String INVALID_APPID					= "AppID mismatch with configuration";
		final String SPECIAL_CHARACTER_LANGUAGE		= "";
		final String STRING_FORMAT_NUMBER_LANGUAGE	= "";
		final String ALREADY_CONFIGURE				= "Text had been already added for this Configuration and language";
		
		String error_msg = null;
		
		if(response.equalsIgnoreCase("NoUserDesignID")) {
			error_msg = NO_USER_DESIGN_ID;
		}else if(response.equalsIgnoreCase("NoAppID")) {
			error_msg = NO_APP_ID;
		}else if(response.equalsIgnoreCase("NoLanguage")) {
			error_msg = NO_LANGUAGE;
		}else if(response.equalsIgnoreCase("NoUserTextJSON")){
			error_msg = NO_USER_TEXT_JSON;
		}else if(response.equalsIgnoreCase("NullUserDesignID")) {
			error_msg = NULL_USER_DESIGN_ID;
		}else if(response.equalsIgnoreCase("NullAppID")) {
			error_msg = NULL_APP_ID;
		}else if(response.equalsIgnoreCase("NullLanguage")) {
			error_msg = NULL_LANGUAGE;
		}else if(response.equalsIgnoreCase("NullUserTextJSON")) {
			error_msg = NULL_USER_TEXT_JSON;
		}else if(response.equalsIgnoreCase("NullCategoryJSON")) {
			error_msg = NULL_CATEGORY_JSON;
		}else if(response.equalsIgnoreCase("NullProviderJSON")) {
			error_msg = NULL_PROVIDER_JSON;
		}else if(response.equalsIgnoreCase("NumberAppID")) {
			error_msg = NUMBER_APP_ID;
		}else if(response.equalsIgnoreCase("NumberLanguage")) {
			error_msg = NUMBER_LANGUAGE;
		}else if(response.equalsIgnoreCase("NumberUserTextJSON")) {
			error_msg = NUMBER_USER_TEXT_JSON;
		}else if(response.equalsIgnoreCase("NumberCategoryJSON")) {
			error_msg = NUMBER_CATEGORY_JSON;
		}else if(response.equalsIgnoreCase("NumberProviderJSON")) {
			error_msg = NUMBER_PROVIDER_JSON;
		}else if(response.equalsIgnoreCase("StringUserTextJSON")) {
			error_msg = STRING_USER_TEXT_JSON;
		}else if(response.equalsIgnoreCase("StringCategoryJSON")) {
			error_msg = STRING_CATEGORY_JSON;
		}else if(response.equalsIgnoreCase("StringProviderJSON")) {
			error_msg = STRING_PROVIDER_JSON;
		}else if(response.equalsIgnoreCase("EmptyAppID")) {
			error_msg = EMPTY_APP_ID;
		}else if(response.equalsIgnoreCase("EmptyLanguage")) {
			error_msg = EMPTY_LANGUAGE;
		}else if(response.equalsIgnoreCase("ExtraKey")) {
			error_msg = EXTRA_KEY;
		}else if(response.equalsIgnoreCase("InValidUserDesignID")) {
			error_msg = INVALID_USERDESIGNID;
			Assert.assertEquals(userTextAddResponse.getBody().getMessage(), error_msg);
			return;
		}else if(response.equalsIgnoreCase("InValidAppID")) {
			error_msg = INVALID_APPID;
			Assert.assertEquals(userTextAddResponse.getBody().getMessage(), error_msg);
			return;
		}else if(response.equalsIgnoreCase("SpecialCharacterLanguageValue")) {
			error_msg = SPECIAL_CHARACTER_LANGUAGE;
		}else if(response.equalsIgnoreCase("StringFormatNumberLanguageValue")) {
			error_msg = STRING_FORMAT_NUMBER_LANGUAGE;
		}else if(response.equalsIgnoreCase("AlreadyConfigure")) {
			Assert.assertEquals(userTextAddResponse.getBody().getMessage(), ALREADY_CONFIGURE);
			return;
		}
		
		System.out.println("|"+error_msg+"|");
		System.out.println("|"+userTextAddResponse.getBody().getError()+"|");
		Assert.assertEquals(userTextAddResponse.getBody().getError(), error_msg);
		
	}
	
}