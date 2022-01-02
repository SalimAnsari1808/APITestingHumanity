package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelResponse.UserDesign.UserDesignGetResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class UserDesignGetSteps extends BaseSteps{
	
	private IRestResponse<UserDesignGetResponse> userDesignGetResponse;

	public UserDesignGetSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User get User Design using valid AppId using Get User Design JSON$")
	public void user_get_User_Design_using_valid_AppId_using_Get_User_Design_JSON() throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGet(token, appID);
	}
	

	
	@When("^User get User Design using valid AppId and QueryConfigurationsData as \"([^\"]*)\" using Get User Design JSON$")
	public void user_get_User_Design_using_valid_AppId_and_QueryConfigurationsData_as_using_Get_User_Design_JSON(String queryConfigurationsData) throws Throwable {
		
		boolean configurationData = Boolean.parseBoolean(queryConfigurationsData);
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGetConfigurationData(token, appID, configurationData);

	}
	
	@When("^User get User Design using valid AppId and QueryBlockingData as \"([^\"]*)\" using Get User Design JSON$")
	public void user_get_User_Design_using_valid_AppId_and_QueryBlockingData_as_using_Get_User_Design_JSON(String queryBlockingData) throws Throwable {
		
		boolean blockingData = Boolean.parseBoolean(queryBlockingData);
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGetBlockingData(token, appID, blockingData);

	}
	
	@When("^User get User Design using valid AppId and QueryLanguagesData as \"([^\"]*)\" using Get User Design JSON$")
	public void user_get_User_Design_using_valid_AppId_and_QueryLanguagesData_as_using_Get_User_Design_JSON(String queryLanguagesData) throws Throwable {
		
		boolean languagesData = Boolean.parseBoolean(queryLanguagesData);
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGetLanguagesData(token, appID, languagesData);
	}
	
	@When("^User get User Design using valid AppId, QueryConfigurationsData as \"([^\"]*)\" QueryBlockingData as \"([^\"]*)\" and QueryLanguagesData as \"([^\"]*)\" using Get User Design JSON$")
	public void user_get_User_Design_using_valid_AppId_QueryConfigurationsData_as_QueryBlockingData_as_and_QueryLanguagesData_as_using_Get_User_Design_JSON(String queryConfigurationsData, String queryBlockingData, String queryLanguagesData) throws Throwable {

		boolean configurationData = Boolean.parseBoolean(queryConfigurationsData);
		boolean blockingData = Boolean.parseBoolean(queryBlockingData);
		boolean languagesData = Boolean.parseBoolean(queryLanguagesData);
		
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGetConfigurationBlockingLanguagesData(token, appID, configurationData, blockingData, languagesData);
	}
	
	@When("^User get User Design using \"([^\"]*)\" AppId using Get User Design JSON$")
	public void user_get_User_Design_using_AppId_using_Get_User_Design_JSON(String appIdType) throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = null;
		
		if(appIdType.equalsIgnoreCase("Invalid")) {
			appID = "InvalidAppId";
		}else if(appIdType.equalsIgnoreCase("Empty")) {
			appID = null;
		}

		userDesignGetResponse = getEndPoints().userDesignGet(token, appID);
	}
	
	@When("^User get User Design using not enter AppId using Get User Design JSON$")
	public void user_get_User_Design_using_not_enter_AppId_using_Get_User_Design_JSON() throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGetWithoutAppId(token);
	}



	@Then("^User get valid response \"([^\"]*)\" in Response body of Get User Design API$")
	public void user_get_valid_response_in_Response_body_of_Get_User_Design_API(String responseCode) throws Throwable {
		
		Assert.assertTrue(userDesignGetResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Get User Design API$")
	public void user_get_valid_response_from_server_for_Get_User_Design_API(String responseCode) throws Throwable {
		
		Assert.assertTrue(userDesignGetResponse.getStatusCode() ==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Get User Design API using valid AppId value$")
	public void response_body_of_Get_User_Design_API_using_valid_AppId_value() throws Throwable {
		
		//verify User Design Get Json 
		verifyUserDesignGetJson();
		
		//verify all User Design Json fields
		verifyUserDesignJson();
		
		//verify Banner config Json fields
		verifyBannerConfigJson();
		
		//verify User Text Json fields
		verifyUserTextJson();
		
		//verify Category Json contain null value
		verifyUserDesignAddNullValue("CategoryJson");

		//verify Provider Json contain null value
		verifyUserDesignAddNullValue("ProviderJson");
		
		//verify Cookie Json contain null value
		verifyUserDesignAddNullValue("CookieJson");
	}
	
	@Then("^Response body of Get User Design API using \"([^\"]*)\" AppId value$")
	public void response_body_of_Get_User_Design_API_using_AppId_value(String appIdType) throws Throwable {
		
		if(appIdType.equalsIgnoreCase("Invalid")) {
			Assert.assertTrue(userDesignGetResponse.getBody().getData() == null);
		}else if(appIdType.equalsIgnoreCase("Empty")) {
			Assert.assertEquals(userDesignGetResponse.getBody().getError(), "\"AppID\" is not allowed to be empty");
		}else if(appIdType.equalsIgnoreCase("NoAppIdKey")) {
			Assert.assertEquals(userDesignGetResponse.getBody().getError(), "\"AppID\" is required");
		}
	}
	
	
	@Then("^Response body of Get User Design API using valid AppId and QueryConfigurationsData as \"([^\"]*)\" value$")
	public void response_body_of_Get_User_Design_API_using_valid_AppId_and_QueryConfigurationsData_as_value(String queryConfigurationsData) throws Throwable {
		
		boolean configurationData = Boolean.parseBoolean(queryConfigurationsData);
		
		//verify User Design Get Json 
		verifyUserDesignGetJson();
		
		
		if(configurationData) {
			//verify all User Design Json fields
			verifyUserDesignJson();
			
			//verify Banner config Json fields
			verifyBannerConfigJson();
			
			//verify User Text Json fields
			verifyUserTextJson();
		}else {
			//verify User Design Json contain null value
			verifyUserDesignAddNullValue("UserDesignJson");

			//verify Banner config Json contain null value
			verifyUserDesignAddNullValue("BannerConfigJson");
			
			//verify User Text Json contain null value
			verifyUserDesignAddNullValue("UserTextJson");
		}
		
		//verify Category Json contain null value
		verifyUserDesignAddNullValue("CategoryJson");

		//verify Provider Json contain null value
		verifyUserDesignAddNullValue("ProviderJson");
		
		//verify Cookie Json contain null value
		verifyUserDesignAddNullValue("CookieJson");
	}
	
	
	@Then("^Response body of Get User Design API using valid AppId and QueryBlockingData as \"([^\"]*)\" value$")
	public void response_body_of_Get_User_Design_API_using_valid_AppId_and_QueryBlockingData_as_value(String queryBlockingData) throws Throwable {

		boolean blockingData = Boolean.parseBoolean(queryBlockingData);
		
		if(blockingData) {
			//verify Cookie Json contain valid value
			verifyCookieJson();
			
			//verify Provider Json contain valid value
			verifyProviderJson();
			
			//verify Category Json contain valid value
			verifyCategoryJson();
		}else {
			//verify Provider Json contain null value
			verifyUserDesignAddNullValue("ProviderJson");
			
			//verify Cookie Json contain null value
			verifyUserDesignAddNullValue("CookieJson");
			
			//verify Category Json contain null value
			verifyUserDesignAddNullValue("CategoryJson");
		}
		
		//verify User Design Get Json 
		verifyUserDesignGetJson();
		
		//verify all User Design Json fields
		verifyUserDesignJson();
		
		//verify Banner config Json fields
		verifyBannerConfigJson();
		
		//verify User Text Json fields
		verifyUserTextJson();
	}
	
	
	@Then("^Response body of Get User Design API using valid AppId and QueryLanguagesData as \"([^\"]*)\" value$")
	public void response_body_of_Get_User_Design_API_using_valid_AppId_and_QueryLanguagesData_as_value(String queryLanguagesData) throws Throwable {

		boolean languagesData = Boolean.parseBoolean(queryLanguagesData);
		
		if(languagesData) {
			//verify Category Json contain valid value
			verifyCategoryJson();
		}else {
			//verify Category Json contain null value
			verifyUserDesignAddNullValue("CategoryJson");
		}
		
		//verify User Design Get Json 
		verifyUserDesignGetJson();
		
		//verify all User Design Json fields
		verifyUserDesignJson();
		
		//verify Banner config Json fields
		verifyBannerConfigJson();
		
		//verify User Text Json fields
		verifyUserTextJson();
		
		//verify Provider Json contain null value
		verifyUserDesignAddNullValue("ProviderJson");
		
		//verify Cookie Json contain null value
		verifyUserDesignAddNullValue("CookieJson");
	}
	
	
	@Then("^Response body of Get User Design API using valid AppId, QueryConfigurationsData as \"([^\"]*)\", QueryBlockingData as \"([^\"]*)\" and QueryLanguagesData as \"([^\"]*)\" value$")
	public void response_body_of_Get_User_Design_API_using_valid_AppId_QueryConfigurationsData_as_QueryBlockingData_as_and_QueryLanguagesData_as_value(String queryConfigurationsData, String queryBlockingData, String queryLanguagesData) throws Throwable {

		boolean configurationData = Boolean.parseBoolean(queryConfigurationsData);
		boolean blockingData = Boolean.parseBoolean(queryBlockingData);
		boolean languagesData = Boolean.parseBoolean(queryLanguagesData);
		
		
		if((configurationData && blockingData && languagesData) || (configurationData && blockingData && !languagesData)){
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
			
		}else if(configurationData && !blockingData && languagesData) {
			
			//verify User Design Get Json 
			verifyUserDesignGetJson();
			
			//verify all User Design Json fields
			verifyUserDesignJson();
			
			//verify Banner config Json fields
			verifyBannerConfigJson();
			
			//verify User Text Json fields
			verifyUserTextJson();
			
			//verify Cookie Json contain null value
			verifyUserDesignAddNullValue("CookieJson");
			
			//verify Provider Json contain null value
			verifyUserDesignAddNullValue("ProviderJson");
			
			//verify Category Json contain valid value
			verifyCategoryJson();
		}else if(configurationData && !blockingData && !languagesData) {
			
			//verify User Design Get Json 
			verifyUserDesignGetJson();
			
			//verify all User Design Json fields
			verifyUserDesignJson();
			
			//verify Banner config Json fields
			verifyBannerConfigJson();
			
			//verify User Text Json fields
			verifyUserTextJson();
			
			//verify Cookie Json contain null value
			verifyUserDesignAddNullValue("CookieJson");
			
			//verify Provider Json contain null value
			verifyUserDesignAddNullValue("ProviderJson");
			
			//verify Category Json contain null value
			verifyUserDesignAddNullValue("CategoryJson");
		}else if(!configurationData && blockingData && languagesData) {
			
			//verify User Design Get Json 
			verifyUserDesignGetJson();
			
			//verify User Design Json contain null value
			verifyUserDesignAddNullValue("UserDesignJson");

			//verify Banner config Json contain null value
			verifyUserDesignAddNullValue("BannerConfigJson");
			
			//verify User Text Json fields
			verifyUserTextJson();
			
			//verify Cookie Json contain valid value
			verifyCookieJson();
			
			//verify Provider Json contain valid value
			verifyProviderJson();
			
			//verify Category Json contain valid value
			verifyCategoryJson();
		}else if(!configurationData && blockingData && !languagesData) {
			
			//verify User Design Get Json 
			verifyUserDesignGetJson();
			
			//verify User Design Json contain null value
			verifyUserDesignAddNullValue("UserDesignJson");

			//verify Banner config Json contain null value
			verifyUserDesignAddNullValue("BannerConfigJson");
			
			//verify User Text Json contain null value
			verifyUserDesignAddNullValue("UserTextJson");
			
			//verify Cookie Json contain valid value
			verifyCookieJson();
			
			//verify Provider Json contain valid value
			verifyProviderJson();
			
			//verify Category Json contain valid value
			verifyCategoryJson();
		}else if(!configurationData && !blockingData && languagesData) {
			//verify User Design Get Json 
			verifyUserDesignGetJson();
			
			//verify User Design Json contain null value
			verifyUserDesignAddNullValue("UserDesignJson");

			//verify Banner config Json contain null value
			verifyUserDesignAddNullValue("BannerConfigJson");
			
			//verify User Text Json fields
			verifyUserTextJson();
			
			//verify Provider Json contain null value
			verifyUserDesignAddNullValue("ProviderJson");
			
			//verify Cookie Json contain null value
			verifyUserDesignAddNullValue("CookieJson");
			
			//verify Category Json contain valid value
			verifyCategoryJson();
		}else if(!configurationData && !blockingData && !languagesData) {
			//verify User Design Get Json 
			verifyUserDesignGetJson();
			
			//verify User Design Json contain null value
			verifyUserDesignAddNullValue("UserDesignJson");

			//verify Banner config Json contain null value
			verifyUserDesignAddNullValue("BannerConfigJson");
			
			//verify User Text Json contain null value
			verifyUserDesignAddNullValue("UserTextJson");
			
			
			//verify Cookie Json contain null value
			verifyUserDesignAddNullValue("CookieJson");
			
			//verify Provider Json contain null value
			verifyUserDesignAddNullValue("ProviderJson");
			
			//verify Category Json contain null value
			verifyUserDesignAddNullValue("CategoryJson");
		}
		
		
	}
	
	
	
	
	
	@Then("Verify New User Design is Added")
	public void verify_New_User_Design_is_Added() {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGet(token, appID);
		
		System.out.println(userDesignGetResponse.getBody().getStatus());
		System.out.println("Get UserDesign ID:"+userDesignGetResponse.getBody().getData().getUserDesignID());
		System.out.println("This Is OnScroll value:"+userDesignGetResponse.getBody().getData().getBannerConfigJSON().getOnScroll());
		System.out.println("UserDesignVersion:"+userDesignGetResponse.getBody().getData().getUserDesignVersion());
		System.out.println("Exception:"+userDesignGetResponse.getException());
	}
	
	@Then("Verify New Changes are Updated into User Design")
	public void verify_New_Changes_are_Updated_into_User_Design() {
	    // Write code here that turns the phrase above into concrete actions
		String token = getScenarioContext().getContext(Context.Token).toString();
		String appID = getScenarioContext().getContext(Context.APP_ID).toString();
		
		userDesignGetResponse = getEndPoints().userDesignGet(token, appID);
		
		System.out.println(userDesignGetResponse.getBody().getStatus());
		System.out.println(userDesignGetResponse.getBody().getData().getUserDesignVersion());
		System.out.println(userDesignGetResponse.getException());
	}
	
	private void verifyUserDesignGetJson() {
		//verify appid and default language
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getAppID() , getScenarioContext().getContext(Context.APP_ID).toString());
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getDefaultLanguage() , "en");
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getUserDesignVersion() == 1);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getLastReIssueVersion() == 1);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getUserDesignID() == Integer.parseInt(getScenarioContext().getContext(Context.UserDesign_ID).toString()));
	}
	
	private void verifyUserDesignJson() {
		//verify all User Design Json fields
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserDesignJSON().getPosition() , "bottom");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserDesignJSON().getTextSize() , "13px");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserDesignJSON().getAnimation() , "fade");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserDesignJSON().getTextColor() , "#ffffff");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserDesignJSON().getBannerColor() , "#32323a");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserDesignJSON().getHeadingSize() , "12px");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserDesignJSON().getBtnTextColor() , "#ffffff");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserDesignJSON().getHeadingColor() , "#86858b");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserDesignJSON().getPrimaryColor() , "#00a99d");
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getUserDesignJSON().getBannerOpacity() == 1);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserDesignJSON().getAnimationSpeed() , "0.3s");
	}
	
	private void verifyBannerConfigJson() {
		//verify Banner config Json fields
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getOnClick() , false);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getOnClose() , false);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getOnScroll() , false);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getReloading() , false);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getUiBlocking() , false);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getGeolocation() , true);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getAcceptExpiry() == 30);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getRejectExpiry() == 30);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getRevokeMethod() , "automatic");
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getScrollOffset() == 200);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getRejectConsent() , true);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getRevokeConsent() , true);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getRevokePosition() , "bottom-left");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getCustomizeConsent() , true);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getPrivacyPolicyUrl() , "");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getPrivacyLinkTarget() , "_blank");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getPrivacyPolicyLink() , true);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getDontSellLinkTarget() , "_blank");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getDontSellLink() , false);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getPreferencesVisible() , false);
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getPrivacyLinkPosition() , "banner");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getBannerConfigJSON().getDontSellLinkPosition() , "message");
	}
	
	private void verifyUserTextJson() {
		//verify User Text Json fields
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getBodyText() , "");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getHeadingText() , "Cookie Notice");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getAcceptBtnText() , "Accept");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getRejectBtnText() , "Reject");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getRevokeBtnText() , "You can revoke or update your consent at any time through this link.");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getPrivacyBtnText() , "Privacy policy");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getDontSellBtnText() , "Do Not Sell");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getPrivacyBodyText() , "If you require more information please visit our Privacy Policy page");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getCustomizeBtnText() , "Customize");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getDontSellBodyText() , "");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getPreferencesBodyText() , "Use the toggles to customize your cookie consent. Learn more about the purpose of each cookie and the companies behind them through the information and links below");
		Assert.assertEquals(userDesignGetResponse.getBody().getData().getUserTextJSON().getPreferencesHeadingText() , "Customize your cookie consent by category.");
	}
	
	private void verifyCookieJson() {
		//verify Cookie Json contain valid value
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getCookieJSON().get(0).getPattern() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getCookieJSON().get(0).getCookieID() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getCookieJSON().get(0).getCategoryID() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getCookieJSON().get(0).getProviderID() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getCookieJSON().get(0).getPatternType() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getCookieJSON().get(0).getPatternFormat() != null);
	}
	
	private void verifyProviderJson() {
		//verify Provider Json contain valid value
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getProviderJSON().get(0).getCategoryID() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getProviderJSON().get(0).getProviderID() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getProviderJSON().get(0).getProviderURL() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getProviderJSON().get(0).getProviderName() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getProviderJSON().get(0).getProviderDescription() != null);
	}
	
	private void verifyCategoryJson() {
		//verify Category Json contain valid value
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getCategoryJSON().get(0).getName() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getCategoryJSON().get(0).getLanguage() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getCategoryJSON().get(0).getCategoryID() != null);
		Assert.assertTrue(userDesignGetResponse.getBody().getData().getCategoryJSON().get(0).getDescription() != null);
	}
	
	private void verifyUserDesignAddNullValue(String keyName) {
		
		switch(keyName) {
			case "UserDesignJson":
				//verify User Design Json contain null value
				Assert.assertTrue(userDesignGetResponse.getBody().getData().getUserDesignJSON() == null);
				
				break;
			case "BannerConfigJson":
				//verify Banner Config Json contain null value
				Assert.assertTrue(userDesignGetResponse.getBody().getData().getBannerConfigJSON() == null);
				
				break;
			case "UserTextJson":
				//verify User Text Json contain null value
				Assert.assertTrue(userDesignGetResponse.getBody().getData().getUserTextJSON() == null);
				
				break;
			case "CookieJson":
				//verify Cookie Json contain null value
				Assert.assertTrue(userDesignGetResponse.getBody().getData().getCookieJSON() == null);

				break;
			case "ProviderJson":
				//verify Provider Json contain null value
				Assert.assertTrue(userDesignGetResponse.getBody().getData().getProviderJSON() == null);
				
				break;
			case "CategoryJson":
				//verify Category Json contain null value
				Assert.assertTrue(userDesignGetResponse.getBody().getData().getCategoryJSON() == null);
				
				break;	
		}
		
	}

}
