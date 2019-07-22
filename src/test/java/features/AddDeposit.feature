Feature: As a user I want to Add Deposit.
Scenario: user would be able to do Deposit.
Given a user with valid credentials
When user navigate to Transaction -> New Deposit
Then New Deposit page should display
When user submit New Deposit form
Then success Msg should display