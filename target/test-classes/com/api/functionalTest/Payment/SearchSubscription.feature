Feature: Verify Search Subscription API
Description: The purpose of Feature file to verify Unit Test Cases for Search Subscription API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON
And   User create User Text of correct details using Add User Text JSON
And   User Open Web Application and Complete Payment and get transactionId of Payment done

@SearchSubscription @Payment
Scenario: To verify that if user pass correct subscriptionId
When  User pass "Correct" transactionId in Search Subscription API.  
Then  User get valid response "200" from server for Search Subscription API
And   Response body of Search Subscription API should have "Valid" value 

@SearchSubscription @Payment
Scenario: To verify that if user pass Incorrect subscriptionId
When  User pass "InCorrect" transactionId in Search Subscription API. 
Then  User get valid response "200" from server for Search Subscription API
And   Response body of Search Subscription API should have "InValid" value 