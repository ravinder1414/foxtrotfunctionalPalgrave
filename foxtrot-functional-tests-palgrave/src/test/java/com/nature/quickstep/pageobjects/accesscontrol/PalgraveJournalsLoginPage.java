package com.nature.quickstep.pageobjects.accesscontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class PalgraveJournalsLoginPage extends PageObject {
    /**
     * Navigates to the Palgrave-Journals Login homepage.
     * 
     * @throws Exception
     */
    @Override
    public void navigateTo() {
        browser().get(context().getURL("palgrave-journals.com/foxtrot/svc/login"));
    }

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * @return user name text box WebElement
     */
    public WebElement userName() {
        return browser().findElement(By.id("login-username"));
    }

    /**
     * @return Password text box WebElement
     */
    public WebElement password() {
        return browser().findElement(By.id("login-password"));
    }

    /**
     * @return Register login button WebElement
     */
    public WebElement btnLogin() {
        return browser().findElement(By.id("login-submit"));
    }

    /**
     * Returns a handle to the log out link.
     * 
     * @return <code>WebElement</code> as a handle to the log out link.
     */
    public WebElement lnkLogOut() {
        return browser().findElement(By.className("logoff"));
    }

    public void loginWithCorrectAlhambraUserCredentials() {
        userName().sendKeys("quickstepuser5@mailinator.com");
        password().sendKeys("qwer1234");
        btnLogin().click();
    }

    public boolean isUserLoggedIn() {
        return (lnkLogOut() != null);
    }

    /**
     * Provides a handle to the "Login via Athens" link on the login screen.
     * 
     * @return A <code>WebElement</code> as a handle to the "Login via Athens"
     *         link.
     */
    public WebElement lnkAthensLogin() {

        return browser().findElement(By.linkText("Login via Athens"));
    }

    /**
     * Provides a handle to the "Login via Institute" link on the login screen.
     * 
     * @return A <code>WebElement</code> as a handle to the "Login via Institute"
     *         link.
     */
    public WebElement lnkLoginViaInstitute() {

        return browser().findElement(By.linkText("Login via your institution"));
    }

    public void loginWithCorrectCredentials() {
        ensure().element(By.id("login-username")).seconds(15);
        ensure().element(By.id("login-password")).seconds(15);
        ensure().element(By.id("login-submit")).seconds(15);
        userName().sendKeys("quickstepuser4@mailinator.com");
        password().sendKeys("qwer1234");
        btnLogin().click();
    }

    public void logOutUser() {
        if (isUserLoggedIn()) {
            lnkLogOut().click();
        }
    }

}
