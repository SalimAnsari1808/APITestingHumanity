Feature: Verify User Design Update API
Description: The purpose of Feature file to verify Unit Test Cases for User Design Update API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON

@UserDesignUpdate @Designer
Scenario: To Verify user can update User Design
When User update User Design using Update User Design JSON
Then User get valid response "200" in Response body of Update User Design API
And  Response body of Update User Design API should have "UpdateDone" message value


@UserDesignUpdate @Designer
Scenario: To verify that if user not enter UserDesignID Key
When User pass "NoUserDesignIDKey" using Update User Design JSON
Then User get valid response "400" from server for Update User Design API
And  Response body of Update User Design API should have "NoUserDesignIDKey" error value


@UserDesignUpdate @Designer
Scenario: To verify that if user not enter UserDesignVersion Key
When User pass "NoUserDesignVersionKey" using Update User Design JSON
Then User get valid response "400" from server for Update User Design API
And  Response body of Update User Design API should have "NoUserDesignVersionKey" error value


@UserDesignUpdate @Designer
Scenario: To verify that if user enter null UserDesignID Value
When User pass "NullUserDesignIDValue" using Update User Design JSON
Then User get valid response "400" from server for Update User Design API
And  Response body of Update User Design API should have "NullUserDesignIDValue" error value


@UserDesignUpdate @Designer
Scenario: To verify that if user enter null UserDesignVersion Value
When User pass "NullUserDesignVersionValue" using Update User Design JSON
Then User get valid response "400" from server for Update User Design API
And  Response body of Update User Design API should have "NullUserDesignVersionValue" error value


@UserDesignUpdate @Designer @FailTest
Scenario: To verify that if user enter String UserDesignID Value
When User pass "StringUserDesignIDValue" using Update User Design JSON
Then User get valid response "400" from server for Update User Design API
And  Response body of Update User Design API should have "StringUserDesignIDValue" error value


@UserDesignUpdate @Designer @FailTest
Scenario: To verify that if user enter String UserDesignVersion Value
When User pass "StringUserDesignVersionValue" using Update User Design JSON
Then User get valid response "400" from server for Update User Design API
And  Response body of Update User Design API should have "StringUserDesignVersionValue" error value


@UserDesignUpdate @Designer
Scenario: To verify that if user enter invalid UserDesignID Value
When User pass "InvalidUserDesignIDValue" using Update User Design JSON
Then User get valid response "400" in Response body of Update User Design API
And  Response body of Update User Design API should have "InvalidUserDesignIDValue" message value

@UserDesignUpdate @Designer
Scenario: To verify that if user enter invalid UserDesignVersion Value
When User pass "InvalidUserDesignVersionValue" using Update User Design JSON
Then User get valid response "400" in Response body of Update User Design API
And  Response body of Update User Design API should have "InvalidUserDesignVersionValue" message value

@UserDesignUpdate @Designer
Scenario: To verify if user add extra key
When User pass "ExtraKey" using Update User Design JSON
Then User get valid response "400" from server for Update User Design API
And  Response body of Update User Design API should have "ExtraKey" error value
