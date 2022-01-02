Feature: Verify Get Category API
Description: The purpose of Feature file to verify Unit Test Cases for Get Category API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON
And   User create User Text of correct details using Add User Text JSON
And   User publish new API using Publish API JSON

@Designer @GetCategory
Scenario: To verify that if User get Publish Banner API details
When User get published API category using Get Category API JSON
Then User get valid response "200" in Response body of Get Category API
And  Response body of Get Category API should have Valid value