Feature: Verify User Text Add API
Description: The purpose of Feature file to verify Unit Test Cases for User Design Add API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON

@AddUserText @Designer
Scenario: To Verify user can create valid User Text
When User create User Text of correct details using Add User Text JSON  
Then User get valid response "200" in Response body of Add User Text API
And  Response body of Add User Text API should have Valid value

@AddUserText @Designer
Scenario Outline: To verify that if User have <BodyValue>
When User enter "<BodyValue>" using Add User Text JSON
Then User get valid response "<ResponseNumber>" from server for Add User Text API 
And  Response body of Add User Text API should have "<BodyValue>" Error value
Examples:
|BodyValue						|ResponseNumber	|
|NoUserDesignID					|400			|
|NoAppID						|400			|
|NoLanguage						|400			|
|NoUserTextJSON					|400			|
|NullUserDesignID				|400			|
|NullAppID						|400			|
|NullLanguage					|400			|
|NullUserTextJSON				|400			|
|NullCategoryJSON				|400			|
|NullProviderJSON				|400			|
|NumberAppID					|400			|
|NumberLanguage					|400			|
|NumberUserTextJSON				|400			|
|NumberCategoryJSON				|400			|
|NumberProviderJSON				|400			|
|StringUserTextJSON				|400			|
|StringCategoryJSON				|400			|
|StringProviderJSON				|400			|
|EmptyAppID						|400			|
|EmptyLanguage					|400			|
|ExtraKey						|400			|

@AddUserText @Designer @FailTest
Scenario Outline: To verify that if User have <BodyValue>
When User enter "<BodyValue>" using Add User Text JSON
Then User get valid response "<ResponseNumber>" from server for Add User Text API 
And  Response body of Add User Text API should have "<BodyValue>" Error value
Examples:
|BodyValue						|ResponseNumber	|
|SpecialCharacterLanguageValue	|400			|
|StringFormatNumberLanguageValue|400			|

@AddUserText @Designer
Scenario Outline: To verify that if User have <BodyValue>
When User enter "<BodyValue>" using Add User Text JSON
Then User get valid response "<ResponseNumber>" in Response body of Add User Text API
And  Response body of Add User Text API should have "<BodyValue>" Error value
Examples:
|BodyValue						|ResponseNumber	|
|InValidUserDesignID			|400			|
|InValidAppID					|400			|
 
@AddUserText @Designer
Scenario: To verify that if User have enteted already configure User Text
When User enter "AlreadyConfigure" using Add User Text JSON
Then User get valid response "400" in Response body of Add User Text API
And  Response body of Add User Text API should have "AlreadyConfigure" Error value