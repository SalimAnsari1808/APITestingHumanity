package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.UserDesign.UserDesignAddEmptyBannerConfigJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddEmptyUserDesignJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddExtraKeyRequest;
import com.api.modelRequest.UserDesign.UserDesignAddNumberAppIdRequest;
import com.api.modelRequest.UserDesign.UserDesignAddNumberBannerConfigJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddNumberDefaultLanguageRequest;
import com.api.modelRequest.UserDesign.UserDesignAddNumberUserDesignJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddNumberUserTextJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddRequest;
import com.api.modelRequest.UserDesign.UserDesignAddStringBannerConfigJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddStringUserDesignJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddStringUserTextJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddWithoutAppIdRequest;
import com.api.modelRequest.UserDesign.UserDesignAddWithoutBannerConfigJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddWithoutDefaultLanguageRequest;
import com.api.modelRequest.UserDesign.UserDesignAddWithoutUserDesignJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddWithoutUserTextJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignBannerConfigJSON;
import com.api.modelRequest.UserDesign.UserDesignEmptyBannerConfigJSON;
import com.api.modelRequest.UserDesign.UserDesignEmptyUserDesignJSON;
import com.api.modelRequest.UserDesign.UserDesignEmptyUserTextJSON;
import com.api.modelRequest.UserDesign.UserDesignAddEmptyUserTextJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignUserDesignJSON;
import com.api.modelRequest.UserDesign.UserDesignUserTextJSON;
import com.api.modelResponse.UserDesign.UserDesignAddResponse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class UserDesignAddSteps extends BaseSteps{
	
	private IRestResponse<UserDesignAddResponse> userDesignAddResponse;

	public UserDesignAddSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User create User Design using Add User Design JSON$")
	public void user_create_User_Design_using_Add_User_Design_JSON() throws Throwable {
		
		getScenarioContext().setContext(Context.Language, "en");
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		//Add user design field values
		UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
		userDesignUserDesignJSON.setPosition("bottom");
		userDesignUserDesignJSON.setTextSize("13px");
		userDesignUserDesignJSON.setAnimation("fade");
		userDesignUserDesignJSON.setTextColor("#ffffff");
		userDesignUserDesignJSON.setBannerColor("#32323a");
		userDesignUserDesignJSON.setHeadingSize("12px");
		userDesignUserDesignJSON.setBtnTextColor("#ffffff");
		userDesignUserDesignJSON.setHeadingColor("#86858b");
		userDesignUserDesignJSON.setPrimaryColor("#00a99d");
		userDesignUserDesignJSON.setBannerOpacity(1);
		userDesignUserDesignJSON.setAnimationSpeed("0.3s");
		//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

		//Add User Design Banner Config field values
		UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
		userDesignBannerConfigJSON.setOnClick(false);
		userDesignBannerConfigJSON.setOnClose(false);
		userDesignBannerConfigJSON.setOnScroll(false);
		userDesignBannerConfigJSON.setReloading(false);
		userDesignBannerConfigJSON.setUiBlocking(false);
		userDesignBannerConfigJSON.setGeolocation(true);
		userDesignBannerConfigJSON.setAcceptExpiry(30);
		userDesignBannerConfigJSON.setRejectExpiry(30);
		userDesignBannerConfigJSON.setRevokeMethod("automatic");
		userDesignBannerConfigJSON.setScrollOffset(200);
		userDesignBannerConfigJSON.setRejectConsent(true);
		userDesignBannerConfigJSON.setRevokeConsent(true);
		userDesignBannerConfigJSON.setRevokePosition("bottom-left");
		userDesignBannerConfigJSON.setCustomizeConsent(true);
		userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
		userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
		userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
		userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
		userDesignBannerConfigJSON.setDontSellLink(false);
		userDesignBannerConfigJSON.setPreferencesVisible(false);
		userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
		userDesignBannerConfigJSON.setDontSellLinkPosition("message");
		
		//Add User Design User text fields value
		UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
		userDesignUserTextJSON.setBodyText("");
		userDesignUserTextJSON.setHeadingText("Cookie Notice");
		userDesignUserTextJSON.setAcceptBtnText("Accept");
		userDesignUserTextJSON.setRejectBtnText("Reject");
		userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
		userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
		userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
		userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
		userDesignUserTextJSON.setCustomizeBtnText("Customize");
		userDesignUserTextJSON.setDontSellBodyText("");
		userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
		userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
		
		//Add User Design fields value
		UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
		userDesignAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
		userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
		userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
		userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
		userDesignAddRequest.setDefaultLanguage(getScenarioContext().getContext(Context.Language).toString());
		
		userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
		
		getScenarioContext().setContext(Context.UserDesign_ID, userDesignAddResponse.getBody().getData().getUserDesignID());
		
		
		//System.out.println(userDesignAddResponse.getResponse().getBody().asString());
	}
	
	
	@Given("^User create User Design in From App using Add User Design JSON$")
	public void user_create_User_Design_in_From_App_using_Add_User_Design_JSON() throws Throwable {
		getScenarioContext().setContext(Context.Language, "en");
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		//Add user design field values
		UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
		userDesignUserDesignJSON.setPosition("bottom");
		userDesignUserDesignJSON.setTextSize("13px");
		userDesignUserDesignJSON.setAnimation("fade");
		userDesignUserDesignJSON.setTextColor("#ffffff");
		userDesignUserDesignJSON.setBannerColor("#32323a");
		userDesignUserDesignJSON.setHeadingSize("12px");
		userDesignUserDesignJSON.setBtnTextColor("#ffffff");
		userDesignUserDesignJSON.setHeadingColor("#86858b");
		userDesignUserDesignJSON.setPrimaryColor("#00a99d");
		userDesignUserDesignJSON.setBannerOpacity(1);
		userDesignUserDesignJSON.setAnimationSpeed("0.3s");
		//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

		//Add User Design Banner Config field values
		UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
		userDesignBannerConfigJSON.setOnClick(false);
		userDesignBannerConfigJSON.setOnClose(false);
		userDesignBannerConfigJSON.setOnScroll(false);
		userDesignBannerConfigJSON.setReloading(false);
		userDesignBannerConfigJSON.setUiBlocking(false);
		userDesignBannerConfigJSON.setGeolocation(true);
		userDesignBannerConfigJSON.setAcceptExpiry(30);
		userDesignBannerConfigJSON.setRejectExpiry(30);
		userDesignBannerConfigJSON.setRevokeMethod("automatic");
		userDesignBannerConfigJSON.setScrollOffset(200);
		userDesignBannerConfigJSON.setRejectConsent(true);
		userDesignBannerConfigJSON.setRevokeConsent(true);
		userDesignBannerConfigJSON.setRevokePosition("bottom-left");
		userDesignBannerConfigJSON.setCustomizeConsent(true);
		userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
		userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
		userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
		userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
		userDesignBannerConfigJSON.setDontSellLink(false);
		userDesignBannerConfigJSON.setPreferencesVisible(false);
		userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
		userDesignBannerConfigJSON.setDontSellLinkPosition("message");
		
		//Add User Design User text fields value
		UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
		userDesignUserTextJSON.setBodyText("");
		userDesignUserTextJSON.setHeadingText("Cookie Notice");
		userDesignUserTextJSON.setAcceptBtnText("Accept");
		userDesignUserTextJSON.setRejectBtnText("Reject");
		userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
		userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
		userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
		userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
		userDesignUserTextJSON.setCustomizeBtnText("Customize");
		userDesignUserTextJSON.setDontSellBodyText("");
		userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
		userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
		
		//Add User Design fields value
		UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
		userDesignAddRequest.setAppID(getScenarioContext().getContext(Context.FROM_APP_ID).toString());
		userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
		userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
		userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
		userDesignAddRequest.setDefaultLanguage(getScenarioContext().getContext(Context.Language).toString());
		
		userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
		
		getScenarioContext().setContext(Context.From_UserDesign_ID, userDesignAddResponse.getBody().getData().getUserDesignID());
	}
	
	@When("^User enter \"([^\"]*)\" using Add User Design JSON$")
	public void user_enter_using_Add_User_Design_JSON(String fieldValue) throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		if(fieldValue.equalsIgnoreCase("NoAppIdkey")) {
			
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddWithoutAppIdRequest userDesignAddWithoutAppIdRequest = new UserDesignAddWithoutAppIdRequest();
			userDesignAddWithoutAppIdRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddWithoutAppIdRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddWithoutAppIdRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddWithoutAppIdRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddWithoutAppId(userDesignAddWithoutAppIdRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NoUserDesignJsonkey")) {
			
			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddWithoutUserDesignJsonRequest userDesignAddWithoutUserDesignJsonRequest = new UserDesignAddWithoutUserDesignJsonRequest();
			userDesignAddWithoutUserDesignJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddWithoutUserDesignJsonRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddWithoutUserDesignJsonRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddWithoutUserDesignJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddWithoutUserDesignJson(userDesignAddWithoutUserDesignJsonRequest, token);
		}else if(fieldValue.equalsIgnoreCase("NoBannerConfigJsonkey")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddWithoutBannerConfigJsonRequest userDesignAddWithoutBannerConfigJsonRequest = new UserDesignAddWithoutBannerConfigJsonRequest();
			userDesignAddWithoutBannerConfigJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddWithoutBannerConfigJsonRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddWithoutBannerConfigJsonRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddWithoutBannerConfigJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddWithoutWithoutBannerConfigJson(userDesignAddWithoutBannerConfigJsonRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NoUserTextJsonkey")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design fields value
			UserDesignAddWithoutUserTextJsonRequest userDesignAddWithoutUserTextJsonRequest = new UserDesignAddWithoutUserTextJsonRequest();
			userDesignAddWithoutUserTextJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddWithoutUserTextJsonRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddWithoutUserTextJsonRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddWithoutUserTextJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddWithoutWithoutUserTextJson(userDesignAddWithoutUserTextJsonRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NoDefaultLanguagekey")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddWithoutDefaultLanguageRequest userDesignAddWithoutDefaultLanguageRequest = new UserDesignAddWithoutDefaultLanguageRequest();
			userDesignAddWithoutDefaultLanguageRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddWithoutDefaultLanguageRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddWithoutDefaultLanguageRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddWithoutDefaultLanguageRequest.setUserTextJSON(userDesignUserTextJSON);

			
			userDesignAddResponse = getEndPoints().userDesignAddWithoutWithoutDefaultLanguage(userDesignAddWithoutDefaultLanguageRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NullAppIdValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
			userDesignAddRequest.setAppID(null);
			userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NullUserDesignJsonValue")) {
			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
			userDesignAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddRequest.setUserDesignJSON(null);
			userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NullBannerConfigJsonValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
			userDesignAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddRequest.setBannerConfigJSON(null);
			userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NullUserTextJsonValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design fields value
			UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
			userDesignAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddRequest.setUserTextJSON(null);
			userDesignAddRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NullDefaultLanguageValue")) {
			
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
			userDesignAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddRequest.setDefaultLanguage(null);
			
			userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NumberAppIdValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddNumberAppIdRequest userDesignAddNumberAppIdRequest = new UserDesignAddNumberAppIdRequest();
			userDesignAddNumberAppIdRequest.setAppID(1234);
			userDesignAddNumberAppIdRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddNumberAppIdRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddNumberAppIdRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddNumberAppIdRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddNumberAppId(userDesignAddNumberAppIdRequest, token);
			
			return;
			
		}else if(fieldValue.equalsIgnoreCase("NumberUserDesignJsonValue")) {

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddNumberUserDesignJsonRequest userDesignAddNumberUserDesignJsonRequest = new UserDesignAddNumberUserDesignJsonRequest();
			userDesignAddNumberUserDesignJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddNumberUserDesignJsonRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddNumberUserDesignJsonRequest.setUserDesignJSON(123);
			userDesignAddNumberUserDesignJsonRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddNumberUserDesignJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddNumberUserDesignJson(userDesignAddNumberUserDesignJsonRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NumberBannerConfigJsonValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddNumberBannerConfigJsonRequest userDesignAddNumberBannerConfigJsonRequest = new UserDesignAddNumberBannerConfigJsonRequest();
			userDesignAddNumberBannerConfigJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddNumberBannerConfigJsonRequest.setBannerConfigJSON(123);
			userDesignAddNumberBannerConfigJsonRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddNumberBannerConfigJsonRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddNumberBannerConfigJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddNumberBannerConfigJson(userDesignAddNumberBannerConfigJsonRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NumberUserTextJsonValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design fields value
			UserDesignAddNumberUserTextJsonRequest userDesignAddNumberUserTextJsonRequest = new UserDesignAddNumberUserTextJsonRequest();
			userDesignAddNumberUserTextJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddNumberUserTextJsonRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddNumberUserTextJsonRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddNumberUserTextJsonRequest.setUserTextJSON(123);
			userDesignAddNumberUserTextJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddNumberUserTextJson(userDesignAddNumberUserTextJsonRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("NumberDefaultLanguageValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddNumberDefaultLanguageRequest userDesignAddNumberDefaultLanguageRequest = new UserDesignAddNumberDefaultLanguageRequest();
			userDesignAddNumberDefaultLanguageRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddNumberDefaultLanguageRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddNumberDefaultLanguageRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddNumberDefaultLanguageRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddNumberDefaultLanguageRequest.setDefaultLanguage(123);
			
			userDesignAddResponse = getEndPoints().userDesignAddNumberDefaultLanguage(userDesignAddNumberDefaultLanguageRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("StringUserDesignJsonValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddStringUserDesignJsonRequest userDesignAddStringUserDesignJsonRequest = new UserDesignAddStringUserDesignJsonRequest();
			userDesignAddStringUserDesignJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddStringUserDesignJsonRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddStringUserDesignJsonRequest.setUserDesignJSON("UserDesignJson");
			userDesignAddStringUserDesignJsonRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddStringUserDesignJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddStringUserDesignJson(userDesignAddStringUserDesignJsonRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("StringBannerConfigJsonValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddStringBannerConfigJsonRequest userDesignAddStringBannerConfigJsonRequest = new UserDesignAddStringBannerConfigJsonRequest();
			userDesignAddStringBannerConfigJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddStringBannerConfigJsonRequest.setBannerConfigJSON("BannerConfigJson");
			userDesignAddStringBannerConfigJsonRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddStringBannerConfigJsonRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddStringBannerConfigJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddStringBannerConfigJson(userDesignAddStringBannerConfigJsonRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("StringUserTextJsonValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddStringUserTextJsonRequest userDesignAddStringUserTextJsonRequest = new UserDesignAddStringUserTextJsonRequest();
			userDesignAddStringUserTextJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddStringUserTextJsonRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddStringUserTextJsonRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddStringUserTextJsonRequest.setUserTextJSON("UserTextjson");
			userDesignAddStringUserTextJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddStringUserTextJson(userDesignAddStringUserTextJsonRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("EmptyUserDesignJsonValue")) {
			//Add user design field values
			UserDesignEmptyUserDesignJSON userDesignEmptyUserDesignJSON = new UserDesignEmptyUserDesignJSON();

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddEmptyUserDesignJsonRequest userDesignAddEmptyUserDesignJsonRequest = new UserDesignAddEmptyUserDesignJsonRequest();
			userDesignAddEmptyUserDesignJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddEmptyUserDesignJsonRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddEmptyUserDesignJsonRequest.setUserDesignJSON(userDesignEmptyUserDesignJSON);
			userDesignAddEmptyUserDesignJsonRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddEmptyUserDesignJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddEmptyUserDesignjson(userDesignAddEmptyUserDesignJsonRequest, token);
			
			System.out.println(userDesignAddResponse.getResponse().getBody().asString());
			return;
		}else if(fieldValue.equalsIgnoreCase("EmptyBannerConfigJsonValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignEmptyBannerConfigJSON userDesignEmptyBannerConfigJSON = new UserDesignEmptyBannerConfigJSON();
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddEmptyBannerConfigJsonRequest userDesignAddEmptyBannerConfigJsonRequest = new UserDesignAddEmptyBannerConfigJsonRequest();
			userDesignAddEmptyBannerConfigJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddEmptyBannerConfigJsonRequest.setBannerConfigJSON(userDesignEmptyBannerConfigJSON);
			userDesignAddEmptyBannerConfigJsonRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddEmptyBannerConfigJsonRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddEmptyBannerConfigJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddEmptyBannerConfigjson(userDesignAddEmptyBannerConfigJsonRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("EmptyUserTextJsonValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignEmptyUserTextJSON userDesignEmptyUserTextJSON = new UserDesignEmptyUserTextJSON();
			
			//Add User Design fields value
			UserDesignAddEmptyUserTextJsonRequest userDesignAddEmptyUserTextJsonRequest = new UserDesignAddEmptyUserTextJsonRequest();
			userDesignAddEmptyUserTextJsonRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddEmptyUserTextJsonRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddEmptyUserTextJsonRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddEmptyUserTextJsonRequest.setUserTextJSON(userDesignEmptyUserTextJSON);
			userDesignAddEmptyUserTextJsonRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAddEmptyUserTextjson(userDesignAddEmptyUserTextJsonRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("EmptyAppIdValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
			userDesignAddRequest.setAppID("");
			userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("EmptyDefaultLanguageValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
			userDesignAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddRequest.setDefaultLanguage("");
			
			userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("AdditionalKey")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddExtraKeyRequest userDesignAddExtraKeyRequest = new UserDesignAddExtraKeyRequest();
			userDesignAddExtraKeyRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddExtraKeyRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddExtraKeyRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddExtraKeyRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddExtraKeyRequest.setDefaultLanguage("en");
			userDesignAddExtraKeyRequest.setExtraKey("Extravalue");
			
			userDesignAddResponse = getEndPoints().userDesignAddExtraKey(userDesignAddExtraKeyRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("InvalidAppIdValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
			userDesignAddRequest.setAppID("localhost");
			userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddRequest.setDefaultLanguage("en");
			
			userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("StringNumberDefaultLanguageValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
			userDesignAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddRequest.setDefaultLanguage("12");
			
			userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
			
			return;
		}else if(fieldValue.equalsIgnoreCase("SpecialCharacterDefaultLanguageValue")) {
			//Add user design field values
			UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
			userDesignUserDesignJSON.setPosition("bottom");
			userDesignUserDesignJSON.setTextSize("13px");
			userDesignUserDesignJSON.setAnimation("fade");
			userDesignUserDesignJSON.setTextColor("#ffffff");
			userDesignUserDesignJSON.setBannerColor("#32323a");
			userDesignUserDesignJSON.setHeadingSize("12px");
			userDesignUserDesignJSON.setBtnTextColor("#ffffff");
			userDesignUserDesignJSON.setHeadingColor("#86858b");
			userDesignUserDesignJSON.setPrimaryColor("#00a99d");
			userDesignUserDesignJSON.setBannerOpacity(1);
			userDesignUserDesignJSON.setAnimationSpeed("0.3s");
			//userDesignUserDesignJSON.setSecondaryColor("#f88a3d");

			//Add User Design Banner Config field values
			UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
			userDesignBannerConfigJSON.setOnClick(false);
			userDesignBannerConfigJSON.setOnClose(false);
			userDesignBannerConfigJSON.setOnScroll(false);
			userDesignBannerConfigJSON.setReloading(false);
			userDesignBannerConfigJSON.setUiBlocking(false);
			userDesignBannerConfigJSON.setGeolocation(true);
			userDesignBannerConfigJSON.setAcceptExpiry(30);
			userDesignBannerConfigJSON.setRejectExpiry(30);
			userDesignBannerConfigJSON.setRevokeMethod("automatic");
			userDesignBannerConfigJSON.setScrollOffset(200);
			userDesignBannerConfigJSON.setRejectConsent(true);
			userDesignBannerConfigJSON.setRevokeConsent(true);
			userDesignBannerConfigJSON.setRevokePosition("bottom-left");
			userDesignBannerConfigJSON.setCustomizeConsent(true);
			userDesignBannerConfigJSON.setPrivacyPolicyUrl("");
			userDesignBannerConfigJSON.setPrivacyLinkTarget("_blank");
			userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
			userDesignBannerConfigJSON.setDontSellLinkTarget("_blank");
			userDesignBannerConfigJSON.setDontSellLink(false);
			userDesignBannerConfigJSON.setPreferencesVisible(false);
			userDesignBannerConfigJSON.setPrivacyLinkPosition("banner");
			userDesignBannerConfigJSON.setDontSellLinkPosition("message");
			
			//Add User Design User text fields value
			UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
			userDesignUserTextJSON.setBodyText("");
			userDesignUserTextJSON.setHeadingText("Cookie Notice");
			userDesignUserTextJSON.setAcceptBtnText("Accept");
			userDesignUserTextJSON.setRejectBtnText("Reject");
			userDesignUserTextJSON.setRevokeBtnText("You can revoke or update your consent at any time through this link.");
			userDesignUserTextJSON.setPrivacyBtnText("Privacy policy");
			userDesignUserTextJSON.setDontSellBtnText("Do Not Sell");
			userDesignUserTextJSON.setPrivacyBodyText("If you require more information please visit our Privacy Policy page");
			userDesignUserTextJSON.setCustomizeBtnText("Customize");
			userDesignUserTextJSON.setDontSellBodyText("");
			userDesignUserTextJSON.setPreferencesBodyText("Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
			userDesignUserTextJSON.setPreferencesHeadingText("Customize your cookie consent by category.");
			
			//Add User Design fields value
			UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
			userDesignAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
			userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
			userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
			userDesignAddRequest.setDefaultLanguage("@#");
			
			userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
			
			return;
		}
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Add User Design API$")
	public void user_get_valid_response_in_Response_body_of_Add_User_Design_API(String responseCode) throws Throwable {
		
		Assert.assertTrue(userDesignAddResponse.getBody().getStatus()==Integer.parseInt(responseCode));

	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Add User Design API$")
	public void user_get_valid_response_from_server_for_Add_User_Design_API(String responseCode) throws Throwable {
		
		Assert.assertTrue(userDesignAddResponse.getStatusCode()==Integer.parseInt(responseCode));
	}
	
	@Then("^Response body of Add User Design API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Add_User_Design_API_should_have_Error_value(String errorValue) throws Throwable {
		
		final String NO_APPID_KEY = "\"AppID\" is required";
		final String NO_USER_DESIGN_JSON_KEY = "\"UserDesignJSON\" is required";
		final String NO_BANNER_CONFIG_JSON_KEY = "\"BannerConfigJSON\" is required";
		final String NO_USER_TEXT_JSON_KEY	= "\"UserTextJSON\" is required";
		final String NO_DEFAULT_LANGUAGE_KEY = "\"DefaultLanguage\" is required";
		final String NULL_APPID_VALUE = "\"AppID\" must be a string";
		final String NULL_USER_DESIGN_JSON_VALUE = "\"UserDesignJSON\" must be of type object";
		final String NULL_BANNER_CONFIG_JSON_VALUE = "\"BannerConfigJSON\" must be of type object";
		final String NULL_USER_TEXT_JSON_VALUE = "\"UserTextJSON\" must be of type object";
		final String NULL_DEFAULT_LANGUAGE_VALUE = "\"DefaultLanguage\" must be a string";
		final String NUMBER_APPID_VALUE = "\"AppID\" must be a string";
		final String NUMBER_USER_DESIGN_JSON_VALUE = "\"UserDesignJSON\" must be of type object";
		final String NUMBER_BANNER_CONFIG_JSON_VALUE = "\"BannerConfigJSON\" must be of type object";
		final String NUMBER_USER_TEXT_JSON_VALUE = "\"UserTextJSON\" must be of type object";
		final String NUMBER_DEFAULT_LANGUAGE_VALUE = "\"DefaultLanguage\" must be a string";
		final String STRING_USER_DESIGN_JSON_VALUE = "\"UserDesignJSON\" must be of type object";
		final String STRING_BANNER_CONFIG_JSON_VALUE = "\"BannerConfigJSON\" must be of type object";
		final String STRING_USER_TEXT_JSON_VALUE = "\"UserTextJSON\" must be of type object";
		final String EMPTY_APPID_VALUE = "\"AppID\" is not allowed to be empty";
		final String EMPTY_DEFAULT_LANGUAGE_VALUE =  "\"DefaultLanguage\" is not allowed to be empty";
		final String ADDITIONAL_KEY = "\"ExtraKey\" is not allowed";
		final String INVALID_APPID_VALUE = "insert or update on table \"UserDesign\" violates foreign key constraint \"UserDesignArchive_AppID_fkey\"";
		
		String error_msg = null;
		
		if(errorValue.equalsIgnoreCase("NoAppIdkey")) {
			error_msg = NO_APPID_KEY;
		}else if(errorValue.equalsIgnoreCase("NoUserDesignJsonkey")) {
			error_msg = NO_USER_DESIGN_JSON_KEY;
		}else if(errorValue.equalsIgnoreCase("NoBannerConfigJsonkey")) {
			error_msg = NO_BANNER_CONFIG_JSON_KEY;
		}else if(errorValue.equalsIgnoreCase("NoUserTextJsonkey")) {
			error_msg = NO_USER_TEXT_JSON_KEY;
		}else if(errorValue.equalsIgnoreCase("NoDefaultLanguagekey")) {
			error_msg = NO_DEFAULT_LANGUAGE_KEY;
		}else if(errorValue.equalsIgnoreCase("NullAppIdValue")) {
			error_msg = NULL_APPID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullUserDesignJsonValue")) {
			error_msg = NULL_USER_DESIGN_JSON_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullBannerConfigJsonValue")) {
			error_msg = NULL_BANNER_CONFIG_JSON_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullUserTextJsonValue")) {
			error_msg = NULL_USER_TEXT_JSON_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullDefaultLanguageValue")) {
			error_msg = NULL_DEFAULT_LANGUAGE_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberAppIdValue")) {
			error_msg = NUMBER_APPID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberUserDesignJsonValue")) {
			error_msg = NUMBER_USER_DESIGN_JSON_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberBannerConfigJsonValue")) {
			error_msg = NUMBER_BANNER_CONFIG_JSON_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberUserTextJsonValue")) {
			error_msg = NUMBER_USER_TEXT_JSON_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberDefaultLanguageValue")) {
			error_msg = NUMBER_DEFAULT_LANGUAGE_VALUE;
		}else if(errorValue.equalsIgnoreCase("StringUserDesignJsonValue")) {
			error_msg = STRING_USER_DESIGN_JSON_VALUE;
		}else if(errorValue.equalsIgnoreCase("StringBannerConfigJsonValue")) {
			error_msg = STRING_BANNER_CONFIG_JSON_VALUE;
		}else if(errorValue.equalsIgnoreCase("StringUserTextJsonValue")) {
			error_msg = STRING_USER_TEXT_JSON_VALUE;
		}else if(errorValue.equalsIgnoreCase("EmptyAppIdValue")) {
			error_msg = EMPTY_APPID_VALUE;
		}else if(errorValue.equalsIgnoreCase("EmptyDefaultLanguageValue")) {
			error_msg = EMPTY_DEFAULT_LANGUAGE_VALUE;
		}else if(errorValue.equalsIgnoreCase("AdditionalKey")) {
			error_msg = ADDITIONAL_KEY;
		}else if(errorValue.equalsIgnoreCase("InvalidAppIdValue")) {
			error_msg = INVALID_APPID_VALUE;
		}
		
		Assert.assertEquals(userDesignAddResponse.getBody().getError(), error_msg);
	
	}

	@Then("^Response body of Add User Design API should have Valid value$")
	public void response_body_of_Add_User_Design_API_should_have_Valid_value() throws Throwable {
		
		//verify all User Design Json fields
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserDesignJSON().getPosition() , "bottom");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserDesignJSON().getTextSize() , "13px");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserDesignJSON().getAnimation() , "fade");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserDesignJSON().getTextColor() , "#ffffff");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserDesignJSON().getBannerColor() , "#32323a");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserDesignJSON().getHeadingSize() , "12px");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserDesignJSON().getBtnTextColor() , "#ffffff");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserDesignJSON().getHeadingColor() , "#86858b");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserDesignJSON().getPrimaryColor() , "#00a99d");
		Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getBannerOpacity() == 1);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserDesignJSON().getAnimationSpeed() , "0.3s");
	
		//verify Banner config Json fields
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getOnClick() , false);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getOnClose() , false);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getOnScroll() , false);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getReloading() , false);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getUiBlocking() , false);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getGeolocation() , true);
		Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getAcceptExpiry() == 30);
		Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getRejectExpiry() == 30);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getRevokeMethod() , "automatic");
		Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getScrollOffset() == 200);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getRejectConsent() , true);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getRevokeConsent() , true);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getRevokePosition() , "bottom-left");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getCustomizeConsent() , true);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getPrivacyPolicyUrl() , "");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getPrivacyLinkTarget() , "_blank");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getPrivacyPolicyLink() , true);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getDontSellLinkTarget() , "_blank");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getDontSellLink() , false);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getPreferencesVisible() , false);
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getPrivacyLinkPosition() , "banner");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getDontSellLinkPosition() , "message");
		
		//verify User Text Json fields
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getBodyText() , "");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getHeadingText() , "Cookie Notice");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getAcceptBtnText() , "Accept");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getRejectBtnText() , "Reject");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getRevokeBtnText() , "You can revoke or update your consent at any time through this link.");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getPrivacyBtnText() , "Privacy policy");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getDontSellBtnText() , "Do Not Sell");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getPrivacyBodyText() , "If you require more information please visit our Privacy Policy page");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getCustomizeBtnText() , "Customize");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getDontSellBodyText() , "");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getPreferencesBodyText() , "Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getUserTextJSON().getPreferencesHeadingText() , "Customize your cookie consent by category.");
		
	
		//verify appid and default language
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getAppID() , getScenarioContext().getContext(Context.APP_ID).toString());
		Assert.assertEquals(userDesignAddResponse.getBody().getData().getDefaultLanguage() , "en");
		
	}
	

	@Then("^Response body of Add User Design API should have \"([^\"]*)\" value$")
	public void response_body_of_Add_User_Design_API_should_have_value(String fieldValue) throws Throwable {
		
		
		if(fieldValue.equalsIgnoreCase("EmptyUserDesignJsonValue")) {

			//verify all User Design Json fields are null
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getPosition() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getTextSize() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getAnimation() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getTextColor() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getBannerColor() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getHeadingSize() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getBtnTextColor() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getHeadingColor() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getPrimaryColor() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getBannerOpacity() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserDesignJSON().getAnimationSpeed() == null);
		}else if(fieldValue.equalsIgnoreCase("EmptyBannerConfigJsonValue")) {
			
			//verify Banner config Json fields are null
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getOnClick() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getOnClose() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getOnClick() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getOnScroll() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getReloading() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getUiBlocking() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getGeolocation() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getAcceptExpiry() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getRejectExpiry() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getRevokeMethod() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getScrollOffset() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getRejectConsent() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getRevokeConsent() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getRevokePosition() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getCustomizeConsent() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getPrivacyPolicyUrl() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getPrivacyLinkTarget() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getPrivacyPolicyLink() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getDontSellLinkTarget() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getDontSellLink() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getPreferencesVisible() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getPrivacyLinkPosition() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getBannerConfigJSON().getDontSellLinkPosition() == null);
		}else if(fieldValue.equalsIgnoreCase("EmptyBannerConfigJsonValue")) {
			
			//verify User Text Json fields are null
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getBodyText() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getHeadingText() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getAcceptBtnText() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getRejectBtnText() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getRevokeBtnText() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getPrivacyBtnText()== null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getDontSellBtnText() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getPrivacyBodyText() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getCustomizeBtnText() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getDontSellBodyText() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getPreferencesBodyText() == null);
			Assert.assertTrue(userDesignAddResponse.getBody().getData().getUserTextJSON().getPreferencesHeadingText() == null);
		}
	}


	
	@When("Add New User Design to User Account")
	public void add_New_User_Design_to_User_Account() {
				
//		UserDesignUserDesignJSON userDesignUserDesignJSON = new UserDesignUserDesignJSON();
//		userDesignUserDesignJSON.setBtnColor("#00a99d");
//		userDesignUserDesignJSON.setPosition("Bottom");
//		userDesignUserDesignJSON.setTextSize("14");
//		userDesignUserDesignJSON.setAnimation("none");
//		userDesignUserDesignJSON.setTextColor("#ffffff");
//		userDesignUserDesignJSON.setBannerColor("#32323a");
//		userDesignUserDesignJSON.setHeadingSize("13");
//		userDesignUserDesignJSON.setSpacingSize("12");
//		userDesignUserDesignJSON.setBtnBackColor("#0078ff");
//		userDesignUserDesignJSON.setHeadingColor("#86858b");
//		userDesignUserDesignJSON.setPrimaryColor("#00a99d");
//		userDesignUserDesignJSON.setBannerOpacity((float) 0.9);
//		userDesignUserDesignJSON.setSecondaryColor("#f88a3d");
//		userDesignUserDesignJSON.setPreferencesPosition("Bottom");
//		
//		List<Integer> expiryAvailablePeriods = new ArrayList<Integer>();
//		expiryAvailablePeriods.add(30);
//		expiryAvailablePeriods.add(182);
//		expiryAvailablePeriods.add(1);
//		expiryAvailablePeriods.add(365);
//
//		UserDesignBannerConfigJSON userDesignBannerConfigJSON = new UserDesignBannerConfigJSON();
//		userDesignBannerConfigJSON.setOnClick(true);
//		userDesignBannerConfigJSON.setOnScroll(true);
//		userDesignBannerConfigJSON.setReloading(false);
//		userDesignBannerConfigJSON.setUiBlocking(false);
//		userDesignBannerConfigJSON.setIabSupport(false);
//		userDesignBannerConfigJSON.setCcpaSupport(false);
//		userDesignBannerConfigJSON.setCcpaLocation(false);
//		userDesignBannerConfigJSON.setCookieExpiry("userSelected");
//		userDesignBannerConfigJSON.setGdprLocation(false);
//		userDesignBannerConfigJSON.setScrollOffset(200);
//		userDesignBannerConfigJSON.setRefuseConsent(false);
//		userDesignBannerConfigJSON.setRevokeConsent(true);
//		userDesignBannerConfigJSON.setBannerCloseIcon(true);
//		userDesignBannerConfigJSON.setPrivacyPolicyUrl("https://irsali.github.io/");
//		userDesignBannerConfigJSON.setPrivacyLinkTarget("_self");
//		userDesignBannerConfigJSON.setPrivacyPolicyLink(true);
//		userDesignBannerConfigJSON.setPrivacyLinkposition("Banner");
//		userDesignBannerConfigJSON.setExpiryAvailablePeriods(expiryAvailablePeriods);
//		userDesignBannerConfigJSON.setRefusedCookieStoragePeriod("7");
//		userDesignBannerConfigJSON.setAcceptedCookieStoragePeriod("365");
//		
//		UserDesignUserTextJSON userDesignUserTextJSON = new UserDesignUserTextJSON();
//		userDesignUserTextJSON.setBodyText("This body text is creted by Automation Script");
//		userDesignUserTextJSON.setHeadingText("Automation Scripting");
//		userDesignUserTextJSON.setAcceptBtnText("Accept");
//		userDesignUserTextJSON.setRefuseBtnText("Decline");
//		userDesignUserTextJSON.setRevokeBtnText("Revoke");
//		userDesignUserTextJSON.setRevokeMessage("Revoke created by Automation");
//		userDesignUserTextJSON.setCookiesBtnText("CookieButton");
//		userDesignUserTextJSON.setDeclineBtnText("Reject");
//		userDesignUserTextJSON.setPrivacyBtnText("PrivacyButton");
//		userDesignUserTextJSON.setPrivacyPolicyBtnText("PrivacyPolicyButton");
//		
//		
//		UserDesignAddRequest userDesignAddRequest = new UserDesignAddRequest();
//		userDesignAddRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
//		userDesignAddRequest.setDefaultLanguage("en-US");
//		userDesignAddRequest.setUserDesignJSON(userDesignUserDesignJSON);
//		userDesignAddRequest.setBannerConfigJSON(userDesignBannerConfigJSON);
//		userDesignAddRequest.setUserTextJSON(userDesignUserTextJSON);
//		
//		String token = getScenarioContext().getContext(Context.Token).toString();
//		
//		userDesignAddResponse = getEndPoints().userDesignAdd(userDesignAddRequest, token);
//		
//		System.out.println(userDesignAddResponse.getBody());
//		System.out.println(userDesignAddResponse.getException());
//		
//		getScenarioContext().setContext(Context.UserDesign_ID, userDesignAddResponse.getBody().getData().getUserDesignID());
//		
//		System.out.println(userDesignAddResponse.getBody().getStatus());
//		System.out.println(userDesignAddResponse.getBody().getData().getUserDesignID());

	}


	@Given("User Design is Added to User Account")
	public void user_Design_is_Added_to_User_Account() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}




}
