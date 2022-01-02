Feature: Verify Cancel Subscription API
Description: The purpose of Feature file to verify Unit Test Cases for Cancel Subscription API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON
And   User create User Text of correct details using Add User Text JSON
And   User Open Web Application and Complete Payment and get transactionId of Payment done

@CancelSubscription @Payment
Scenario: To verify that if user pass correct AppId
When  User pass "PreCreated" AppId in Cancel Subscription API.
Then  User get valid response "200" from server for Cancel Subscription API
And   Response body of Cancel Subscription API should have "Valid" value 

@CancelSubscription @Payment
Scenario Outline: To verify that if user pass <RequestType>
When  User pass "<RequestType>" AppId in Cancel Subscription API.
Then  User get valid response "<ResponseCode>" from server for Cancel Subscription API
And   Response body of Cancel Subscription API should have "<ResponseType>" value 
Examples:
|RequestType	|ResponseCode	|ResponseType	|
|NoAppId		|400			|RequiredAppId	|
|NullAppId		|400			|StringAppId	|
|NumberAppId	|400			|StringAppId	|
|EmptyAppId		|400			|NotEmptyAppId	|
|InValidAppId	|400			|InValidAppId	|

@CancelSubscription @Payment
Scenario: To verify that if user pass allready canceled subscription AppId
When  User pass "PreCreated" AppId in Cancel Subscription API.
And   User pass "PreCreated" AppId in Cancel Subscription API.
Then  User get valid response "200" from server for Cancel Subscription API
And   Response body of Cancel Subscription API should have "AlreadyCanceled" value 