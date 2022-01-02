package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelResponse.Payment.PaymentSearchSubscriptionResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchSubscriptionSteps extends BaseSteps{
		
	private IRestResponse<PaymentSearchSubscriptionResponse> paymentSearchSubscriptionResponse;
	
	public SearchSubscriptionSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User pass \"([^\"]*)\" transactionId in Search Subscription API\\.$")
	public void user_pass_transactionId_in_Search_Subscription_API(String valueType) throws Throwable {
	    
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		if(valueType.equalsIgnoreCase("Correct")) {
			
			paymentSearchSubscriptionResponse = getEndPoints().paymentSearchSubscription(getScenarioContext().getContext(Context.Payment_SubscriptionID).toString(), token);
			
		}else if(valueType.equalsIgnoreCase("InCorrect")) {
			
			paymentSearchSubscriptionResponse = getEndPoints().paymentSearchSubscription("xyzabc", token);
		}
		
	}

	@Then("^User get valid response \"([^\"]*)\" from server for Search Subscription API$")
	public void user_get_valid_response_from_server_for_Search_Subscription_API(String responseCode) throws Throwable {
		Assert.assertNotEquals(paymentSearchSubscriptionResponse.getStatusCode(), responseCode);
	}

	@Then("^Response body of Search Subscription API should have \"([^\"]*)\" value$")
	public void response_body_of_Search_Subscription_API_should_have_value(String responseType) throws Throwable {
	    
		if(responseType.equalsIgnoreCase("Valid")) {
			
		}else if(responseType.equalsIgnoreCase("InValid")) {
			Assert.assertEquals(paymentSearchSubscriptionResponse.getBody().getName(), "notFoundError");
		}	
		
	}
}