$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/web/SearchPokemon.feature");
formatter.feature({
  "name": "Get Pokemon By ID",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Web"
    }
  ]
});
formatter.scenario({
  "name": "User search pokemon Pikachu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Web"
    },
    {
      "name": "@Mewtwo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open google page",
  "keyword": "Given "
});
formatter.match({
  "location": "demo.steps.web.WebStepDefinition.userOpenGooglePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input keyword \"Mewtwo Wikipedia Indonesia\" on the search field",
  "keyword": "When "
});
formatter.match({
  "location": "demo.steps.web.WebStepDefinition.userInputKeywordOnTheSearchField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click search button",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.web.WebStepDefinition.userClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the first search",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.web.WebStepDefinition.userClickTheFirstSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see \"mewtwo\" as the title on wikipedia article page",
  "keyword": "Then "
});
formatter.match({
  "location": "demo.steps.web.WebStepDefinition.userSeeAsTheTitleOnWikipediaArticlePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see 150 as pokemon number on wikipedia article page",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.web.WebStepDefinition.userSeeOnWikipediaArticlePage(int)"
});
