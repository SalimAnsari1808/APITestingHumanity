package com.api.modelEngine;

import com.api.modelRequest.Account.AccountCreateRequest;
import com.api.modelRequest.Account.AccountCreateWithoutAdminIdRequest;
import com.api.modelRequest.Account.AccountCreateWithoutLanguageRequest;
import com.api.modelRequest.Account.AccountCreateWithoutPasswordRequest;
import com.api.modelRequest.App.AppCreateNumberDomainDescriptionRequest;
import com.api.modelRequest.App.AppCreateNumberDomainNameRequest;
import com.api.modelRequest.App.AppCreateNumberDomainUrlRequest;
import com.api.modelRequest.App.AppCreateRequest;
import com.api.modelRequest.App.AppCreateWithoutDomainDescriptionRequest;
import com.api.modelRequest.App.AppCreateWithoutDomainNameRequest;
import com.api.modelRequest.App.AppCreateWithoutDomainUrlRequest;
import com.api.modelRequest.App.AppDeleteNumberAppIdRequest;
import com.api.modelRequest.App.AppDeleteRequest;
import com.api.modelRequest.App.AppDeleteWithoutAppIdRequest;
import com.api.modelRequest.App.AppEditExtraKeyRequest;
import com.api.modelRequest.App.AppEditNumberAppIDRequest;
import com.api.modelRequest.App.AppEditNumberDomainDescriptionRequest;
import com.api.modelRequest.App.AppEditNumberDomainNameRequest;
import com.api.modelRequest.App.AppEditNumberDomainUrlRequest;
import com.api.modelRequest.App.AppEditRequest;
import com.api.modelRequest.App.AppEditWithoutAppIDRequest;
import com.api.modelRequest.App.AppEditWithoutDomainUrlRequest;
import com.api.modelRequest.Company.CompanyEditNumberEmailRequest;
import com.api.modelRequest.Company.CompanyEditNumberNameRequest;
import com.api.modelRequest.Company.CompanyEditRequest;
import com.api.modelRequest.Company.CompanyEditStringCompanyIdRequest;
import com.api.modelRequest.Company.CompanyEditWithoutCompanyIdRequest;
import com.api.modelRequest.Company.CompanyEditWithoutEmailRequest;
import com.api.modelRequest.Company.CompanyEditWithoutNameRequest;
import com.api.modelRequest.Company.ProfileCreateRequest;
import com.api.modelRequest.Company.ProfileUpdateRequest;
import com.api.modelRequest.Email.EmailAccountValidateNumberTokenRequest;
import com.api.modelRequest.Email.EmailAccountValidateRequest;
import com.api.modelRequest.Email.EmailAccountValidateWithoutTokenRequest;
import com.api.modelRequest.Email.EmailAccountVerifyNumberAdminIdRequest;
import com.api.modelRequest.Email.EmailAccountVerifyNumberLanguageRequest;
import com.api.modelRequest.Email.EmailAccountVerifyRequest;
import com.api.modelRequest.Email.EmailAccountVerifyWithoutAdminIdRequest;
import com.api.modelRequest.Email.EmailAccountVerifyWithoutLanguageRequest;
import com.api.modelRequest.Event.SaveEventAPIExtraKeyRequest;
import com.api.modelRequest.Event.SaveEventAPINumberAppIDRequest;
import com.api.modelRequest.Event.SaveEventAPINumberEventRequest;
import com.api.modelRequest.Event.SaveEventAPINumberSessionIDRequest;
import com.api.modelRequest.Event.SaveEventAPINumberUserIDRequest;
import com.api.modelRequest.Event.SaveEventAPIRequest;
import com.api.modelRequest.Event.SaveEventAPIStringEventRequest;
import com.api.modelRequest.Event.SaveEventAPIWithoutAppIDRequest;
import com.api.modelRequest.Event.SaveEventAPIWithoutSessioIDRequest;
import com.api.modelRequest.Login.LoginRequest;
import com.api.modelRequest.Login.LoginWithoutAdminIdRequest;
import com.api.modelRequest.Login.LoginWithoutPasswordRequest;
import com.api.modelRequest.Password.PasswordResetRequest;
import com.api.modelRequest.Password.PasswordResetWithoutAdminIdRequest;
import com.api.modelRequest.Password.PasswordValidateResetNumberExpiryTimeRequest;
import com.api.modelRequest.Password.PasswordValidateResetNumberPasswordRequest;
import com.api.modelRequest.Password.PasswordValidateResetNumberTokenRequest;
import com.api.modelRequest.Password.PasswordValidateResetRequest;
import com.api.modelRequest.Password.PasswordValidateResetWithoutExpiryTime;
import com.api.modelRequest.Password.PasswordValidateResetWithoutPasswordRequest;
import com.api.modelRequest.Password.PasswordValidateResetWithoutToken;
import com.api.modelRequest.Payment.PaymentCancelSubscriptionNumberAppIdRequest;
import com.api.modelRequest.Payment.PaymentCancelSubscriptionRequest;
import com.api.modelRequest.Payment.PaymentRefundNumberAppIDRequest;
import com.api.modelRequest.Payment.PaymentRefundNumberTransactionIdRequest;
import com.api.modelRequest.Payment.PaymentRefundRequest;
import com.api.modelRequest.Payment.PaymentRefundWithoutAppIDRequest;
import com.api.modelRequest.Payment.PaymentRefundWithoutTransactionIdRequest;
import com.api.modelRequest.Publish.PublishAPIExtraKeyRequest;
import com.api.modelRequest.Publish.PublishAPINumberAppIDRequest;
import com.api.modelRequest.Publish.PublishAPIRequest;
import com.api.modelRequest.Publish.PublishAPIWithoutAppIDRequest;
import com.api.modelRequest.Session.SaveSessionAPIExtraKeyRequest;
import com.api.modelRequest.Session.SaveSessionAPINumberAppIDRequest;
import com.api.modelRequest.Session.SaveSessionAPINumberSessionIDRequest;
import com.api.modelRequest.Session.SaveSessionAPINumberSessionJSONRequest;
import com.api.modelRequest.Session.SaveSessionAPIRequest;
import com.api.modelRequest.Session.SaveSessionAPIStringSessionJSONRequest;
import com.api.modelRequest.Session.SaveSessionAPIWithoutAppIDRequest;
import com.api.modelRequest.Session.SaveSessionAPIWithoutSessionIDRequest;
import com.api.modelRequest.UserDesign.UserDesignAddEmptyBannerConfigJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddEmptyUserDesignJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddEmptyUserTextJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddExtraKeyRequest;
import com.api.modelRequest.UserDesign.UserDesignAddNumberAppIdRequest;
import com.api.modelRequest.UserDesign.UserDesignAddNumberBannerConfigJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddNumberDefaultLanguageRequest;
import com.api.modelRequest.UserDesign.UserDesignAddNumberUserDesignJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddNumberUserTextJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddRequest;
import com.api.modelRequest.UserDesign.UserDesignAddStringBannerConfigJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddStringUserDesignJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddStringUserTextJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddWithoutAppIdRequest;
import com.api.modelRequest.UserDesign.UserDesignAddWithoutBannerConfigJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddWithoutDefaultLanguageRequest;
import com.api.modelRequest.UserDesign.UserDesignAddWithoutUserDesignJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignAddWithoutUserTextJsonRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppExtraKeyRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppNumberFromAppIDRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppNumberToAppIDRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppWithoutFromAppIDRequest;
import com.api.modelRequest.UserDesign.UserDesignCopyAppWithoutToAppIDRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateExtraKeyRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateStringUserDesignIDRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateStringUserDesignVersionRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateWithoutUserDesignIDRequest;
import com.api.modelRequest.UserDesign.UserDesignUpdateWithoutUserDesignVersionRequest;
import com.api.modelRequest.UserText.UserTextAddExtraKeyRequest;
import com.api.modelRequest.UserText.UserTextAddNumberAppIDRequest;
import com.api.modelRequest.UserText.UserTextAddNumberCategoryJSONRequest;
import com.api.modelRequest.UserText.UserTextAddNumberLanguageRequest;
import com.api.modelRequest.UserText.UserTextAddNumberProviderJSONRequest;
import com.api.modelRequest.UserText.UserTextAddNumberUserTextJSONRequest;
import com.api.modelRequest.UserText.UserTextAddRequest;
import com.api.modelRequest.UserText.UserTextAddStringCategoryJSONRequest;
import com.api.modelRequest.UserText.UserTextAddStringProviderJSONRequest;
import com.api.modelRequest.UserText.UserTextAddStringUserTextJSONRequest;
import com.api.modelRequest.UserText.UserTextAddWithoutAppIDRequest;
import com.api.modelRequest.UserText.UserTextAddWithoutLanguageRequest;
import com.api.modelRequest.UserText.UserTextAddWithoutUserDesignIDRequest;
import com.api.modelRequest.UserText.UserTextAddWithoutUserTextJSONRequest;
import com.api.modelRequest.UserText.UserTextUpdateExtraKeyRequest;
import com.api.modelRequest.UserText.UserTextUpdateRequest;
import com.api.modelRequest.UserText.UserTextUpdateStringUserTextIDRequest;
import com.api.modelRequest.UserText.UserTextUpdateStringUserTextVersionRequest;
import com.api.modelRequest.UserText.UserTextUpdateWithoutUserTextIDRequest;
import com.api.modelRequest.UserText.UserTextUpdateWithoutUserTextVersionRequest;
import com.api.modelResponse.Account.AccountCreateResponse;
import com.api.modelResponse.App.AppCreateResponse;
import com.api.modelResponse.App.AppDeleteResponse;
import com.api.modelResponse.App.AppEditResponse;
import com.api.modelResponse.App.AppListResponse;
import com.api.modelResponse.Category.CategoryGetResponse;
import com.api.modelResponse.Company.CompanyEditResponse;
import com.api.modelResponse.Company.CompanyGetResponse;
import com.api.modelResponse.Company.ProfileCreateResponse;
import com.api.modelResponse.Company.ProfileGetResponse;
import com.api.modelResponse.Company.ProfileUpdateResponse;
import com.api.modelResponse.Email.EmailAccountValidateResponse;
import com.api.modelResponse.Email.EmailAccountVerifyResponse;
import com.api.modelResponse.Event.SaveEventResponse;
import com.api.modelResponse.Login.LoginResponse;
import com.api.modelResponse.Password.PasswordResetResponse;
import com.api.modelResponse.Password.PasswordValidateResetResponse;
import com.api.modelResponse.Payment.PaymentBrainTreeGetResponse;
import com.api.modelResponse.Payment.PaymentCancelSubscriptionResponse;
import com.api.modelResponse.Payment.PaymentRefundResponse;
import com.api.modelResponse.Payment.PaymentSearchSubscriptionResponse;
import com.api.modelResponse.Payment.PaymentSearchTransactionResponse;
import com.api.modelResponse.Publish.PublishAPIGetResponse;
import com.api.modelResponse.Publish.PublishAPIResponse;
import com.api.modelResponse.Session.SaveSessionResponse;
import com.api.modelResponse.UserDesign.UserDesignAddResponse;
import com.api.modelResponse.UserDesign.UserDesignCopyAppResponse;
import com.api.modelResponse.UserDesign.UserDesignGetResponse;
import com.api.modelResponse.UserDesign.UserDesignUpdateResponse;
import com.api.modelResponse.UserText.UserTextAddResponse;
import com.api.modelResponse.UserText.UserTextGetResponse;
import com.api.modelResponse.UserText.UserTextUpdateResponse;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


