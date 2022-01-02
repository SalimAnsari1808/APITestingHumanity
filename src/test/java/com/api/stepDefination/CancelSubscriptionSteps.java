package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Payment.PaymentCancelSubscriptionNumberAppIdRequest;
import com.api.modelRequest.Payment.PaymentCancelSubscriptionRequest;
import com.api.modelResponse.Payment.PaymentCancelSubscriptionResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CancelSubscriptionSteps extends BaseSteps{
		
	private IRestResponse<PaymentCancelSubscriptionResponse> paymentCancelSubscriptionResponse;
	
	public CancelSubscriptionSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User pass \"([^\"]*)\" AppId in Cancel Subscription API\\.$")
	public void user_pass_AppId_in_Cancel_Subscription_API(String requestType) throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
	    
		if(requestType.equalsIgnoreCase("PreCreated")) {
			
			PaymentCancelSubscriptionRequest paymentCancelSubscriptionRequest = new PaymentCancelSubscriptionRequest();
			paymentCancelSubscriptionRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			
			paymentCancelSubscriptionResponse = getEndPoints().paymentCancelSubscription(paymentCancelSubscriptionRequest, token);
			
			return;
			
		}else if(requestType.equalsIgnoreCase("NoAppId")) {
			
			paymentCancelSubscriptionResponse = getEndPoints().paymentCancelSubscriptionWithoutAppId(token);
			return;
		}else if(requestType.equalsIgnoreCase("NumberAppId")) {
			PaymentCancelSubscriptionNumberAppIdRequest paymentCancelSubscriptionNumberAppIdRequest = new PaymentCancelSubscriptionNumberAppIdRequest();
			paymentCancelSubscriptionNumberAppIdRequest.setAppID(1234);
			
			paymentCancelSubscriptionResponse = getEndPoints().paymentCancelSubscriptionNumberAppId(paymentCancelSubscriptionNumberAppIdRequest, token);
			return;
		}else if(requestType.equalsIgnoreCase("EmptyAppId")) {
			
			PaymentCancelSubscriptionRequest paymentCancelSubscriptionRequest = new PaymentCancelSubscriptionRequest();
			paymentCancelSubscriptionRequest.setAppID("");
			
			paymentCancelSubscriptionResponse = getEndPoints().paymentCancelSubscription(paymentCancelSubscriptionRequest, token);
			
			return;
			
		}else if(requestType.equalsIgnoreCase("NullAppId")) {
			
			PaymentCancelSubscriptionRequest paymentCancelSubscriptionRequest = new PaymentCancelSubscriptionRequest();
			paymentCancelSubscriptionRequest.setAppID(null);
			
			paymentCancelSubscriptionResponse = getEndPoints().paymentCancelSubscription(paymentCancelSubscriptionRequest, token);
			
			return;
			
		}else if(requestType.equalsIgnoreCase("InValidAppId")) {
			
			PaymentCancelSubscriptionRequest paymentCancelSubscriptionRequest = new PaymentCancelSubscriptionRequest();
			paymentCancelSubscriptionRequest.setAppID("loc12");
			
			paymentCancelSubscriptionResponse = getEndPoints().paymentCancelSubscription(paymentCancelSubscriptionRequest, token);
			
			return;
			
		}
		
	}

	@Then("^User get valid response \"([^\"]*)\" from server for Cancel Subscription API$")
	public void user_get_valid_response_from_server_for_Cancel_Subscription_API(String responseCode) throws Throwable {
	    if(paymentCancelSubscriptionResponse.getBody().getStatus()==null) {
	    	Assert.assertEquals(paymentCancelSubscriptionResponse.getStatusCode(), Integer.parseInt(responseCode));
	    }else {
	    	//Assert.assertEquals(paymentCancelSubscriptionResponse.getBody().getStatus(), Integer.parseInt(responseCode));
	    	Assert.assertEquals((int)paymentCancelSubscriptionResponse.getBody().getStatus(), Integer.parseInt(responseCode));
	    }
	}

	@Then("^Response body of Cancel Subscription API should have \"([^\"]*)\" value$")
	public void response_body_of_Cancel_Subscription_API_should_have_value(String responseType) throws Throwable {
		
		final String REQUIRED_APPID = "\"appID\" is required";
		final String STRING_APPID	= "\"appID\" must be a string";
		final String NOT_EMPTY_APPID	= "\"appID\" is not allowed to be empty";
		final String NO_APP_FOUND		= "No apps found";
		final String CANCEL_SUBSCRIPTION	= "Subscription has already been canceled.";
	 
		if(responseType.equalsIgnoreCase("Valid")) {
			Assert.assertEquals(paymentCancelSubscriptionResponse.getBody().getData().getSuccess(), true);
		}else if(responseType.equalsIgnoreCase("RequiredAppId")) {
			Assert.assertEquals(paymentCancelSubscriptionResponse.getBody().getError(), REQUIRED_APPID);
		}else if(responseType.equalsIgnoreCase("StringAppId")) {
			Assert.assertEquals(paymentCancelSubscriptionResponse.getBody().getError(), STRING_APPID);
		}else if(responseType.equalsIgnoreCase("NotEmptyAppId")) {
			Assert.assertEquals(paymentCancelSubscriptionResponse.getBody().getError(), NOT_EMPTY_APPID);
		}else if(responseType.equalsIgnoreCase("InValidAppId")) {
			Assert.assertEquals(paymentCancelSubscriptionResponse.getBody().getMessage(), NO_APP_FOUND);
		}else if(responseType.equalsIgnoreCase("AlreadyCanceled")) {
			Assert.assertEquals(paymentCancelSubscriptionResponse.getBody().getData().getMessage(), CANCEL_SUBSCRIPTION);
		}
	}
}