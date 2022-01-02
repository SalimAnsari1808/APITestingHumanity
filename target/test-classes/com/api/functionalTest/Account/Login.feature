Feature: Verify Login API
Description: The purpose of Feature file to verify Unit Test Cases for Login API

Background:
Given Given User connect to Login URL

@Login @Account
Scenario Outline: To verify if user enter correct adminID contains <UserName> and Password
And   User enter AdminId "<UserName>", Password "<Password>", Language "<Language>" and requiredToken "<RequireToken>" using Create Account JSON
When  User enter created AdminId and Password using Login JSON
Then  User get valid response code "<ResponseCode>" from server of Login API
And   Response body of Login API should have "<TokenValue>" Token value
Examples:
| UserName| Password | Language | RequireToken| ResponseCode| TokenValue |
|Alphabet |ValidValue|   en     |    true     |     200     |   Contain  |
|Number   |ValidValue|   en     |    false    |     200     |   Contain  |

@Login @Account
Scenario: To verify that if user has not entered AdminId key
When User enter Password "ValidValue" using Login JSON
Then User get valid response code "400" from server of Login API
And  Response body of Login API should have "AdminIdKey" Error value

@Login @Account
Scenario: To verify that if user has not entered Password key
When User enter AdminId "ValidValue" using Login JSON
Then User get valid response code "400" from server of Login API
And  Response body of Login API should have "PasswordKey" Error value

@Login @Account
Scenario Outline: To verify that if user has not entered <ErrorType> value
And   User create new valid account
When  User enter AdminId "<UserName>" and Password "<Password>" using Login JSON in Login API
Then  User get valid response code "<ResponseCode>" from server of Login API
And   Response body of Login API should have "<ErrorType>" Error value
Examples:
| UserName | Password | ResponseCode| ErrorType    |
|Empty     |ValidValue|     400     |AdminIdValue  |
|ValidValue|Empty     |     400     |PasswordValue |

@Login @Account
Scenario: To verify that if user has entered incorrect AdminId and Password
When  User enter AdminId "InvalidEmail@fake.com" and Password "InvalidPassword" using Login JSON in Login API
Then  User get valid response code "400" in Response body of Login API
And   Login API Response body should have "AdminIdPasswordMistach" Message value

@Login @Account
Scenario Outline: To verify that user enter <ErrorType> in AdminId
When  User enter AdminId "<UserName>" and Password "<Password>" using Login JSON in Login API
Then  User get valid response code "<ResponseCode>" in Response body of Login API
And   Login API Response body should have "<Error>" Message value
Examples:
| UserName 				   | Password  | ResponseCode| Error         | ErrorType  				 	 |
|   abhi   				   | Test@123  |     400     | InvalidAdminId|only letter 				 	 |
|abh%i9@shreepa$#rtners.com| Test@123  |     400     | InvalidAdminId|contains special character	 |
|   abhi@shreepartners.    | Test@123  |     400     | InvalidAdminId|having format (xxx@xxxx.) 	 |
|abhi@123@shreepartners.com| Test@123  |     400     | InvalidAdminId|having format (xxx@xx@xxx.xxx) |
|abhi12@shreepartners.comin| Test@123  |     400     | InvalidAdminId|having format (xxx@xxx.xxxxx)  |
|   abhi12@.com            | Test@123  |     400     | InvalidAdminId|having format (xxx@.xxx)       |

@Login @Account
Scenario Outline: To verify that if user has entered correct Email address in AdminId field and entered Password having <ErrorType>
When  User enter AdminId "<UserName>" and Password "<Password>" using Login JSON in Login API
Then  User get valid response code "<ResponseCode>" in Response body of Login API
And   Login API Response body should have "<Error>" Message value
Examples:
| UserName        | Password  | ResponseCode| Error          | ErrorType  				   |
|sample@sample.com|  Te       |     400     | InvalidPassword|length less than 8 character |
|sample@sample.com|  test@123 |     400     | InvalidPassword|no upper case letter 	       |
|sample@sample.com|  TEST@123 |     400     | InvalidPassword|no small letter	 		   |
|sample@sample.com|  Test123  |     400     | InvalidPassword|no special character	 	   |
|sample@sample.com|  Testing@!|     400     | InvalidPassword|no numeric value		 	   |

@Login @Account
Scenario: To verify that if user enter correct AdminId and Password without verify email verification
And   User create new valid account
When  User enter created AdminId and Password using Login JSON
Then  User get valid response code "200" from server of Login API
And   Response body of Login API should have "Contain" Token value

#This is pending as functionality till not developed to delete account
#Scenario: To verify that if user login with deactivated account


