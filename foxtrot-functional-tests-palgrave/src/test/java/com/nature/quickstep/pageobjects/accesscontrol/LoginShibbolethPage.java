package com.nature.quickstep.pageobjects.accesscontrol;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class LoginShibbolethPage extends PageObject {

    private final String contentStr = "";

    @Override
    public boolean isPresent() {
        return false;
    }

    /***
     * Navigates to the Institutional Login Page
     */
    @Override
    public void navigateTo() {
        browser().get(context().getURL("palgrave-journals.com/nams/svc/institutelogin"));
    }

    /**
     * Navigates to the BE Journal Article
     * 
     * @throws Exception
     */
    public void navigateToBE() throws Exception {
        browser().get(context().getURL("palgrave-journals.com/be/journal/v45/n1/full/be200938a.html"));
    }

    /****
     * 
     * @returns link object of Login via your institution
     */
    public WebElement lnkLoginViaYourInstitute() {
        return browser().findElement(By.linkText("Login via your institution"));

    }

    /***
     * 
     * @returns link object of "login" on Journal Login Page
     */
    public WebElement lnkNCBJournalLogin() {
        return browser().findElement(By.id("access-login"));
    }

    /***
     * 
     * @returns link object of instituional access of journal article
     */
    public WebElement lnkShibbolethInstitutionalAccess() {
        return browser().findElement(By.xpath("//*[@id='access-login-institution']"));
    }

    /***
     * This method validates BE Jornal Articlecontent
     */
    public void validateBEContent() {
        assertEquals(contentStr, fldBEContent().getText());
    }

    /**
     * This method facilitates to select country
     * 
     * @param country
     */
    public void fldShibbolethCountry(String country) {
        Select sele = new Select(browser().findElement(By.xpath("//*[@id='loc-select']")));
        sele.selectByVisibleText(country);
    }

    /***
     * 
     * @returns button object of Go on institutional page
     */
    public WebElement btnShibbolethGo() {
        return browser().findElement(By.xpath("//*[@id='login-go']"));
    }

    /**
     * 
     * @returns text box object of Search on institutional page
     */
    public WebElement txtSearchInstitution() {
        return browser().findElement(By.xpath("//*[@id='loc-search']"));
    }

    /***
     * 
     * @returns button object of Search on institutional page
     */
    public WebElement btnSearchButton() {
        return browser().findElement(By.xpath("//*[@id='login-search']"));
    }

    /**
     * 
     * @returns link object of Brunal University on institutional page
     */
    public WebElement lnkShibbolethBrunalUniversity() {
        return browser().findElement(By.linkText("Brunel University"));
    }

    /***
     * This method can be used to login to Brunal University using credentials
     * 
     * @param username
     * @param password
     */
    public void brunalUniversityLogin(String username, String password) {
        txtBrunalUniversityUserName().sendKeys(username);
        txtBrunalUniversityPassword().sendKeys(password);
        btnBrunalUniversityContinue().click();
    }

    /**
     * 
     * @returns text box object of username on Brunal University Login Page
     */
    public WebElement txtBrunalUniversityUserName() {
        return browser().findElement(
                By.xpath("//*[@id='hometext']/div/div[1]" + "/div/form/table/tbody/tr[1]/td[2]/input"));
    }

    /**
     * 
     * @returns text box object of password on Brunal University Login Page
     */
    public WebElement txtBrunalUniversityPassword() {
        return browser().findElement(
                By.xpath("//*[@id='hometext']/div/div[1]" + "/div/form/table/tbody/tr[2]/td[2]/input"));
    }

    /***
     * 
     * @returns button object of Continue on Brunal University Login Page
     */
    public WebElement btnBrunalUniversityContinue() {
        return browser().findElement(
                By.xpath("//*[@id='hometext']/div/div[1]" + "/div/form/table/tbody/tr[3]/td[2]/button"));
    }

    /**
     * 
     * @returns paragraph object Brunal University Journal article content
     */
    public WebElement fldBrunalUniversityContent() {
        return browser().findElement(By.xpath("//*[@id='introduction']/h1/a"));
    }

    /***
     * 
     * @returns error message object of unsuccessful login on Brunal University Login Page
     */
    public WebElement fldBrunalUniversityUnsuccessfulLogin() {
        return browser().findElement(By.xpath("//*[@id='hometext']/div/div[1]/div/p/font"));
    }

    /***
     * validates unsuccessful login of Brunal University
     */
    public void validateBrunalUniversityUnsuccessfuleLogin() {
        assertEquals("Credentials not recognised.", fldBrunalUniversityUnsuccessfulLogin().getText());
    }

    /***
     * 
     * @returns link object LoginViaInstitute on BE Journal article content
     */
    public WebElement lnkBEShibbolethLoginViaInstitute() {
        return browser().findElement(By.xpath("//*[@id='extranav']/div/div[1]/ul/li[4]/p[1]/a"));
    }

    /***
     * 
     * @returns paragraph object on BE Journal article content
     */
    public WebElement fldBEContent() {
        return browser().findElement(By.xpath("//*[@id='articlebody']/p[1]"));
    }

    /***
     * validates institutional Page
     * 
     * @throws Exception
     */
    public void validateInstutionalPage() throws Exception {
        WebDriverUtils.waitForURLToContainSubstring(browser(), "institutelogin");
    }

}
