Feature: Verify Get Publish API
Description: The purpose of Feature file to verify Unit Test Cases for Get Publish API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON
And   User create User Text of correct details using Add User Text JSON
And   User publish new API using Publish API JSON

@GetPublishAPI @Designer
Scenario: To verify that if User get Publish Banner API details
When User get published API using Get Publish API JSON
Then User get valid response "200" in Response body of Get Publish API
And  Response body of Get Publish API should have Valid value


@GetPublishAPI @Designer
Scenario: To verify that if User not enter AppId key
When User enter "NoAppIDkey" using Get Publish API JSON
Then User get valid response "400" from server for Get Publish API
And  Response body of Get Publish API should have "NoAppIDkey" Error value


@GetPublishAPI @Designer @FailTest
Scenario: To verify that if User not enter Language key
When User enter "NoLanguagekey" using Get Publish API JSON
Then User get valid response "400" from server for Get Publish API
And  Response body of Get Publish API should have "NoLanguagekey" Error value


@GetPublishAPI @Designer
Scenario: To verify that if User enter empty as AppId Value
When User enter "EmptyAppIDValue" using Get Publish API JSON
Then User get valid response "400" from server for Get Publish API
And  Response body of Get Publish API should have "EmptyAppIDValue" Error value


@GetPublishAPI @Designer
Scenario: To verify that if User enter empty as Language Value
When User enter "EmptyLanguageValue" using Get Publish API JSON
Then User get valid response "400" from server for Get Publish API
And  Response body of Get Publish API should have "EmptyLanguageValue" Error value


@GetPublishAPI @Designer
Scenario: To verify that if User enter empty as AppId Value
When User enter "InvalidAppIDValue" using Get Publish API JSON
Then User get valid response "404" from server for Get Publish API
And  Response body of Get Publish API should have "InvalidAppIDValue" Error value


@GetPublishAPI @Designer @FailTest
Scenario: To verify that if User enter invalid Language in Parameter
When User enter "InvalidLanguageValue" using Get Publish API JSON
Then User get valid response "400" from server for Get Publish API
And  Response body of Get Publish API should have "InvalidLanguageValue" Error value

