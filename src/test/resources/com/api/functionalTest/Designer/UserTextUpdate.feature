Feature: Verify User Text Update API
Description: The purpose of Feature file to verify Unit Test Cases for User Design Update API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON
And   User create User Text of correct details using Add User Text JSON 

@UserTextUpdate @Designer
Scenario: To Verify user can update User Text
When User update User Text using Update User Text JSON
Then User get valid response "200" in Response body of Update User Text API
And  Response body of Update User Text API should have Valid value


@UserTextUpdate @Designer
Scenario: To verify that if User not enter UserTextId Key
When User pass "NoUserTextIdKey" in Update User Text JSON
Then User get valid response "400" in Response body of Update User Text API
And  Response body of Update User Text API should have "NoUserTextIdKey" Message value


@UserTextUpdate @Designer
Scenario: To verify that if User not enter UserTextVersion Key
When User pass "NoUserTextVersionKey" in Update User Text JSON
Then User get valid response "400" from server for Update User Text API
And  Response body of Update User Text API should have "NoUserTextVersionKey" Error value


@UserTextUpdate @Designer
Scenario: To verify that if User enter null as UserTextId value
When User pass "NullUserTextIdValue" in Update User Text JSON
Then User get valid response "400" from server for Update User Text API
And  Response body of Update User Text API should have "NullUserTextIdValue" Error value


@UserTextUpdate @Designer
Scenario: To verify that if User enter null as UserTextVersion value
When User pass "NullUserTextVersionValue" in Update User Text JSON
Then User get valid response "400" from server for Update User Text API
And  Response body of Update User Text API should have "NullUserTextVersionValue" Error value


@UserTextUpdate @Designer
Scenario: To verify that if User enter empty string as UserTextId value
When User pass "StringUserTextIdValue" in Update User Text JSON
Then User get valid response "400" from server for Update User Text API
And  Response body of Update User Text API should have "StringUserTextIdValue" Error value


@UserTextUpdate @Designer
Scenario: To verify that if User enter empty String as UserTextVersion value
When User pass "StringUserTextVersionValue" in Update User Text JSON
Then User get valid response "400" from server for Update User Text API
And  Response body of Update User Text API should have "StringUserTextVersionValue" Error value


@UserTextUpdate @Designer
Scenario: To verify that id user enter invalid UserText Id
When User pass "InvalidUserTextIdValue" in Update User Text JSON
Then User get valid response "400" in Response body of Update User Text API
And  Response body of Update User Text API should have "InvalidUserTextIdValue" Message value


@UserTextUpdate @Designer
Scenario: To verify that id user enter invalid UserTextVersion
When User pass "InvalidUserTextVersionValue" in Update User Text JSON
Then User get valid response "400" in Response body of Update User Text API
And  Response body of Update User Text API should have "InvalidUserTextVersionValue" Message value


@UserTextUpdate @Designer
Scenario: To verify that if user enter extra key
When User pass "ExtraKey" in Update User Text JSON
Then User get valid response "400" from server for Update User Text API
And  Response body of Update User Text API should have "ExtraKey" Error value
