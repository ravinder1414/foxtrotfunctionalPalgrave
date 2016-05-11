package com.nature.quickstep.pageobjects.accesscontrol;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class MyaccountPalgrave extends PageObject {

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("palgrave-journals.com/nams/svc/myaccount"));

    }

    public void MyAccount(String email, String password) throws Exception {

        ensure().element(By.name("user_id")).seconds(15);
        fldEmailaddress().sendKeys(email);
        fldPassword().sendKeys(password);
        btnLogin().click();

        WebDriverUtils.waitForURLToContainSubstring(browser(), "palgrave-journals.com/nams/svc/myaccount");

    }

    public WebElement fldEmailaddress() {
        return browser().findElement(By.name("user_id"));
    }

    public WebElement fldPassword() {
        return browser().findElement(By.name("passwd"));
    }

    public WebElement btnLogin() {
        return browser()
                .findElement(
                        By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr[3]/td[2]/input"));
    }

    public void validateProfilePage() {

        assertEquals("Your Personal Details", fldProfilePage().getText());
    }

    public WebElement fldProfilePage() {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/"
                + "table/tbody/tr[1]/td/table/tbody/tr/td[1]/p[3]";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));
    }

    public WebElement lnkpasswordmodify() {
        return browser()
                .findElement(
                        By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[2]/tbody/tr[5]/td[3]/a"));
    }

    public WebElement fldcurrentpassword() {

        String elementLocator = "current";
        ensure().element(By.name(elementLocator)).seconds(15);
        return browser().findElement(By.name(elementLocator));
    }

    public WebElement fldnewpassword() {

        return browser().findElement(By.name("password"));

    }

    public WebElement fldconfirmnewpassword() {

        return browser().findElement(By.name("passwordConfirm"));

    }

    public WebElement btnpasswordconfirm() {

        return browser()
                .findElement(
                        By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table[2]/tbody/tr/td/input"));

    }

    public WebElement btnReturntoHomepage() {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/"
                + "table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[5]/tbody/tr/td/a/img";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));

    }

    public WebElement lnklogout() {

        String elementXpath = ".//*[@id='top']/div[1]/div/div[1]/p/a";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));

    }

    public void validatefldlogin() {
        assertEquals("LOGIN", fldlogin().getText());

    }

    public WebElement fldlogin() {

        String elementXpath = ".//*[@id='top']/div[1]/div/div[1]/p/a";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));

    }

    public WebElement lnkworkmodify() {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/"
                + "table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[3]/tbody/tr[5]/td[3]/a";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));

    }

    public void placeofwork(String value) {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/"
                + "table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table[1]/tbody/tr[1]/td[2]/select";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        Select dropdown = new Select(browser().findElement(By.xpath(elementXpath)));
        dropdown.selectByValue(value);

    }

    public void position(String position) {
        Select dropdown = new Select(
                browser()
                        .findElement(
                                By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table[1]/tbody/tr[3]/td[2]/select")));

        dropdown.selectByVisibleText(position);

    }

    public WebElement fldcompany() {

        return browser().findElement(By.name("company"));
    }

    public WebElement btnworkdetailsconform() {

        return browser()
                .findElement(
                        By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table[2]/tbody/tr/td/input"));
    }

    public void validateplaceofwork() {

        assertEquals("Government Institute or Agency", fldposition().getText());
    }

    public WebElement fldposition() {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/"
                + "table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[3]/tbody/tr[1]/td[2]";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));

    }

    public WebElement lnkAddressBook() {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/"
                + "table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[1]/tbody/tr[2]/td[4]/a";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));

    }

    public WebElement lnkAddressbookmodify() {

        return browser()
                .findElement(
                        By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[2]/tbody/tr[13]/td[3]/a"));

    }

    public WebElement fldaddressline1() {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/"
                + "table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table[1]/tbody/tr[3]/td[2]/input";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));
    }

    public WebElement fldaddressline2() {

        return browser()
                .findElement(
                        By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table[1]/tbody/tr[5]/td[2]/input"));

    }

    public WebElement fldcity() {

        return browser()
                .findElement(
                        By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table[1]/tbody/tr[7]/td[2]/input"));

    }

    public WebElement fldstate() {

        return browser()
                .findElement(
                        By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table[1]/tbody/tr[9]/td[2]/input"));

    }

    public void country(String value) {
        Select dropdown = new Select(browser().findElement(By.xpath(".//*[@id='country']")));

        dropdown.selectByValue(value);

    }

    public WebElement btnaddressconfirm() {

        return browser()
                .findElement(
                        By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table[2]/tbody/tr/td/input"));

    }

    public WebElement lnksubscription() {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/"
                + "table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[1]/tbody/tr[2]/td[6]/a";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));
    }

    public WebElement subscriptiondetails() {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/table[2]/tbody/tr[1]/td/"
                + "table/tbody/tr[1]/td/table/tbody/tr/td[1]/p[1]";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));

    }

    public void validateSubscriptionPage() {
        assertEquals("Subscriptions", subscriptiondetails().getText());
    }
}
