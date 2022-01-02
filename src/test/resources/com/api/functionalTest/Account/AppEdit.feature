Feature: Verify App Edit API
Description: The purpose of Feature file to verify Unit Test Cases for App Edit API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON

@AppEdit @Account
Scenario: To verify that if user enter correct AppId, DomainUrl, DomainName and DomainDescription
When  User send AppId "PreCreated" DomainURL "https://localhost:8040" DomainName "AutomationTest" DomainDescription "App Edit using Automation Script" using App Edit JSON
Then  User get valid response code "200" in Response body of App Edit API 
And   Response body of Edit App API should have "ValidValue" value

@AppEdit @Account
Scenario: To verify that user not enter AppID key
When  User send DomainURL "https://localhost:8040" DomainName "AutomationTestEdited", DomainDescription "App Edited using Automation Script" using App Edit JSON
Then  User get valid response code "400" from server of App Edit API
And   Response body of Edit App API should have "AppIDKey" Error value 

@AppEdit @Account @FailTest
Scenario: To verify that user not enter DomianUrl key
When  User send AppId "PreCreated" DomainName "AutomationTestEdited", DomainDescription "App Edited using Automation Script" using App Edit JSON
Then  User get valid response code "400" from server of App Edit API
And   Response body of Edit App API should have "DomainUrlKey" Error value  

@AppEdit @Account
Scenario Outline: To verify that user enter <Error> value
When  User send AppId "<AppID>" DomainURL "<DomainUrl>" DomainName "<DomainName>" DomainDescription "<DomainDescription>" using App Edit JSON
Then  User get valid response code "<ResponseCode>" from server of App Edit API
And   Response body of Edit App API should have "<Error>" Error value
Examples:
|AppID		|DomainUrl             |DomainName    |DomainDescription                  	|ResponseCode|Error          |
|PreCreated	|NullValue             |AutomationTest|App Edited using Automation Script	|  400       |NullDomainUrl  |
|NullValue 	|https://localhost:8040|AutomationTest|App Edited using Automation Script	|  400       |NullAppId 	 |
|PreCreated	|NumberValue           |AutomationTest|App Edited using Automation Script	|  400       |NumberDomainUrl|
|NumberValue|https://localhost:8040|AutomationTest|App Edited using Automation Script	|  400       |NumberAppId 	 |
|PreCreated	|EmptyValue            |AutomationTest|App Edited using Automation Script	|  400       |DomainUrlEmpty |
|EmptyValue |https://localhost:8040|AutomationTest|App Edited using Automation Script	|  400       |AppIdEmpty	 |


#@AppEdit @Account 
Scenario: To verify if user Edit app with existing domain url
When  User send AppId "PreCreated" DomainURL "https://localhost:8040" DomainName "AutomationTest" DomainDescription "App Edit using Automation Script" using App Edit JSON
And   User send AppId "PreCreated" DomainURL "https://localhost:8040" DomainName "AutomationTest" DomainDescription "App Edit using Automation Script" using App Edit JSON
Then  User get valid response code "400" in Response body of App Edit API
And   Response body of Edit App API should have "DuplicateDomainUrl" Message value 

@AppEdit @Account
Scenario: To verify if user is Editing app without login or expire token.
When  User Edit App with Expire Token
#Then  User get valid response code "400" in Response body of App Create API
Then  User get valid response code "403" from server of App Edit API
And   Response body of Edit App API should have "TokenExpire" Message value 

@AppEdit @Account
Scenario: To verify if user enter invalid App Id
When  User send AppId "local123" DomainURL "https://localhost:8040" DomainName "AutomationTest" DomainDescription "App Edit using Automation Script" using App Edit JSON
Then  User get valid response code "200" from server of App Edit API
And   Response body of Edit App API should have "DataNull" Message value 

@AppEdit @Account
Scenario: To verify if user enter secured domainUrl
When  User send AppId "PreCreated" DomainURL "https://localhost:8040" DomainName "AutomationTest" DomainDescription "App Edit using Automation Script" using App Edit JSON
Then  User get valid response code "200" from server of App Edit API
And   Response body of Edit App API should contains isHttps value "true".  

@AppEdit @Account
Scenario: To verify if user enter not secured domainUrl
When  User send AppId "PreCreated" DomainURL "http://localhost:8040" DomainName "AutomationTest" DomainDescription "App Edit using Automation Script" using App Edit JSON
Then  User get valid response code "200" from server of App Edit API
And   Response body of Edit App API should contains isHttps value "false".  

@AppEdit @Account
Scenario: To verify if user enter extra key
When  User send extra key using App Edit JSON
Then  User get valid response code "400" from server of App Edit API 
And   Response body of Edit App API should have "ExtraKey" Error value