$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/AddContact.feature");
formatter.feature({
  "line": 1,
  "name": "TechFios\u0027s users are able to fillout the Addcontact form.",
  "description": "",
  "id": "techfios\u0027s-users-are-able-to-fillout-the-addcontact-form.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11230484500,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Users can fill out the Addcontact form",
  "description": "",
  "id": "techfios\u0027s-users-are-able-to-fillout-the-addcontact-form.;users-can-fill-out-the-addcontact-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "a internal user",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user navigate to CRM -\u003e AddContact page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "AddContact page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user fill the form",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "success message should display",
  "keyword": "Then "
});
formatter.match({
  "location": "AddContactSteps.user_already_on_login_page()"
});
formatter.result({
  "duration": 3478201200,
  "status": "passed"
});
formatter.match({
  "location": "AddContactSteps.user_navigate_to_CRM_AddContact_page()"
});
formatter.result({
  "duration": 1086048000,
  "status": "passed"
});
formatter.match({
  "location": "AddContactSteps.addcontact_page_should_display()"
});
formatter.result({
  "duration": 80302300,
  "status": "passed"
});
formatter.match({
  "location": "AddContactSteps.user_fill_the_form()"
});
formatter.result({
  "duration": 1719659100,
  "status": "passed"
});
formatter.match({
  "location": "AddContactSteps.success_message_should_display()"
});
formatter.result({
  "duration": 6376880600,
  "error_message": "java.lang.NullPointerException\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:560)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.isDisplayed(Unknown Source)\r\n\tat page.AddContactPage.isSuccessMsgDisplay(AddContactPage.java:104)\r\n\tat steps.AddContactSteps.success_message_should_display(AddContactSteps.java:70)\r\n\tat ✽.Then success message should display(src/test/java/features/AddContact.feature:7)\r\n",
  "status": "failed"
});
});