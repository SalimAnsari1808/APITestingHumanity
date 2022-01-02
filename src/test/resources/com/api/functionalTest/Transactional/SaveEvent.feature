Feature: Verify Save Event API
Description: The purpose of Feature file to verify Unit Test Cases for Save Event API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON
And   User create User Text of correct details using Add User Text JSON

@SaveEvent @Transactional
Scenario: To verify that if User hit Save Event API with Correct Details
When User hit Save Event API with Correct Details using Save Event JSON. 
Then User get valid response "200" in Response body of Save Event API
And  Response body of Save Event API should have Valid value

@SaveEvent @Transactional 
Scenario Outline: To verify that if User have <BodyValue>
When User enter "<BodyValue>" using Save Event JSON
Then User get valid response "<ResponseCode>" from server for Save Event API 
And  Response body of Save Event API should have "<BodyValue>" Error value
Examples:
|BodyValue						|ResponseCode	|
|NoSessionID					|400			|
|NoAppID						|400			|
|NullSessionID					|400			|
|NullAppID						|400			|
|NumberSessionID				|400			|
|NumberAppID					|400			|
|EmptySessionID					|400			|
|EmptyAppID						|400			|
|NullUserID						|400			|
|NumberUserID					|400			|
|EmptyUserID					|400			|
|NullEvent						|400			|
|NumberEvent					|400			|
|StringEvent					|400			|
|ExtraKey						|400			|

@SaveEvent @Transactional @FailTest
Scenario Outline: To verify that if User have <BodyValue>
When User enter "<BodyValue>" using Save Event JSON
Then User get valid response "<ResponseCode>" from server for Save Event API 
And  Response body of Save Event API should have "<BodyValue>" Error value
Examples:
|BodyValue						|ResponseCode	|
|InvalidSessionID				|400			|
|InvalidAppID					|400			|