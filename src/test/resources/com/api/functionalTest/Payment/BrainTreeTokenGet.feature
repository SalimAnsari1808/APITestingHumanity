Feature: Verify Get Braintree Token API
Description: The purpose of Feature file to verify Unit Test Cases for Get Braintree Token API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API

@BrainTreeGet @Payment
Scenario: To verify that if user hit get braintree token URL
When  User get token using Get Braintree Token JSON
Then  User get valid response "200" from server for Get Braintree Token API
And   Response body of Get Braintree Token API should have Valid value