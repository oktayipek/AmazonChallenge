$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/miroLogin.feature");
formatter.feature({
  "name": "Users should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@miroLogin"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Miro login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the Miro user enters \"\u003cwork_email\u003e\" and \"\u003cpassword\u003e\" information",
  "keyword": "When "
});
formatter.step({
  "name": "the user should be on \"\u003cpage_title\u003e\" page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "work_email",
        "password",
        "page_title"
      ]
    },
    {
      "cells": [
        "game_dante@hotmail.com",
        "eagle_4311",
        "Online Whiteboard for Visual Collaboration"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@miroLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Miro login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.amazon.step_definitions.miroLoginStepDef.the_user_is_on_the_Miro_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Miro user enters \"game_dante@hotmail.com\" and \"eagle_4311\" information",
  "keyword": "When "
});
formatter.match({
  "location": "com.amazon.step_definitions.miroLoginStepDef.the_Miro_user_enters_and_information(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on \"Online Whiteboard for Visual Collaboration\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.amazon.step_definitions.miroLoginStepDef.the_user_should_be_on_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});