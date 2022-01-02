package com.api.modelEngine;


/**
 * <h1>API Routes</h1>
* This class is used to create and return API Routes i.e API Resource Path
* 
* @author	Salim Ansari
* @since	23-Oct-2020	
*/
public class Route {
	
	private static final String API_ACCOUNT = "/api/account";
	
	private static final String API_DESIGN = "/api/designer";
	
	private static final String API_TRANSACTIONAL = "/api/transactional";
	
	private static final String ACCOUNT = "/account";
	
	private static final String EMAIL = "/email";
	
	private static final String APP = "/app";
	
	private static final String PROFILE = "/profile";
	
	private static final String COMPANY = "/company";
	
	private static final String HEALTH = "/health";
	
	private static final String LOGIN = "/login";
	
	private static final String REGISTRATION = "/registration";
	
	private static final String ADD = "/add";
	
	private static final String DELETE = "/delete";
	
	private static final String LIST = "/list";
	
	private static final String EDIT = "/edit";
	
	private static final String VERIFY_EMAIl = "/sendAccountVerifyEmail";
	
	private static final String VALIDATE_EMAIL = "/validate-email";
	
	private static final String RESET_PASSWORD = "/resetPassword";
	
	private static final String VALIDATE_RESET_PASSWORD = "/validate-resetPassword";
	
	private static final String USER_DESIGN = "/user-design";
	
	private static final String USER_TEXT = "/user-text";
	
	private static final String PUBLISH_API = "/user-design-live";
	
	private static final String CATEGORY = "/category";
	
	private static final String SAVE = "/save";
	
	private static final String EVENT = "/event";
	
	private static final String SESSION = "/session";
	
	private static final String COPY = "/copy";
	
	private static final String BRAINTREE = "/braintree";
	
	private static final String REFUND = "/refund";
	
	private static final String SEARCH = "/search";
	
	private static final String SUBSCRIPTION_SEARCH = "/subscriptionSearch";
	
	private static final String SUBSCRIPTION_CANCEL	= "/subcriptioncancel";
	
	/**
	* The health method will create and return health API resource path
	* 
	* @param	NA
	* @return 	/api/account/health
	*/
	public static String health() {
		//api/account/health
		return API_ACCOUNT + HEALTH;
	}
	
	/**
	* The login method will create and return Login API resource path
	* 
	* @param	NA
	* @return 	/api/account/account/login
	*/
	public static String login() {
		//api/account/account/login
		return API_ACCOUNT + ACCOUNT + LOGIN;
	}
	
	/**
	* The Create Account method will create and return Create Account API resource path
	* 
	* @param	NA
	* @return 	/api/account/account/registration
	*/
	public static String accountCreate() {
		//api/account/account/registration
		return API_ACCOUNT + ACCOUNT + REGISTRATION;
	}
	
	/**
	* The Email Verify method will create and return email verify API resource path
	* 
	* @param	NA
	* @return 	/api/account/email/sendAccountVerifyEmail
	*/
	public static String emailVerify() {
		//api/account/email/sendAccountVerifyEmail
		return API_ACCOUNT + EMAIL + VERIFY_EMAIl;
	}
	
	/**
	* The Validate Email Reset method will create and return validate email API resource path
	* 
	* @param	NA
	* @return 	/api/account/email/validate-email
	*/
	public static String emailValidate() {
		//api/account/account/validate-email
		return API_ACCOUNT + ACCOUNT + VALIDATE_EMAIL;
	}
	
	/**
	* The Password Reset method will create and return reset password API resource path
	* 
	* @param	NA
	* @return 	/api/account/account/resetPassword
	*/
	public static String passwordReset() {
		//api/account/email/resetPassword
		return API_ACCOUNT + EMAIL + RESET_PASSWORD;
	}
	
	/**
	* The Validate Password Reset method will create and return validate reset password API resource path
	* 
	* @param	NA
	* @return 	/api/account/account/validate-resetPassword
	*/
	public static String passwordValidateReset() {
		//api/account/account/validate-resetPassword
		return API_ACCOUNT + ACCOUNT + VALIDATE_RESET_PASSWORD;
	}
	
	/**
	* The Create App method will create and return create app API resource path
	* 
	* @param	NA
	* @return 	/api/account/app/add
	*/
	public static String appCreate() {
		//api/account/app/add
		return API_ACCOUNT + APP + ADD;
	}
	
	/**
	* The Delete App method will create and return delete app API resource path
	* 
	* @param	NA
	* @return 	/api/account/app/delete
	*/
	public static String appDelete() {
		//api/account/app/delete
		return API_ACCOUNT + APP + DELETE;
	}
	
	/**
	* The List App method will create and return list app API resource path
	* 
	* @param	NA
	* @return 	/api/account/app/list
	*/
	public static String appList() {
		//api/account/app/list
		return API_ACCOUNT + APP + LIST;
	}
	
	/**
	* The Edit App method will create and return edit app API resource path
	* 
	* @param	NA
	* @return 	/api/account/app/edit
	*/
	public static String appEdit() {
		//api/account/app/edit
		return API_ACCOUNT + APP + EDIT;
	}
	
	/**
	* The Profile Create method will create and return create profile API resource path
	* 
	* @param	NA
	* @return 	/api/account/app/list
	*/
	public static String profileCreate() {
		//api/account/profile/add
		return API_ACCOUNT + PROFILE + ADD;
	}
	
	/**
	* The Profile Get method will create and return get profile API resource path
	* 
	* @param	NA
	* @return 	/api/account/profile
	*/
	public static String profileGet() {
		//api/account/profile
		return API_ACCOUNT + PROFILE;
	}
	
