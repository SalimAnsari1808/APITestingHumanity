Feature: Verify App Create API
Description: The purpose of Feature file to verify Unit Test Cases for App Create API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API

@AppCreate @Account 
Scenario: To verify that if user enter correct DomainUrl, DomainName and DomainDescription
When  User send DomainURL "https://localhost:8040" DomainName "AutomationTest", DomainDescription "App Created using Automation Script" using App Create JSON
Then  User get valid response code "200" in Response body of App Create API
And   Response body of Create App API should have "ValidValue" value

@AppCreate @Account
Scenario: To verify that user not enter DomainUrl key
When  User send DomainName "AutomationTest", DomainDescription "App Created using Automation Script" using App Create JSON
Then  User get valid response code "400" from server of App Create API
And   Response body of Create App API should have "DomainUrlKey" Error value

@AppCreate @Account 
Scenario: To verify that user not enter DomainName key
When  User send DomainURL "https://localhost:8040" and DomainDescription "Blah blah description of Website" using App Create JSON
Then  User get valid response code "400" from server of App Create API
And   Response body of Create App API should have "DomainNameKey" Error value

@AppCreate @Account
Scenario: To verify that user not enter DomainDescription key
When  User send DomainURL "https://localhost:8040" and DomainName "Test Web1" using App Create JSON
#Then  User get valid response code "400" from server of App Create API
#And   Response body of Create App API should have "DomainDescriptionKey" Error value
Then  User get valid response code "200" in Response body of App Create API
And   Response body of Create App API should have "DomainDescriptionKey" value

@AppCreate @Account
Scenario Outline: To verify that user enter Empty DomainUrl value
When  User send DomainURL "<DomainUrl>" DomainName "<DomainName>", DomainDescription "<DomainDescription>" using App Create JSON
Then  User get valid response code "<ResponseCode>" from server of App Create API
And   Response body of Create App API should have "<Error>" Error value
Examples:
|DomainUrl             |DomainName    |DomainDescription                  |ResponseCode|Error         |
|EmptyValue            |AutomationTest|App Created using Automation Script|  400       |EmptyDomainUrl|

@AppCreate @Account @FailTest
Scenario Outline: To verify that user not enter <ResponseValue> value
When  User send DomainURL "<DomainUrl>" DomainName "<DomainName>", DomainDescription "<DomainDescription>" using App Create JSON
Then  User get valid response code "<ResponseCode>" in Response body of App Create API
And   Response body of Create App API should have "<ResponseValue>" value
Examples:
|DomainUrl             |DomainName    |DomainDescription                  |ResponseCode|ResponseValue		  |
|https://localhost:8040|AutomationTest|EmptyValue                         |  200       |EmptyDomainDescription|

@AppCreate @Account
Scenario Outline: To verify that user enter <Error> value
When  User send DomainURL "<DomainUrl>" DomainName "<DomainName>", DomainDescription "<DomainDescription>" using App Create JSON
Then  User get valid response code "<ResponseCode>" from server of App Create API
And   Response body of Create App API should have "<Error>" Error value
Examples:
|DomainUrl             |DomainName    |DomainDescription                  |ResponseCode|Error        	|
|NullValue             |AutomationTest|App Created using Automation Script|  400       |NullDomainUrl 	|
|https://localhost:8040|EmptyValue    |App Created using Automation Script|  400       |EmptyDomainName	|


@AppCreate @Account
Scenario Outline: To verify that user enter <ResponseValue> value
When  User send DomainURL "<DomainUrl>" DomainName "<DomainName>", DomainDescription "<DomainDescription>" using App Create JSON
Then  User get valid response code "<ResponseCode>" in Response body of App Create API
And   Response body of Create App API should have "<ResponseValue>" value
Examples:
|DomainUrl             |DomainName    |DomainDescription                  |ResponseCode|ResponseValue		  |
|https://localhost:8042|AutomationTest|NullValue                          |  200       |NullDomainDescription |

@AppCreate @Account
Scenario Outline: To verify that user enter <Error> value
When  User send DomainURL "<DomainUrl>" DomainName "<DomainName>", DomainDescription "<DomainDescription>" using App Create JSON
Then  User get valid response code "<ResponseCode>" from server of App Create API
And   Response body of Create App API should have "<Error>" Error value
Examples:
|DomainUrl             |DomainName    |DomainDescription                  |ResponseCode|Error				  |
|https://localhost:8041|NullValue     |App Created using Automation Script|  400       |NullDomainName		  |

@AppCreate @Account 
Scenario Outline: To verify that user enter <ErrorType> value as number
When  User send DomainURL "<DomainUrl>" DomainName "<DomainName>", DomainDescription "<DomainDescription>" using App Create JSON
Then  User get valid response code "<ResponseCode>" from server of App Create API
And   Response body of Create App API should have "<ErrorType>" Error value
Examples:
|DomainUrl             |DomainName    |DomainDescription                  |ResponseCode|ErrorType		  	   |
|NumberValue		   |AutomationTest|App Created using Automation Script|  400       |NumberDomainUrl		   |
|https://localhost:8040|NumberValue   |App Created using Automation Script|  400       |NumberDomainName	   |
|https://localhost:8040|AutomationTest|NumberValue                        |  400       |NumberDomainDescription|

@AppCreate @Account
Scenario: To verify if user create app with existing domain url
When  User send DomainURL "https://localhost:8040" DomainName "AutomationTest", DomainDescription "App Created using Automation Script" using App Create JSON
And   User send DomainURL "https://localhost:8040" DomainName "AutomationTest", DomainDescription "App Created using Automation Script" using App Create JSON
Then  User get valid response code "400" in Response body of App Create API
And   Response body of Create App API should have "DuplicateDomainUrl" Message value


@AppCreate @Account
Scenario: To verify if user is creating app without login or expire token.
When  User create new App with Expire Token
#Then  User get valid response code "400" in Response body of App Create API
Then  User get valid response code "403" from server of App Create API
And   Response body of Create App API should have "TokenExpire" Message value

