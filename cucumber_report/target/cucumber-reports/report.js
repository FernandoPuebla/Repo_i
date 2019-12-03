$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber_plantilla/plantilla.feature");
formatter.feature({
  "name": "Find food",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Finding some cheese",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the Google search page",
  "keyword": "Given "
});
formatter.match({
  "location": "TemplateSteps.iAmOnTheGoogleSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"Cheese!\"",
  "keyword": "When "
});
formatter.match({
  "location": "TemplateSteps.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should start with \"cheese\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TemplateSteps.thePageTitleShouldStartWith(String)"
});
formatter.result({
  "status": "passed"
});
});