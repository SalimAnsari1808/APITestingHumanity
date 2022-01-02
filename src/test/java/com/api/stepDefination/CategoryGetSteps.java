package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.modelEngine.IRestResponse;
import com.api.modelResponse.Category.CategoryGetResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CategoryGetSteps extends BaseSteps{
	
	private IRestResponse<CategoryGetResponse> categoryGetResponse;

	public CategoryGetSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User get published API category using Get Category API JSON$")
	public void user_get_published_API_category_using_Get_Category_API_JSON() throws Throwable {
	
		categoryGetResponse = getEndPoints().categoryGet();
		
		System.out.println(categoryGetResponse.getResponse().getBody().asString());
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Get Category API$")
	public void user_get_valid_response_in_Response_body_of_Get_Category_API(String responseCode) throws Throwable {
		
		Assert.assertTrue(categoryGetResponse.getBody().getStatus()==Integer.parseInt(responseCode));

	}

	@Then("^Response body of Get Category API should have Valid value$")
	public void response_body_of_Get_Category_API_should_have_Valid_value() throws Throwable {
		
		

	}

}
