package com.nature.quickstep.stepdef.site;

import com.nature.quickstep.pageobjects.site.SlamsStatisticsPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SlamsStatisticsStepDefinition {

    SlamsStatisticsPageObject slamsStatisticsObj = new SlamsStatisticsPageObject();

    @Given("^I am a SLAM user on palgrave-journals.com and I navigate to My Site Account$")
    public void I_am_a_SLAM_user_on_palgrave_journals_com_and_I_navigate_to_My_Site_Account() throws Throwable {
        slamsStatisticsObj.navigateTo();
        slamsStatisticsObj.loginSlam("att", "qwer1234");
    }

    @When("^I navigate to Statistics page in Palgrave SLAMS$")
    public void I_navigate_to_Statistics_page_in_Palgrave_SLAMS() throws Throwable {
        slamsStatisticsObj.clickStatics();
    }

    @When("^I click on link Palgrave Macmillan Journals usage reports$")
    public void I_click_on_link_Palgrave_Macmillan_Journals_usage_reports() throws Throwable {
        slamsStatisticsObj.clickPalgraveUsageReport();
    }

    @Then("^I should redirect to new MpsInsight site to see palgrave Usage reports$")
    public void I_should_redirect_to_new_MpsInsight_site_to_see_palgrave_Usage_reports() throws Throwable {
        slamsStatisticsObj.validatePalgraveUrl();
    }

    @When("^I click on link Nature Publishing Group Usage Reports$")
    public void I_click_on_link_Nature_Publishing_Group_Usage_Reports() throws Throwable {
        slamsStatisticsObj.clickNatureUsageReport();
    }

    @Then("^I should redirect to new MpsInsight site to see nature Usage reports$")
    public void I_should_redirect_to_new_MpsInsight_site_to_see_nature_Usage_reports() throws Throwable {
        slamsStatisticsObj.validateNatureUrl();
    }

}
