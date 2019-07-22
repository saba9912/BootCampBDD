$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/AddDeposit.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want to Add Deposit.",
  "description": "",
  "id": "as-a-user-i-want-to-add-deposit.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11392705700,
  "status": "passed"
});
formatter.before({
  "duration": 7479996899,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "user would be able to do Deposit.",
  "description": "",
  "id": "as-a-user-i-want-to-add-deposit.;user-would-be-able-to-do-deposit.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "a user with valid credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user navigate to Transaction -\u003e New Deposit",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "New Deposit page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user submit New Deposit form",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "success Msg should display",
  "keyword": "Then "
});
formatter.match({
  "location": "AddDepositSteps.a_user_with_valid_credentials()"
});
formatter.result({
  "duration": 8126030500,
  "status": "passed"
});
formatter.match({
  "location": "AddDepositSteps.user_navigate_to_Transaction_New_Deposit()"
});
formatter.result({
  "duration": 1791919000,
  "status": "passed"
});
formatter.match({
  "location": "AddDepositSteps.new_Deposit_page_should_display()"
});
formatter.result({
  "duration": 85666100,
  "status": "passed"
});
formatter.match({
  "location": "AddDepositSteps.user_submit_New_Deposit_form()"
});
formatter.result({
  "duration": 3107705600,
  "status": "passed"
});
formatter.match({
  "location": "AddDepositSteps.success_Msg_should_display()"
});
formatter.result({
  "duration": 3403364701,
  "status": "passed"
});
});