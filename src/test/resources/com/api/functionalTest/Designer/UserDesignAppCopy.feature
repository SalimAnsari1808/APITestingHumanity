Feature: Verify User Design App Copy API
Description: The purpose of Feature file to verify Unit Test Cases for User Design App Copy API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an new From App using App create JSON
And   User Create an new To App using App create JSON
And   User create User Design in From App using Add User Design JSON
And   User get User Design using "FromAPP" AppId using Get User Design JSON
And   User get User Design using "ToApp" AppId using Get User Design JSON


@UserDesignAppCopy @Designer
Scenario: To verify that if User can copy User Design to another APP
When User copy User Design FromApp to ToApp using User Design App Copy JSON
Then User get valid response "200" in Response body of User Design App Copy API
And  Response body of User Design App Copy API using valid AppId's' values


@UserDesignAppCopy @Designer
Scenario: To verify that if user not enter FromAppID Key
When User pass "NoFromAppIDKey" using User Design Copy App JSON
Then User get valid response "400" from server for User Design Copy App API
And  Response body of User Design Copy App API should have "NoFromAppIDKey" error value


@UserDesignAppCopy @Designer
Scenario: To verify that if user not enter ToAppID Key
When User pass "NoToAppIDKey" using User Design Copy App JSON
Then User get valid response "400" from server for User Design Copy App API
And  Response body of User Design Copy App API should have "NoToAppIDKey" error value


@UserDesignAppCopy @Designer
Scenario: To verify that if user enter number as FromAppID value
When User pass "NumberFromAppIDValue" using User Design Copy App JSON
Then User get valid response "400" from server for User Design Copy App API
And  Response body of User Design Copy App API should have "NumberFromAppIDValue" error value


@UserDesignAppCopy @Designer
Scenario: To verify that if user enter number as ToAppID value
When User pass "NumberToAppIDValue" using User Design Copy App JSON
Then User get valid response "400" from server for User Design Copy App API
And  Response body of User Design Copy App API should have "NumberToAppIDValue" error value


@UserDesignAppCopy @Designer
Scenario: To verify that if user enter null as FromAppID value
When User pass "NullFromAppIDValue" using User Design Copy App JSON
Then User get valid response "400" from server for User Design Copy App API
And  Response body of User Design Copy App API should have "NullFromAppIDValue" error value


@UserDesignAppCopy @Designer
Scenario: To verify that if user enter null as ToAppID value
When User pass "NullToAppIDValue" using User Design Copy App JSON
Then User get valid response "400" from server for User Design Copy App API
And  Response body of User Design Copy App API should have "NullToAppIDValue" error value


@UserDesignAppCopy @Designer
Scenario: To verify that if user enter empty String FromAppID value
When User pass "EmptyFromAppIDValue" using User Design Copy App JSON
Then User get valid response "400" from server for User Design Copy App API
And  Response body of User Design Copy App API should have "EmptyFromAppIDValue" error value


@UserDesignAppCopy @Designer
Scenario: To verify that if user enter empty String ToAppID value
When User pass "EmptyToAppIDValue" using User Design Copy App JSON
Then User get valid response "400" from server for User Design Copy App API
And  Response body of User Design Copy App API should have "EmptyToAppIDValue" error value


@UserDesignAppCopy @Designer
Scenario: To verify that if user enter incorrect FromAppId value
When User pass "InvalidFromAppIDValue" using User Design Copy App JSON
Then User get valid response "500" from server for User Design Copy App API
And  Response body of User Design Copy App API should have "InvalidFromAppIDValue" error value


@UserDesignAppCopy @Designer
Scenario: To verify that if user enter incorrect ToAppId value
When User pass "InvalidToAppIDValue" using User Design Copy App JSON
Then User get valid response "400" in Response body of User Design App Copy API
And  Response body of User Design Copy App API should have "InvalidToAppIDValue" message value


@UserDesignAppCopy @Designer
Scenario: To verify that if user enter extra key
When User pass "ExtraKey" using User Design Copy App JSON
Then User get valid response "400" from server for User Design Copy App API
And  Response body of User Design Copy App API should have "ExtraKey" error value