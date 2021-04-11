$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/search.feature");
formatter.feature({
  "name": "Users should be able to search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user should be able to enter \"\u003csearchText\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see \"\u003cexpectedResult\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "searchText",
        "expectedResult"
      ]
    },
    {
      "cells": [
        "java",
        "1-48 of over 4,000 results for"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.amazon.step_definitions.SearchStepDefinition.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to enter \"java\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.amazon.step_definitions.SearchStepDefinition.the_user_should_be_able_to_enter(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see \"1-48 of over 4,000 results for\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.amazon.step_definitions.SearchStepDefinition.the_user_should_see(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});