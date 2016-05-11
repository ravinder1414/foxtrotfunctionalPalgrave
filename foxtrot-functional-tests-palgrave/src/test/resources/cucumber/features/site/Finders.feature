@cleanbrowser @test @staging @live
Feature: Browse doifinder, uidfinder, articlefinder, abstractpagefinder, pdffinder urls

Scenario Outline: As a user I want to use palgrave-journals.com finders url to browse to an article page
Given I am on palgrave-journals.com
When I navigate to finder "<finder>" for doi "<doi>"
Then I should see the palgrave-journals article "<article>"

Examples:

| finder             | doi                | article                                |
| doifinder          | 10.1057/abm.2012.3 | abm/journal/v11/n2/full/abm20123a.html |
| uidfinder          | 10.1057/abm.2012.3 | abm/journal/v11/n2/full/abm20123a.html |
| articlefinder      | 10.1057/abm.2012.3 | abm/journal/v11/n2/full/abm20123a.html |
| abstractpagefinder | 10.1057/abm.2012.3 | abm/journal/v11/n2/abs/abm20123a.html  |
