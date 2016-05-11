@broken @cleanbrowser
Feature:Palgrave Athens Login 

Scenario: Get full text access of a paid article by Athens
Given I navigate to an access page of an article of 'BP' journal
When I click on 'Login via Athens' link
And I enter valid Athens credentials and click on login button
Then I should get full access for BP journal