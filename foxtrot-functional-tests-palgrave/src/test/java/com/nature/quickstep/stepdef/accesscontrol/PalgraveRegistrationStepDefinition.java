package com.nature.quickstep.stepdef.accesscontrol;

import com.nature.quickstep.pageobjects.accesscontrol.PalgraveRegistrationPage;
import com.nature.quickstep.pageobjects.accesscontrol.RegistrationComplete;
import com.nature.quickstep.pageobjects.accesscontrol.RegistrationEalertPage;
import com.nature.quickstep.pageobjects.homepage.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PalgraveRegistrationStepDefinition {

    HomePage homePage = new HomePage();
    PalgraveRegistrationPage regPage = new PalgraveRegistrationPage();
    RegistrationEalertPage regEalertPage = new RegistrationEalertPage();
    RegistrationComplete regComplete = new RegistrationComplete();

    @Given("^I have no account on palgrave-journals.com$")
    public void I_have_no_account_on_palgrave_journals_com() throws Throwable {
        homePage.navigateTo();
    }

    @When("^I fill up information required on personal detail page$")
    public void I_fill_up_information_required_on_personal_detail_page() throws Throwable {
        regPage.navigateTo();
        regPage.completeStep1Registration();
        regPage.continuePalgrave().click();
    }

    @When("^I fill up Ealerts and confirm the registration$")
    public void I_fill_up_Ealerts_and_confirm_the_registration() throws Throwable {
        Thread.sleep(5000);
        regEalertPage.continuepage2Palgrave().click();
        regEalertPage.confirmPalgrave().click();
    }

    @Then("^I should see a registration successful message$")
    public void I_should_see_a_registration_successful_message() throws Throwable {
        regComplete.validateRegistrationCompleteMsg();
    }
}
