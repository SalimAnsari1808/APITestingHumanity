Feature: Verify Company Edit API
Description: The purpose of Feature file to verify Unit Test Cases for Company Edit API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User connect to Edit Company API URL

@EditCompany @Account
Scenario: To verify that if user enter correct company details
When  User enter Company details using Edit Company JSON
Then  User get valid response "200" in Response body of Edit Company API
And   Response body of Edit Company API should have Valid value

@EditCompany @Account
Scenario Outline:To verify if user <Description>
When  User pass "<InputField>" Edit Company JSON
Then  User get valid response "<ResponseCode>" from server for Edit Company API
And   Response body of Edit Company API should have "<InputField>" Error value
Examples:
|InputField				|ResponseCode	|Description					|
|NoCompanyIdKey			| 400 			|not enter Company Id Key		|
|NullCompanyIdValue		| 400 			|enter null Company Id Value	|

@EditCompany @Account @FailTest
Scenario Outline:To verify if user <Description>
When  User pass "<InputField>" Edit Company JSON
Then  User get valid response "<ResponseCode>" from server for Edit Company API
And   Response body of Edit Company API should have "<InputField>" Error value
Examples:
|InputField				|ResponseCode	|Description					|
|StringCompanyIdValue	| 400 			|enter string Company Id Value	|

@EditCompany @Account
Scenario: To verify if user enter invalid company Id Value
When  User pass "InvalidCompanyIdValue" Edit Company JSON
Then  User get valid response "200" from server for Edit Company API 
And   Response body of Edit Company API should have data null.

@EditCompany @Account
Scenario Outline:To verify if user <Description>
When  User pass "<InputField>" Edit Company JSON
Then  User get valid response "<ResponseCode>" from server for Edit Company API
And   Response body of Edit Company API should have "<InputField>" Error value
Examples:
|InputField			|ResponseCode	|Description				|
|NoNameKey			| 400 			|not enter Name Key			|
|NullNameValue		| 400 			|enter null Name Value		|
|NumberNameValue	| 400 			|enter number Name Value	|
|EmptyNameValue		| 400 			|enter empty Name Value		|


@EditCompany @Account 
Scenario Outline:To verify if user <Description>
When  User pass "<InputField>" Edit Company JSON
Then  User get valid response "<ResponseCode>" from server for Edit Company API
And   Response body of Edit Company API should have "<InputField>" Error value
Examples:
|InputField			|ResponseCode	|Description				|
|NoEmailKey			| 400 			|not enter Email Key		|
|NullEmailValue		| 400 			|enter null Email Value		|
|NumberEmailValue	| 400 			|enter number Email Value	|
|EmptyEmailValue	| 400 			|enter empty Email Value	|


@EditCompany @Account @FailTest
Scenario Outline:To verify that user enter value <Description> in Email
When  User pass Email "<InputField>" in Edit Company JSON
Then  User get valid response "<ResponseCode>" from server for Edit Company API
And   Response body of Edit Company API should have "<InputField>" Error value
Examples:
|EmailField								|ResponseCode	|Description					|ErrorType			|
|abhisheksharma							| 400 			|only letter 					|InvalidEmailValue	|
|abhishek#$sharma@shreepartners.com		| 400 			|special Character				|InvalidEmailValue	|
|abhishek.sharma@shreepartners.			| 400 			|having format (xxx@xxxx.)		|InvalidEmailValue	|
|abhishek@sharma@shreepartners.			| 400 			|having format (xxx@xx@xxx.xxx)	|InvalidEmailValue	|
|abhishek@sharma@shreepartners.comin	| 400 			|having format (xxx@xxx.xxxxx)	|InvalidEmailValue	|