/**
 * <h1>Request End Points</h1>
* This class is used to create EndPoints for different request
* and return the response received from server
* 
* @author	Salim Ansari
* @since	23-Oct-2020	
*/
public class EndPoints{
	
	private RequestSpecification accountRequest;
	
	public EndPoints(String baseURL) {
		RestAssured.baseURI = baseURL;
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
	}
	
	
	private void initializeAPIRequestWithToken(String token) {
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32")
					  .header("Authorization", "Bearer " + token);
	}
	
	private void initializeAPIRequestToken() {
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
	}
	
	/**
	* The loginIn method is used to create a http request to 
	* Login to application and return response that contain
	* token which is used as authorization  
	* 
	* @param	loginRequest Login Request Payload
	* @return	LoginResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<LoginResponse> loginIn(LoginRequest loginRequest) {
		
		Response response = accountRequest.body(loginRequest).post(Route.login());
		
		return new RestResponse<LoginResponse>(LoginResponse.class, response);
	}
	
	/**
	* The loginIn method is used to create a http request to 
	* Login to application and return response that contain
	* token which is used as authorization  
	* 
	* @param	LoginWithoutAdminIdRequest Login Request Payload
	* @return	LoginResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<LoginResponse> loginInWithoutAdminId(LoginWithoutAdminIdRequest loginWithoutAdminIdRequest) {
		
		Response response = accountRequest.body(loginWithoutAdminIdRequest).post(Route.login());
		
		return new RestResponse<LoginResponse>(LoginResponse.class, response);
	}
	
	/**
	* The loginIn method is used to create a http request to 
	* Login to application and return response that contain
	* token which is used as authorization  
	* 
	* @param	LoginWithoutPasswordRequest Login Request Payload
	* @return	LoginResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<LoginResponse> loginInWithoutPassword(LoginWithoutPasswordRequest loginWithoutPasswordRequest) {
		
		Response response = accountRequest.body(loginWithoutPasswordRequest).post(Route.login());
		
		return new RestResponse<LoginResponse>(LoginResponse.class, response);
	}
	
	/**
	* The CreateAccount method is used to create a http request to 
	* create new user account and return response that contain
	* AccountID and Account Status 
	* 
	* @param	accountCreateRequest Create Account Request Payload
	* @return	AccountCreateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AccountCreateResponse> createAccount(AccountCreateRequest accountCreateRequest) {
	
		Response response = accountRequest.body(accountCreateRequest).post(Route.accountCreate());
		
		return new RestResponse<AccountCreateResponse>(AccountCreateResponse.class, response);
	}
	
	/**
	* The CreateAccount method is used to create a http request to 
	* create new user account and return response that contain
	* AccountID and Account Status 
	* 
	* @param	accountCreateWithoutAdminIdRequest Create Account Request Payload
	* @return	AccountCreateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AccountCreateResponse> createAccountWithoutAdminKey(AccountCreateWithoutAdminIdRequest accountCreateWithoutAdminIdRequest) {
	
		Response response = accountRequest.body(accountCreateWithoutAdminIdRequest).post(Route.accountCreate());
		
		return new RestResponse<AccountCreateResponse>(AccountCreateResponse.class, response);
	}
	
	/**
	* The CreateAccount method is used to create a http request to 
	* create new user account and return response that contain
	* AccountID and Account Status 
	* 
	* @param	accountCreateWithoutAdminIdRequest Create Account Request Payload
	* @return	AccountCreateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AccountCreateResponse> createAccountWithoutPasswordKey(AccountCreateWithoutPasswordRequest accountCreateWithoutPasswordRequest) {
	
		Response response = accountRequest.body(accountCreateWithoutPasswordRequest).post(Route.accountCreate());
		
		return new RestResponse<AccountCreateResponse>(AccountCreateResponse.class, response);
	}
	
	/**
	* The CreateAccount method is used to create a http request to 
	* create new user account and return response that contain
	* AccountID and Account Status 
	* 
	* @param	accountCreateWithoutAdminIdRequest Create Account Request Payload
	* @return	AccountCreateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AccountCreateResponse> createAccountWithoutLanguageKey(AccountCreateWithoutLanguageRequest accountCreateWithoutLanguageRequest) {
	
		Response response = accountRequest.body(accountCreateWithoutLanguageRequest).post(Route.accountCreate());
		
		return new RestResponse<AccountCreateResponse>(AccountCreateResponse.class, response);
	}
	
	/**
	* The Email verify method is used to create a http request to 
	* to create a request for email verify and send a mail to registered 
	* mail id with email verify link
	* 
	* @param	emailAccountVerifyRequest Reset Password Request Payload
	* @return	EmailAccountVerifyResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<EmailAccountVerifyResponse> emailAccountVerify(EmailAccountVerifyRequest emailAccountVerifyRequest) {
		
		Response response = accountRequest.body(emailAccountVerifyRequest).post(Route.emailVerify());
		
		return new RestResponse<EmailAccountVerifyResponse>(EmailAccountVerifyResponse.class, response);
	}
	
	/**
	* The Email verify method is used to create a http request to 
	* to create a request for email verify and send a mail to registered 
	* mail id with email verify link
	* 
	* @param	emailAccountVerifyRequest Reset Password Request Payload
	* @return	EmailAccountVerifyResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<EmailAccountVerifyResponse> emailAccountVerifyWithoutAdminId(EmailAccountVerifyWithoutAdminIdRequest emailAccountVerifyWithoutAdminIdRequest) {
		
		Response response = accountRequest.body(emailAccountVerifyWithoutAdminIdRequest).post(Route.emailVerify());
		
		return new RestResponse<EmailAccountVerifyResponse>(EmailAccountVerifyResponse.class, response);
	}
	
	/**
	* The Email verify method is used to create a http request to 
	* to create a request for email verify and send a mail to registered 
	* mail id with email verify link
	* 
	* @param	emailAccountVerifyRequest Reset Password Request Payload
	* @return	EmailAccountVerifyResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<EmailAccountVerifyResponse> emailAccountVerifyWithoutLanguage(EmailAccountVerifyWithoutLanguageRequest emailAccountVerifyWithoutLanguageRequest) {
		
		Response response = accountRequest.body(emailAccountVerifyWithoutLanguageRequest).post(Route.emailVerify());
		
		return new RestResponse<EmailAccountVerifyResponse>(EmailAccountVerifyResponse.class, response);
	}
	
	/**
	* The Email verify method is used to create a http request to 
	* to create a request for email verify and send a mail to registered 
	* mail id with email verify link
	* 
	* @param	emailAccountVerifyRequest Reset Password Request Payload
	* @return	EmailAccountVerifyResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<EmailAccountVerifyResponse> emailAccountVerifyNumberAdminid(EmailAccountVerifyNumberAdminIdRequest emailAccountVerifyNumberAdminIdRequest) {
		
		Response response = accountRequest.body(emailAccountVerifyNumberAdminIdRequest).post(Route.emailVerify());
		
		return new RestResponse<EmailAccountVerifyResponse>(EmailAccountVerifyResponse.class, response);
	}
	
	/**
	* The Email verify method is used to create a http request to 
	* to create a request for email verify and send a mail to registered 
	* mail id with email verify link
	* 
	* @param	emailAccountVerifyRequest Reset Password Request Payload
	* @return	EmailAccountVerifyResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<EmailAccountVerifyResponse> emailAccountVerifyNumberLanguage(EmailAccountVerifyNumberLanguageRequest emailAccountVerifyNumberLanguageRequest) {
		
		Response response = accountRequest.body(emailAccountVerifyNumberLanguageRequest).post(Route.emailVerify());
		
		return new RestResponse<EmailAccountVerifyResponse>(EmailAccountVerifyResponse.class, response);
	}
	
	/**
	* The Email validate method is used to create a http request to 
	* to create a request for email validate and send a mail to registered 
	* mail id with email validate link
	* 
	* @param	emailAccountValidateRequest Reset Password Request Payload
	* @return	EmailAccountValidateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<EmailAccountValidateResponse> emailAccountValidate(EmailAccountValidateRequest emailAccountValidateRequest) {
		
		Response response = accountRequest.body(emailAccountValidateRequest).post(Route.emailValidate());
		
		return new RestResponse<EmailAccountValidateResponse>(EmailAccountValidateResponse.class, response);
	}
	
	
	/**
	* The Email validate method is used to create a http request to 
	* to create a request for email validate and send a mail to registered 
	* mail id with email validate link
	* 
	* @param	emailAccountValidateWithoutTokenRequest Reset Password Request Payload
	* @return	EmailAccountValidateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<EmailAccountValidateResponse> emailAccountValidateWithoutToken(EmailAccountValidateWithoutTokenRequest emailAccountValidateWithoutTokenRequest) {
		
		Response response = accountRequest.body(emailAccountValidateWithoutTokenRequest).post(Route.emailValidate());
		
		return new RestResponse<EmailAccountValidateResponse>(EmailAccountValidateResponse.class, response);
	}
	
	/**
	* The Email validate method is used to create a http request to 
	* to create a request for email validate and send a mail to registered 
	* mail id with email validate link
	* 
	* @param	emailAccountValidateNumberTokenRequest Reset Password Request Payload
	* @return	EmailAccountValidateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<EmailAccountValidateResponse> emailAccountValidateNumberToken(EmailAccountValidateNumberTokenRequest emailAccountValidateNumberTokenRequest) {
		
		Response response = accountRequest.body(emailAccountValidateNumberTokenRequest).post(Route.emailValidate());
		
		return new RestResponse<EmailAccountValidateResponse>(EmailAccountValidateResponse.class, response);
	}
	
	
	/**
	* The Password Reset method is used to create a http request to 
	* to create a request for password reset and send a mail to registered 
	* mail id with reset password link
	* 
	* @param	passwordResetRequest Reset Password Request Payload
	* @return	PasswordResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PasswordResetResponse> passwordReset(PasswordResetRequest passwordResetRequest) {
		
		Response response = accountRequest.body(passwordResetRequest).post(Route.passwordReset());
		
		return new RestResponse<PasswordResetResponse>(PasswordResetResponse.class, response);
	}
	
	/**
	* The Password Reset method is used to create a http request to 
	* to create a request for password reset and send a mail to registered 
	* mail id with reset password link
	* 
	* @param	PasswordResetWithoutAdminIdRequest Reset Password Request Payload
	* @return	PasswordResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PasswordResetResponse> passwordResetWithoutAdminId(PasswordResetWithoutAdminIdRequest passwordResetWithoutAdminIdRequest) {
		
		Response response = accountRequest.body(passwordResetWithoutAdminIdRequest).post(Route.passwordReset());
		
		return new RestResponse<PasswordResetResponse>(PasswordResetResponse.class, response);
	}
	
	/**
	* The Validate Password Reset method is used to create a http request to 
	* in which token and expire date to be send as payload
	* 
	* @param	passwordValidateResetRequest Validate Reset Password Request Payload
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PasswordValidateResetResponse> passwordResetValidate(PasswordValidateResetRequest passwordValidateResetRequest) {
		
		Response response = accountRequest.body(passwordValidateResetRequest).post(Route.passwordValidateReset());
		
		return new RestResponse<PasswordValidateResetResponse>(PasswordValidateResetResponse.class, response);
	}
	
	/**
	* The Validate Password Reset method is used to create a http request to 
	* in which token and expire date to be send as payload
	* 
	* @param	passwordValidateResetWithoutPasswordRequest Validate Reset Password Request Payload
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PasswordValidateResetResponse> passwordResetValidateWithoutPassword(PasswordValidateResetWithoutPasswordRequest passwordValidateResetWithoutPasswordRequest) {
		
		Response response = accountRequest.body(passwordValidateResetWithoutPasswordRequest).post(Route.passwordValidateReset());
		
		return new RestResponse<PasswordValidateResetResponse>(PasswordValidateResetResponse.class, response);
	}
	
	/**
	* The Validate Password Reset method is used to create a http request to 
	* in which token and expire date to be send as payload
	* 
	* @param	passwordValidateResetWithoutPasswordRequest Validate Reset Password Request Payload
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PasswordValidateResetResponse> passwordResetValidateWithoutToken(PasswordValidateResetWithoutToken passwordValidateResetWithoutToken) {
		
		Response response = accountRequest.body(passwordValidateResetWithoutToken).post(Route.passwordValidateReset());
		
		return new RestResponse<PasswordValidateResetResponse>(PasswordValidateResetResponse.class, response);
	}
	
	/**
	* The Validate Password Reset method is used to create a http request to 
	* in which token and expire date to be send as payload
	* 
	* @param	passwordValidateResetWithoutPasswordRequest Validate Reset Password Request Payload
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PasswordValidateResetResponse> passwordResetValidateWithoutExpiryTime(PasswordValidateResetWithoutExpiryTime passwordValidateResetWithoutExpiryTime) {
		
		Response response = accountRequest.body(passwordValidateResetWithoutExpiryTime).post(Route.passwordValidateReset());
		
		return new RestResponse<PasswordValidateResetResponse>(PasswordValidateResetResponse.class, response);
	}
	
	/**
	* The Validate Password Reset method is used to create a http request to 
	* in which token and expire date to be send as payload
	* 
	* @param	passwordValidateResetNumberPasswordRequest Validate Reset Password Request Payload
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PasswordValidateResetResponse> passwordResetValidateNumberPassword(PasswordValidateResetNumberPasswordRequest passwordValidateResetNumberPasswordRequest) {
		
		Response response = accountRequest.body(passwordValidateResetNumberPasswordRequest).post(Route.passwordValidateReset());
		
		return new RestResponse<PasswordValidateResetResponse>(PasswordValidateResetResponse.class, response);
	}
	
	/**
	* The Validate Password Reset method is used to create a http request to 
	* in which token and expire date to be send as payload
	* 
	* @param	passwordValidateResetNumberTokenRequest Validate Reset Password Request Payload
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PasswordValidateResetResponse> passwordResetValidateNumberToken(PasswordValidateResetNumberTokenRequest passwordValidateResetNumberTokenRequest) {
		
		Response response = accountRequest.body(passwordValidateResetNumberTokenRequest).post(Route.passwordValidateReset());
		
		return new RestResponse<PasswordValidateResetResponse>(PasswordValidateResetResponse.class, response);
	}
	
	/**
	* The Validate Password Reset method is used to create a http request to 
	* in which token and expire date to be send as payload
	* 
	* @param	passwordValidateResetNumberExpiryTimeRequest Validate Reset Password Request Payload
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PasswordValidateResetResponse> passwordResetValidateNumberExpiryTime(PasswordValidateResetNumberExpiryTimeRequest passwordValidateResetNumberExpiryTimeRequest) {
		
		Response response = accountRequest.body(passwordValidateResetNumberExpiryTimeRequest).post(Route.passwordValidateReset());
		
		return new RestResponse<PasswordValidateResetResponse>(PasswordValidateResetResponse.class, response);
	}
	
	
	/**
	* The Create App method is used to create a http request to create new app
	* for login user 
	* 
	* @param	appCreateRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppCreateResponse> appCreate(AppCreateRequest appCreateRequest, String token) {
		
		//accountRequest.header("Authorization", "Bearer " + token);
		initializeAPIRequestWithToken(token);
		Response response = accountRequest.body(appCreateRequest).post(Route.appCreate());
		
		return new RestResponse<AppCreateResponse>(AppCreateResponse.class, response);
	}
	
	/**
	* The Create App method is used to create a http request to create new app
	* for login user 
	* 
	* @param	appCreateWithoutDomainUrlRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppCreateResponse> appCreateWithoutDomainUrl(AppCreateWithoutDomainUrlRequest appCreateWithoutDomainUrlRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(appCreateWithoutDomainUrlRequest).post(Route.appCreate());
		
		return new RestResponse<AppCreateResponse>(AppCreateResponse.class, response);
	}
	
	/**
	* The Create App method is used to create a http request to create new app
	* for login user 
	* 
	* @param	appCreateRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppCreateResponse> appCreateWithoutDomainName(AppCreateWithoutDomainNameRequest appCreateWithoutDomainNameRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(appCreateWithoutDomainNameRequest).post(Route.appCreate());
		
		return new RestResponse<AppCreateResponse>(AppCreateResponse.class, response);
	}
	
	/**
	* The Create App method is used to create a http request to create new app
	* for login user 
	* 
	* @param	appCreateRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppCreateResponse> appCreateWithoutDomainDescription(AppCreateWithoutDomainDescriptionRequest appCreateWithoutDomainDescriptionRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(appCreateWithoutDomainDescriptionRequest).post(Route.appCreate());
		
		return new RestResponse<AppCreateResponse>(AppCreateResponse.class, response);
	}
	
	/**
	* The Create App method is used to create a http request to create new app
	* for login user 
	* 
	* @param	appCreateRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppCreateResponse> appCreateNumberDomainUrl(AppCreateNumberDomainUrlRequest appCreateNumberDomainUrlRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(appCreateNumberDomainUrlRequest).post(Route.appCreate());
		
		return new RestResponse<AppCreateResponse>(AppCreateResponse.class, response);
	}
	
	/**
	* The Create App method is used to create a http request to create new app
	* for login user 
	* 
	* @param	appCreateRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppCreateResponse> appCreateNumberDomainName(AppCreateNumberDomainNameRequest appCreateNumberDomainNameRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(appCreateNumberDomainNameRequest).post(Route.appCreate());
		
		return new RestResponse<AppCreateResponse>(AppCreateResponse.class, response);
	}
	
	/**
	* The Create App method is used to create a http request to create new app
	* for login user 
	* 
	* @param	appCreateRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppCreateResponse> appCreateNumberDomainDescription(AppCreateNumberDomainDescriptionRequest appCreateNumberDomainDescriptionRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(appCreateNumberDomainDescriptionRequest).post(Route.appCreate());
		
		return new RestResponse<AppCreateResponse>(AppCreateResponse.class, response);
	}
	
	/**
	* The App list method is used to create a http request to get a list of App created by user 
	* under his profile
	* 
	* @param	token used in header for request authorization
	* @return	AppListResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppListResponse> listApp(String token) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32")
					  .header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.given().get(Route.appList());
		
		return new RestResponse<AppListResponse>(AppListResponse.class, response);
		
	}
	
	/**
	* The Delete App method is used to create a http request to delete existing App
	* by using AppID 
	* 
	* @param	appDeleteRequest Delete App Request Payload
	* @param	token used in header for request authorization
	* @return	AppDeleteResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppDeleteResponse> appDelete(AppDeleteRequest appDeleteRequest, String token) {
		
		//accountRequest.header("Authorization", "Bearer " + token);
		initializeAPIRequestWithToken(token);
		Response response = accountRequest.body(appDeleteRequest).post(Route.appDelete());
		
		return new RestResponse<AppDeleteResponse>(AppDeleteResponse.class, response);
	}
	
	/**
	* The Delete App method is used to create a http request to delete existing App
	* by using AppID 
	* 
	* @param	appDeleteRequest Delete App Request Payload
	* @param	token used in header for request authorization
	* @return	AppDeleteResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppDeleteResponse> appDeleteWithoutAppId(AppDeleteWithoutAppIdRequest appDeleteWithoutAppIdRequest, String token) {
		
		//accountRequest.header("Authorization", "Bearer " + token);
		initializeAPIRequestWithToken(token);
		Response response = accountRequest.body(appDeleteWithoutAppIdRequest).post(Route.appDelete());
		
		return new RestResponse<AppDeleteResponse>(AppDeleteResponse.class, response);
	}
	
	/**
	* The Delete App method is used to create a http request to delete existing App
	* by using AppID 
	* 
	* @param	appDeleteRequest Delete App Request Payload
	* @param	token used in header for request authorization
	* @return	AppDeleteResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppDeleteResponse> appDeleteNumberAppId(AppDeleteNumberAppIdRequest appDeleteNumberAppIdRequest, String token) {
		
		//accountRequest.header("Authorization", "Bearer " + token);
		initializeAPIRequestWithToken(token);
		Response response = accountRequest.body(appDeleteNumberAppIdRequest).post(Route.appDelete());
		
		return new RestResponse<AppDeleteResponse>(AppDeleteResponse.class, response);
	}
	
	/**
	* The Edit App method is used to create a http request to Edit new app
	* for login user 
	* 
	* @param	appEditRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	AppEditResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppEditResponse> appEdit(AppEditRequest appEditRequest, String token) {
		
		//accountRequest.header("Authorization", "Bearer " + token);
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(appEditRequest).post(Route.appEdit());
		
		return new RestResponse<AppEditResponse>(AppEditResponse.class, response);
	}
	
	/**
	* The Edit App method is used to create a http request to Edit app
	* for login user 
	* 
	* @param	appCreateWithoutDomainUrlRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppEditResponse> appEditWithoutDomainUrl(AppEditWithoutDomainUrlRequest appEditWithoutDomainUrlRequest, String token) {
		
		//accountRequest.header("Authorization", "Bearer " + token);
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(appEditWithoutDomainUrlRequest).post(Route.appEdit());
		
		return new RestResponse<AppEditResponse>(AppEditResponse.class, response);
	}
	
	/**
	* The Edit App method is used to create a http request to Edit app
	* for login user 
	* 
	* @param	appEditRequest Edit App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppEditResponse> appEditWithoutAppID(AppEditWithoutAppIDRequest appEditWithoutAppIdRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(appEditWithoutAppIdRequest).post(Route.appEdit());
		
		return new RestResponse<AppEditResponse>(AppEditResponse.class, response);
	}
	
	/**
	* The Edit App method is used to create a http request to create new app
	* for login user 
	* 
	* @param	appCreateRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppEditResponse> appEditNumberDomainUrl(AppEditNumberDomainUrlRequest appEditNumberDomainUrlRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(appEditNumberDomainUrlRequest).post(Route.appEdit());
		
		return new RestResponse<AppEditResponse>(AppEditResponse.class, response);
	}
	
	/**
	* The Create App method is used to create a http request to create new app
	* for login user 
	* 
	* @param	appCreateRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppEditResponse> appEditNumberDomainName(AppEditNumberDomainNameRequest appEditNumberDomainNameRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(appEditNumberDomainNameRequest).post(Route.appEdit());
		
		return new RestResponse<AppEditResponse>(AppEditResponse.class, response);
	}
	
	/**
	* The Create App method is used to create a http request to create new app
	* for login user 
	* 
	* @param	appCreateRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppEditResponse> appEditNumberDomainDescription(AppEditNumberDomainDescriptionRequest appEditNumberDomainDescriptionRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(appEditNumberDomainDescriptionRequest).post(Route.appEdit());
		
		return new RestResponse<AppEditResponse>(AppEditResponse.class, response);
	}
	
	/**
	* The Edit App method is used to create a http request to Edit new app
	* for login user 
	* 
	* @param	appCreateRequest Create App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppEditResponse> appEditNumberAppID(AppEditNumberAppIDRequest appEditNumberAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(appEditNumberAppIDRequest).post(Route.appEdit());
		
		return new RestResponse<AppEditResponse>(AppEditResponse.class, response);
	}
	
	/**
	* The Edit App method is used to create a http request to Edit new app
	* for login user 
	* 
	* @param	appEditExtraKeyRequest Edit App Request Payload
	* @param	token used in header for request authorization
	* @return	PasswordValidateResetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<AppEditResponse> appEditExtraKey(AppEditExtraKeyRequest appEditExtraKeyRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(appEditExtraKeyRequest).post(Route.appEdit());
		
		return new RestResponse<AppEditResponse>(AppEditResponse.class, response);
	}
	
	/**
	* The Edit Company method is used to create a http request to edit company of 
	* existance user identifed by using token value
	* 
	* @param	companyEditRequest Profile Create Request Payload
	* @param	token used in header for request authorization
	* @return	CompanyEditResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<CompanyEditResponse> editCompany(CompanyEditRequest companyEditRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(companyEditRequest).put(Route.editCompany());
		
		return new RestResponse<CompanyEditResponse>(CompanyEditResponse.class, response);
	}
	
	/**
	* The Edit Company method is used to create a http request to edit company of 
	* existance user identifed by using token value
	* 
	* @param	companyEditWithoutCompanyIdRequest Profile Create Request Payload
	* @param	token used in header for request authorization
	* @return	CompanyEditResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<CompanyEditResponse> editCompanyWithoutCompanyId(CompanyEditWithoutCompanyIdRequest companyEditWithoutCompanyIdRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(companyEditWithoutCompanyIdRequest).put(Route.editCompany());
		
		return new RestResponse<CompanyEditResponse>(CompanyEditResponse.class, response);
	}
	
	/**
	* The Edit Company method is used to create a http request to edit company of 
	* existance user identifed by using token value
	* 
	* @param	companyEditWithoutNameRequest Profile Create Request Payload
	* @param	token used in header for request authorization
	* @return	CompanyEditResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<CompanyEditResponse> editCompanyWithoutName(CompanyEditWithoutNameRequest companyEditWithoutNameRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(companyEditWithoutNameRequest).put(Route.editCompany());
		
		return new RestResponse<CompanyEditResponse>(CompanyEditResponse.class, response);
	}
	
	/**
	* The Edit Company method is used to create a http request to edit company of 
	* existance user identifed by using token value
	* 
	* @param	companyEditWithoutEmailRequest Profile Create Request Payload
	* @param	token used in header for request authorization
	* @return	CompanyEditResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<CompanyEditResponse> editCompanyWithoutEmail(CompanyEditWithoutEmailRequest companyEditWithoutEmailRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(companyEditWithoutEmailRequest).put(Route.editCompany());
		
		return new RestResponse<CompanyEditResponse>(CompanyEditResponse.class, response);
	}
	
	/**
	* The Edit Company method is used to create a http request to edit company of 
	* existance user identifed by using token value
	* 
	* @param	companyEditStringCompanyIdRequest Profile Create Request Payload
	* @param	token used in header for request authorization
	* @return	CompanyEditResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<CompanyEditResponse> editCompanyStringCompantId(CompanyEditStringCompanyIdRequest companyEditStringCompanyIdRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(companyEditStringCompanyIdRequest).put(Route.editCompany());
		
		return new RestResponse<CompanyEditResponse>(CompanyEditResponse.class, response);
	}
	
	/**
	* The Edit Company method is used to create a http request to edit company of 
	* existance user identifed by using token value
	* 
	* @param	companyEditNumberNameRequest Profile Create Request Payload
	* @param	token used in header for request authorization
	* @return	CompanyEditResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<CompanyEditResponse> editCompanyNumberName(CompanyEditNumberNameRequest companyEditNumberNameRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(companyEditNumberNameRequest).put(Route.editCompany());
		
		return new RestResponse<CompanyEditResponse>(CompanyEditResponse.class, response);
	}
	
	/**
	* The Edit Company method is used to create a http request to edit company of 
	* existance user identifed by using token value
	* 
	* @param	companyEditNumberNameRequest Profile Create Request Payload
	* @param	token used in header for request authorization
	* @return	CompanyEditResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<CompanyEditResponse> editCompanyNumberEmail(CompanyEditNumberEmailRequest companyEditNumberEmailRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(companyEditNumberEmailRequest).put(Route.editCompany());
		
		return new RestResponse<CompanyEditResponse>(CompanyEditResponse.class, response);
	}
	
	/**
	* The Get Company method is used to create a http request to get company of 
	* existance user identifed by using token value
	* 
	* @param	token used in header for request authorization
	* @return	CompanyEditResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<CompanyGetResponse> getCompany(String token) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32")
					  .header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.get(Route.getCompany());
		
		return new RestResponse<CompanyGetResponse>(CompanyGetResponse.class, response);
	}
	
	
	/**
	* The Create Profile method is used to create a http request to create profile of 
	* existance user identifed by using token value
	* 
	* @param	profileCreateRequest Profile Create Request Payload
	* @param	token used in header for request authorization
	* @return	ProfileCreateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<ProfileCreateResponse> createProfile(ProfileCreateRequest profileCreateRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(profileCreateRequest).post(Route.profileCreate());
		
		return new RestResponse<ProfileCreateResponse>(ProfileCreateResponse.class, response);
	}
	
	/**
	* The Get Profile method is used to create a http request to get profile of 
	* existing user identifed by using token value
	* 
	* @param	token used in header for request authorization
	* @return	ProfileGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<ProfileGetResponse> getProfile(String token) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32")
					  .header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.get(Route.profileGet());
		
		return new RestResponse<ProfileGetResponse>(ProfileGetResponse.class, response);
	}
	
	/**
	* The Update Profile method is used to create a http request to update profile of 
	* existing user identifed by using token value
	* 
	* @param	profileUpdateRequest Profile Update Request Payload
	* @param	token used in header for request authorization
	* @return	ProfileUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<ProfileUpdateResponse> updateProfile(ProfileUpdateRequest profileUpdateRequest, String token) {
		
		accountRequest.header("Authorization", "Bearer " + token);
		
		Response response = accountRequest.body(profileUpdateRequest).post(Route.profileUpdate());
		
		return new RestResponse<ProfileUpdateResponse>(ProfileUpdateResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAdd(UserDesignAddRequest userDesignAddRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignAddRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddWithoutAppId(UserDesignAddWithoutAppIdRequest userDesignAddWithoutAppIdRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddWithoutAppIdRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddWithoutUserDesignJson(UserDesignAddWithoutUserDesignJsonRequest userDesignAddWithoutUserDesignJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddWithoutUserDesignJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddWithoutWithoutBannerConfigJson(UserDesignAddWithoutBannerConfigJsonRequest userDesignAddWithoutBannerConfigJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddWithoutBannerConfigJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddWithoutWithoutUserTextJson(UserDesignAddWithoutUserTextJsonRequest userDesignAddWithoutUserTextJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddWithoutUserTextJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddWithoutWithoutDefaultLanguage(UserDesignAddWithoutDefaultLanguageRequest userDesignAddWithoutDefaultLanguageRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddWithoutDefaultLanguageRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddNumberAppId(UserDesignAddNumberAppIdRequest userDesignAddNumberAppIdRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddNumberAppIdRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddNumberUserDesignJson(UserDesignAddNumberUserDesignJsonRequest userDesignAddNumberUserDesignJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddNumberUserDesignJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddNumberBannerConfigJson(UserDesignAddNumberBannerConfigJsonRequest userDesignAddNumberBannerConfigJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddNumberBannerConfigJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddNumberUserTextJson(UserDesignAddNumberUserTextJsonRequest userDesignAddNumberUserTextJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddNumberUserTextJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddNumberDefaultLanguage(UserDesignAddNumberDefaultLanguageRequest userDesignAddNumberDefaultLanguageRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddNumberDefaultLanguageRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddStringUserDesignJson(UserDesignAddStringUserDesignJsonRequest userDesignAddStringUserDesignJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddStringUserDesignJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddStringBannerConfigJson(UserDesignAddStringBannerConfigJsonRequest userDesignAddStringBannerConfigJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddStringBannerConfigJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddStringUserTextJson(UserDesignAddStringUserTextJsonRequest userDesignAddStringUserTextJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddStringUserTextJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddEmptyUserDesignjson(UserDesignAddEmptyUserDesignJsonRequest userDesignAddEmptyUserDesignJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddEmptyUserDesignJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddEmptyBannerConfigjson(UserDesignAddEmptyBannerConfigJsonRequest userDesignAddEmptyBannerConfigJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddEmptyBannerConfigJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddEmptyUserTextjson(UserDesignAddEmptyUserTextJsonRequest userDesignAddEmptyUserTextJsonRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddEmptyUserTextJsonRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Add User Design method is used to create a http request to add new User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignAddRequest Add User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignAddResponse> userDesignAddExtraKey(UserDesignAddExtraKeyRequest userDesignAddExtraKeyRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userDesignAddExtraKeyRequest).post(Route.userDesignAdd());
		
		return new RestResponse<UserDesignAddResponse>(UserDesignAddResponse.class, response);
	}
	
	/**
	* The Update User Design method is used to create a http request to Update User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignUpdateRequest Update User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignUpdateResponse> userDesignUpdate(UserDesignUpdateRequest userDesignUpdateRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignUpdateRequest).patch(Route.userDesignUpdate());
		
		return new RestResponse<UserDesignUpdateResponse>(UserDesignUpdateResponse.class, response);
	}
	
	/**
	* The Update User Design method is used to create a http request to Update User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignUpdateRequest Update User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignUpdateResponse> userDesignUpdateWithoutUserDesignID(UserDesignUpdateWithoutUserDesignIDRequest userDesignUpdateWithoutUserDesignIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignUpdateWithoutUserDesignIDRequest).patch(Route.userDesignUpdate());
		
		return new RestResponse<UserDesignUpdateResponse>(UserDesignUpdateResponse.class, response);
	}
	
	/**
	* The Update User Design method is used to create a http request to Update User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignUpdateRequest Update User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignUpdateResponse> userDesignUpdateWithoutUserDesignVersion(UserDesignUpdateWithoutUserDesignVersionRequest userDesignUpdateWithoutUserDesignVersionRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignUpdateWithoutUserDesignVersionRequest).patch(Route.userDesignUpdate());
		
		return new RestResponse<UserDesignUpdateResponse>(UserDesignUpdateResponse.class, response);
	}
	
	/**
	* The Update User Design method is used to create a http request to Update User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignUpdateRequest Update User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignUpdateResponse> userDesignUpdateStringUserDesignID(UserDesignUpdateStringUserDesignIDRequest userDesignUpdateStringUserDesignIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignUpdateStringUserDesignIDRequest).patch(Route.userDesignUpdate());
		
		return new RestResponse<UserDesignUpdateResponse>(UserDesignUpdateResponse.class, response);
	}
	
	/**
	* The Update User Design method is used to create a http request to Update User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignUpdateRequest Update User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignUpdateResponse> userDesignUpdateStringUserDesignVersion(UserDesignUpdateStringUserDesignVersionRequest userDesignUpdateStringUserDesignVersionRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignUpdateStringUserDesignVersionRequest).patch(Route.userDesignUpdate());
		
		return new RestResponse<UserDesignUpdateResponse>(UserDesignUpdateResponse.class, response);
	}
	
	/**
	* The Update User Design method is used to create a http request to Update User Design of 
	* existing user identified by using token value
	* 
	* @param	userDesignUpdateRequest Update User Design Request Payload
	* @param	token used in header for request authorization
	* @return	UserDesignUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignUpdateResponse> userDesignUpdateExtraKey(UserDesignUpdateExtraKeyRequest userDesignUpdateExtraKeyRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignUpdateExtraKeyRequest).patch(Route.userDesignUpdate());
		
		return new RestResponse<UserDesignUpdateResponse>(UserDesignUpdateResponse.class, response);
	}
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignGetResponse> userDesignGet(String token, String appID) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.queryParam("AppID", appID).get(Route.userDesignGet());
		
		return new RestResponse<UserDesignGetResponse>(UserDesignGetResponse.class, response);
	}
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignGetResponse> userDesignGetConfigurationData(String token, String appID, boolean configurationData) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.queryParam("AppID", appID).queryParam("QueryConfigurationsData", configurationData).get(Route.userDesignGet());
		
		return new RestResponse<UserDesignGetResponse>(UserDesignGetResponse.class, response);
	}
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignGetResponse> userDesignGetBlockingData(String token, String appID, boolean blockingData) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.queryParam("AppID", appID).queryParam("QueryBlockingData", blockingData).get(Route.userDesignGet());
		
		return new RestResponse<UserDesignGetResponse>(UserDesignGetResponse.class, response);
	}
	
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignGetResponse> userDesignGetLanguagesData(String token, String appID, boolean languagesData) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.queryParam("AppID", appID).queryParam("QueryLanguagesData", languagesData).get(Route.userDesignGet());
		
		return new RestResponse<UserDesignGetResponse>(UserDesignGetResponse.class, response);
	}
	
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignGetResponse> userDesignGetConfigurationBlockingLanguagesData(String token, String appID, boolean configurationData, boolean blockingData, boolean languagesData) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.queryParam("AppID", appID).queryParam("QueryConfigurationsData", configurationData).queryParam("QueryBlockingData", blockingData).queryParam("QueryLanguagesData", languagesData).get(Route.userDesignGet());
		
		return new RestResponse<UserDesignGetResponse>(UserDesignGetResponse.class, response);
	}
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignGetResponse> userDesignGetWithoutAppId(String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.get(Route.userDesignGet());
		
		return new RestResponse<UserDesignGetResponse>(UserDesignGetResponse.class, response);
	}
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignCopyAppResponse> userDesignCopy(UserDesignCopyAppRequest userDesignCopyAppRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignCopyAppRequest).post(Route.userDesignCopyApp());
		
		return new RestResponse<UserDesignCopyAppResponse>(UserDesignCopyAppResponse.class, response);
	}
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignCopyAppResponse> userDesignCopyWithoutFromApp(UserDesignCopyAppWithoutFromAppIDRequest userDesignCopyAppWithoutFromAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignCopyAppWithoutFromAppIDRequest).post(Route.userDesignCopyApp());
		
		return new RestResponse<UserDesignCopyAppResponse>(UserDesignCopyAppResponse.class, response);
	}
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignCopyAppResponse> userDesignCopyWithoutToAppID(UserDesignCopyAppWithoutToAppIDRequest userDesignCopyAppToAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignCopyAppToAppIDRequest).post(Route.userDesignCopyApp());
		
		return new RestResponse<UserDesignCopyAppResponse>(UserDesignCopyAppResponse.class, response);
	}
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignCopyAppResponse> userDesignCopyNumberFromApp(UserDesignCopyAppNumberFromAppIDRequest userDesignCopyAppNumberFromAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignCopyAppNumberFromAppIDRequest).post(Route.userDesignCopyApp());
		
		return new RestResponse<UserDesignCopyAppResponse>(UserDesignCopyAppResponse.class, response);
	}
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignCopyAppResponse> userDesignCopyNumberToAppID(UserDesignCopyAppNumberToAppIDRequest userDesignCopyAppNumberToAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignCopyAppNumberToAppIDRequest).post(Route.userDesignCopyApp());
		
		return new RestResponse<UserDesignCopyAppResponse>(UserDesignCopyAppResponse.class, response);
	}
	
	
	/**
	* The Get User Design method is used to create a http request to get User Design of 
	* existing user identified by using token value
	* 
	* @param	appID AppID of the user design
	* @param	token used in header for request authorization
	* @return	UserDesignGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserDesignCopyAppResponse> userDesignCopyExtraKey(UserDesignCopyAppExtraKeyRequest userDesignCopyAppExtraKeyRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userDesignCopyAppExtraKeyRequest).post(Route.userDesignCopyApp());
		
		return new RestResponse<UserDesignCopyAppResponse>(UserDesignCopyAppResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddRequest Add User Design Text Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAdd(UserTextAddRequest userTextAddRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddWithoutUserDesignIDRequest Add User Design Text without UserDesignID Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddWithoutUserDesignID(UserTextAddWithoutUserDesignIDRequest userTextAddWithoutUserDesignIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddWithoutUserDesignIDRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddWithoutAppIDRequest Add User Design Text without AppID Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddWithoutAppID(UserTextAddWithoutAppIDRequest userTextAddWithoutAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddWithoutAppIDRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddWithoutLanguageRequest Add User Design Text without Language Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddWithoutLanguage(UserTextAddWithoutLanguageRequest userTextAddWithoutLanguageRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddWithoutLanguageRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddWithoutUserTextJSONRequest Add User Design Text without UserTextJSON Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddWithoutUserTextJSON(UserTextAddWithoutUserTextJSONRequest userTextAddWithoutUserTextJSONRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddWithoutUserTextJSONRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddNumberAppIDRequest Add User Design Text Number AppID Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddNumberAppID(UserTextAddNumberAppIDRequest userTextAddNumberAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddNumberAppIDRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddWithoutNumberRequest Add User Design Text Number Language Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddNumberLanguage(UserTextAddNumberLanguageRequest userTextAddNumberLanguageRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddNumberLanguageRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddNumberUserTextJSONRequest Add User Design Text Number UserTextJSON Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddNumberUserTextJSON(UserTextAddNumberUserTextJSONRequest userTextAddNumberUserTextJSONRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddNumberUserTextJSONRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddNumberCategoryRequest Add User Design Text Number Category Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddNumberCategoryJSON(UserTextAddNumberCategoryJSONRequest userTextAddNumberCategoryJSONRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddNumberCategoryJSONRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddNumberProviderRequest Add User Design Text Number Provider Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddNumberProviderJSON(UserTextAddNumberProviderJSONRequest userTextAddNumberProviderJSONRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddNumberProviderJSONRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddStringUserTextJSONRequest Add User Design Text String UserTextJSON Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddStringUserTextJSON(UserTextAddStringUserTextJSONRequest userTextAddStringUserTextJSONRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddStringUserTextJSONRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddStringCategoryRequest Add User Design Text String Category Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddStringCategoryJSON(UserTextAddStringCategoryJSONRequest userTextAddStringCategoryJSONRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddStringCategoryJSONRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddStringProviderRequest Add User Design Text String Provider Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddStringProviderJSON(UserTextAddStringProviderJSONRequest userTextAddStringProviderJSONRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddStringProviderJSONRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Add User Text method is used to create a http request to add new User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextAddExtraKeyRequest Add User Design Text Extra Key Payload
	* @param	token used in header for request authorization
	* @return	UserTextAddResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextAddResponse> userTextAddExtraKey(UserTextAddExtraKeyRequest userTextAddExtraKeyRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(userTextAddExtraKeyRequest).post(Route.userTextAdd());
		
		return new RestResponse<UserTextAddResponse>(UserTextAddResponse.class, response);
	}
	
	/**
	* The Update User Text method is used to create a http request to Update User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextUpdateRequest Update User Text Request Payload
	* @param	token used in header for request authorization
	* @return	UserTextUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextUpdateResponse> userTextUpdate(UserTextUpdateRequest userTextUpdateRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userTextUpdateRequest).patch(Route.userTextUpdate());
		
		return new RestResponse<UserTextUpdateResponse>(UserTextUpdateResponse.class, response);
	}
	
	/**
	* The Update User Text method is used to create a http request to Update User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextUpdateRequest Update User Text Request Payload
	* @param	token used in header for request authorization
	* @return	UserTextUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextUpdateResponse> userTextUpdateWithoutUserTextID(UserTextUpdateWithoutUserTextIDRequest userTextUpdateWithoutUserTextIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userTextUpdateWithoutUserTextIDRequest).patch(Route.userTextUpdate());
		
		return new RestResponse<UserTextUpdateResponse>(UserTextUpdateResponse.class, response);
	}
	
	/**
	* The Update User Text method is used to create a http request to Update User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextUpdateRequest Update User Text Request Payload
	* @param	token used in header for request authorization
	* @return	UserTextUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextUpdateResponse> userTextUpdateWithoutUserTextVersion(UserTextUpdateWithoutUserTextVersionRequest userTextUpdateWithoutUserTextVersionRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userTextUpdateWithoutUserTextVersionRequest).patch(Route.userTextUpdate());
		
		return new RestResponse<UserTextUpdateResponse>(UserTextUpdateResponse.class, response);
	}
	
	
	/**
	* The Update User Text method is used to create a http request to Update User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextUpdateRequest Update User Text Request Payload
	* @param	token used in header for request authorization
	* @return	UserTextUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextUpdateResponse> userTextUpdateStringUserTextID(UserTextUpdateStringUserTextIDRequest userTextUpdateStringUserTextIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userTextUpdateStringUserTextIDRequest).patch(Route.userTextUpdate());
		
		return new RestResponse<UserTextUpdateResponse>(UserTextUpdateResponse.class, response);
	}
	
	/**
	* The Update User Text method is used to create a http request to Update User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextUpdateRequest Update User Text Request Payload
	* @param	token used in header for request authorization
	* @return	UserTextUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextUpdateResponse> userTextUpdateStringUserTextVersion(UserTextUpdateStringUserTextVersionRequest userTextUpdateStringUserTextVersionRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userTextUpdateStringUserTextVersionRequest).patch(Route.userTextUpdate());
		
		return new RestResponse<UserTextUpdateResponse>(UserTextUpdateResponse.class, response);
	}
	
	/**
	* The Update User Text method is used to create a http request to Update User Text of 
	* existing user identified by using token value
	* 
	* @param	userTextUpdateRequest Update User Text Request Payload
	* @param	token used in header for request authorization
	* @return	UserTextUpdateResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextUpdateResponse> userTextUpdateExtraKey(UserTextUpdateExtraKeyRequest userTextUpdateExtraKeyRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.body(userTextUpdateExtraKeyRequest).patch(Route.userTextUpdate());
		
		return new RestResponse<UserTextUpdateResponse>(UserTextUpdateResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	userDesignID UserDesignID of the user design
	* @param	token used in header for request authorization
	* @param	language set in User Text
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextGetResponse> userTextGet(String token, String userDesignID, String language) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.queryParam("UserDesignID", userDesignID)
				.queryParam("Language", language).get(Route.userTextGet());
		
		return new RestResponse<UserTextGetResponse>(UserTextGetResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	token used in header for request authorization
	* @param	language set in User Text
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextGetResponse> userTextGetWithoutUserDesignID(String token, String language) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.queryParam("Language", language).get(Route.userTextGet());
		
		return new RestResponse<UserTextGetResponse>(UserTextGetResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	userDesignID UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextGetResponse> userTextGetWithoutLanguage(String token, String userDesignID) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.queryParam("UserDesignID", userDesignID).get(Route.userTextGet());
		
		return new RestResponse<UserTextGetResponse>(UserTextGetResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<UserTextGetResponse> userTextGetWithoutAnyParam(String token) {
		
		initializeAPIRequestWithToken(token);
		
		Response response = accountRequest.get(Route.userTextGet());
		
		return new RestResponse<UserTextGetResponse>(UserTextGetResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	publishRequest UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PublishAPIResponse> publishAPI(PublishAPIRequest publishAPIRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(publishAPIRequest).put(Route.publishAPI());
		
		return new RestResponse<PublishAPIResponse>(PublishAPIResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	publishRequest UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PublishAPIResponse> publishAPIWithoutAppID(PublishAPIWithoutAppIDRequest publishAPIWithoutAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(publishAPIWithoutAppIDRequest).put(Route.publishAPI());
		
		return new RestResponse<PublishAPIResponse>(PublishAPIResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	publishRequest UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PublishAPIResponse> publishAPINumberAppID(PublishAPINumberAppIDRequest publishAPINumberAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(publishAPINumberAppIDRequest).put(Route.publishAPI());
		
		return new RestResponse<PublishAPIResponse>(PublishAPIResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	publishRequest UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PublishAPIResponse> publishAPIExtraKey(PublishAPIExtraKeyRequest publishAPIExtraKeyRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(publishAPIExtraKeyRequest).put(Route.publishAPI());
		
		return new RestResponse<PublishAPIResponse>(PublishAPIResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	appID AppID added in uer profile
	* @param	language set in User Text
	* @return	PublishAPIGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PublishAPIGetResponse> publishAPIGet(String appID, String language) {
		
		initializeAPIRequestToken();
		
		Response response = accountRequest.queryParam("AppID", appID)
				.queryParam("Language", language).get(Route.publishAPIGet());
		
		return new RestResponse<PublishAPIGetResponse>(PublishAPIGetResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	appID AppID added in uer profile
	* @param	language set in User Text
	* @return	PublishAPIGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PublishAPIGetResponse> publishAPIGetWithoutAppID( String language) {
		
		initializeAPIRequestToken();
		
		Response response = accountRequest.queryParam("Language", language).get(Route.publishAPIGet());
		
		return new RestResponse<PublishAPIGetResponse>(PublishAPIGetResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	appID AppID added in uer profile
	* @param	language set in User Text
	* @return	PublishAPIGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PublishAPIGetResponse> publishAPIGetWithoutLanguage( String appID) {
		
		initializeAPIRequestToken();
		
		Response response = accountRequest.queryParam("AppID", appID).get(Route.publishAPIGet());
		
		return new RestResponse<PublishAPIGetResponse>(PublishAPIGetResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	appID AppID added in uer profile
	* @param	language set in User Text
	* @return	PublishAPIGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<CategoryGetResponse> categoryGet() {
		
		initializeAPIRequestToken();
		
		Response response = accountRequest.get(Route.getCategory());
		
		return new RestResponse<CategoryGetResponse>(CategoryGetResponse.class, response);
	}
	
	/**
	* The save event method is used to create a http request to save event of 
	* existing user identified by using token value
	* 
	* @param	saveEventAPIRequest
	* @return	saveEventAPIRequest Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveEventResponse> saveEvent(SaveEventAPIRequest saveEventAPIRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveEventAPIRequest).post(Route.saveEvent());
		
		return new RestResponse<SaveEventResponse>(SaveEventResponse.class, response);
	}
	
	/**
	* The saveEventWithoutSessionID method is used to create a http request to save Event Without SessionID of 
	* existing user identified by using token value
	* 
	* @param	saveEventAPIRequest
	* @return	SaveEventResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveEventResponse> saveEventWithoutSessionID(SaveEventAPIWithoutSessioIDRequest saveEventAPIWithoutSessioIDRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveEventAPIWithoutSessioIDRequest).post(Route.saveEvent());
		
		return new RestResponse<SaveEventResponse>(SaveEventResponse.class, response);
	}
	
	/**
	* The saveEventWithoutAppID method is used to create a http request to save Event Without AppID 
	* 
	* @param	saveEventAPIWithoutAppIDRequest
	* @return	SaveEventResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveEventResponse> saveEventWithoutAppID(SaveEventAPIWithoutAppIDRequest saveEventAPIWithoutAppIDRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveEventAPIWithoutAppIDRequest).post(Route.saveEvent());
		
		return new RestResponse<SaveEventResponse>(SaveEventResponse.class, response);
	}
	
	/**
	* The saveEventAPINumberSessionIDRequest method is used to create a http request to Save Event API Number Session ID Request of 
	* 
	* @param	SaveEventAPINumberSessionIDRequest
	* @return	SaveEventResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveEventResponse> saveEventNumberSessionID(SaveEventAPINumberSessionIDRequest saveEventAPINumberSessionIDRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveEventAPINumberSessionIDRequest).post(Route.saveEvent());
		
		return new RestResponse<SaveEventResponse>(SaveEventResponse.class, response);
	}
	
	/**
	* The saveEventAPINumberAppIDRequest method is used to create a http request to save Event Without AppID 
	* 
	* @param	saveEventAPINumberAppIDRequest
	* @return	SaveEventResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveEventResponse> saveEventNumberAppID(SaveEventAPINumberAppIDRequest saveEventAPINumberAppIDRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveEventAPINumberAppIDRequest).post(Route.saveEvent());
		
		return new RestResponse<SaveEventResponse>(SaveEventResponse.class, response);
	}
	
	/**
	* The saveEventAPINumberUserIDRequest method is used to create a http request to save Event API number User ID
	* 
	* @param	saveEventAPINumberUserIDRequest
	* @return	SaveEventResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveEventResponse> saveEventNumberUserID(SaveEventAPINumberUserIDRequest saveEventAPINumberUserIDRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveEventAPINumberUserIDRequest).post(Route.saveEvent());
		
		return new RestResponse<SaveEventResponse>(SaveEventResponse.class, response);
	}
	
	/**
	* The saveEventAPINumberEventRequest method is used to create a http request to save Event API number Event
	* 
	* @param	saveEventAPINumberEventRequest
	* @return	SaveEventResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveEventResponse> saveEventNumberEvent(SaveEventAPINumberEventRequest saveEventAPINumberEventRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveEventAPINumberEventRequest).post(Route.saveEvent());
		
		return new RestResponse<SaveEventResponse>(SaveEventResponse.class, response);
	}
	
	/**
	* The saveEventAPIStringEventRequest method is used to create a http request to save Event API String Event
	* 
	* @param	saveEventAPINumberEventRequest
	* @return	SaveEventResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveEventResponse> saveEventStringEvent(SaveEventAPIStringEventRequest saveEventAPIStringEventRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveEventAPIStringEventRequest).post(Route.saveEvent());
		
		return new RestResponse<SaveEventResponse>(SaveEventResponse.class, response);
	}
	
	/**
	* The saveEventAPIExtraKey method is used to create a http request to save Event API Extra key
	* 
	* @param	saveEventAPIExtraKeyRequest
	* @return	SaveEventResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveEventResponse> saveEventExtraKey(SaveEventAPIExtraKeyRequest saveEventAPIExtraKeyRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveEventAPIExtraKeyRequest).post(Route.saveEvent());
		
		return new RestResponse<SaveEventResponse>(SaveEventResponse.class, response);
	}
	
	/**
	* The save event method is used to create a http request to save event of 
	* existing user identified by using token value
	* 
	* @param	saveSessionAPIRequest
	* @return	saveSessionAPIRequest Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveSessionResponse> saveSession(SaveSessionAPIRequest saveSessionAPIRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveSessionAPIRequest).post(Route.saveSession());
		
		return new RestResponse<SaveSessionResponse>(SaveSessionResponse.class, response);
	}
	
	/**
	* The saveSessionAPIWithoutSessionIDRequest method is used to create a http request to save Session Without SessionID of 
	* existing user identified by using token value
	* 
	* @param	saveSessionAPIWithoutSessionIDRequest
	* @return	SaveSessionResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveSessionResponse> saveSessionWithoutSessionID(SaveSessionAPIWithoutSessionIDRequest saveSessionAPIWithoutSessionIDRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveSessionAPIWithoutSessionIDRequest).post(Route.saveSession());
		
		return new RestResponse<SaveSessionResponse>(SaveSessionResponse.class, response);
	}
	
	/**
	* The saveSessionAPIWithoutAppIDRequest method is used to create a http request to save Session Without AppID 
	* 
	* @param	saveSessionAPIWithoutAppIDRequest
	* @return	SaveSessionResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveSessionResponse> saveSessionWithoutAppID(SaveSessionAPIWithoutAppIDRequest saveSessionAPIWithoutAppIDRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveSessionAPIWithoutAppIDRequest).post(Route.saveSession());
		
		return new RestResponse<SaveSessionResponse>(SaveSessionResponse.class, response);
	}
	
	/**
	* The saveSessionAPINumberSessionIDRequest method is used to create a http request to Save Session API Number Session ID Request of 
	* 
	* @param	saveSessionAPINumberSessionIDRequest
	* @return	SaveSessionResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveSessionResponse> saveSessionNumberSessionID(SaveSessionAPINumberSessionIDRequest saveSessionAPINumberSessionIDRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveSessionAPINumberSessionIDRequest).post(Route.saveSession());
		
		return new RestResponse<SaveSessionResponse>(SaveSessionResponse.class, response);
	}
	
	/**
	* The saveSessionAPINumberAppID method is used to create a http request to save Session Number AppID 
	* 
	* @param	saveSessionAPINumberAppIDRequest
	* @return	SaveSessionResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveSessionResponse> saveSessionNumberAppID(SaveSessionAPINumberAppIDRequest saveSessionAPINumberAppIDRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveSessionAPINumberAppIDRequest).post(Route.saveSession());
		
		return new RestResponse<SaveSessionResponse>(SaveSessionResponse.class, response);
	}
	
	/**
	* The saveSessionAPINumberSessionJSON method is used to create a http request to save Session Number SessionJSON 
	* 
	* @param	saveSessionAPINumberSessionJSONRequest
	* @return	SaveSessionResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveSessionResponse> saveSessionNumberSessionJSON(SaveSessionAPINumberSessionJSONRequest saveSessionAPINumberSessionJSONRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveSessionAPINumberSessionJSONRequest).post(Route.saveSession());
		
		return new RestResponse<SaveSessionResponse>(SaveSessionResponse.class, response);
	}
	
	/**
	* The saveSessionStringSessionJSON method is used to create a http request to save Session String SessionJSON 
	* 
	* @param	saveSessionAPIStringSessionJSONRequest
	* @return	SaveSessionResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveSessionResponse> saveSessionStringSessionJSON(SaveSessionAPIStringSessionJSONRequest saveSessionAPIStringSessionJSONRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveSessionAPIStringSessionJSONRequest).post(Route.saveSession());
		
		return new RestResponse<SaveSessionResponse>(SaveSessionResponse.class, response);
	}
	
	/**
	* The saveSessionAPIExtraKey method is used to create a http request to save Session API Extra key
	* 
	* @param	saveSessionAPIExtraKeyRequest
	* @return	SaveSessionResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<SaveSessionResponse> saveSessionExtraKey(SaveSessionAPIExtraKeyRequest saveSessionAPIExtraKeyRequest) {
		
		accountRequest = RestAssured.given();
		
		accountRequest.header("Content-Type","application/json")
					  .header("x-api-key","ieksok2383djisdusdjwek32");
		
		Response response = accountRequest.body(saveSessionAPIExtraKeyRequest).post(Route.saveSession());
		
		return new RestResponse<SaveSessionResponse>(SaveSessionResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	publishRequest UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PaymentBrainTreeGetResponse> braintreeGet(String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.get(Route.braintreeGet());
		
		return new RestResponse<PaymentBrainTreeGetResponse>(PaymentBrainTreeGetResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	publishRequest UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PaymentRefundResponse> paymentRefund(PaymentRefundRequest paymentRefundRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(paymentRefundRequest).put(Route.paymentRefund());
		
		return new RestResponse<PaymentRefundResponse>(PaymentRefundResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	publishRequest UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PaymentRefundResponse> paymentRefundWithoutTransactionId(PaymentRefundWithoutTransactionIdRequest paymentRefundWithoutTransactionIdRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(paymentRefundWithoutTransactionIdRequest).put(Route.paymentRefund());
		
		return new RestResponse<PaymentRefundResponse>(PaymentRefundResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	publishRequest UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PaymentRefundResponse> paymentRefundWithoutAppID(PaymentRefundWithoutAppIDRequest paymentRefundWithoutAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(paymentRefundWithoutAppIDRequest).put(Route.paymentRefund());
		
		return new RestResponse<PaymentRefundResponse>(PaymentRefundResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	publishRequest UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PaymentRefundResponse> paymentRefundNumberTransactionId(PaymentRefundNumberTransactionIdRequest paymentRefundNumberTransactionIdRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(paymentRefundNumberTransactionIdRequest).put(Route.paymentRefund());
		
		return new RestResponse<PaymentRefundResponse>(PaymentRefundResponse.class, response);
	}
	
	/**
	* The Get User Text method is used to create a http request to get User Text of 
	* existing user identified by using token value
	* 
	* @param	publishRequest UserDesignID of the user design
	* @param	token used in header for request authorization
	* @return	UserTextGetResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PaymentRefundResponse> paymentRefundNumberAppID(PaymentRefundNumberAppIDRequest paymentRefundNumberAppIDRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.body(paymentRefundNumberAppIDRequest).put(Route.paymentRefund());
		
		return new RestResponse<PaymentRefundResponse>(PaymentRefundResponse.class, response);
	}
	
	/**
	* The paymentSearchTransaction method is used to create a http request to Search Transaction of 
	* existing user identified by using token value
	* 
	* @param	transactionID
	* @param	token used in header for request authorization
	* @return	PaymentSearchTransactionResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PaymentSearchTransactionResponse> paymentSearchTransaction(String transactionID, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.get(Route.searchTransaction(transactionID));
		
		return new RestResponse<PaymentSearchTransactionResponse>(PaymentSearchTransactionResponse.class, response);
	}
	
	/**
	* The paymentSearchSubscription method is used to create a http request to Search Subscription of 
	* existing user identified by using token value
	* 
	* @param	subscriptionID
	* @param	token used in header for request authorization
	* @return	PaymentSearchSubscriptionResponse Response Payload from server as RestResponse
	*/
	public IRestResponse<PaymentSearchSubscriptionResponse> paymentSearchSubscription(String subscriptionID, String token) {
		
		initializeAPIRequestWithToken(token);
		  
		Response response = accountRequest.get(Route.searchSubscription(subscriptionID));
		
		return new RestResponse<PaymentSearchSubscriptionResponse>(PaymentSearchSubscriptionResponse.class, response);
	}	
	
