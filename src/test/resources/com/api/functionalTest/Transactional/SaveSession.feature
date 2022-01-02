Feature: Verify Save Session API
Description: The purpose of Feature file to verify Unit Test Cases for Save Session API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON

@SaveSession @Transactional
Scenario: To verify that if User hit Save Session API with Correct Details
When User hit Save Session API with Correct Details using Save Session JSON. 
Then User get valid response "200" in Response body of Save Session API
And  Response body of Save Session API should have Valid value
 
@SaveSession @Transactional
Scenario Outline: To verify that if User have <BodyValue>
When User enter "<BodyValue>" using Save Session JSON
Then User get valid response "<ResponseCode>" from server for Save Session API 
And  Response body of Save Session API should have "<BodyValue>" Error value
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
|NullSessionJSON				|400			|
|NumberSessionJSON				|400			|
|StringSessionJSON				|400			|
|ExtraKey						|400			|


@SaveSession @Transactional @FailTest
Scenario Outline: To verify that if User have <BodyValue>
When User enter "<BodyValue>" using Save Session JSON
Then User get valid response "<ResponseCode>" from server for Save Session API 
And  Response body of Save Session API should have "<BodyValue>" Error value
Examples:
|BodyValue						|ResponseCode	|
|InvalidSessionID				|400			|
|InvalidAppID					|400			|