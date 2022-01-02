Feature: Verify App Delete API
Description: The purpose of Feature file to verify Unit Test Cases for App Delete API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User get App List using App List JSON
And   User get valid response code "200" in Response body of List App API
And   Response body of List App API should have "ValidValue" value

@AppDelete @Account
Scenario: To verify that if user enter correct AppId
When  User delete App using Delete App JSON
Then  User get valid response code "200" in Response body of App Delete API
And   Response body of App Delete API should have "AppDeleted" value
And   User get App List using App List JSON
And   User get valid response code "400" in Response body of List App API
And   Response body of List App API should have "AppDeleted" Message value

@AppDelete @Account
Scenario: To verify that if user has not enter AppId
When  User delete App without AppID using Delete App JSON
Then  User get valid response code "400" from server of Delete App
And   Response body of App Delete API should have "AppIDKey" Error value

@AppDelete @Account
Scenario: To verify that if user has not enter AppId value
When  User send AppId "" using Delete App JSON
Then  User get valid response code "400" from server of Delete App
And   Response body of App Delete API should have "EmptyAppID" Error value

@AppDelete @Account
Scenario: To verify that if user has enter null AppId value
When  User send AppId "NullValue" using Delete App JSON
Then  User get valid response code "400" from server of Delete App
And   Response body of App Delete API should have "NullAppID" Error value

@AppDelete @Account
Scenario: To verify that if user has enter numeric AppId value
When  User send AppId "NumberValue" using Delete App JSON
Then  User get valid response code "400" from server of Delete App
And   Response body of App Delete API should have "NumberAppID" Error value

@AppDelete @Account
Scenario: To verify that if user has enter special character AppId value
When  User send AppId "!@#$%^&&*()" using Delete App JSON
Then  User get valid response code "400" in Response body of App Delete API
And   Response body of App Delete API should have "SpecialCharacterAppID" Message value

@AppDelete @Account
Scenario: To verify that if user has incorrect AppId value
When  User send AppId "IncorrectAppId" using Delete App JSON 
#When  User delete App using Delete App JSON
#When  User get App List using App List JSON
#Then  User get valid response code "400" in Response body of List App API
#And   Response body of List App API should have "NoAppCreated" Message value
#And   User delete App using Delete App JSON
Then  User get valid response code "400" in Response body of App Delete API
And   Response body of App Delete API should have "IncorrectAppId" Message value

@AppDelete @Account @FailTest 
Scenario: To verify that if user deleted already deleted app
When  User send AppId "IncorrectAppId" using Delete App JSON 
#When  User delete App using Delete App JSON
#When  User get App List using App List JSON
#Then  User get valid response code "400" in Response body of List App API
#And   Response body of List App API should have "NoAppCreated" Message value
#And   User delete App using Delete App JSON
Then  User get valid response code "400" in Response body of App Delete API
And   Response body of App Delete API should have "IncorrectAppId" Message value