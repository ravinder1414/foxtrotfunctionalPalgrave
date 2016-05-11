package com.nature.quickstep.stepdef.accesscontrol;

import com.nature.quickstep.pageobjects.accesscontrol.AthensLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AthensLoginStepDefinitions {
    AthensLoginPage athens = new AthensLoginPage();

    @Given("^I navigate to an access page of an article of 'BP' journal$")
    public void I_navigate_to_an_access_page_of_an_article_of_BP_journal() throws Throwable {
        athens.navigateTo();
        athens.validateAccessPage();

    }

    @When("^I click on 'Login via Athens' link$")
    public void I_click_on_Login_via_Athens_link() throws Throwable {
        athens.clickOnLoginViaAthensLink();
        athens.validateAthensLoginPage();

    }

    @When("^I enter valid Athens credentials and click on login button$")
    public void I_enter_valid_Athens_credentials_and_click_on_login_button() throws Throwable {
        athens.loginUsingAthensAccount("npgpj_qa_access", "sekhar_qa_123");

    }

    @Then("^I should get full access for BP journal$")
    public void I_should_get_full_access_for_BP_journal() throws Throwable {
        athens.validateFullTextContent();

    }

}
