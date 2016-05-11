package com.nature.quickstep.pageobjects.site;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class SlamsStatisticsPageObject extends PageObject {

    private static String NPG_USAGE_REPORTS_URL = "Nature Publishing Group Usage Reports";
    private static String PALGRAVE_USAGE_REPORTS_URL = "Palgrave Macmillan Journals usage reports";

    @Override
    public void navigateTo() {
        browser().get(context().getURL("palgrave-journals.com/nams/svc/mysiteaccount"));

    }

    public void loginSlam(String email, String password) throws Exception {

        fldEmailaddress().sendKeys(email);
        fldPassword().sendKeys(password);
        btnLogin().click();
        WebDriverUtils.waitForURLToContainSubstring(browser(), "palgrave-journals.com/nams/svc/mysiteaccount");
    }

    public void clickStatics() throws Exception {
        lnkStatics().click();
        WebDriverUtils.waitForURLToContainSubstring(browser(),
                "palgrave-journals.com/nams/svc/mysiteaccount/show/statistics");
    }

    public WebElement fldEmailaddress() {
        ensure().element(By.id("userid")).seconds(15);
        return browser().findElement(By.id("userid"));
    }

    public WebElement fldPassword() {
        ensure().element(By.id("password")).seconds(15);
        return browser().findElement(By.id("password"));
    }

    public void clickNatureUsageReport() throws Exception {
        lnkNatureUsageReport().click();
    }

    public void clickPalgraveUsageReport() throws Exception {
        lnkPalgraveUsageReport().click();
    }

    public WebElement btnLogin() {
        return browser().findElement(By.id("loginbtn"));

    }

    public void validateNatureUrl() {
        String currentUrl = browser().getCurrentUrl();
        assertEquals("https://www.mpsinsight.com/npg", currentUrl);
    }

    public void validatePalgraveUrl() {
        String currentUrl = browser().getCurrentUrl();
        assertEquals("https://www.mpsinsight.com/pal", currentUrl);
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    private WebElement lnkNatureUsageReport() throws Exception {
        ensure().element(ByLinkText.linkText(NPG_USAGE_REPORTS_URL)).seconds(15);
        return browser().findElement(ByLinkText.linkText(NPG_USAGE_REPORTS_URL));
    }

    private WebElement lnkPalgraveUsageReport() throws Exception {
        ensure().element(ByLinkText.linkText(PALGRAVE_USAGE_REPORTS_URL)).seconds(15);
        return browser().findElement(ByLinkText.linkText(PALGRAVE_USAGE_REPORTS_URL));
    }

    private WebElement lnkStatics() throws Exception {
        ensure().element(ByLinkText.linkText("Statistics")).seconds(15);
        return browser().findElement(ByLinkText.linkText("Statistics"));
    }

}
