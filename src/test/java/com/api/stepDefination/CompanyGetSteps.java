package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelResponse.Company.CompanyGetResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CompanyGetSteps extends BaseSteps{
	
	private IRestResponse<CompanyGetResponse> companyGetResponse;

	public CompanyGetSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User get Company details using Get Company JSON$")
	public void user_get_Company_details_using_Get_Company_JSON() throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		companyGetResponse = getEndPoints().getCompany(token);
		
		System.out.println("Get Company Response-->"+companyGetResponse.getResponse().getBody().asString());
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Get Company API$")
	public void user_get_valid_response_in_Response_body_of_Get_Company_API(String responseCode) throws Throwable {
		Assert.assertTrue(companyGetResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Get Company API should have Valid value$")
	public void response_body_of_Get_Company_API_should_have_Valid_value() throws Throwable {
		Integer companyID = Integer.parseInt(getScenarioContext().getContext(Context.companyID).toString());
		
		Assert.assertTrue(companyGetResponse.getBody().getData().getCompanyID()-companyID==0);
		Assert.assertEquals(companyGetResponse.getBody().getData().getName(), "Shree Infosoft");
		Assert.assertEquals(companyGetResponse.getBody().getData().getVATID(), "NP438934");
		Assert.assertEquals(companyGetResponse.getBody().getData().getFirstName(), "Shree");
		Assert.assertEquals(companyGetResponse.getBody().getData().getLastName(), "Infosoft");
		Assert.assertEquals(companyGetResponse.getBody().getData().getRole(), "1");
		Assert.assertEquals(companyGetResponse.getBody().getData().getAddress(), "Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
		Assert.assertEquals(companyGetResponse.getBody().getData().getCity(), "Gurgaon");
		Assert.assertEquals(companyGetResponse.getBody().getData().getState(), "Haryana");
		Assert.assertEquals(companyGetResponse.getBody().getData().getCountry(), "India");
		Assert.assertEquals(companyGetResponse.getBody().getData().getZipCode(), "120002");
		Assert.assertEquals(companyGetResponse.getBody().getData().getPhone(), "+91 0124-672-8815");
		Assert.assertEquals(companyGetResponse.getBody().getData().getEmail(), "connect@shreepartners.com");
		Assert.assertEquals(companyGetResponse.getBody().getData().getURL(), "https://www.shreepartners.com");
		Assert.assertEquals(companyGetResponse.getBody().getData().getPrivacyNotice(), "https://www.shreepartners.com");
	}

}
