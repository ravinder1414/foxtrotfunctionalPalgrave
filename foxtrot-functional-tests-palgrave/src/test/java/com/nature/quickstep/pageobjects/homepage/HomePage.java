package com.nature.quickstep.pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class HomePage extends PageObject {

    @Override
    public void navigateTo() {
        // TODO Auto-generated method stub
        browser().get(context().getURL("palgrave-journals.com/"));
    }

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * This method validates weather we are on palgrave-journals.com home page or not
     * 
     * @throws Exception
     */
    public void validateNatureHomePage() throws Exception {
        WebDriverUtils.waitForURLToContainSubstring(browser(), "palgrave-journals.com");
    }

    /**
     * Returns a handle to the log in link.
     * 
     * @return <code>WebElement</code> as a handle to the log in link.
     */
    public WebElement lnkLogIn() {
        return browser().findElement(By.className("login"));
    }
}
