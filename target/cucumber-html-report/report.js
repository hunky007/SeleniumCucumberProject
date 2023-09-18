$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginPage.feature");
formatter.feature({
  "line": 1,
  "name": "User login.",
  "description": "",
  "id": "user-login.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20369069300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "The user should be able to login successfully.",
  "description": "",
  "id": "user-login.;the-user-should-be-able-to-login-successfully.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user click on \"Sign In\" link",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter valid login and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 5346577200,
  "status": "passed"
});
formatter.before({
  "duration": 17931076200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "The user should not be able to login.",
  "description": "",
  "id": "user-login.;the-user-should-not-be-able-to-login.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User click on \"Sign In\" link",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enter invalid login and password",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user should get an error message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 4843645900,
  "status": "passed"
});
formatter.uri("signup.feature");
formatter.feature({
  "line": 1,
  "name": "Create Account",
  "description": "",
  "id": "create-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16995606200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BasePage.i_am_on_Home_page()"
});
formatter.result({
  "duration": 4755888300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#Write step in background when the step is common for all scenarios in a feature file."
    }
  ],
  "line": 7,
  "name": "Sign up successfully",
  "description": "",
  "id": "create-account;sign-up-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I have entered valid firstname lastname email password and confirmpassword",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on create account button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Account should get created",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationPage.i_have_entered_valid_firstname_lastname_email_password_and_confirmpassword()"
});
formatter.result({
  "duration": 248405100,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPage.i_click_on_create_account_button()"
});
formatter.result({
  "duration": 5029750000,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPage.account_should_get_created()"
});
formatter.result({
  "duration": 123752500,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[Thank you for registering with Main Website Store.]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinition.RegistrationPage.account_should_get_created(RegistrationPage.java:28)\r\n\tat ✽.Then Account should get created(signup.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 5244005300,
  "status": "passed"
});
});