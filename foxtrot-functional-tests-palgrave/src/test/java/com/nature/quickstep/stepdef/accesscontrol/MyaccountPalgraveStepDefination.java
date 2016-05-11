package com.nature.quickstep.stepdef.accesscontrol;

import com.nature.quickstep.pageobjects.accesscontrol.MyaccountPalgrave;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyaccountPalgraveStepDefination {
    MyaccountPalgrave palgrave = new MyaccountPalgrave();

    @Given("^user navigate to myaccount page$")
    public void user_navigate_to_myaccount_page() throws Throwable {
        palgrave.navigateTo();

    }

    @When("^user enter valid user credentials and click on Login button$")
    public void user_enter_valid_user_credentials_and_click_on_Login_button() throws Throwable {
        palgrave.MyAccount("quickstepuser10@mailinator.com", "qwer1234");

    }

    @Then("^user should be able to see the personal profile page$")
    public void user_should_be_able_to_see_the_personal_profile_page() throws Throwable {
        palgrave.validateProfilePage();

    }

    @When("^user click on modify password button on personal profile tab$")
    public void user_click_on_modify_password_button_on_personal_profile_tab() throws Throwable {
        palgrave.lnkpasswordmodify().click();
    }

    @When("^user modify their password details$")
    public void user_modify_their_password_details() throws Throwable {

        palgrave.fldcurrentpassword().clear();

        palgrave.fldcurrentpassword().sendKeys("qwer1234");

        palgrave.fldnewpassword().clear();

        palgrave.fldnewpassword().sendKeys("qwer4321");

        palgrave.fldconfirmnewpassword().clear();

        palgrave.fldconfirmnewpassword().sendKeys("qwer4321");

    }

    @When("^user click on password change confirm button and also on Return to Homepage button$")
    public void user_click_on_password_change_confirm_button_and_also_on_Return_to_Homepage_button() throws Throwable {
        palgrave.btnpasswordconfirm().click();
        palgrave.btnReturntoHomepage().click();
    }

    @When("^user click on logout button$")
    public void user_click_on_logout_button() throws Throwable {
        palgrave.lnklogout().click();
    }

    @Then("^user should be able to see the login page$")
    public void user_should_be_able_to_see_the_login_page() throws Throwable {
        palgrave.validatefldlogin();

    }

    @Given("^user enter newly valid credentails after changing password and click on login button$")
    public void user_enter_newly_valid_credentails_after_changing_password_and_click_on_login_button() throws Throwable {
        palgrave.MyAccount("quickstepuser10@mailinator.com", "qwer4321");

    }

    @When("^user modify their password details again$")
    public void user_modify_their_password_details_again() throws Throwable {
        palgrave.fldcurrentpassword().clear();

        palgrave.fldcurrentpassword().sendKeys("qwer4321");

        palgrave.fldnewpassword().clear();

        palgrave.fldnewpassword().sendKeys("qwer1234");

        palgrave.fldconfirmnewpassword().clear();

        palgrave.fldconfirmnewpassword().sendKeys("qwer1234");

    }

    @When("^user enter again newly valid credentails after changing password and click on login button$")
    public void user_enter_again_newly_valid_credentails_after_changing_password_and_click_on_login_button()
            throws Throwable {
        palgrave.MyAccount("quickstepuser10@mailinator.com", "qwer1234");

    }

    @When("^user click on modify button on work details tab$")
    public void user_click_on_modify_button_on_work_details_tab() throws Throwable {
        palgrave.lnkworkmodify().click();
    }

    @When("^user change their workdetails and click on confirm button$")
    public void user_change_their_workdetails_and_click_on_confirm_button() throws Throwable {
        palgrave.placeofwork("2");
        palgrave.position("Business Consultant");
        palgrave.fldcompany().clear();
        palgrave.fldcompany().sendKeys("MPS1");
        palgrave.btnworkdetailsconform().click();

    }

    @Then("^user should be able to see the modified workdetails$")
    public void user_should_be_able_to_see_the_modified_workdetails() throws Throwable {
        palgrave.validateplaceofwork();

    }

    @When("^user click on Address Book tab$")
    public void user_click_on_Address_Book_tab() throws Throwable {
        palgrave.lnkAddressBook().click();

    }

    @When("^user click on modify button$")
    public void user_click_on_modify_button() throws Throwable {
        palgrave.lnkAddressbookmodify().click();

    }

    @When("^user modify their address details and click on confirm button$")
    public void user_modify_their_address_details_and_click_on_confirm_button() throws Throwable {
        palgrave.fldaddressline1().clear();

        palgrave.fldaddressline1().sendKeys("340 MPS LTD");

        palgrave.fldaddressline2().clear();

        palgrave.fldaddressline2().sendKeys("udyog vihar phase 4");

        palgrave.fldcity().clear();

        palgrave.fldcity().sendKeys("Gurgaon");

        palgrave.fldstate().clear();

        palgrave.fldstate().sendKeys("Haryana");

        //palgrave.country("IN");

        palgrave.btnaddressconfirm().click();

    }

    @Then("^user should be able to see the modified address details$")
    public void user_should_be_able_to_see_the_modified_address_details() throws Throwable {

    }

    @When("^user click on subscription and purchase tab$")
    public void user_click_on_subscription_and_purchase_tab() throws Throwable {

        palgrave.lnksubscription().click();

    }

    @Then("^user should be able to see the assigned subscription$")
    public void user_should_be_able_to_see_the_assigned_subscription() throws Throwable {
        palgrave.validateSubscriptionPage();

    }

}
