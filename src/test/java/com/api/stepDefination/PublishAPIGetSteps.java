package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelResponse.Publish.PublishAPIGetResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class PublishAPIGetSteps extends BaseSteps{
	
	private IRestResponse<PublishAPIGetResponse> publishAPIGetResponse;

	public PublishAPIGetSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User get published API using Get Publish API JSON$")
	public void user_get_published_API_using_Get_Publish_API_JSON() throws Throwable {
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		String language = getScenarioContext().getContext(Context.Language).toString();
	    
		publishAPIGetResponse = getEndPoints().publishAPIGet(appID, language);
		
		getScenarioContext().setContext(Context.PublishBanner_ID, publishAPIGetResponse.getBody().getData().getPublicBannerID());
		
		System.out.println(publishAPIGetResponse.getResponse().getBody().asString());
	}
	
	@When("^User enter \"([^\"]*)\" using Get Publish API JSON$")
	public void user_enter_using_Get_Publish_API_JSON(String fieldValue) throws Throwable {
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		String language = getScenarioContext().getContext(Context.Language).toString();
		
		if(fieldValue.equalsIgnoreCase("NoAppIDkey")) {
			
			publishAPIGetResponse = getEndPoints().publishAPIGetWithoutAppID(language);
		}else if(fieldValue.equalsIgnoreCase("NoLanguagekey")) {
			
			publishAPIGetResponse = getEndPoints().publishAPIGetWithoutLanguage(appID);
		}else if(fieldValue.equalsIgnoreCase("EmptyAppIDValue")) {
			
			final String EMPTY_APPID = "";
			
			publishAPIGetResponse = getEndPoints().publishAPIGet(EMPTY_APPID, language);
		}else if(fieldValue.equalsIgnoreCase("EmptyLanguageValue")) {
			
			final String EMPTY_LANGUAGE = "";
			
			publishAPIGetResponse = getEndPoints().publishAPIGet(appID, EMPTY_LANGUAGE);
		}else if(fieldValue.equalsIgnoreCase("InvalidAppIDValue")) {
			
			final String INVALID_APPID = "Invalid_AppID";
			
			publishAPIGetResponse = getEndPoints().publishAPIGet(INVALID_APPID, language);
		}else if(fieldValue.equalsIgnoreCase("InvalidLanguageValue")) {
			
			final String INVALID_LANGUAGE = "12";
			
			publishAPIGetResponse = getEndPoints().publishAPIGet(appID, INVALID_LANGUAGE);
		}
		
		System.out.println(publishAPIGetResponse.getResponse().getBody().asString());
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Get Publish API$")
	public void user_get_valid_response_in_Response_body_of_Get_Publish_API(String responseCode) throws Throwable {
		
		Assert.assertTrue(publishAPIGetResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Get Publish API$")
	public void user_get_valid_response_from_server_for_Get_Publish_API(String responseCode) throws Throwable {

		Assert.assertTrue(publishAPIGetResponse.getStatusCode()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Get Publish API should have Valid value$")
	public void response_body_of_Get_Publish_API_should_have_Valid_value() throws Throwable {
		System.out.println(publishAPIGetResponse.getResponse().getBody().asString());
		
		//verify User Design Get Json 
		verifyUserDesignGetJson();
		
		//verify all User Design Json fields
		verifyUserDesignJson();
		
		//verify Banner config Json fields
		verifyBannerConfigJson();
		
		//verify User Text Json fields
		verifyUserTextJson();
		
		//verify Cookie Json contain valid value
		verifyCookieJson();
		
		//verify Provider Json contain valid value
		verifyProviderJson();
		
		//verify Category Json contain valid value
		verifyCategoryJson();
	}
	
	@Then("^Response body of Get Publish API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Get_Publish_API_should_have_Error_value(String errorValue) throws Throwable {
		final String NO_APPID_KEY = "\"AppID\" is required";
		final String NO_LANGUAGE_KEY = "\"Language\" is required";
		final String EMPTY_APPID_VALUE = "\"AppID\" is not allowed to be empty";
		final String EMPTY_LANGUAGE_VALUE = "\"Language\" is not allowed to be empty";
		//final String INVALID_APPID_VALUE = "app_not_found";

		
		String err_msg = null;
		
		System.out.println(publishAPIGetResponse.getBody().getError());
		
		if(errorValue.equalsIgnoreCase("NoAppIDkey")) {
			err_msg = NO_APPID_KEY;
		}else if(errorValue.equalsIgnoreCase("NoLanguagekey")) {
			err_msg = NO_LANGUAGE_KEY;
		}else if(errorValue.equalsIgnoreCase("EmptyAppIDValue")) {
			err_msg = EMPTY_APPID_VALUE;
		}else if(errorValue.equalsIgnoreCase("EmptyLanguageValue")) {
			err_msg = EMPTY_LANGUAGE_VALUE;
		}else if(errorValue.equalsIgnoreCase("InvalidAppIDValue")) {
			//err_msg = INVALID_APPID_VALUE;
		}else if(errorValue.equalsIgnoreCase("InvalidLanguageValue")) {
			//err_msg = INVALID_APPID_VALUE;
		}
		
		Assert.assertEquals(publishAPIGetResponse.getBody().getError(), err_msg);
	}

	@Then("Verify API is Published")
	public void verify_API_is_Published() {
	    // Write code here that turns the phrase above into concrete actions
		
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		String language = getScenarioContext().getContext(Context.Language).toString();
	    
		publishAPIGetResponse = getEndPoints().publishAPIGet(appID, language);
		
		System.out.println(publishAPIGetResponse.getBody().getStatus());
		System.out.println(publishAPIGetResponse.getException());
	}
	
	private void verifyUserDesignGetJson() {
		//verify appid and default language
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getAppID() , getScenarioContext().getContext(Context.APP_ID).toString());
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getDefaultLanguage() , "en");
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getUserDesignVersion() == 1);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getLastReIssueVersion() == 1);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getUserDesignID() == Integer.parseInt(getScenarioContext().getContext(Context.UserDesign_ID).toString()));
	}
	
	private void verifyUserDesignJson() {
		//verify all User Design Json fields
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getPosition() , "bottom");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getTextSize() , "13px");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getAnimation() , "fade");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getTextColor() , "#ffffff");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getBannerColor() , "#32323a");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getHeadingSize() , "12px");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getBtnTextColor() , "#ffffff");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getHeadingColor() , "#86858b");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getPrimaryColor() , "#00a99d");
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getBannerOpacity() == 1);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserDesignJSON().getAnimationSpeed() , "0.3s");
	}
	
	private void verifyBannerConfigJson() {
		//verify Banner config Json fields
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getOnClick() , false);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getOnClose() , false);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getOnScroll() , false);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getReloading() , false);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getUiBlocking() , false);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getGeolocation() , true);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getAcceptExpiry() == 30);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getRejectExpiry() == 30);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getRevokeMethod() , "automatic");
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getScrollOffset() == 200);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getRejectConsent() , true);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getRevokeConsent() , true);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getRevokePosition() , "bottom-left");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getCustomizeConsent() , true);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getPrivacyPolicyUrl() , "");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getPrivacyLinkTarget() , "_blank");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getPrivacyPolicyLink() , true);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getDontSellLinkTarget() , "_blank");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getDontSellLink() , false);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getPreferencesVisible() , false);
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getPrivacyLinkPosition() , "banner");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getBannerConfigJSON().getDontSellLinkPosition() , "message");
	}
	
	private void verifyUserTextJson() {
		//verify User Text Json fields
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getBodyText() , "");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getHeadingText() , "Cookie Notice");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getAcceptBtnText() , "Accept");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getRejectBtnText() , "Reject");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getRevokeBtnText() , "You can revoke or update your consent at any time through this link.");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getPrivacyBtnText() , "Privacy policy");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getDontSellBtnText() , "Do Not Sell");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getPrivacyBodyText() , "If you require more information please visit our Privacy Policy page");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getCustomizeBtnText() , "Customize");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getDontSellBodyText() , "");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getPreferencesBodyText() , "Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
		Assert.assertEquals(publishAPIGetResponse.getBody().getData().getUserTextJSON().getPreferencesHeadingText() , "Customize your cookie consent by category.");
	}
	
	private void verifyCookieJson() {
		//verify Cookie Json contain valid value
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getCookieJSON().get(0).getPattern() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getCookieJSON().get(0).getCookieID() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getCookieJSON().get(0).getCategoryID() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getCookieJSON().get(0).getProviderID() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getCookieJSON().get(0).getPatternType() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getCookieJSON().get(0).getPatternFormat() != null);
	}
	
	private void verifyProviderJson() {
		//verify Provider Json contain valid value
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getProviderJSON().get(0).getCategoryID() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getProviderJSON().get(0).getProviderID() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getProviderJSON().get(0).getProviderURL() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getProviderJSON().get(0).getProviderName() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getProviderJSON().get(0).getProviderDescription() != null);
	}
	
	private void verifyCategoryJson() {
		//verify Category Json contain valid value
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getCategoryJSON().get(0).getName() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getCategoryJSON().get(0).getLanguage() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getCategoryJSON().get(0).getCategoryID() != null);
		Assert.assertTrue(publishAPIGetResponse.getBody().getData().getCategoryJSON().get(0).getDescription() != null);
	}
}
