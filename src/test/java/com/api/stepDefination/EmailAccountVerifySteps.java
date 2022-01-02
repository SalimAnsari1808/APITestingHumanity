package com.api.stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Email.EmailAccountVerifyNumberAdminIdRequest;
import com.api.modelRequest.Email.EmailAccountVerifyNumberLanguageRequest;
import com.api.modelRequest.Email.EmailAccountVerifyRequest;
import com.api.modelRequest.Email.EmailAccountVerifyWithoutAdminIdRequest;
import com.api.modelRequest.Email.EmailAccountVerifyWithoutLanguageRequest;
import com.api.modelResponse.Email.EmailAccountVerifyResponse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class EmailAccountVerifySteps extends BaseSteps{
	
	private IRestResponse<EmailAccountVerifyResponse> emailAccountVerifyResponse;

	public EmailAccountVerifySteps(TestContext testContext) {
		super(testContext);
	}
	
	@Given("User connect to sendAccountVerifyEmail URL")
	public void user_connect_to_sendAccountVerifyEmail_URL() {
		//Do Nothing
	}
	
	
	@When("^User enter AdminId \"([^\"]*)\" and Language \"([^\"]*)\" using Email Account Verify JSON$")
	public void user_enter_AdminId_and_Language_using_Email_Account_Verify_JSON(String email, String language) throws Throwable {
		
		if(email.equalsIgnoreCase("NoAdminIdkey")) {
			EmailAccountVerifyWithoutAdminIdRequest emailAccountVerifyWithoutAdminIdRequest = new EmailAccountVerifyWithoutAdminIdRequest();
			emailAccountVerifyWithoutAdminIdRequest.setLanguage(language);
			
			emailAccountVerifyResponse = getEndPoints().emailAccountVerifyWithoutAdminId(emailAccountVerifyWithoutAdminIdRequest);
			
			return;
		}else if(language.equalsIgnoreCase("NoLanguageKey")) {
			EmailAccountVerifyWithoutLanguageRequest emailAccountVerifyWithoutLanguageRequest = new EmailAccountVerifyWithoutLanguageRequest();
			emailAccountVerifyWithoutLanguageRequest.setAdminID(email);
			
			emailAccountVerifyResponse = getEndPoints().emailAccountVerifyWithoutLanguage(emailAccountVerifyWithoutLanguageRequest);
			
			return;
		}else if(email.equalsIgnoreCase("NumberAdminIdValue")) {
			EmailAccountVerifyNumberAdminIdRequest emailAccountVerifyNumberAdminIdRequest = new EmailAccountVerifyNumberAdminIdRequest();
			emailAccountVerifyNumberAdminIdRequest.setAdminID(123);
			emailAccountVerifyNumberAdminIdRequest.setLanguage(language);
			
			emailAccountVerifyResponse = getEndPoints().emailAccountVerifyNumberAdminid(emailAccountVerifyNumberAdminIdRequest);
			
			return;
		}else if(language.equalsIgnoreCase("NumberLanguageValue")) {
			EmailAccountVerifyNumberLanguageRequest emailAccountVerifyNumberLanguageRequest = new EmailAccountVerifyNumberLanguageRequest();
			emailAccountVerifyNumberLanguageRequest.setAdminID(email);
			emailAccountVerifyNumberLanguageRequest.setLanguage(123);
			
			emailAccountVerifyResponse = getEndPoints().emailAccountVerifyNumberLanguage(emailAccountVerifyNumberLanguageRequest);
			
			return;
		}else if(email.equalsIgnoreCase("NoAdminIdValue")) {
			EmailAccountVerifyRequest emailAccountVerifyRequest = new EmailAccountVerifyRequest();
			emailAccountVerifyRequest.setAdminID("");
			emailAccountVerifyRequest.setLanguage(language);
			
			emailAccountVerifyResponse = getEndPoints().emailAccountVerify(emailAccountVerifyRequest);
			
			return;
		}else if(language.equalsIgnoreCase("NoLanguageValue")) {
			EmailAccountVerifyRequest emailAccountVerifyRequest = new EmailAccountVerifyRequest();
			emailAccountVerifyRequest.setAdminID(email);
			emailAccountVerifyRequest.setLanguage("");
			
			emailAccountVerifyResponse = getEndPoints().emailAccountVerify(emailAccountVerifyRequest);
			
			return;		
		}else if(email.equalsIgnoreCase("NullAdminIdValue")) {
			EmailAccountVerifyRequest emailAccountVerifyRequest = new EmailAccountVerifyRequest();
			emailAccountVerifyRequest.setAdminID(null);
			emailAccountVerifyRequest.setLanguage(language);
			
			emailAccountVerifyResponse = getEndPoints().emailAccountVerify(emailAccountVerifyRequest);
			
			return;	
		}else if(language.equalsIgnoreCase("NullLanguageValue")) {
			EmailAccountVerifyRequest emailAccountVerifyRequest = new EmailAccountVerifyRequest();
			emailAccountVerifyRequest.setAdminID(email);
			emailAccountVerifyRequest.setLanguage(null);
			
			emailAccountVerifyResponse = getEndPoints().emailAccountVerify(emailAccountVerifyRequest);
			
			return;		
		}
		
		
		EmailAccountVerifyRequest emailAccountVerifyRequest = new EmailAccountVerifyRequest();
		emailAccountVerifyRequest.setAdminID(email);
		emailAccountVerifyRequest.setLanguage(language);
		
		emailAccountVerifyResponse = getEndPoints().emailAccountVerify(emailAccountVerifyRequest);
		
		System.out.println(emailAccountVerifyResponse.getResponse().getBody().asString());
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Email Account Verify API$")
	public void user_get_valid_response_in_Response_body_of_Email_Account_Verify_API(String responseCode) throws Throwable {
		//verify response code in email account verify response body
		Assert.assertTrue(emailAccountVerifyResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Email Account Verify API$")
	public void user_get_valid_response_from_server_for_Email_Account_Verify_API(String responseCode) throws Throwable {
		//verify response code in email account verify response server
		Assert.assertTrue(emailAccountVerifyResponse.getStatusCode()==Integer.parseInt(responseCode));
	}
	
	@Then("^Response body of Email Account Verify API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Email_Account_Verify_API_should_have_Error_value(String errorValue) throws Throwable {
		final String NO_ADMINID_KEY 		= "\"AdminID\" is required";
		final String NO_LANGUAGE_KEy 		= "\"Language\" is required";
		final String NUMBER_ADMINID_VALUE 	= "\"AdminID\" must be a string";
		final String NUMBER_LANGUAGE_VALUE 	= "\"Language\" must be a string";
		final String NO_ADMINID_VALUE 		= "\"AdminID\" is not allowed to be empty";
		final String NO_LANGUAGE_VALUE 		= "\"Language\" is not allowed to be empty";
		final String NULL_ADMINID_VALUE 	= "\"AdminID\" must be a string";
		final String NULL_LANGUAGE_VALUE 	= "\"Language\" must be a string";
		final String INVALID_ADMINID_VALUE	= "\"AdminID\" must be a valid email";
		
		String err_msg = null;
		
		if(errorValue.equalsIgnoreCase("NoAdminIdKey")) {
			err_msg = NO_ADMINID_KEY;
		}else if(errorValue.equalsIgnoreCase("NoLanguageKey")) {
			err_msg = NO_LANGUAGE_KEy;
		}else if(errorValue.equalsIgnoreCase("NumberAdminIdValue")) {
			err_msg = NUMBER_ADMINID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberLanguageValue")) {
			err_msg = NUMBER_LANGUAGE_VALUE;
		}else if(errorValue.equalsIgnoreCase("NoAdminIdValue")) {
			err_msg = NO_ADMINID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NoLanguageValue")) {
			err_msg = NO_LANGUAGE_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullAdminIdValue")) {
			err_msg = NULL_ADMINID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullLanguageValue")) {
			err_msg = NULL_LANGUAGE_VALUE;
		}else if(errorValue.equalsIgnoreCase("InvalidAdminId")) {
			err_msg = INVALID_ADMINID_VALUE;
		}
		
		Assert.assertEquals(emailAccountVerifyResponse.getBody().getError(), err_msg);
	}

	@Then("^User copy Token data from mail generated by Email Account Verify JSON$")
	public void user_copy_Token_data_from_mail_generated_by_Email_Account_Verify_JSON() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\main\\resources\\com\\api\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://gmail.com/");

        driver.findElement(By.id("identifierId")).sendKeys("apitestinghumanity@gmail.com");

        driver.findElement(By.xpath("//span[text()='Next']/..")).click();

        try{
            Thread.sleep((3000));
        }catch (Exception e){

        }

        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Automation@123");

        driver.findElement(By.xpath("//span[text()='Next']/..")).click();

        try{
            Thread.sleep((3000));
        }catch (Exception e){

        }

        List<WebElement> unreademail=null;

        for(int counter=0;counter<10;counter++){
            unreademail = driver.findElements(By.xpath("//tr[@class='zA zE']"));

            //System.out.println("Total No. of Unread Mails: " + unreademail.size());

            if (unreademail.size()>0){
                for(int i=0;i<unreademail.size();i++){

                    //System.out.println(unreademail.get(i).getText());
                    if(unreademail.get(i).getText().contains("Verify your email")){
                        unreademail.get(i).click();
                        counter = 12;
                        break;
                    }
                }

                if(counter > 10){
                    break;
                }
            }

            driver.navigate().refresh();

            try{
                Thread.sleep((3000));
            }catch (Exception e){

            }
        }

        try{
            Thread.sleep((2000));
        }catch (Exception e){

        }
        String link_value = driver.findElement(By.xpath("//a[text()='Click here to Verify your email']")).getAttribute("href");

        try{
            Thread.sleep((2000));
        }catch (Exception e){

        }

        driver.findElement(By.xpath("//a[text()='Inbox']")).click();

        try{
            Thread.sleep((1000));
        }catch (Exception e){

        }

        driver.close();
      
        
        getScenarioContext().setContext(Context.RESET_PASSWORD_TOKEN, link_value.split("token=")[1]);
        
        System.out.println("Token value:"+link_value.split("token=")[1]);
	}
}
