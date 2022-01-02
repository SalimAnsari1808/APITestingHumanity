Feature: Verify Refund Payment API
Description: The purpose of Feature file to verify Unit Test Cases for Refund Payment API

Background:
Given User create new valid account
And   User enter created AdminId and Password using Login JSON
And   User get token value for authorization from Login API
And   User Create an App using App create JSON
And   User create User Design using Add User Design JSON
And   User create User Text of correct details using Add User Text JSON
And   User Open Web Application and Complete Payment and get transactionId of Payment done


@PaymentRefund @Payment
Scenario: To verify that if user enter correct transactionId and appID details
When User refund payment using Refund Payment API JSON
Then User get valid response "200" in Response body of Refund Payment API
And  Response body of Refund Payment API should have Valid value


@PaymentRefund @Payment
Scenario: To verify that if user has not enter TransactionId key
When User enter "NoTransactionIDKey" using Refund Payment API JSON
Then User get valid response "400" from server for Refund Payment API
And  Response body of Refund Payment API should have "NoTransactionIDKey" Error value


@PaymentRefund @Payment
Scenario: To verify that if user has not enter appID key
When User enter "NoAppIDKey" using Refund Payment API JSON
Then User get valid response "400" from server for Refund Payment API
And  Response body of Refund Payment API should have "NoAppIDKey" Error value


@PaymentRefund @Payment
Scenario: To verify that if user has enter number in transactionId value
When User enter "NumberTransactionIDValue" using Refund Payment API JSON
Then User get valid response "400" from server for Refund Payment API
And  Response body of Refund Payment API should have "NumberTransactionIDValue" Error value


@PaymentRefund @Payment
Scenario: To verify that if user has enter number appID value
When User enter "NumberAppIDValue" using Refund Payment API JSON
Then User get valid response "400" from server for Refund Payment API
And  Response body of Refund Payment API should have "NumberAppIDValue" Error value


@PaymentRefund @Payment
Scenario: To verify that if user has enter null in transactionId value
When User enter "NullTransactionIDValue" using Refund Payment API JSON
Then User get valid response "400" from server for Refund Payment API
And  Response body of Refund Payment API should have "NullTransactionIDValue" Error value


@PaymentRefund @Payment
Scenario: To verify that if user has enter null appID value
When User enter "NullAppIDValue" using Refund Payment API JSON
Then User get valid response "400" from server for Refund Payment API
And  Response body of Refund Payment API should have "NullAppIDValue" Error value


@PaymentRefund @Payment
Scenario: To verify that if user has enter empty string in transactionId value
When User enter "EmptyTransactionIDValue" using Refund Payment API JSON
Then User get valid response "400" from server for Refund Payment API
And  Response body of Refund Payment API should have "EmptyTransactionIDValue" Error value


@PaymentRefund @Payment
Scenario: To verify that if user has enter empty string appID value
When User enter "EmptyAppIDValue" using Refund Payment API JSON
Then User get valid response "400" from server for Refund Payment API
And  Response body of Refund Payment API should have "EmptyAppIDValue" Error value


@PaymentRefund @Payment
Scenario: To verify that if user has enter invalid transactionId value
When User enter "InvalidTransactionIDValue" using Refund Payment API JSON
Then User get valid response "400" in Response body of Refund Payment API
And  Response body of Refund Payment API should have "InvalidTransactionIDValue" Message value


@PaymentRefund @Payment
Scenario: To verify that if user has enter invalid appId value
When User enter "InvalidAppIDValue" using Refund Payment API JSON
Then User get valid response "400" in Response body of Refund Payment API
And  Response body of Refund Payment API should have "InvalidAppIDValue" Message value


@PaymentRefund @Payment
Scenario: To verify that if user enter unmatch transactionId or appID
When User enter "MismacthTransactionIDAppIDValue" using Refund Payment API JSON
Then User get valid response "400" in Response body of Refund Payment API
And  Response body of Refund Payment API should have "MismacthTransactionIDAppIDValue" Message value

