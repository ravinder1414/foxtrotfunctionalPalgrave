package com.nature.quickstep.stepdef.site;

import com.nature.quickstep.pageobjects.site.FindersPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindersStepDefinitions {

    FindersPage findersPage = new FindersPage();

    @Given("^I am on palgrave-journals.com$")
    public void I_am_on_palgrave_journals() {
    }

    @When("^I navigate to finder \"([^\"]*)\" for doi \"([^\"]*)\"$")
    public void I_navigate_to_finder_url_with_doi(String finder, String doi) throws Throwable {
        findersPage.navigateToFinder(finder, doi);

    }

    @Then("^I should see the palgrave-journals article \"([^\"]*)\"$")
    public void I_should_see_the_palgrave_journals_article(String article) throws Throwable {
        findersPage.verifyArticlePage(article);
    }

}
