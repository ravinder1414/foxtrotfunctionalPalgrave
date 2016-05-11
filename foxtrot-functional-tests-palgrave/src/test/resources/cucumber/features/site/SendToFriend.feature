@cleanbrowser @live
Feature: Email An Article Link to a Friend 

Scenario: As a guest user I should redirect to SEND TO A FRIEND form page
Given I am a guest user on an 'ABM' journal article
When I click on send to a friend link
And Enter the valid credentials on login page
Then I should see a SEND TO A FRIEND form page

Scenario: As a logged in user I should redirect to SEND TO A FRIEND form page
Given I am a logged in user on an 'ABM' journal article
When I click on send to a friend link
Then I should see a SEND TO A FRIEND form page

Scenario: I should see error message when submit the incomplete send email form
Given I am on SEND TO A FRIEND form page
When I submit the send email form without filling mandatory fields
Then I should see error messages on send email to friend form

Scenario: I should be able to email an article link to a friend
Given I am on SEND TO A FRIEND form page
When I fill up required information and submit the send email form
Then I should see email confirmation message