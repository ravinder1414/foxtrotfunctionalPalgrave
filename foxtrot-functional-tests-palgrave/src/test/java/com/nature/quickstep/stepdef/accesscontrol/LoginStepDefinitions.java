package com.nature.quickstep.stepdef.accesscontrol;

import static org.junit.Assert.assertTrue;

import com.nature.quickstep.pageobjects.accesscontrol.PalgraveJournalsLoginPage;
import com.nature.quickstep.pageobjects.homepage.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {

    HomePage homePage = new HomePage();
    PalgraveJournalsLoginPage loginPage = new PalgraveJournalsLoginPage();

    @Then("^I should be logged in$")
    public void I_should_be_logged_in() {
        assertTrue(loginPage.isUserLoggedIn());
    }

    @Given("^I have a nature.com account linked to Alhambra$")
    public void I_have_a_nature_account_linked_to_Alhambra() throws Exception {
        homePage.navigateTo();
    }

    @When("^I enter my correct alhambra credentials at palgrave login$")
    public void I_enter_my_correct_alhambra_credentials_at_palgrave_login() throws Exception {
        homePage.lnkLogIn().click();
        loginPage.loginWithCorrectAlhambraUserCredentials();
    }

}
