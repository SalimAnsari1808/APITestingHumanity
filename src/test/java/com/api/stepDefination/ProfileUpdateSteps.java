package com.api.stepDefination;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Company.ProfileUpdateRequest;
import com.api.modelResponse.Company.ProfileUpdateResponse;

import cucumber.api.java.en.Given;



public class ProfileUpdateSteps extends BaseSteps{
	
	private IRestResponse<ProfileUpdateResponse> updateProfileResponse;

	public ProfileUpdateSteps(TestContext testContext) {
		super(testContext);
	}
	
	@Given("Update New Created Profile")
	public void update_New_Created_Profile() {
		String token = getScenarioContext().getContext(Context.Token).toString(); 
		ProfileUpdateRequest updateProfileRequest = new ProfileUpdateRequest();
		updateProfileRequest.setEmailRecovery("sid.tyagi@shreepartners.com");
		updateProfileRequest.setFirstName("Pankaj");
		updateProfileRequest.setLastName("Chauhan");
		updateProfileRequest.setPhoneNumber("7834863764");
		updateProfileRequest.setProfileID(Integer.parseInt(getScenarioContext().getContext(Context.PROFILE_ID).toString()));
		
		updateProfileResponse = getEndPoints().updateProfile(updateProfileRequest, token);
		
		System.out.println(updateProfileResponse.getStatusCode());
		
		System.out.println("Updated Profile with below details");
		System.out.println(updateProfileResponse.getResponse().getBody().asString());
		System.out.println("EmailRecovery:"+updateProfileResponse.getBody().getData().getEmailRecovery());
		System.out.println("FirstName:"+updateProfileResponse.getBody().getData().getFirstName());
		System.out.println("LastName:"+updateProfileResponse.getBody().getData().getLastName());
		System.out.println("PhoneNumber:"+updateProfileResponse.getBody().getData().getPhoneNumber());
		System.out.println("ProfileID:"+updateProfileResponse.getBody().getData().getProfileID());
	}

}
