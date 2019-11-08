$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber_plantilla/plantilla.feature");
formatter.feature({
  "name": "Cucumber Report",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login functionality exists",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have opened the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "TemplateSteps.iHaveOpenedTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.match({
  "location": "TemplateSteps.goToFacebook()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat cucumber_plantilla.TemplateSteps.goToFacebook(TemplateSteps.java:24)\r\n\tat ✽.I open Facebook website(cucumber_plantilla/plantilla.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Login button should exist",
  "keyword": "Then "
});
formatter.match({
  "location": "TemplateSteps.loginButtonShouldExist()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Forgot password exists",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "TemplateSteps.openBrowser()"
});
formatter.result({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Users\\FernandoPueb_5dvr3\\Downloads\\chromedriver_win32.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:518)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat cucumber_plantilla.TemplateSteps.openBrowser(TemplateSteps.java:19)\r\n\tat ✽.I have open the browser(cucumber_plantilla/plantilla.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.match({
  "location": "TemplateSteps.goToFacebook()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Forgot password link should exist",
  "keyword": "Then "
});
formatter.match({
  "location": "TemplateSteps.forgotPWD()"
});
formatter.result({
  "status": "skipped"
});
});