package com.nature.quickstep.stepdef.site;

import com.nature.quickstep.pageobjects.accesscontrol.PalgraveJournalsLoginPage;
import com.nature.quickstep.pageobjects.site.SendToFriendPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendToFriendStepDefinitions {
    SendToFriendPage sendToFriendPage = new SendToFriendPage();
    PalgraveJournalsLoginPage palgraveJournalsLoginPage = new PalgraveJournalsLoginPage();

    @Given("^I am a guest user on an 'ABM' journal article$")
    public void I_am_a_guest_user_on_an_ABM_journal_article() throws Exception {
        sendToFriendPage.navigateToABMJournalArticle();
    }

    @When("^I click on send to a friend link$")
    public void I_click_on_send_to_a_friend_link() {
        sendToFriendPage.clickOnSendToAFriendLink();
    }

    @When("^Enter the valid credentials on login page$")
    public void Enter_the_valid_credentials_on_login_page() {
        palgraveJournalsLoginPage.loginWithCorrectCredentials();
    }

    @Then("^I should see a SEND TO A FRIEND form page$")
    public void I_should_see_a_SEND_TO_A_FRIEND_form_page() throws Exception {
        sendToFriendPage.validateSendToFriendFormPage();
        // This is for logout the user
        palgraveJournalsLoginPage.logOutUser();
    }

    @Given("^I am a logged in user on an 'ABM' journal article$")
    public void I_am_a_logged_in_user_on_an_ABM_journal_article() throws Exception {
        palgraveJournalsLoginPage.navigateTo();
        palgraveJournalsLoginPage.loginWithCorrectCredentials();
        sendToFriendPage.navigateToABMJournalArticle();
    }

    @Given("^I am on SEND TO A FRIEND form page$")
    public void I_am_on_SEND_TO_A_FRIEND_form_page() throws Exception {
        palgraveJournalsLoginPage.navigateTo();
        palgraveJournalsLoginPage.loginWithCorrectCredentials();
        sendToFriendPage.navigateToABMJournalArticle();
        sendToFriendPage.clickOnSendToAFriendLink();
        sendToFriendPage.validateSendToFriendFormPage();
    }

    @When("^I submit the send email form without filling mandatory fields$")
    public void I_submit_the_send_email_form_without_filling_mandatory_fields() {
        sendToFriendPage.submitIncompleteForm();
    }

    @Then("^I should see error messages on send email to friend form$")
    public void I_should_see_error_messages_on_send_email_to_friend_form() throws Exception {
        sendToFriendPage.validateSendToFriendErrorMessages();
        // This is for logout the user
        palgraveJournalsLoginPage.logOutUser();
    }

    @When("^I fill up required information and submit the send email form$")
    public void I_fill_up_required_information_and_submit_the_send_email_form() {
        sendToFriendPage.submitCompleteSendToFriendEmailForm();
    }

    @Then("^I should see email confirmation message$")
    public void I_should_see_email_confirmation_message() throws Exception {
        sendToFriendPage.validateEmailSentConfirmation();
        // This is for logout the user
        sendToFriendPage.clickOnBackToArticleLink();
        palgraveJournalsLoginPage.logOutUser();
    }

}
