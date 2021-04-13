$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/search.feature");
formatter.feature({
  "name": "Users should be able to search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search with price",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user should be able to enter \"\u003csearchText\u003e\" and search",
  "keyword": "When "
});
formatter.step({
  "name": "the user should be able to choose \"\u003cmin\u003e\" and \"\u003cmax\u003e\" price",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see \u003cmin\u003e price and \u003cmax\u003e price",
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
        "min",
        "max"
      ]
    },
    {
      "cells": [
        "macbook pro laptop",
        "500",
        "600"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search with price",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
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
  "name": "the user should be able to enter \"macbook pro laptop\" and search",
  "keyword": "When "
});
formatter.match({
  "location": "com.amazon.step_definitions.SearchStepDefinitionWithPrice.the_user_should_be_able_to_enter_and_search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to choose \"500\" and \"600\" price",
  "keyword": "And "
});
formatter.match({
  "location": "com.amazon.step_definitions.SearchStepDefinitionWithPrice.the_user_should_be_able_to_choose_and_price(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see 500 price and 600 price",
  "keyword": "Then "
});
formatter.match({
  "location": "com.amazon.step_definitions.SearchStepDefinitionWithPrice.the_user_should_see_price_and_price(java.lang.Integer,java.lang.Integer)"
});
