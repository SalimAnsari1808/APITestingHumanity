Feature: Verify Publish API
Description: The purpose of Feature file to verify Unit Test Cases for Publish API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON
And   User create User Text of correct details using Add User Text JSON 

@PublishAPI @Designer
Scenario: To verify that if User Publish API by enter correct AppId
When User publish new API using Publish API JSON
Then User get valid response "200" in Response body of Publish API
And  Response body of Publish API should have Valid value

@PublishAPI @Designer
Scenario: To verify that if User not enter AppId Key
When User enter "NoAppIDkey" using Publish API JSON
Then User get valid response "400" from server for Publish API
And  Response body of Publish API should have "NoAppIDkey" Error value

@PublishAPI @Designer
Scenario: To verify that if User enter null as AppId Value
When User enter "NullAppIDValue" using Publish API JSON
Then User get valid response "400" from server for Publish API
And  Response body of Publish API should have "NullAppIDValue" Error value

@PublishAPI @Designer
Scenario: To verify that if User enter number as AppId Value
When User enter "NumberAppIDValue" using Publish API JSON
Then User get valid response "400" from server for Publish API
And  Response body of Publish API should have "NumberAppIDValue" Error value

@PublishAPI @Designer
Scenario: To verify that if User enter empty String as AppId Value
When User enter "EmptyAppIDValue" using Publish API JSON
Then User get valid response "400" from server for Publish API
And  Response body of Publish API should have "EmptyAppIDValue" Error value

@PublishAPI @Designer
Scenario: To verify that if User enter invalid as AppId Value
When User enter "InvalidAppIDValue" using Publish API JSON
Then User get valid response "500" from server for Publish API
And  Response body of Publish API should have "InvalidAppIDValue" Error value

@PublishAPI @Designer
Scenario: To verify that if user enter extra key
When User enter "Extrakey" using Publish API JSON
Then User get valid response "400" from server for Publish API
And  Response body of Publish API should have "Extrakey" Error value
