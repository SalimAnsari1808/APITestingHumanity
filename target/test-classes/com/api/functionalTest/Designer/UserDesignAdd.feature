Feature: Verify User Design Add API
Description: The purpose of Feature file to verify Unit Test Cases for User Design Add API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON

@UserDesignAdd @Designer
Scenario: To Verify user can create valid User Design
When User create User Design using Add User Design JSON
Then User get valid response "200" in Response body of Add User Design API
And  Response body of Add User Design API should have Valid value


@UserDesignAdd @Designer
Scenario: To verify that if User not enter AppId
When User enter "NoAppIdkey" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NoAppIdkey" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User not enter UserDesignJSON key
When User enter "NoUserDesignJsonkey" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NoUserDesignJsonkey" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User not enter BannerConfigJSON key
When User enter "NoBannerConfigJsonkey" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NoBannerConfigJsonkey" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User not enter UserTextJSON key
When User enter "NoUserTextJsonkey" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NoUserTextJsonkey" Error value

@UserDesignAdd @Designer
Scenario: To verify that if User not enter DefaultLanguage key
When User enter "NoDefaultLanguagekey" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NoDefaultLanguagekey" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter null in AppId value
When User enter "NullAppIdValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NullAppIdValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter null in UserDesignJSON value
When User enter "NullUserDesignJsonValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NullUserDesignJsonValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter null in BannerConfigJSON value
When User enter "NullBannerConfigJsonValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NullBannerConfigJsonValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter null in UserTextJSON value
When User enter "NullUserTextJsonValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NullUserTextJsonValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter null in DefaultLanguage value
When User enter "NullDefaultLanguageValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NullDefaultLanguageValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter number in AppId value
When User enter "NumberAppIdValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NumberAppIdValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter number in UserDesignJSON value
When User enter "NumberUserDesignJsonValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NumberUserDesignJsonValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter number in BannerConfigJSON value
When User enter "NumberBannerConfigJsonValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NumberBannerConfigJsonValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter number in UserTextJSON value
When User enter "NumberUserTextJsonValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NumberUserTextJsonValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter number in DefaultLanguage value
When User enter "NumberDefaultLanguageValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "NumberDefaultLanguageValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter String in UserDesignJSON value
When User enter "StringUserDesignJsonValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "StringUserDesignJsonValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter String in BannerConfigJSON value
When User enter "StringBannerConfigJsonValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "StringBannerConfigJsonValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter String in UserTextJSON value
When User enter "StringUserTextJsonValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "StringUserTextJsonValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter String in UserTextJSON value
When User enter "StringUserTextJsonValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "StringUserTextJsonValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter empty object in UserDesignJSON value
When User enter "EmptyUserDesignJsonValue" using Add User Design JSON
Then User get valid response "200" in Response body of Add User Design API
And  Response body of Add User Design API should have "EmptyUserDesignJsonValue" value


@UserDesignAdd @Designer
Scenario: To verify that if User enter empty object in BannerConfigJSON value
When User enter "EmptyBannerConfigJsonValue" using Add User Design JSON
Then User get valid response "200" in Response body of Add User Design API
And  Response body of Add User Design API should have "EmptyBannerConfigJsonValue" value


@UserDesignAdd @Designer
Scenario: To verify that if User enter empty object in UserTextJSON value
When User enter "EmptyUserTextJsonValue" using Add User Design JSON
Then User get valid response "200" in Response body of Add User Design API
And  Response body of Add User Design API should have "EmptyUserTextJsonValue" value


@UserDesignAdd @Designer
Scenario: To verify that if User enter empty String in AppId value
When User enter "EmptyAppIdValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "EmptyAppIdValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if User enter empty String in DefaultLanguage value
When User enter "EmptyDefaultLanguageValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "EmptyDefaultLanguageValue" Error value


@UserDesignAdd @Designer
Scenario: To verify that if used add extra key
When User enter "AdditionalKey" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "AdditionalKey" Error value


@UserDesignAdd @Designer
Scenario: To verify if user enter invalid AppId
When User enter "InvalidAppIdValue" using Add User Design JSON
Then User get valid response "500" from server for Add User Design API
And  Response body of Add User Design API should have "InvalidAppIdValue" Error value


@UserDesignAdd @Designer @FailTest
Scenario: To verify that if user enter number in language value as string format
When User enter "StringNumberDefaultLanguageValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "StringNumberDefaultLanguageValue" Error value


@UserDesignAdd @Designer @FailTest
Scenario: To verify that if user enter specaial character in language value as string format
When User enter "SpecialCharacterDefaultLanguageValue" using Add User Design JSON
Then User get valid response "400" from server for Add User Design API
And  Response body of Add User Design API should have "SpecialCharacterDefaultLanguageValue" Error value
