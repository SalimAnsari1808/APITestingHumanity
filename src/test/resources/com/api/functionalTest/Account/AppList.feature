Feature: Verify App List API
Description: The purpose of Feature file to verify Unit Test Cases for App List API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API

@AppList @Account 
Scenario: To verify that if user list App after create App
When  User Create an App using App create JSON
And   User get App List using App List JSON
Then  User get valid response code "200" in Response body of List App API
And   Response body of List App API should have "ValidValue" value

@AppList @Account
Scenario: To verify that if user list App from newly created account
When  User get App List using App List JSON
Then  User get valid response code "400" in Response body of List App API
And   Response body of List App API should have "NoAppCreated" Message value
