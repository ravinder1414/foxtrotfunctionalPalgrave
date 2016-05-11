@to_automate @cleanbrowser
Feature: Shibboleth Login Palgrave
Scenario:Login via Shibboleth Palgrave
Given I navigate to palgrave-journals login page
When I click on 'Login via institution' link
And I select 'United Kingdom' from the country's drop down and click on Go button
When I search for 'University of Portsmouth'in Institution search box and click on search button
And I click on 'University of Portsmouth'link
And I enter credentials on university login page
Then It redirects to the palgrave-journals homepage
		
Scenario: Get full text access of a paid article by Login via Shibboleth
Given I navigate to <palgrave journal> journal access page
When I click on article 'Login via institution' link
And I select 'United Kingdom' from the country's drop down and click on Go button
When I search for 'University of Portsmouth'in Institution search box and click on search button
And I click on 'University of Portsmouth'link
And I enter credentials on university login page
Then I should get full text access for <palgrave journal name> for valid site account