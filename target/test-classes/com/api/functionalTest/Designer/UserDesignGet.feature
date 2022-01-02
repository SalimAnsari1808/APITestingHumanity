Feature: Verify User Design Get API
Description: The purpose of Feature file to verify Unit Test Cases for User Design Get API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON

@UserDesignGet @Designer
Scenario: To verify that if User enter valid AppId as Parameter
When User get User Design using valid AppId using Get User Design JSON
Then User get valid response "200" in Response body of Get User Design API
And  Response body of Get User Design API using valid AppId value

@UserDesignGet @Designer
Scenario Outline: To verify that if User enter valid AppId and QueryConfigurationsData as <QueryConfigurationsData> in Parameter
When User get User Design using valid AppId and QueryConfigurationsData as "<QueryConfigurationsData>" using Get User Design JSON
Then User get valid response "200" in Response body of Get User Design API
And  Response body of Get User Design API using valid AppId and QueryConfigurationsData as "<QueryConfigurationsData>" value
Examples:
|QueryConfigurationsData|
|		true			|
|		false			|

@UserDesignGet @Designer
Scenario Outline: To verify that if User enter valid AppId and QueryBlockingData as <QueryBlockingData> in Parameter
When User get User Design using valid AppId and QueryBlockingData as "<QueryBlockingData>" using Get User Design JSON
Then User get valid response "200" in Response body of Get User Design API
And  Response body of Get User Design API using valid AppId and QueryBlockingData as "<QueryBlockingData>" value
Examples:
|QueryBlockingData	|
|		true		|
|		false		|

@UserDesignGet @Designer
Scenario Outline: To verify that if User enter valid AppId and QueryLanguagesData as <QueryLanguagesData> in Parameter
When User get User Design using valid AppId and QueryLanguagesData as "<QueryLanguagesData>" using Get User Design JSON
Then User get valid response "200" in Response body of Get User Design API
And  Response body of Get User Design API using valid AppId and QueryLanguagesData as "<QueryLanguagesData>" value
Examples:
|QueryLanguagesData	|
|		true		|
|		false		|

@UserDesignGet @Designer
Scenario Outline: To verify that if User enter valid AppId, QueryConfigurationsData as <QueryConfigurationsData>, QueryBlockingData as <QueryBlockingData> and QueryLanguagesData as <QueryLanguagesData> in Parameters
When User get User Design using valid AppId, QueryConfigurationsData as "<QueryConfigurationsData>" QueryBlockingData as "<QueryBlockingData>" and QueryLanguagesData as "<QueryLanguagesData>" using Get User Design JSON
Then User get valid response "200" in Response body of Get User Design API
And  Response body of Get User Design API using valid AppId, QueryConfigurationsData as "<QueryConfigurationsData>", QueryBlockingData as "<QueryBlockingData>" and QueryLanguagesData as "<QueryLanguagesData>" value
Examples:
|QueryConfigurationsData 	|QueryBlockingData	|QueryLanguagesData	|
|		true				|		true		|		true		|
|		true				|		true		|		false		|
|		true				|		false		|		true		|
|		true				|		false		|		false		|
|		false				|		true		|		true		|
|		false				|		true		|		false		|
|		false				|		false		|		true		|
|		false				|		false		|		false		|

@UserDesignGet @Designer
Scenario: To verify that if User enter invalid AppId in Parameter
When User get User Design using "Invalid" AppId using Get User Design JSON
Then User get valid response "200" in Response body of Get User Design API
And  Response body of Get User Design API using "Invalid" AppId value

@UserDesignGet @Designer
Scenario: To verify that if User enter invalid AppId in Parameter
When User get User Design using "Empty" AppId using Get User Design JSON
Then User get valid response "400" from server for Get User Design API
And  Response body of Get User Design API using "Empty" AppId value

@UserDesignGet @Designer
Scenario: To verify that if User not enter AppId value in Parameter
When User get User Design using not enter AppId using Get User Design JSON
Then User get valid response "400" from server for Get User Design API
And  Response body of Get User Design API using "NoAppIdKey" AppId value
