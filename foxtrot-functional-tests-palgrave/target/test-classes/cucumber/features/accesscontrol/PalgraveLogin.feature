@cleanbrowser @test @staging @live
Feature: Login functionality

Scenario: As a alhambra linked User I should be able to login in palgrave
Given I have a nature.com account linked to Alhambra
When I enter my correct alhambra credentials at palgrave login
Then I should be logged in
 
