Feature: Verify User Text Get API
Description: The purpose of Feature file to verify Unit Test Cases for User Design Add API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON
And   User create User Text of correct details using Add User Text JSON 

@GetUserText @Designer
Scenario: To Verify user can create valid User Text
When User get User Text using "CorrectDetails" as parameter.
Then User get valid response "200" in Response body of Get User Text API.
And  Response body of Get User Text API should have Valid value.

@GetUserText @Designer
Scenario Outline: To Verify user get User Text having <RequestType>.
When User get User Text using "<RequestType>" as parameter.
Then User get valid response "<ResponseCode>" from server for Get User Text API  
And  Response body of Get User Text API should have "<RequestType>" Error value
Examples:
|RequestType				|ResponseCode	|
|NoUserDesignID				|400			|
|NoLanguage					|400			|
|WithoutAnyParam			|400			|
|EmptyUserDesignID			|400			|
|EmptyLanguage				|400			|
|StringUserDesignID			|500			|
|InValidUserDesignID		|200			|

@GetUserText @Designer @FailTest
Scenario Outline: To Verify user get User Text having <RequestType>.
When User get User Text using "<RequestType>" as parameter.
Then User get valid response "<ResponseCode>" from server for Get User Text API  
And  Response body of Get User Text API should have "<RequestType>" Error value
Examples:
|RequestType				|ResponseCode	|
|NumberLanguage				|400			|
|SpecialCharacterLanguage	|400			|