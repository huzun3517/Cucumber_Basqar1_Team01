$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4282284647,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with username and password",
  "description": "",
  "id": "login-functionality;login-with-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Navigate to basqar",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter username and password and  click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.navigateToBasqar()"
});
formatter.result({
  "duration": 12685838243,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enterUsernameAndPasswordAndClickLoginButton()"
});
formatter.result({
  "duration": 20458166675,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.userShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 220090,
  "status": "passed"
});
formatter.after({
  "duration": 5766944212,
  "status": "passed"
});
});