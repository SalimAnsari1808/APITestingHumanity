$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/api/functionalTest/Payment/CancelSubscription.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Cancel Subscription API",
  "description": "Description: The purpose of Feature file to verify Unit Test Cases for Cancel Subscription API",
  "id": "verify-cancel-subscription-api",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User create new valid account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter created AdminId and Password using Login JSON",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User get token value for authorization from Login API",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Create an App using App create JSON",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User create User Design using Add User Design JSON",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User create User Text of correct details using Add User Text JSON",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Open Web Application and Complete Payment and get transactionId of Payment done",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreateSteps.user_create_new_valid_account()"
});
formatter.result({
  "duration": 4911101200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_created_AdminId_and_Password_using_Login_JSON()"
});
formatter.result({
  "duration": 522636500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_get_token_value_for_authorization_from_Login_API()"
});
formatter.result({
  "duration": 5550000,
  "status": "passed"
});
formatter.match({
  "location": "AppCreateSteps.user_Create_an_App_using_App_create_JSON()"
});
formatter.result({
  "duration": 545557300,
  "error_message": "java.lang.NullPointerException\r\n\tat com.api.stepDefination.AppCreateSteps.user_Create_an_App_using_App_create_JSON(AppCreateSteps.java:274)\r\n\tat ✽.And User Create an App using App create JSON(com/api/functionalTest/Payment/CancelSubscription.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserDesignAddSteps.user_create_User_Design_using_Add_User_Design_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserTextAddSteps.user_create_User_Text_of_correct_details_using_Add_User_Text_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentRefundSteps.user_Open_Web_Application_and_Complete_Payment_and_get_transactionId_of_Payment_done()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "To verify that if user pass correct AppId",
  "description": "",
  "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-correct-appid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@CancelSubscription"
    },
    {
      "line": 13,
      "name": "@Payment"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User pass \"PreCreated\" AppId in Cancel Subscription API.",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User get valid response \"200\" from server for Cancel Subscription API",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Response body of Cancel Subscription API should have \"Valid\" value",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "PreCreated",
      "offset": 11
    }
  ],
  "location": "CancelSubscriptionSteps.user_pass_AppId_in_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 25
    }
  ],
  "location": "CancelSubscriptionSteps.user_get_valid_response_from_server_for_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Valid",
      "offset": 54
    }
  ],
  "location": "CancelSubscriptionSteps.response_body_of_Cancel_Subscription_API_should_have_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "To verify that if user pass \u003cRequestType\u003e",
  "description": "",
  "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@CancelSubscription"
    },
    {
      "line": 19,
      "name": "@Payment"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User pass \"\u003cRequestType\u003e\" AppId in Cancel Subscription API.",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User get valid response \"\u003cResponseCode\u003e\" from server for Cancel Subscription API",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Response body of Cancel Subscription API should have \"\u003cResponseType\u003e\" value",
  "keyword": "And "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;",
  "rows": [
    {
      "cells": [
        "RequestType",
        "ResponseCode",
        "ResponseType"
      ],
      "line": 25,
      "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;1"
    },
    {
      "cells": [
        "NoAppId",
        "400",
        "RequiredAppId"
      ],
      "line": 26,
      "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;2"
    },
    {
      "cells": [
        "NullAppId",
        "400",
        "StringAppId"
      ],
      "line": 27,
      "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;3"
    },
    {
      "cells": [
        "NumberAppId",
        "400",
        "StringAppId"
      ],
      "line": 28,
      "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;4"
    },
    {
      "cells": [
        "EmptyAppId",
        "400",
        "NotEmptyAppId"
      ],
      "line": 29,
      "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;5"
    },
    {
      "cells": [
        "InValidAppId",
        "400",
        "InValidAppId"
      ],
      "line": 30,
      "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User create new valid account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter created AdminId and Password using Login JSON",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User get token value for authorization from Login API",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Create an App using App create JSON",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User create User Design using Add User Design JSON",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User create User Text of correct details using Add User Text JSON",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Open Web Application and Complete Payment and get transactionId of Payment done",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreateSteps.user_create_new_valid_account()"
});
formatter.result({
  "duration": 2660078000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_created_AdminId_and_Password_using_Login_JSON()"
});
formatter.result({
  "duration": 462060800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_get_token_value_for_authorization_from_Login_API()"
});
formatter.result({
  "duration": 5183900,
  "status": "passed"
});
formatter.match({
  "location": "AppCreateSteps.user_Create_an_App_using_App_create_JSON()"
});
formatter.result({
  "duration": 503389500,
  "error_message": "java.lang.NullPointerException\r\n\tat com.api.stepDefination.AppCreateSteps.user_Create_an_App_using_App_create_JSON(AppCreateSteps.java:274)\r\n\tat ✽.And User Create an App using App create JSON(com/api/functionalTest/Payment/CancelSubscription.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserDesignAddSteps.user_create_User_Design_using_Add_User_Design_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserTextAddSteps.user_create_User_Text_of_correct_details_using_Add_User_Text_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentRefundSteps.user_Open_Web_Application_and_Complete_Payment_and_get_transactionId_of_Payment_done()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 26,
  "name": "To verify that if user pass NoAppId",
  "description": "",
  "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@CancelSubscription"
    },
    {
      "line": 19,
      "name": "@Payment"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User pass \"NoAppId\" AppId in Cancel Subscription API.",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User get valid response \"400\" from server for Cancel Subscription API",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Response body of Cancel Subscription API should have \"RequiredAppId\" value",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "NoAppId",
      "offset": 11
    }
  ],
  "location": "CancelSubscriptionSteps.user_pass_AppId_in_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 25
    }
  ],
  "location": "CancelSubscriptionSteps.user_get_valid_response_from_server_for_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "RequiredAppId",
      "offset": 54
    }
  ],
  "location": "CancelSubscriptionSteps.response_body_of_Cancel_Subscription_API_should_have_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User create new valid account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter created AdminId and Password using Login JSON",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User get token value for authorization from Login API",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Create an App using App create JSON",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User create User Design using Add User Design JSON",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User create User Text of correct details using Add User Text JSON",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Open Web Application and Complete Payment and get transactionId of Payment done",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreateSteps.user_create_new_valid_account()"
});
formatter.result({
  "duration": 2602135600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_created_AdminId_and_Password_using_Login_JSON()"
});
formatter.result({
  "duration": 494457400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_get_token_value_for_authorization_from_Login_API()"
});
formatter.result({
  "duration": 5634100,
  "status": "passed"
});
formatter.match({
  "location": "AppCreateSteps.user_Create_an_App_using_App_create_JSON()"
});
formatter.result({
  "duration": 498136100,
  "error_message": "java.lang.NullPointerException\r\n\tat com.api.stepDefination.AppCreateSteps.user_Create_an_App_using_App_create_JSON(AppCreateSteps.java:274)\r\n\tat ✽.And User Create an App using App create JSON(com/api/functionalTest/Payment/CancelSubscription.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserDesignAddSteps.user_create_User_Design_using_Add_User_Design_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserTextAddSteps.user_create_User_Text_of_correct_details_using_Add_User_Text_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentRefundSteps.user_Open_Web_Application_and_Complete_Payment_and_get_transactionId_of_Payment_done()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 27,
  "name": "To verify that if user pass NullAppId",
  "description": "",
  "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@CancelSubscription"
    },
    {
      "line": 19,
      "name": "@Payment"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User pass \"NullAppId\" AppId in Cancel Subscription API.",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User get valid response \"400\" from server for Cancel Subscription API",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Response body of Cancel Subscription API should have \"StringAppId\" value",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "NullAppId",
      "offset": 11
    }
  ],
  "location": "CancelSubscriptionSteps.user_pass_AppId_in_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 25
    }
  ],
  "location": "CancelSubscriptionSteps.user_get_valid_response_from_server_for_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "StringAppId",
      "offset": 54
    }
  ],
  "location": "CancelSubscriptionSteps.response_body_of_Cancel_Subscription_API_should_have_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User create new valid account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter created AdminId and Password using Login JSON",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User get token value for authorization from Login API",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Create an App using App create JSON",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User create User Design using Add User Design JSON",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User create User Text of correct details using Add User Text JSON",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Open Web Application and Complete Payment and get transactionId of Payment done",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreateSteps.user_create_new_valid_account()"
});
formatter.result({
  "duration": 2690965800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_created_AdminId_and_Password_using_Login_JSON()"
});
formatter.result({
  "duration": 479011200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_get_token_value_for_authorization_from_Login_API()"
});
formatter.result({
  "duration": 4061300,
  "status": "passed"
});
formatter.match({
  "location": "AppCreateSteps.user_Create_an_App_using_App_create_JSON()"
});
formatter.result({
  "duration": 492230500,
  "error_message": "java.lang.NullPointerException\r\n\tat com.api.stepDefination.AppCreateSteps.user_Create_an_App_using_App_create_JSON(AppCreateSteps.java:274)\r\n\tat ✽.And User Create an App using App create JSON(com/api/functionalTest/Payment/CancelSubscription.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserDesignAddSteps.user_create_User_Design_using_Add_User_Design_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserTextAddSteps.user_create_User_Text_of_correct_details_using_Add_User_Text_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentRefundSteps.user_Open_Web_Application_and_Complete_Payment_and_get_transactionId_of_Payment_done()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 28,
  "name": "To verify that if user pass NumberAppId",
  "description": "",
  "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@CancelSubscription"
    },
    {
      "line": 19,
      "name": "@Payment"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User pass \"NumberAppId\" AppId in Cancel Subscription API.",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User get valid response \"400\" from server for Cancel Subscription API",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Response body of Cancel Subscription API should have \"StringAppId\" value",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "NumberAppId",
      "offset": 11
    }
  ],
  "location": "CancelSubscriptionSteps.user_pass_AppId_in_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 25
    }
  ],
  "location": "CancelSubscriptionSteps.user_get_valid_response_from_server_for_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "StringAppId",
      "offset": 54
    }
  ],
  "location": "CancelSubscriptionSteps.response_body_of_Cancel_Subscription_API_should_have_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User create new valid account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter created AdminId and Password using Login JSON",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User get token value for authorization from Login API",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Create an App using App create JSON",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User create User Design using Add User Design JSON",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User create User Text of correct details using Add User Text JSON",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Open Web Application and Complete Payment and get transactionId of Payment done",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreateSteps.user_create_new_valid_account()"
});
formatter.result({
  "duration": 2620345700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_created_AdminId_and_Password_using_Login_JSON()"
});
formatter.result({
  "duration": 484561500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_get_token_value_for_authorization_from_Login_API()"
});
formatter.result({
  "duration": 5034400,
  "status": "passed"
});
formatter.match({
  "location": "AppCreateSteps.user_Create_an_App_using_App_create_JSON()"
});
formatter.result({
  "duration": 502347500,
  "error_message": "java.lang.NullPointerException\r\n\tat com.api.stepDefination.AppCreateSteps.user_Create_an_App_using_App_create_JSON(AppCreateSteps.java:274)\r\n\tat ✽.And User Create an App using App create JSON(com/api/functionalTest/Payment/CancelSubscription.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserDesignAddSteps.user_create_User_Design_using_Add_User_Design_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserTextAddSteps.user_create_User_Text_of_correct_details_using_Add_User_Text_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentRefundSteps.user_Open_Web_Application_and_Complete_Payment_and_get_transactionId_of_Payment_done()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 29,
  "name": "To verify that if user pass EmptyAppId",
  "description": "",
  "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@CancelSubscription"
    },
    {
      "line": 19,
      "name": "@Payment"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User pass \"EmptyAppId\" AppId in Cancel Subscription API.",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User get valid response \"400\" from server for Cancel Subscription API",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Response body of Cancel Subscription API should have \"NotEmptyAppId\" value",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "EmptyAppId",
      "offset": 11
    }
  ],
  "location": "CancelSubscriptionSteps.user_pass_AppId_in_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 25
    }
  ],
  "location": "CancelSubscriptionSteps.user_get_valid_response_from_server_for_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "NotEmptyAppId",
      "offset": 54
    }
  ],
  "location": "CancelSubscriptionSteps.response_body_of_Cancel_Subscription_API_should_have_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User create new valid account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter created AdminId and Password using Login JSON",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User get token value for authorization from Login API",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Create an App using App create JSON",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User create User Design using Add User Design JSON",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User create User Text of correct details using Add User Text JSON",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Open Web Application and Complete Payment and get transactionId of Payment done",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreateSteps.user_create_new_valid_account()"
});
formatter.result({
  "duration": 2661259800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_created_AdminId_and_Password_using_Login_JSON()"
});
formatter.result({
  "duration": 483638200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_get_token_value_for_authorization_from_Login_API()"
});
formatter.result({
  "duration": 3571800,
  "status": "passed"
});
formatter.match({
  "location": "AppCreateSteps.user_Create_an_App_using_App_create_JSON()"
});
formatter.result({
  "duration": 486537300,
  "error_message": "java.lang.NullPointerException\r\n\tat com.api.stepDefination.AppCreateSteps.user_Create_an_App_using_App_create_JSON(AppCreateSteps.java:274)\r\n\tat ✽.And User Create an App using App create JSON(com/api/functionalTest/Payment/CancelSubscription.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserDesignAddSteps.user_create_User_Design_using_Add_User_Design_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserTextAddSteps.user_create_User_Text_of_correct_details_using_Add_User_Text_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentRefundSteps.user_Open_Web_Application_and_Complete_Payment_and_get_transactionId_of_Payment_done()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 30,
  "name": "To verify that if user pass InValidAppId",
  "description": "",
  "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-\u003crequesttype\u003e;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@CancelSubscription"
    },
    {
      "line": 19,
      "name": "@Payment"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User pass \"InValidAppId\" AppId in Cancel Subscription API.",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User get valid response \"400\" from server for Cancel Subscription API",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Response body of Cancel Subscription API should have \"InValidAppId\" value",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "InValidAppId",
      "offset": 11
    }
  ],
  "location": "CancelSubscriptionSteps.user_pass_AppId_in_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 25
    }
  ],
  "location": "CancelSubscriptionSteps.user_get_valid_response_from_server_for_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "InValidAppId",
      "offset": 54
    }
  ],
  "location": "CancelSubscriptionSteps.response_body_of_Cancel_Subscription_API_should_have_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User create new valid account",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter created AdminId and Password using Login JSON",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User get token value for authorization from Login API",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Create an App using App create JSON",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User create User Design using Add User Design JSON",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User create User Text of correct details using Add User Text JSON",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Open Web Application and Complete Payment and get transactionId of Payment done",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreateSteps.user_create_new_valid_account()"
});
formatter.result({
  "duration": 2640758600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_created_AdminId_and_Password_using_Login_JSON()"
});
formatter.result({
  "duration": 475677500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_get_token_value_for_authorization_from_Login_API()"
});
formatter.result({
  "duration": 3398800,
  "status": "passed"
});
formatter.match({
  "location": "AppCreateSteps.user_Create_an_App_using_App_create_JSON()"
});
formatter.result({
  "duration": 516039000,
  "error_message": "java.lang.NullPointerException\r\n\tat com.api.stepDefination.AppCreateSteps.user_Create_an_App_using_App_create_JSON(AppCreateSteps.java:274)\r\n\tat ✽.And User Create an App using App create JSON(com/api/functionalTest/Payment/CancelSubscription.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserDesignAddSteps.user_create_User_Design_using_Add_User_Design_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserTextAddSteps.user_create_User_Text_of_correct_details_using_Add_User_Text_JSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentRefundSteps.user_Open_Web_Application_and_Complete_Payment_and_get_transactionId_of_Payment_done()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 33,
  "name": "To verify that if user pass allready canceled subscription AppId",
  "description": "",
  "id": "verify-cancel-subscription-api;to-verify-that-if-user-pass-allready-canceled-subscription-appid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@CancelSubscription"
    },
    {
      "line": 32,
      "name": "@Payment"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User pass \"PreCreated\" AppId in Cancel Subscription API.",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User pass \"PreCreated\" AppId in Cancel Subscription API.",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User get valid response \"200\" from server for Cancel Subscription API",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Response body of Cancel Subscription API should have \"AlreadyCanceled\" value",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "PreCreated",
      "offset": 11
    }
  ],
  "location": "CancelSubscriptionSteps.user_pass_AppId_in_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "PreCreated",
      "offset": 11
    }
  ],
  "location": "CancelSubscriptionSteps.user_pass_AppId_in_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 25
    }
  ],
  "location": "CancelSubscriptionSteps.user_get_valid_response_from_server_for_Cancel_Subscription_API(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "AlreadyCanceled",
      "offset": 54
    }
  ],
  "location": "CancelSubscriptionSteps.response_body_of_Cancel_Subscription_API_should_have_value(String)"
});
formatter.result({
  "status": "skipped"
});
});