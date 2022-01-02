Feature: Verify Company Get API
Description: The purpose of Feature file to verify Unit Test Cases for Company Get API


Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User enter Company details using Edit Company JSON


@GetCompany @Account 
Scenario: To verify that if user enter correct company details
When  User get Company details using Get Company JSON
Then  User get valid response "200" in Response body of Get Company API
And   Response body of Get Company API should have Valid value