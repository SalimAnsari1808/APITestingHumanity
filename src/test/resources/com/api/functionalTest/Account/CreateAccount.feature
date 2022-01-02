Feature: Verify Create Account API
Description: The purpose of Feature file to verify Unit Test Cases for Create Account API

Background:
Given User connect to Create Account URL

@CreateAcount @Account
Scenario Outline: To verify that if user has entered correct AdminId, Password, Language and requiredtoken as <RequireToken>
When  User enter AdminId "<UserName>", Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" in Response body of Create Account API
And   Response body of Create Account API should have "<TokenValue>" Token value
Examples:
| UserName | Password | Language | RequireToken| ResponseCode| TokenValue |
|ValidValue|ValidValue|   en     |    true     |     200     |   Contain  |
|ValidValue|ValidValue|   en     |    false    |     200     |  NotContain|

@CreateAcount @Account 
Scenario Outline: To verify that if user has entered correct email Id format as AdminId which contains numbers also.
When  User enter AdminId "<UserName>", Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" in Response body of Create Account API
And   Response body of Create Account API should have "<TokenValue>" Token value
Examples:
| UserName | Password | Language | RequireToken| ResponseCode| TokenValue |
|  Number  |ValidValue|   en     |    false    |     200     | NotContain |

@CreateAcount @Account 
Scenario Outline: To verify that user has entered correct AdminId, Language. requiredToken and Password which contains numbers and special characters also.
When  User enter AdminId "<UserName>", Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" in Response body of Create Account API
And   Response body of Create Account API should have "<TokenValue>" Token value
Examples:
| UserName | Password  | Language | RequireToken| ResponseCode| TokenValue |
|ValidValue|Test@123$#%|   en     |    false    |     200     | NotContain |

@CreateAcount @Account
Scenario Outline: To verify that if user has not entered AdminId key
When  User enter Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" from server for Create Account API
And  Response body of Create Account API should have "<Error>" Error value
Examples:
| Password | Language | RequireToken| ResponseCode| Error      |
|ValidValue|   en     |    false    |     400     | AdminIDKey |

@CreateAcount @Account
Scenario Outline: To verify that if user has not entered Password key
When  User enter AdminId "<UserName>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" from server for Create Account API
And   Response body of Create Account API should have "<Error>" Error value
Examples:
| UserName | Language | RequireToken| ResponseCode| Error      |
|ValidValue|  en      |    false    |     400     | PasswordKey|

@CreateAcount @Account
Scenario Outline: To verify that if user has not entered language key
When  User enter AdminId "<UserName>", Password "<Password>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" from server for Create Account API
And   Response body of Create Account API should have "<Error>" Error value
Examples:
| UserName | Password  | RequireToken| ResponseCode| Error       |
|ValidValue|Test@123$#%|    false    |     400     | LanguageKey |

@CreateAcount @Account
Scenario Outline: To verify that if user has not entered <Error>
When  User enter AdminId "<UserName>", Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" from server for Create Account API
And   Response body of Create Account API should have "<Error>" Error value
Examples:
| UserName | Password  | Language | RequireToken| ResponseCode| Error        |
|EmptyValue|ValidValue |   en     |    false    |     400     | AdminIDValue |
|ValidValue|EmptyValue |   en     |    false    |     400     | PasswordValue|
|ValidValue|ValidValue |EmptyValue|    false    |     400     | LanguageValue|

@CreateAcount @Account
Scenario Outline: To verify that user enter <ErrorType> in AdminId
When  User enter AdminId "<UserName>", Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" from server for Create Account API
And   Response body of Create Account API should have "<Error>" Error value
Examples:
| UserName 				   | Password  | Language | RequireToken| ResponseCode| Error         | ErrorType  				 	 |
|   abhi   				   |ValidValue |   en     |    false    |     400     | InvalidAdminID|only letter 				 	 |
|abh%i9@shreepa$#rtners.com|ValidValue |   en     |    false    |     400     | InvalidAdminID|contains special character	 |
|   abhi@shreepartners.    |ValidValue |   en     |    false    |     400     | InvalidAdminID|having format (xxx@xxxx.) 	 |
|abhi@123@shreepartners.com|ValidValue |   en     |    false    |     400     | InvalidAdminID|having format (xxx@xx@xxx.xxx)|
|abhi12@shreepartners.comin|ValidValue |   en     |    false    |     400     | InvalidAdminID|having format (xxx@xxx.xxxxx) |
|   abhi12@.com            |ValidValue |   en     |    false    |     400     | InvalidAdminID|having format (xxx@.xxx)      |

@CreateAcount @Account
Scenario Outline: To verify that if user has entered correct Email address in AdminId field and entered Password having <ErrorType>
When  User enter AdminId "<UserName>", Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" from server for Create Account API
And   Response body of Create Account API should have "<Error>" Error value
Examples:
| UserName | Password  | Language | RequireToken| ResponseCode| Error          | ErrorType  				|
|ValidValue|  Te       |   en     |    false    |     400     |InvalidPassword1|length less than 8 character|
|ValidValue|  test@123 |   en     |    false    |     400     |InvalidPassword2|no upper case letter 	 	|
|ValidValue|  Test123  |   en     |    false    |     400     |InvalidPassword1|no special character	 	|
|ValidValue|  Testing@!|   en     |    false    |     400     |InvalidPassword2|no numeric value		 	|

@CreateAcount @Account @FailTest
Scenario Outline: To verify that if user has entered correct Email address in AdminId field and entered Password having <ErrorType>
When  User enter AdminId "<UserName>", Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" from server for Create Account API
And   Response body of Create Account API should have "<Error>" Error value
Examples:
| UserName | Password  | Language | RequireToken| ResponseCode| Error          | ErrorType  				|
|ValidValue|  TEST@123 |   en     |    false    |     400     | InvalidPassword|no small letter	 		 	|

@CreateAcount @Account @FailTest 
Scenario Outline: To verify that if user has entered  correct email and password but having <ErrorType> in language field
When  User enter AdminId "<UserName>", Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" from server for Create Account API
And   Response body of Create Account API should have "<Error>" Error value
Examples:
| UserName | Password  | Language | RequireToken| ResponseCode| Error          | ErrorType  		|
|ValidValue| ValidValue|   12     |    false    |     400     | InvalidLanguage|numeric value		|
|ValidValue| ValidValue|   $%     |    false    |     400     | InvalidLanguage|special character 	|
|ValidValue| ValidValue|   xy     |    false    |     400     | InvalidLanguage|invalid language	|

@CreateAcount @Account
Scenario Outline: To verify that if user entered existing AdminID and password <MessageType> verifying from email address
When  User enter AdminId "<UserName>", Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
Then  User get valid response "<ResponseCode>" in Response body of Create Account API
And   Response body of Create Account API should have "<Error>" Message value
Examples:
| UserName 					 	  | Password  | Language | RequireToken| ResponseCode| Message        	| MessageType 	|
|apitestinghumanity@gmail.com	  | ValidValue|   en     |    false    |     400     | UnverifiedAccount| without		|
|abhishek.sharma@shreepartners.com| ValidValue|   en     |    false    |     400     | VerifiedAccount	| with 			|