	/**
	* The Update Get method will create and return update profile API resource path
	* 
	* @param	NA
	* @return 	/api/account/profile/edit
	*/
	public static String profileUpdate() {
		//api/account/profile/edit
		return API_ACCOUNT + PROFILE + EDIT; 
	}
	
	/**
	* The Add User Design method will create and return add user design API resource path
	* 
	* @param	NA
	* @return 	/api/designer/user-design
	*/
	public static String userDesignAdd() {
		//api/designer/user-design
		return API_DESIGN + USER_DESIGN;
	}
	
	/**
	* The Update User Design method will create and return update user design API resource path
	* 
	* @param	NA
	* @return 	/api/designer/user-design
	*/
	public static String userDesignUpdate() {
		//api/designer/user-design
		return API_DESIGN + USER_DESIGN;	
	}
	
	/**
	* The Get User Design method will create and return get user design API resource path
	* 
	* @param	NA
	* @return 	/api/designer/user-design
	*/
	public static String userDesignGet() {
		//api/designer/user-design
		return API_DESIGN + USER_DESIGN;	
	}
	
	/**
	* The User Design Copy App method will create and return user design Copy App API resource path
	* 
	* @param	NA
	* @return 	/api/designer/user-design/copy
	*/
	public static String userDesignCopyApp() {
		//api/designer/user-design/copy
		return API_DESIGN + USER_DESIGN + COPY;	
	}
	
	/**
	* The Add User Text method will create and return add user text API resource path
	* 
	* @param	NA
	* @return 	/api/designer/user-text
	*/
	public static String userTextAdd() {
		//api/designer/user-text
		return API_DESIGN + USER_TEXT;
	}
	
	/**
	* The Update User Text method will create and return update user text API resource path
	* 
	* @param	NA
	* @return 	/api/designer/user-text
	*/
	public static String userTextUpdate() {
		//api/designer/user-text
		return API_DESIGN + USER_TEXT;	
	}
	
	/**
	* The Get User Text method will create and return get user text API resource path
	* 
	* @param	NA
	* @return 	/api/designer/user-text
	*/
	public static String userTextGet() {
		//api/designer/user-text
		return API_DESIGN + USER_TEXT;	
	}
	
	/**
	* The publish API method will create and return get publish API resource path
	* 
	* @param	NA
	* @return 	/api/designer/user-design-live
	*/
	public static String publishAPI() {
		//api/designer/user-design-live
		return API_DESIGN + PUBLISH_API;
	}
	
	/**
	* The publish API get method will create and return get publish API get resource path
	* 
	* @param	NA
	* @return 	/api/designer/user-design-live
	*/
	public static String publishAPIGet() {
		//api/designer/user-design-live
		return API_DESIGN + PUBLISH_API;
	}
	
	/**
	* The edit company get method will create and return edit company API get resource path
	* 
	* @param	NA
	* @return 	/api/account/company
	*/
	public static String editCompany() {
		//api/account/company
		return API_ACCOUNT + COMPANY;
	}
	
	/**
	* The get company get method will create and return get company API get resource path
	* 
	* @param	NA
	* @return 	/api/account/company
	*/
	public static String getCompany() {
		//api/account/company
		return API_ACCOUNT + COMPANY;
	}
	
	public static String getCategory() {
		//api/designer/category
		return API_DESIGN + CATEGORY;
	}
	
	/**
	* The saveEvent get method will create and return Save Event resource path
	* 
	* @param	NA
	* @return 	/api/transactional/event/save
	*/
	public static String saveEvent() {
		//api/transactional/event/save
		return API_TRANSACTIONAL + EVENT + SAVE;
	}
	
	/**
	* The saveSession get method will create and return save session resource path
	* 
	* @param	NA
	* @return 	/api/transactional/session/save
	*/
	public static String saveSession() {
		//api/transactional/event/save
		return API_TRANSACTIONAL + SESSION + SAVE;
	}
	
	/**
	* The saveSession get method will create and return save session resource path
	* 
	* @param	NA
	* @return 	/api/account/braintree
	*/
	public static String braintreeGet() {
		//api/account/braintree
		return API_ACCOUNT + BRAINTREE;
	}
	
	/**
	* The saveSession get method will create and return save session resource path
	* 
	* @param	NA
	* @return 	/api/account/braintree
	*/
	public static String paymentRefund() {
		//api/account/braintree/refund
		return API_ACCOUNT + BRAINTREE + REFUND;
	}
	
	/**
	* The searchTransaction get method will search Transaction and return search Transaction resource path
	* 
	* @param	transationID
	* @return 	/api/account/braintree/search/
	*/
	public static String searchTransaction(String transationID) {
		//api/account/braintree/search/
		return API_ACCOUNT + BRAINTREE + SEARCH + "/" + transationID;
	}
	
	/**
	* The searchSubscription get method will search Transaction and return search Subscription resource path
	* 
	* @param	subscriptionID
	* @return 	/api/account/braintree/subscriptionSearch/
	*/
	public static String searchSubscription(String subscriptionID) {
		//api/account/braintree/subscriptionSearch/
		return API_ACCOUNT + BRAINTREE + SUBSCRIPTION_SEARCH + "/" + subscriptionID;
	}
	
	/**
	* The cancelSubscription get method will cancel Subscription and return cancel Subscription resource path
	* 
	* @param	NA
	* @return 	/api/account/braintree/subcriptioncancel
	*/
	public static String cancelSubscription() {
		//api/account/braintree/subcriptioncancel
		return API_ACCOUNT + BRAINTREE + SUBSCRIPTION_CANCEL;
	}
}
