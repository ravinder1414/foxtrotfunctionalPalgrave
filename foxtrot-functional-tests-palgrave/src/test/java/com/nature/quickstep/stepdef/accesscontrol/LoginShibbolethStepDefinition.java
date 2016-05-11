package com.nature.quickstep.stepdef.accesscontrol;

import static org.junit.Assert.assertEquals;

import com.nature.quickstep.pageobjects.accesscontrol.LoginShibbolethPage;
import com.nature.quickstep.pageobjects.accesscontrol.PalgraveJournalsLoginPage;
import com.nature.quickstep.pageobjects.homepage.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginShibbolethStepDefinition {
    HomePage home = new HomePage();
    PalgraveJournalsLoginPage plogin = new PalgraveJournalsLoginPage();
    LoginShibbolethPage lshib = new LoginShibbolethPage();

    @Given("^I navigate to palgrave-journals.com login page$")
    public void I_navigate_to_palgrave_journals_com_login_page() throws Throwable {
        plogin.navigateTo();
    }

    @When("^click on 'Login Via Institute' link$")
    public void click_on_Login_Via_Institute_link() throws Throwable {
        plogin.lnkLoginViaInstitute().click();
    }

    @Then("^it navigates to the instituion login page$")
    public void it_navigates_to_the_instituion_login_page() throws Throwable {
        lshib.validateInstutionalPage();
    }

    @Given("^I navigate to palgrave-journals institutional login page$")
    public void I_navigate_to_palgrave_journals_institutional_login_page() throws Throwable {
        lshib.navigateTo();
    }

    @Given("^select country - United Kingdom$")
    public void select_country_United_Kingdom() throws Throwable {
        lshib.fldShibbolethCountry("United Kingdom");
    }

    @When("^click 'Go' button$")
    public void click_Go_button() throws Throwable {
        lshib.btnShibbolethGo();
    }

    @Then("^it navigates to the instituion Country login page$")
    public void it_navigates_to_the_instituion_Country_login_page() throws Throwable {

    }

    @When("^I type Brunel University' name in search for an institution$")
    public void I_type_Brunel_University_name_in_search_for_an_institution() throws Throwable {
        lshib.txtSearchInstitution().sendKeys("Brunel University");
    }

    @When("^click 'Search' button$")
    public void click_Search_button() throws Throwable {
        lshib.btnSearchButton().click();
    }

    @Then("^'Brunel University' appears in search list$")
    public void _Brunel_University_appears_in_search_list() throws Throwable {
        assertEquals("Brunel University", lshib.lnkShibbolethBrunalUniversity().getText());
    }

    @When("^I click the 'Brunel University' link$")
    public void I_click_the_Brunel_University_link() throws Throwable {
        lshib.lnkShibbolethBrunalUniversity().click();
    }

    @When("^enter 'Brunel University' credentials and click 'continue' button$")
    public void enter_Brunel_University_credentials_and_click_continue_button() throws Throwable {
        lshib.brunalUniversityLogin("lbsrshib", "Vn3wt8fh");
    }

    @Then("^it navigates palgrave-journals.com page$")
    public void it_navigates_palgrave_journals_com_page() throws Throwable {
        home.validateNatureHomePage();
    }

    @Given("^I go to BE journal and click View Full Access$")
    public void I_go_to_BE_journal_and_click_View_Full_Access() throws Throwable {
        lshib.navigateToBE();
        lshib.lnkLoginViaYourInstitute().click();
    }

    @When("^I select country from drop down and click go button$")
    public void I_select_country_from_drop_down_and_click_go_button() throws Throwable {
        lshib.fldShibbolethCountry("United Kingdom");
        lshib.btnShibbolethGo().click();
    }

    @When("^enter invalid 'Brunel University' credentials and click 'continue' button$")
    public void enter_invalid_Brunel_University_credentials_and_click_continue_button() throws Throwable {
        lshib.brunalUniversityLogin("lbsrshib123", "Vn3wt8fh");
    }

    @Then("^Brunel University login should be unsuccessful$")
    public void Brunel_University_login_should_be_unsuccessful() throws Throwable {
        lshib.validateBrunalUniversityUnsuccessfuleLogin();
    }

    @Then("^This should appear in header Full text access provided to Brunal University by Central Library$")
    public void This_should_appear_in_header_Full_text_access_provided_to_Brunal_University_by_Central_Library()
            throws Throwable {
        lshib.validateBEContent();
    }

}