	/**
	* The paymentCancelSubscription method is used to create a http request to payment Cancel Subscription of 
	* existing user identified by using token value
	* 
	* @param	paymentCancelSubscriptionRequest
	* @param	token
	* @return	PaymentCancelSubscriptionResponse
	*/
	public IRestResponse<PaymentCancelSubscriptionResponse> paymentCancelSubscription(PaymentCancelSubscriptionRequest paymentCancelSubscriptionRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		 
		Response response = accountRequest.body(paymentCancelSubscriptionRequest).put(Route.cancelSubscription());
		
		return new RestResponse<PaymentCancelSubscriptionResponse>(PaymentCancelSubscriptionResponse.class, response);
	}
	
	/**
	* The paymentCancelSubscriptionWithoutAppIdRequest method is used to payment Cancel Subscription Without AppId of 
	* existing user identified by using token value
	* 
	* @param	token used in header for request authorization
	* @return	PaymentCancelSubscriptionResponse Payload from server as RestResponse
	*/
	public IRestResponse<PaymentCancelSubscriptionResponse> paymentCancelSubscriptionWithoutAppId(String token) {
		
		initializeAPIRequestWithToken(token);
		 
		Response response = accountRequest.put(Route.cancelSubscription());
		
		return new RestResponse<PaymentCancelSubscriptionResponse>(PaymentCancelSubscriptionResponse.class, response);
	}
	
	/**
	* The paymentCancelSubscriptionNumberAppId method is used to payment Cancel Subscription Number AppId of 
	* existing user identified by using token value
	* 
	* @param	paymentCancelSubscriptionWithoutAppIdRequest
	* @param	token used in header for request authorization
	* @return	PaymentCancelSubscriptionResponse Payload from server as RestResponse
	*/
	public IRestResponse<PaymentCancelSubscriptionResponse> paymentCancelSubscriptionNumberAppId(PaymentCancelSubscriptionNumberAppIdRequest paymentCancelSubscriptionNumberAppIdRequest, String token) {
		
		initializeAPIRequestWithToken(token);
		 
		Response response = accountRequest.body(paymentCancelSubscriptionNumberAppIdRequest).put(Route.cancelSubscription());
		
		return new RestResponse<PaymentCancelSubscriptionResponse>(PaymentCancelSubscriptionResponse.class, response);
	}
}