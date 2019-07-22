Feature: TechFios's users are able to fillout the Addcontact form.
Scenario: Users can fill out the Addcontact form
Given a internal user
When user navigate to CRM -> AddContact page
Then AddContact page should display
When user fill the form
Then success message should display
