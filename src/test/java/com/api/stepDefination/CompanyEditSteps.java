package com.api.stepDefination;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Company.CompanyEditNumberEmailRequest;
import com.api.modelRequest.Company.CompanyEditNumberNameRequest;
import com.api.modelRequest.Company.CompanyEditRequest;
import com.api.modelRequest.Company.CompanyEditStringCompanyIdRequest;
import com.api.modelRequest.Company.CompanyEditWithoutCompanyIdRequest;
import com.api.modelRequest.Company.CompanyEditWithoutEmailRequest;
import com.api.modelRequest.Company.CompanyEditWithoutNameRequest;
import com.api.modelResponse.Company.CompanyEditResponse;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class CompanyEditSteps extends BaseSteps{
	
	private IRestResponse<CompanyEditResponse> companyEditResponse;

	public CompanyEditSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("User connect to Edit Company API URL")
	public void user_connect_to_Edit_Company_API_URL() {
		//Do Nothing
	}
	
	
	@When("^User enter Company details using Edit Company JSON$")
	public void user_enter_Company_details_using_Edit_Company_JSON() throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		Integer companyID = Integer.parseInt(getScenarioContext().getContext(Context.companyID).toString());
		
		CompanyEditRequest companyEditRequest = new CompanyEditRequest();
		
		companyEditRequest.setCompanyID(companyID);
		companyEditRequest.setName("Shree Infosoft");
		companyEditRequest.setVATID("NP438934");
		companyEditRequest.setFirstName("Shree");
		companyEditRequest.setLastName("Infosoft");
		companyEditRequest.setRole("1");
		companyEditRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
		companyEditRequest.setCity("Gurgaon");
		companyEditRequest.setState("Haryana");
		companyEditRequest.setCountry("India");
		companyEditRequest.setZipCode("120002");
		companyEditRequest.setPhone("+91 0124-672-8815");
		companyEditRequest.setEmail("connect@shreepartners.com");
		companyEditRequest.setURL("https://www.shreepartners.com");
		companyEditRequest.setPrivacyNotice("https://www.shreepartners.com");
		
		companyEditResponse = getEndPoints().editCompany(companyEditRequest, token);
	}
	
	@When("^User pass \"([^\"]*)\" Edit Company JSON$")
	public void user_pass_Edit_Company_JSON(String requestfield) throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		Integer companyID = Integer.parseInt(getScenarioContext().getContext(Context.companyID).toString());
		
		if(requestfield.equalsIgnoreCase("NoCompanyIdKey")) {
			CompanyEditWithoutCompanyIdRequest companyEditWithoutCompanyIdRequest = new CompanyEditWithoutCompanyIdRequest();
			
			companyEditWithoutCompanyIdRequest.setName("Shree Infosoft");
			companyEditWithoutCompanyIdRequest.setVATID("NP438934");
			companyEditWithoutCompanyIdRequest.setFirstName("Shree");
			companyEditWithoutCompanyIdRequest.setLastName("Infosoft");
			companyEditWithoutCompanyIdRequest.setRole("1");
			companyEditWithoutCompanyIdRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditWithoutCompanyIdRequest.setCity("Gurgaon");
			companyEditWithoutCompanyIdRequest.setState("Haryana");
			companyEditWithoutCompanyIdRequest.setCountry("India");
			companyEditWithoutCompanyIdRequest.setZipCode("120002");
			companyEditWithoutCompanyIdRequest.setPhone("+91 0124-672-8815");
			companyEditWithoutCompanyIdRequest.setEmail("connect@shreepartners.com");
			companyEditWithoutCompanyIdRequest.setURL("https://www.shreepartners.com");
			companyEditWithoutCompanyIdRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompanyWithoutCompanyId(companyEditWithoutCompanyIdRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("NoNameKey")) {
			CompanyEditWithoutNameRequest companyEditWithoutNameRequest = new CompanyEditWithoutNameRequest();
			
			companyEditWithoutNameRequest.setCompanyID(companyID);
			companyEditWithoutNameRequest.setVATID("NP438934");
			companyEditWithoutNameRequest.setFirstName("Shree");
			companyEditWithoutNameRequest.setLastName("Infosoft");
			companyEditWithoutNameRequest.setRole("1");
			companyEditWithoutNameRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditWithoutNameRequest.setCity("Gurgaon");
			companyEditWithoutNameRequest.setState("Haryana");
			companyEditWithoutNameRequest.setCountry("India");
			companyEditWithoutNameRequest.setZipCode("120002");
			companyEditWithoutNameRequest.setPhone("+91 0124-672-8815");
			companyEditWithoutNameRequest.setEmail("connect@shreepartners.com");
			companyEditWithoutNameRequest.setURL("https://www.shreepartners.com");
			companyEditWithoutNameRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompanyWithoutName(companyEditWithoutNameRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("NoEmailKey")) {
			CompanyEditWithoutEmailRequest companyEditWithoutEmailRequest = new CompanyEditWithoutEmailRequest();
			
			companyEditWithoutEmailRequest.setCompanyID(companyID);
			companyEditWithoutEmailRequest.setName("Shree Infosoft");
			companyEditWithoutEmailRequest.setVATID("NP438934");
			companyEditWithoutEmailRequest.setFirstName("Shree");
			companyEditWithoutEmailRequest.setLastName("Infosoft");
			companyEditWithoutEmailRequest.setRole("1");
			companyEditWithoutEmailRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditWithoutEmailRequest.setCity("Gurgaon");
			companyEditWithoutEmailRequest.setState("Haryana");
			companyEditWithoutEmailRequest.setCountry("India");
			companyEditWithoutEmailRequest.setZipCode("120002");
			companyEditWithoutEmailRequest.setPhone("+91 0124-672-8815");
			companyEditWithoutEmailRequest.setURL("https://www.shreepartners.com");
			companyEditWithoutEmailRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompanyWithoutEmail(companyEditWithoutEmailRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("NullCompanyIdValue")) {
			CompanyEditRequest companyEditRequest = new CompanyEditRequest();
			
			companyEditRequest.setCompanyID(null);
			companyEditRequest.setName("Shree Infosoft");
			companyEditRequest.setVATID("NP438934");
			companyEditRequest.setFirstName("Shree");
			companyEditRequest.setLastName("Infosoft");
			companyEditRequest.setRole("1");
			companyEditRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditRequest.setCity("Gurgaon");
			companyEditRequest.setState("Haryana");
			companyEditRequest.setCountry("India");
			companyEditRequest.setZipCode("120002");
			companyEditRequest.setPhone("+91 0124-672-8815");
			companyEditRequest.setEmail("connect@shreepartners.com");
			companyEditRequest.setURL("https://www.shreepartners.com");
			companyEditRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompany(companyEditRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("NullNameValue")) {
			CompanyEditRequest companyEditRequest = new CompanyEditRequest();
			
			companyEditRequest.setCompanyID(companyID);
			companyEditRequest.setName(null);
			companyEditRequest.setVATID("NP438934");
			companyEditRequest.setFirstName("Shree");
			companyEditRequest.setLastName("Infosoft");
			companyEditRequest.setRole("1");
			companyEditRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditRequest.setCity("Gurgaon");
			companyEditRequest.setState("Haryana");
			companyEditRequest.setCountry("India");
			companyEditRequest.setZipCode("120002");
			companyEditRequest.setPhone("+91 0124-672-8815");
			companyEditRequest.setEmail("connect@shreepartners.com");
			companyEditRequest.setURL("https://www.shreepartners.com");
			companyEditRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompany(companyEditRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("NullEmailValue")) {
			CompanyEditRequest companyEditRequest = new CompanyEditRequest();
			
			companyEditRequest.setCompanyID(companyID);
			companyEditRequest.setName("Shree Infosoft");
			companyEditRequest.setVATID("NP438934");
			companyEditRequest.setFirstName("Shree");
			companyEditRequest.setLastName("Infosoft");
			companyEditRequest.setRole("1");
			companyEditRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditRequest.setCity("Gurgaon");
			companyEditRequest.setState("Haryana");
			companyEditRequest.setCountry("India");
			companyEditRequest.setZipCode("120002");
			companyEditRequest.setPhone("+91 0124-672-8815");
			companyEditRequest.setEmail(null);
			companyEditRequest.setURL("https://www.shreepartners.com");
			companyEditRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompany(companyEditRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("StringCompanyIdValue")){
			CompanyEditStringCompanyIdRequest companyEditStringCompanyIdRequest = new CompanyEditStringCompanyIdRequest();
			
			companyEditStringCompanyIdRequest.setCompanyID("1");
			companyEditStringCompanyIdRequest.setName("Shree Infosoft");
			companyEditStringCompanyIdRequest.setVATID("NP438934");
			companyEditStringCompanyIdRequest.setFirstName("Shree");
			companyEditStringCompanyIdRequest.setLastName("Infosoft");
			companyEditStringCompanyIdRequest.setRole("1");
			companyEditStringCompanyIdRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditStringCompanyIdRequest.setCity("Gurgaon");
			companyEditStringCompanyIdRequest.setState("Haryana");
			companyEditStringCompanyIdRequest.setCountry("India");
			companyEditStringCompanyIdRequest.setZipCode("120002");
			companyEditStringCompanyIdRequest.setPhone("+91 0124-672-8815");
			companyEditStringCompanyIdRequest.setEmail("connect@shreepartners.com");
			companyEditStringCompanyIdRequest.setURL("https://www.shreepartners.com");
			companyEditStringCompanyIdRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompanyStringCompantId(companyEditStringCompanyIdRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("NumberNameValue")) {
			CompanyEditNumberNameRequest companyEditNumberNameRequest = new CompanyEditNumberNameRequest();
			
			companyEditNumberNameRequest.setCompanyID(companyID);
			companyEditNumberNameRequest.setName(123);
			companyEditNumberNameRequest.setVATID("NP438934");
			companyEditNumberNameRequest.setFirstName("Shree");
			companyEditNumberNameRequest.setLastName("Infosoft");
			companyEditNumberNameRequest.setRole("1");
			companyEditNumberNameRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditNumberNameRequest.setCity("Gurgaon");
			companyEditNumberNameRequest.setState("Haryana");
			companyEditNumberNameRequest.setCountry("India");
			companyEditNumberNameRequest.setZipCode("120002");
			companyEditNumberNameRequest.setPhone("+91 0124-672-8815");
			companyEditNumberNameRequest.setEmail("connect@shreepartners.com");
			companyEditNumberNameRequest.setURL("https://www.shreepartners.com");
			companyEditNumberNameRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompanyNumberName(companyEditNumberNameRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("NumberEmailValue")) {
			CompanyEditNumberEmailRequest companyEditNumberEmailRequest = new CompanyEditNumberEmailRequest();
			
			companyEditNumberEmailRequest.setCompanyID(companyID);
			companyEditNumberEmailRequest.setName("Shree Infosoft");
			companyEditNumberEmailRequest.setVATID("NP438934");
			companyEditNumberEmailRequest.setFirstName("Shree");
			companyEditNumberEmailRequest.setLastName("Infosoft");
			companyEditNumberEmailRequest.setRole("1");
			companyEditNumberEmailRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditNumberEmailRequest.setCity("Gurgaon");
			companyEditNumberEmailRequest.setState("Haryana");
			companyEditNumberEmailRequest.setCountry("India");
			companyEditNumberEmailRequest.setZipCode("120002");
			companyEditNumberEmailRequest.setPhone("+91 0124-672-8815");
			companyEditNumberEmailRequest.setEmail(123);
			companyEditNumberEmailRequest.setURL("https://www.shreepartners.com");
			companyEditNumberEmailRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompanyNumberEmail(companyEditNumberEmailRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("EmptyNameValue")) {
			CompanyEditRequest companyEditRequest = new CompanyEditRequest();
			
			companyEditRequest.setCompanyID(companyID);
			companyEditRequest.setName("");
			companyEditRequest.setVATID("NP438934");
			companyEditRequest.setFirstName("Shree");
			companyEditRequest.setLastName("Infosoft");
			companyEditRequest.setRole("1");
			companyEditRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditRequest.setCity("Gurgaon");
			companyEditRequest.setState("Haryana");
			companyEditRequest.setCountry("India");
			companyEditRequest.setZipCode("120002");
			companyEditRequest.setPhone("+91 0124-672-8815");
			companyEditRequest.setEmail("connect@shreepartners.com");
			companyEditRequest.setURL("https://www.shreepartners.com");
			companyEditRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompany(companyEditRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("EmptyEmailValue")) {
			CompanyEditRequest companyEditRequest = new CompanyEditRequest();
			
			companyEditRequest.setCompanyID(companyID);
			companyEditRequest.setName("Shree Infosoft");
			companyEditRequest.setVATID("NP438934");
			companyEditRequest.setFirstName("Shree");
			companyEditRequest.setLastName("Infosoft");
			companyEditRequest.setRole("1");
			companyEditRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditRequest.setCity("Gurgaon");
			companyEditRequest.setState("Haryana");
			companyEditRequest.setCountry("India");
			companyEditRequest.setZipCode("120002");
			companyEditRequest.setPhone("+91 0124-672-8815");
			companyEditRequest.setEmail("");
			companyEditRequest.setURL("https://www.shreepartners.com");
			companyEditRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompany(companyEditRequest, token);
			
			return;
		}else if(requestfield.equalsIgnoreCase("InvalidCompanyIdValue")) {
			CompanyEditRequest companyEditRequest = new CompanyEditRequest();
			
			companyEditRequest.setCompanyID(companyID+1234);
			companyEditRequest.setName("Shree Infosoft");
			companyEditRequest.setVATID("NP12345");
			companyEditRequest.setFirstName("Shree");
			companyEditRequest.setLastName("Infosoft");
			companyEditRequest.setRole("1");
			companyEditRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
			companyEditRequest.setCity("Gurgaon");
			companyEditRequest.setState("Haryana");
			companyEditRequest.setCountry("India");
			companyEditRequest.setZipCode("120002");
			companyEditRequest.setPhone("+91 0124-672-8815");
			companyEditRequest.setEmail("connect@shreepartners.com");
			companyEditRequest.setURL("https://www.shreepartners.com");
			companyEditRequest.setPrivacyNotice("https://www.shreepartners.com");
			
			companyEditResponse = getEndPoints().editCompany(companyEditRequest, token);
			
			return;
		}
	}
	
	@When("^User pass Email \"([^\"]*)\" in Edit Company JSON$")
	public void user_pass_Email_in_Edit_Company_JSON(String emailValue) throws Throwable {
		String token = getScenarioContext().getContext(Context.Token).toString();
		Integer companyID = Integer.parseInt(getScenarioContext().getContext(Context.companyID).toString());
		
		CompanyEditRequest companyEditRequest = new CompanyEditRequest();
		
		companyEditRequest.setCompanyID(companyID);
		companyEditRequest.setName("Shree Infosoft");
		companyEditRequest.setVATID("NP438934");
		companyEditRequest.setFirstName("Shree");
		companyEditRequest.setLastName("Infosoft");
		companyEditRequest.setRole("1");
		companyEditRequest.setAddress("Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
		companyEditRequest.setCity("Gurgaon");
		companyEditRequest.setState("Haryana");
		companyEditRequest.setCountry("India");
		companyEditRequest.setZipCode("120002");
		companyEditRequest.setPhone("+91 0124-672-8815");
		companyEditRequest.setEmail(emailValue);
		companyEditRequest.setURL("https://www.shreepartners.com");
		companyEditRequest.setPrivacyNotice("https://www.shreepartners.com");
		
		companyEditResponse = getEndPoints().editCompany(companyEditRequest, token);
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Edit Company API$")
	public void user_get_valid_response_in_Response_body_of_Edit_Company_API(String responseCode) throws Throwable {
		Assert.assertTrue(companyEditResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Edit Company API$")
	public void user_get_valid_response_from_server_for_Edit_Company_API(String responseCode) throws Throwable {
		System.out.println("Status Code-->"+companyEditResponse.getStatusCode());
		Assert.assertTrue(companyEditResponse.getStatusCode()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Edit Company API should have Valid value$")
	public void response_body_of_Edit_Company_API_should_have_Valid_value() throws Throwable {
		int companyID = Integer.parseInt(getScenarioContext().getContext(Context.companyID).toString());
		
		Assert.assertTrue(companyEditResponse.getBody().getData().getCompanyID()==companyID);
		Assert.assertEquals(companyEditResponse.getBody().getData().getName(), "Shree Infosoft");
		Assert.assertEquals(companyEditResponse.getBody().getData().getVATID(), "NP438934");
		Assert.assertEquals(companyEditResponse.getBody().getData().getFirstName(), "Shree");
		Assert.assertEquals(companyEditResponse.getBody().getData().getLastName(), "Infosoft");
		Assert.assertEquals(companyEditResponse.getBody().getData().getRole(), "1");
		Assert.assertEquals(companyEditResponse.getBody().getData().getAddress(), "Corporate Edge,Level 1, Tower A,Building 10, CyberCity,DLF Phase II");
		Assert.assertEquals(companyEditResponse.getBody().getData().getCity(), "Gurgaon");
		Assert.assertEquals(companyEditResponse.getBody().getData().getState(), "Haryana");
		Assert.assertEquals(companyEditResponse.getBody().getData().getCountry(), "India");
		Assert.assertEquals(companyEditResponse.getBody().getData().getZipCode(), "120002");
		Assert.assertEquals(companyEditResponse.getBody().getData().getPhone(), "+91 0124-672-8815");
		Assert.assertEquals(companyEditResponse.getBody().getData().getEmail(), "connect@shreepartners.com");
		Assert.assertEquals(companyEditResponse.getBody().getData().getURL(), "https://www.shreepartners.com");
		Assert.assertEquals(companyEditResponse.getBody().getData().getPrivacyNotice(), "https://www.shreepartners.com");
	}

	@Then("^Response body of Edit Company API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Edit_Company_API_should_have_Error_value(String errorValue) throws Throwable {
		final String NO_COMPANYID_KEY = "\"CompanyID\" is required";
		final String NO_NAME_KEY = "\"Name\" is required";
		final String NO_EMAIL_KEY = "\"Email\" is required";
		final String NULL_COMPANYID_VALUE =  "\"CompanyID\" must be a number";
		final String NULL_NAME_VALUE = "\"Name\" must be a string";
		final String NULL_EMAIL_VALUE = "\"Email\" must be a string";
		final String STRING_COMPANYID_VALUE = "\"CompanyID\" must be a number";
		final String NUMBER_NAME_VALUE = "\"Name\" must be a string";
		final String NUMBER_EMAIL_VALUE = "\"Email\" must be a string";
		final String EMPTY_NAME_VALUE = "\"Name\" is not allowed to be empty";
		final String EMPTY_EMAIL_VALUE = "\"Email\" is not allowed to be empty";
		final String INVALID_EMAIL_VALUE = "\"Email\"  must be a valid email";
		
		String err_msg = null;
		
	    if(errorValue.equalsIgnoreCase("NoCompanyIdKey")) {
	    	err_msg = NO_COMPANYID_KEY;
	    }else if(errorValue.equalsIgnoreCase("NoNameKey")) {
	    	err_msg = NO_NAME_KEY;
	    }else if(errorValue.equalsIgnoreCase("NoEmailKey")) {
	    	err_msg = NO_EMAIL_KEY;
	    }else if(errorValue.equalsIgnoreCase("NullCompanyIdValue")) {
	    	err_msg = NULL_COMPANYID_VALUE;
	    }else if(errorValue.equalsIgnoreCase("NullNameValue")) {
	    	err_msg = NULL_NAME_VALUE;
	    }else if(errorValue.equalsIgnoreCase("NullEmailValue")) {
	    	err_msg = NULL_EMAIL_VALUE;
	    }else if(errorValue.equalsIgnoreCase("StringCompanyIdValue")) {
	    	err_msg = STRING_COMPANYID_VALUE;
	    }else if(errorValue.equalsIgnoreCase("NumberNameValue")) {
	    	err_msg = NUMBER_NAME_VALUE;
	    }else if(errorValue.equalsIgnoreCase("EmptyNameValue")) {
	    	err_msg = EMPTY_NAME_VALUE;
	    }else if(errorValue.equalsIgnoreCase("EmptyEmailValue")) {
	    	err_msg = EMPTY_EMAIL_VALUE;
	    }else if(errorValue.equalsIgnoreCase("NumberEmailValue")) {
	    	err_msg = NUMBER_EMAIL_VALUE;
	    }else if(errorValue.equalsIgnoreCase("InvalidEmailValue")) {
	    	err_msg = INVALID_EMAIL_VALUE;
	    }
	   
	    System.out.println("Error:"+companyEditResponse.getBody().getError());
	    Assert.assertEquals(companyEditResponse.getBody().getError(), err_msg);
	}
	
	@Then("^Response body of Edit Company API should have data null\\.$")
	public void response_body_of_Edit_Company_API_should_have_data_null() throws Throwable {
		 Assert.assertTrue(companyEditResponse.getBody().getData()==null);
	}
}
