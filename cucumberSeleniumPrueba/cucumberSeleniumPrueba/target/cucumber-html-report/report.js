$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Login to the page",
  "description": "",
  "id": "login;successful-login-to-the-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@single"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open firefox browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to login.html page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I provide username as hi and password as hi",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "hi should be name",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iOpenFirefoxBrowser()"
});
formatter.result({
  "duration": 9572301200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iNavigateToLoginHtmlPage()"
});
formatter.result({
  "duration": 1303451200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iProvideUsernameAsHiAndPasswordAsHi()"
});
formatter.result({
  "duration": 6203186200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 857276600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.hiShouldBeName()"
});
formatter.result({
  "duration": 2191500100,
  "status": "passed"
});
});