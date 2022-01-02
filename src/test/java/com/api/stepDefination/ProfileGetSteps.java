package com.api.stepDefination;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelResponse.Company.ProfileGetResponse;

import cucumber.api.java.en.Given;



public class ProfileGetSteps extends BaseSteps{
	
	private IRestResponse<ProfileGetResponse> getProfileResponse;

	public ProfileGetSteps(TestContext testContext) {
		super(testContext);
	}
	
	@Given("Get New Created Profile")
	public void get_New_Created_Profile() {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		getProfileResponse = getEndPoints().getProfile(token);
		
		System.out.println(getProfileResponse.getStatusCode());
		
		System.out.println("Get Profile with below details");
		System.out.println("EmailRecovery:"+getProfileResponse.getBody().getData().getEmailRecovery());
		System.out.println("FirstName:"+getProfileResponse.getBody().getData().getFirstName());
		System.out.println("LastName:"+getProfileResponse.getBody().getData().getLastName());
		System.out.println("PhoneNumber:"+getProfileResponse.getBody().getData().getPhoneNumber());
		System.out.println("ProfileID:"+getProfileResponse.getBody().getData().getProfileID());

	}

	@Given("Check Profile is Update")
	public void check_Profile_is_Update() {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		getProfileResponse = getEndPoints().getProfile(token);
		
		System.out.println(getProfileResponse.getStatusCode());
		
		System.out.println("Get Profile with below details");
		System.out.println("EmailRecovery:"+getProfileResponse.getBody().getData().getEmailRecovery());
		System.out.println("FirstName:"+getProfileResponse.getBody().getData().getFirstName());
		System.out.println("LastName:"+getProfileResponse.getBody().getData().getLastName());
		System.out.println("PhoneNumber:"+getProfileResponse.getBody().getData().getPhoneNumber());
		System.out.println("ProfileID:"+getProfileResponse.getBody().getData().getProfileID());

		
		System.out.println(getScenarioContext().isContains(Context.ADMIN_USERNAME));
		System.out.println(getScenarioContext().isContains(Context.ADMIN_PASSWORD));
		System.out.println(getScenarioContext().isContains(Context.APP_ID));
		System.out.println(getScenarioContext().isContains(Context.PROFILE_ID));
		System.out.println(getScenarioContext().isContains(Context.RESET_PASSWORD_EXPIRE_TIME));
		System.out.println(getScenarioContext().isContains(Context.RESET_PASSWORD_PASSWORD));
	}

}
