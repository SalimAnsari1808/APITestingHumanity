Feature: Verify Password Reset API
Description: The purpose of Feature file to verify Unit Test Cases for Password Reset API

Background:
Given User connect to Password Reset URL

@PasswordReset @Account
Scenario: To verify that if user enter correct AdminId
And   User create new valid account
When  User enter AdminId using Password Reset JSON
Then  User get valid response "200" in Response body of Password Reset API
And   Response body of Password Reset API should have "Valid" value.

@PasswordReset @Account
Scenario: To verify that if user has not entered AdminId key
When  User not enter AdminId using Password Reset JSON
Then  User get valid response "400" from server for Password Reset API
And   Response body of Password Reset API should have "AdminIdKey" Error value

@PasswordReset @Account
Scenario: To verify that if user has not entered AdminId value
When  User enter AdminId "EmptyValue" using Password Reset JSON
Then  User get valid response "400" from server for Password Reset API
And   Response body of Password Reset API should have "AdminIdEmpty" Error value

@PasswordReset @Account
Scenario Outline: To verify that user enter <ErrorType> in AdminId
When  User enter AdminId "<UserName>" using Password Reset JSON
Then  User get valid response "<ResponseCode>" from server for Password Reset API
And   Response body of Password Reset API should have "<Error>" Error value
Examples:
| UserName 				   | ResponseCode| Error         | ErrorType  				 	 |
|   abhi   				   |     400     | InvalidAdminId|only letter 				 	 |
|abh%i9@shreepa$#rtners.com|     400     | InvalidAdminId|contains special character	 |
|   abhi@shreepartners.    |     400     | InvalidAdminId|having format (xxx@xxxx.) 	 |
|abhi@123@shreepartners.com|     400     | InvalidAdminId|having format (xxx@xx@xxx.xxx) |
|abhi12@shreepartners.comin|     400     | InvalidAdminId|having format (xxx@xxx.xxxxx)  |
|   abhi12@.com            |     400     | InvalidAdminId|having format (xxx@.xxx)       |

@PasswordReset @Account
Scenario: To verify that if user enter incorrect email in AdminId value
When  User enter AdminId "fake@fake.com" using Password Reset JSON
Then  User get valid response "400" in Response body of Password Reset API
And   Response body of Password Reset API should have "InvalidAdminId" Message value

#This is pending as functionality till not developed to delete account
#Scenario: To verify that if user enter deactivated in AdminId value
