package com.api.stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.api.baseClass.TestContext;
import com.api.enums.Context;
import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.Payment.PaymentRefundNumberAppIDRequest;
import com.api.modelRequest.Payment.PaymentRefundNumberTransactionIdRequest;
import com.api.modelRequest.Payment.PaymentRefundRequest;
import com.api.modelRequest.Payment.PaymentRefundWithoutAppIDRequest;
import com.api.modelRequest.Payment.PaymentRefundWithoutTransactionIdRequest;
import com.api.modelResponse.Payment.PaymentRefundResponse;
import com.api.modelResponse.WebPayment.WebPaymentResponse;
import com.google.gson.Gson;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PaymentRefundSteps extends BaseSteps{
	
	private WebDriver driver;
	private WebDriverWait webDriverWait;
	
	private IRestResponse<PaymentRefundResponse> paymentRefundResponse;
	

	public PaymentRefundSteps(TestContext testContext) {
		super(testContext);
	}
	
	
	@When("^User Open Web Application and Complete Payment and get transactionId of Payment done$")
	public void user_Open_Web_Application_and_Complete_Payment_and_get_transactionId_of_Payment_done() throws Throwable {
		try{
			Thread.sleep((3000));
		}catch (Exception e){
		
		}
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\main\\resources\\com\\api\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://stage-app.hu-manity.co/#/en/cc2/login");
        
        webDriverWait = new WebDriverWait(driver,10);
        
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//input[@placeholder='Email']")));
        
        //enter username
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getScenarioContext().getContext(Context.ADMIN_USERNAME).toString());
        
        //enter password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(getScenarioContext().getContext(Context.ADMIN_PASSWORD).toString());
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
  
        
        By cardPayment = By.xpath("//div[@aria-label='Paying with Card']");
        
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cardPayment));
        
        driver.findElement(cardPayment).click();
        
        By cardNumber = By.xpath("//input[@id='credit-card-number']");
        By expirationDate = By.xpath("//input[@id='expiration']");
        By cvvNumber = By.xpath("//input[@id='cvv']");
        By paymentSubmit = By.xpath("//button[@id='subscribe-now-submit-button']");
        By paymentResponse = By.xpath("//input[@id='TestingId']");
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-number']")));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cardNumber));
        driver.findElement(cardNumber).sendKeys("4111111111111111");
        
        driver.switchTo().defaultContent();
  
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-expirationDate']")));      
        webDriverWait.until(ExpectedConditions.elementToBeClickable(expirationDate));
        driver.findElement(expirationDate).sendKeys("02 / 23");
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-cvv']")));  
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cvvNumber));
        driver.findElement(cvvNumber).sendKeys("123");
        
        driver.switchTo().defaultContent();
        
        driver.findElement(paymentSubmit).click();
        
		try{
			Thread.sleep((3000));
		}catch (Exception e){
		
		}
		
		String paymentTransationId =  driver.findElement(paymentResponse).getAttribute("value");
		
		//System.out.println("Payment Response-->"+ paymentTransationId);
		
		Gson gson = new Gson(); 

		WebPaymentResponse webPaymentResponse  = gson.fromJson(paymentTransationId, WebPaymentResponse.class);
		
		getScenarioContext().setContext(Context.Payment_TransactionID, webPaymentResponse.getSubscription().getTransactions().get(0).getId());
		
		getScenarioContext().setContext(Context.Payment_SubscriptionID, webPaymentResponse.getSubscription().getId());
				
		//System.out.println("TransactionID-->"+webPaymentResponse.getSubscription().getTransactions().get(0).getId());
		
		driver.quit();
	}
	
	
	@When("^User refund payment using Refund Payment API JSON$")
	public void user_refund_payment_using_Refund_Payment_API_JSON() throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		PaymentRefundRequest paymentRefundRequest = new PaymentRefundRequest();
		paymentRefundRequest.setTransactionId(getScenarioContext().getContext(Context.Payment_TransactionID).toString());
		paymentRefundRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
		
		paymentRefundResponse = getEndPoints().paymentRefund(paymentRefundRequest, token);
		
		System.out.println("Payment Refund-->"+paymentRefundResponse.getResponse().getBody().asString());

	}
	
	@When("^User enter \"([^\"]*)\" using Refund Payment API JSON$")
	public void user_enter_using_Refund_Payment_API_JSON(String fieldValue) throws Throwable {
		
		String token = getScenarioContext().getContext(Context.Token).toString();
		
		if(fieldValue.equalsIgnoreCase("NoTransactionIDKey")) {
			
			PaymentRefundWithoutTransactionIdRequest paymentRefundWithoutTransactionIdRequest = new PaymentRefundWithoutTransactionIdRequest();
			paymentRefundWithoutTransactionIdRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			
			paymentRefundResponse = getEndPoints().paymentRefundWithoutTransactionId(paymentRefundWithoutTransactionIdRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("NoAppIDKey")) {
			
			PaymentRefundWithoutAppIDRequest paymentRefundWithoutAppIDRequest = new PaymentRefundWithoutAppIDRequest();
			paymentRefundWithoutAppIDRequest.setTransactionId(getScenarioContext().getContext(Context.Payment_TransactionID).toString());
			
			paymentRefundResponse = getEndPoints().paymentRefundWithoutAppID(paymentRefundWithoutAppIDRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("NumberTransactionIDValue")) {
			
			PaymentRefundNumberTransactionIdRequest paymentRefundNumberTransactionIdRequest = new PaymentRefundNumberTransactionIdRequest();
			paymentRefundNumberTransactionIdRequest.setTransactionId(123);
			paymentRefundNumberTransactionIdRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			
			paymentRefundResponse = getEndPoints().paymentRefundNumberTransactionId(paymentRefundNumberTransactionIdRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("NumberAppIDValue")) {
			
			PaymentRefundNumberAppIDRequest paymentRefundNumberAppIDRequest = new PaymentRefundNumberAppIDRequest();
			paymentRefundNumberAppIDRequest.setTransactionId(getScenarioContext().getContext(Context.Payment_TransactionID).toString());
			paymentRefundNumberAppIDRequest.setAppID(123);
			
			paymentRefundResponse = getEndPoints().paymentRefundNumberAppID(paymentRefundNumberAppIDRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("NullTransactionIDValue")) {
			PaymentRefundRequest paymentRefundRequest = new PaymentRefundRequest();
			paymentRefundRequest.setTransactionId(null);
			paymentRefundRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			
			paymentRefundResponse = getEndPoints().paymentRefund(paymentRefundRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("NullAppIDValue")) {
			PaymentRefundRequest paymentRefundRequest = new PaymentRefundRequest();
			paymentRefundRequest.setTransactionId(getScenarioContext().getContext(Context.Payment_TransactionID).toString());
			paymentRefundRequest.setAppID(null);
			
			paymentRefundResponse = getEndPoints().paymentRefund(paymentRefundRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("EmptyTransactionIDValue")) {
			PaymentRefundRequest paymentRefundRequest = new PaymentRefundRequest();
			paymentRefundRequest.setTransactionId("");
			paymentRefundRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			
			paymentRefundResponse = getEndPoints().paymentRefund(paymentRefundRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("EmptyAppIDValue")) {
			PaymentRefundRequest paymentRefundRequest = new PaymentRefundRequest();
			paymentRefundRequest.setTransactionId(getScenarioContext().getContext(Context.Payment_TransactionID).toString());
			paymentRefundRequest.setAppID("");
			
			paymentRefundResponse = getEndPoints().paymentRefund(paymentRefundRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("InvalidTransactionIDValue")) {
			PaymentRefundRequest paymentRefundRequest = new PaymentRefundRequest();
			paymentRefundRequest.setTransactionId("Invalid");
			paymentRefundRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString());
			
			paymentRefundResponse = getEndPoints().paymentRefund(paymentRefundRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("InvalidAppIDValue")) {
			PaymentRefundRequest paymentRefundRequest = new PaymentRefundRequest();
			paymentRefundRequest.setTransactionId(getScenarioContext().getContext(Context.Payment_TransactionID).toString());
			paymentRefundRequest.setAppID("Invalid");
			
			paymentRefundResponse = getEndPoints().paymentRefund(paymentRefundRequest, token);
			
		}else if(fieldValue.equalsIgnoreCase("MismacthTransactionIDAppIDValue")) {
			PaymentRefundRequest paymentRefundRequest = new PaymentRefundRequest();
			paymentRefundRequest.setTransactionId(getScenarioContext().getContext(Context.Payment_TransactionID).toString());
			paymentRefundRequest.setAppID(getScenarioContext().getContext(Context.APP_ID).toString()+"123");
			
			paymentRefundResponse = getEndPoints().paymentRefund(paymentRefundRequest, token);
		}
		
		System.out.println(paymentRefundResponse.getResponse().getBody().asString());
		System.out.println(paymentRefundResponse.getStatusCode());

	}

	@Then("^User get valid response \"([^\"]*)\" in Response body of Refund Payment API$")
	public void user_get_valid_response_in_Response_body_of_Refund_Payment_API(String responseCode) throws Throwable {
		Assert.assertTrue(paymentRefundResponse.getBody().getStatus()==Integer.parseInt(responseCode));
	}
	
	@Then("^User get valid response \"([^\"]*)\" from server for Refund Payment API$")
	public void user_get_valid_response_from_server_for_Refund_Payment_API(String responseCode) throws Throwable {
		Assert.assertTrue(paymentRefundResponse.getStatusCode()==Integer.parseInt(responseCode));
	}

	@Then("^Response body of Refund Payment API should have Valid value$")
	public void response_body_of_Refund_Payment_API_should_have_Valid_value() throws Throwable {

	}
	
	@Then("^Response body of Refund Payment API should have \"([^\"]*)\" Error value$")
	public void response_body_of_Refund_Payment_API_should_have_Error_value(String errorValue) throws Throwable {
		
		final String NO_TRANSACTION_ID_KEY = "\"transactionId\" is required";
		final String NO_APP_ID_KEY = "\"appID\" is required";
		final String NUMBER_TRANSACTION_ID_VALUE = "\"transactionId\" must be a string";
		final String NUMBER_APP_ID_VALUE = "\"appID\" must be a string";
		final String NULL_TRANSACTION_ID_VALUE = "\"transactionId\" must be a string";
		final String NULL_APP_ID_VALUE = "\"appID\" must be a string";
		final String EMPTY_TRANSACTION_ID_VALUE = "\"transactionId\" is not allowed to be empty";
		final String EMPTY_APP_ID_VALUE = "\"appID\" is not allowed to be empty";
		
		String err_msg = null;
		
		if(errorValue.equalsIgnoreCase("NoTransactionIDKey")) {
			err_msg = NO_TRANSACTION_ID_KEY;
		}else if(errorValue.equalsIgnoreCase("NoAppIDKey")) {
			err_msg = NO_APP_ID_KEY;
		}else if(errorValue.equalsIgnoreCase("NumberTransactionIDValue")) {
			err_msg = NUMBER_TRANSACTION_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NumberAppIDValue")) {
			err_msg = NUMBER_APP_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullTransactionIDValue")) {
			err_msg = NULL_TRANSACTION_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("NullAppIDValue")) {
			err_msg = NULL_APP_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("EmptyTransactionIDValue")) {
			err_msg = EMPTY_TRANSACTION_ID_VALUE;
		}else if(errorValue.equalsIgnoreCase("EmptyAppIDValue")) {
			err_msg = EMPTY_APP_ID_VALUE;
		}
		
		Assert.assertEquals(paymentRefundResponse.getBody().getError(), err_msg);
	}
	
	@Then("^Response body of Refund Payment API should have \"([^\"]*)\" Message value$")
	public void response_body_of_Refund_Payment_API_should_have_Message_value(String messageValue) throws Throwable {
		
		final String INVALID_TRANSACTION_ID_MSG = "App ID and transaction Id do not matched";
		final String INVALID_TRANSACTION_ID_I18MSG = "Bad request";
		
		String msg = null;
		String i18_msg = null;
		
		if(messageValue.equalsIgnoreCase("InvalidTransactionIDValue") || messageValue.equalsIgnoreCase("InvalidAppIDValue") || messageValue.equalsIgnoreCase("MismacthTransactionIDAppIDValue")) {
			msg = INVALID_TRANSACTION_ID_MSG;
			i18_msg = INVALID_TRANSACTION_ID_I18MSG;
		}
		
		Assert.assertEquals(paymentRefundResponse.getBody().getMessage(), msg);
		Assert.assertEquals(paymentRefundResponse.getBody().getI18n_msg(), i18_msg);
		

	}

}
