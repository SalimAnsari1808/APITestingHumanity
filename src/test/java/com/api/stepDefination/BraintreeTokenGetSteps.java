package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;

import com.api.modelResponse.Payment.PaymentBrainTreeGetResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BraintreeTokenGetSteps extends BaseSteps{
	
	private IRestResponse<PaymentBrainTreeGetResponse> paymentBrainTreeGetResponse;

	public BraintreeTokenGetSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User get token using Get Braintree Token JSON$")
	public void user_get_token_using_Get_Braintree_Token_JSON() throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		paymentBrainTreeGetResponse = getEndPoints().braintreeGet(token);

		//System.out.println(paymentBrainTreeGetResponse.getResponse().getBody().asString());
	}

	@Then("^User get valid response \"([^\"]*)\" from server for Get Braintree Token API$")
	public void user_get_valid_response_from_server_for_Get_Braintree_Token_API(String responseCode) throws Throwable {
		Assert.assertTrue(paymentBrainTreeGetResponse.getStatusCode()==Integer.parseInt(responseCode));

	}

	@Then("^Response body of Get Braintree Token API should have Valid value$")
	public void response_body_of_Get_Braintree_Token_API_should_have_Valid_value() throws Throwable {
		Assert.assertTrue(paymentBrainTreeGetResponse.getBody().getToken()!=null);
	}



}
