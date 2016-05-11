package com.nature.quickstep.pageobjects.accesscontrol;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class AthensLoginPage extends PageObject {

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("palgrave-journals.com/bp/journal/v4/n4/full/bp200924a.html"));
    }

    public void validateAccessPage() {
        assertEquals("Access", fldAccess().getText());
    }

    public WebElement fldAccess() {

        return browser().findElement(By.id("content")).findElement(By.tagName("h1"));

    }

    public void clickOnLoginViaAthensLink() {
        lnkLoginViaAthens().click();

    }

    public WebElement lnkLoginViaAthens() {
        ensure().element(By.linkText("Login via Athens")).seconds(15);
        return browser().findElement(By.linkText("Login via Athens"));

    }

    public void validateAthensLoginPage() {
        assertEquals("Authentication Point", fldAthensLoginpage().getText());
    }

    public WebElement fldAthensLoginpage() {
        ensure().element(By.xpath(".//*[@id='c2']/div/div[2]/div/h2/big")).seconds(15);
        return browser().findElement(By.xpath(".//*[@id='c2']/div/div[2]/div/h2/big"));
    }

    public void loginUsingAthensAccount(String username, String password) throws Exception {
        fldUsername().sendKeys(username);
        fldPassword().sendKeys(password);
        btnLogin().click();

        WebDriverUtils.waitForURLToContainSubstring(browser(), "palgrave-journals.com");
    }

    public WebElement fldUsername() {
        ensure().element(By.id("ath_uname")).seconds(15);
        return browser().findElement(By.id("ath_uname"));
    }

    public WebElement fldPassword() {
        ensure().element(By.id("ath_passwd")).seconds(15);
        return browser().findElement(By.id("ath_passwd"));
    }

    public WebElement btnLogin() {
        ensure().element(By.name("submit")).seconds(15);
        return browser().findElement(By.name("submit"));
    }

    public void validateFullTextContent() {
        assertEquals("Anatomy of Crisis", fldFullTextContent().getText());
    }

    public WebElement fldFullTextContent() {

        return browser().findElement(By.id("Anatomy-of-Crisis")).findElement(By.tagName("h3"));

    }
}
