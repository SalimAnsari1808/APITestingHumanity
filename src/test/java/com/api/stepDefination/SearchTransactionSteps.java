package com.api.stepDefination;

import org.junit.Assert;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelResponse.Payment.PaymentSearchTransactionResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchTransactionSteps extends BaseSteps{
		
	private IRestResponse<PaymentSearchTransactionResponse> paymentSearchTransactionResponse;
	

	public SearchTransactionSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^User pass \"([^\"]*)\" transactionId in Search Transacrion API\\.$")
	public void user_pass_transactionId_in_Search_Transacrion_API(String valueType) throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
				
		if(valueType.equalsIgnoreCase("Correct")) {
			
			paymentSearchTransactionResponse = getEndPoints().paymentSearchTransaction(getScenarioContext().getContext(Context.Payment_TransactionID).toString(), token);
			
		}else if(valueType.equalsIgnoreCase("InCorrect")) {
			
			paymentSearchTransactionResponse = getEndPoints().paymentSearchTransaction("xyzabc", token);
		}
		
	}

	@Then("^User get valid response \"([^\"]*)\" from server for Search Transaction API$")
	public void user_get_valid_response_from_server_for_Search_Transaction_API(String responseCode) throws Throwable {
	    Assert.assertNotEquals(paymentSearchTransactionResponse.getStatusCode(), responseCode);
	}

	@Then("^Response body of Search Transaction API should have \"([^\"]*)\" value$")
	public void response_body_of_Search_Transaction_API_should_have_value(String responseType) throws Throwable {
	    
		if(responseType.equalsIgnoreCase("Valid")) {
			
		}else if(responseType.equalsIgnoreCase("InValid")) {
			Assert.assertEquals(paymentSearchTransactionResponse.getBody().getName(), "notFoundError");
		}	
	}
}