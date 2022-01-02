package com.api.stepDefination;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Company.ProfileCreateRequest;
import com.api.modelResponse.Company.ProfileCreateResponse;

import cucumber.api.java.en.Given;



public class ProfileCreateSteps extends BaseSteps{
	
	private IRestResponse<ProfileCreateResponse> createProfileResponse;

	public ProfileCreateSteps(TestContext testContext) {
		super(testContext);
	}
	
	@Given("Create New Profile")
	public void create_New_Profile() {
		String token = getScenarioContext().getContext(Context.Token).toString(); 
		ProfileCreateRequest createProfileRequest = new ProfileCreateRequest();
		createProfileRequest.setEmailRecovery("sid.tyagi@shreepartners");
		createProfileRequest.setFirstName("Sid");
		createProfileRequest.setLastName("Tyagi");
		createProfileRequest.setPhoneNumber("7834863764");
		createProfileRequest.setProfileID(0);
		
		createProfileResponse = getEndPoints().createProfile(createProfileRequest, token);
		
		System.out.println(createProfileResponse.getStatusCode());
		
		System.out.println("Created Profile with below details");
		System.out.println("EmailRecovery:"+createProfileResponse.getBody().getData().getEmailRecovery());
		System.out.println("FirstName:"+createProfileResponse.getBody().getData().getFirstName());
		System.out.println("LastName:"+createProfileResponse.getBody().getData().getLastName());
		System.out.println("PhoneNumber:"+createProfileResponse.getBody().getData().getPhoneNumber());
		System.out.println("ProfileID:"+createProfileResponse.getBody().getData().getProfileID());
		
		getScenarioContext().setContext(Context.PROFILE_ID, createProfileResponse.getBody().getData().getProfileID());
	}

}
