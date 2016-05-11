@cleanbrowser @test @staging @live

Feature: Site Account Admin Usage Reports via Palgrave Slams
 
Scenario: As a palgrave-journals.com site account admin user I should be able to view usage report through SLAMS 
Given I am a SLAM user on palgrave-journals.com and I navigate to My Site Account 
When I navigate to Statistics page in Palgrave SLAMS
And I click on link Palgrave Macmillan Journals usage reports 
Then I should redirect to new MpsInsight site to see palgrave Usage reports
 
Scenario: As a palgrave-journals.com site account admin user I should be able to view usage report through SLAMS 
Given I am a SLAM user on palgrave-journals.com and I navigate to My Site Account 
When I navigate to Statistics page in Palgrave SLAMS
And I click on link Nature Publishing Group Usage Reports 
Then I should redirect to new MpsInsight site to see nature Usage reports