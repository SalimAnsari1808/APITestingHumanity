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
import com.api.modelRequest.Password.PasswordResetRequest;
import com.api.modelRequest.Password.PasswordResetWithoutAdminIdRequest;
import com.api.modelResponse.Password.PasswordResetResponse;
import com.api.utilities.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class PasswordResetSteps extends BaseSteps{
	
	private IRestResponse<PasswordResetResponse> resetPasswordResponse;

	public PasswordResetSteps(TestContext testContext) {
		super(testContext);
	}
	
	@Given("User connect to Password Reset URL")
	public void user_connect_to_Password_Reset_URL() {
		//Do Nothing
	}
	
	@When("^User enter AdminId using Password Reset JSON$")
	public void user_enter_AdminId_using_Password_Reset_JSON() throws Throwable {
		String username =  getScenarioContext().getContext(Context.ADMIN_USERNAME).toString();
		
		PasswordResetRequest passwordResetRequest = new PasswordResetRequest();
		passwordResetRequest.setAdminID(username);
		
		resetPasswordResponse = getEndPoints().passwordReset(passwordResetRequest);
		
		System.out.println("Password Reset Response-->"+resetPasswordResponse.getResponse().getBody().asString());
	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Password Reset API$")
	public void user_get_valid_response_in_Response_body_of_Password_Reset_API(String responseCode) throws Throwable {
		//check password reset response code 
		Assert.assertTrue(resetPasswordResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Password Reset API should have \"([^\"]*)\" value\\.$")
	public void response_body_of_Password_Reset_API_should_have_value(String arg1) throws Throwable {
		System.out.println("Message ID-->"+resetPasswordResponse.getBody().getData().getMessageId());
		
		System.out.println("Request ID-->"+resetPasswordResponse.getBody().getData().getResponseMetadata().getRequestId());
	}

	@When("^User not enter AdminId using Password Reset JSON$")
	public void user_not_enter_AdminId_using_Password_Reset_JSON() throws Throwable {
		PasswordResetWithoutAdminIdRequest passwordResetWithoutAdminIdRequest = new PasswordResetWithoutAdminIdRequest();
		
		resetPasswordResponse = getEndPoints().passwordResetWithoutAdminId(passwordResetWithoutAdminIdRequest);
	}

	@Then("^User get valid response \"([^\"]*)\" from server for Password Reset API$")
	public void user_get_valid_response_from_server_for_Password_Reset_API(String responseCode) throws Throwable {
		//check password reset response code 
		Assert.assertTrue(resetPasswordResponse.getStatusCode()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Password Reset API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Password_Reset_API_should_have_Error_value(String errorValue) throws Throwable {
		final String ADMINID_KEY_ERROR =  "\"AdminID\" is required";
		final String ADMINID_VALUE_EMPTY =  "\"AdminID\" is not allowed to be empty";
		final String ADMINID_VALUE_INVALID = "\"AdminID\" must be a valid email";
		
		String error_msg = null;
		
		if(errorValue.equalsIgnoreCase("AdminIdKey")) {
			error_msg = ADMINID_KEY_ERROR;
		}else if(errorValue.equalsIgnoreCase("AdminIdEmpty")) {
			error_msg = ADMINID_VALUE_EMPTY;
		}else if(errorValue.equalsIgnoreCase("InvalidAdminId")) {
			error_msg = ADMINID_VALUE_INVALID;
		}
		
		System.out.println("Error Value-->"+resetPasswordResponse.getBody().getError());
		
		//verify error message
		Assert.assertEquals(error_msg, resetPasswordResponse.getBody().getError());
	}

	@When("^User enter AdminId \"([^\"]*)\" using Password Reset JSON$")
	public void user_enter_AdminId_using_Password_Reset_JSON(String username) throws Throwable {
		if(username.equalsIgnoreCase("EmptyValue")) {
			username = "";
		}
		
		PasswordResetRequest passwordResetRequest = new PasswordResetRequest();
		passwordResetRequest.setAdminID(username);
		
		resetPasswordResponse = getEndPoints().passwordReset(passwordResetRequest);
	}

	@Then("^Response body of Password Reset API should have \"([^\"]*)\" Message value$")
	public void response_body_of_Password_Reset_API_should_have_Message_value(String errorMessage) throws Throwable {
		String error_msg = null;
		String error_i18msg = null;
		
		final String ADMINID_INVALID_MSG = "Account does not exist.";
		final String ADMINID_IMVALID_I18MSG = "account_not_exist";
		
		if(errorMessage.equalsIgnoreCase("InvalidAdminId")) {
			error_msg = ADMINID_INVALID_MSG;
			error_i18msg = ADMINID_IMVALID_I18MSG;
		}
		
		System.out.println("Message Value-->"+resetPasswordResponse.getBody().getMessage());
		System.out.println("I18Message Value-->"+resetPasswordResponse.getBody().getI18n_msg());
		//verify message
		Assert.assertEquals(error_msg, resetPasswordResponse.getBody().getMessage());
		Assert.assertEquals(error_i18msg, resetPasswordResponse.getBody().getI18n_msg());
	}
	
	
//	
//	@Given("Reset Password request is send")
//	public void reset_Password_request_is_send() {
//		PasswordResetRequest resetPasswordRequest = new PasswordResetRequest();
//		resetPasswordRequest.setAdminID("apitestinghumanity@gmail.com");
//		
//		resetPasswordResponse = getEndPoints().passwordReset(resetPasswordRequest);
//		
//		System.out.println(resetPasswordResponse.getBody().getStatus());
//		
//		System.out.println("******************************************************");
//		System.out.println(getScenarioContext().isContains(Context.ADMIN_USERNAME));
//		System.out.println(getScenarioContext().isContains(Context.ADMIN_PASSWORD));
//		System.out.println(getScenarioContext().isContains(Context.APP_ID));
//		System.out.println(getScenarioContext().isContains(Context.PROFILE_ID));
//		System.out.println(getScenarioContext().isContains(Context.RESET_PASSWORD_EXPIRE_TIME));
//		System.out.println(getScenarioContext().isContains(Context.RESET_PASSWORD_PASSWORD));
//		System.out.println("******************************************************");
//	}
//	
//	
//
//	
	@Given("User copy Token and ExpiryTime data mail generated by Password Reset JSON")
	public void user_copy_Token_and_ExpiryTime_data_mail_generated_by_Password_Reset_JSON() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\main\\resources\\com\\api\\drivers\\chromedriver.exe");

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
                    if(unreademail.get(i).getText().contains("Reset your password")){
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
        String link_value = driver.findElement(By.xpath("//a[text()='Reset password']")).getAttribute("href");

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
        
        getScenarioContext().setContext(Context.RESET_PASSWORD_PASSWORD, TestUtil.randomPassword());
        getScenarioContext().setContext(Context.RESET_PASSWORD_EXPIRE_TIME, link_value.split("password\\?e=")[1].split("&token=")[0]);
        getScenarioContext().setContext(Context.RESET_PASSWORD_TOKEN, link_value.split("password\\?e=")[1].split("&token=")[1]);

        //String newPassword = TestUtil.randomPassword();
        //String expireTime = link_value.split("password\\?e=")[1].split("&token=")[0];
        //String tokenValue = link_value.split("password\\?e=")[1].split("&token=")[1];
       // System.out.println("New Password Value is:"+newPassword);
	}
	

}
