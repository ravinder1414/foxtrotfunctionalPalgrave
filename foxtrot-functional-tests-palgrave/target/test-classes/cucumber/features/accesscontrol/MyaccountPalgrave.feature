@cleanbrowser
Feature: Palgrave Myaccount

Scenario: User Myaccount valid login flow access
Given user navigate to myaccount page
When user enter valid user credentials and click on Login button
Then user should be able to see the personal profile page

Scenario: User modify the password
Given user navigate to myaccount page
When user click on modify password button on personal profile tab
And user modify their password details
And user click on password change confirm button and also on Return to Homepage button
And user click on logout button
Then user should be able to see the login page

Scenario: User myaccount login flow after modify the password    
Given user navigate to myaccount page
And user enter newly valid credentails after changing password and click on login button
Then user should be able to see the personal profile page

Scenario: User modify the password again to reset the previous value
Given user navigate to myaccount page
When user click on modify password button on personal profile tab
And user modify their password details again
And user click on password change confirm button and also on Return to Homepage button
And user click on logout button
Then user should be able to see the login page

Scenario: User myaccount login flow after again modified the password    
Given user navigate to myaccount page
When user enter again newly valid credentails after changing password and click on login button
Then user should be able to see the personal profile page

Scenario: User edit the work details    
Given user navigate to myaccount page
When user click on modify button on work details tab
And user change their workdetails and click on confirm button
Then user should be able to see the modified workdetails
          
Scenario: User edit the address book details    
Given user navigate to myaccount page
When user click on Address Book tab
And user click on modify button
And user modify their address details and click on confirm button
Then user should be able to see the modified address details
         
Scenario: User Myaccount subscription and purchase
Given user navigate to myaccount page
When user click on subscription and purchase tab
Then user should be able to see the assigned subscription
