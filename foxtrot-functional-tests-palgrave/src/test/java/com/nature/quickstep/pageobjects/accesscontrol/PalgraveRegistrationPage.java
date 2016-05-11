package com.nature.quickstep.pageobjects.accesscontrol;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nature.quickstep.pageobjects.PageObject;

public class PalgraveRegistrationPage extends PageObject {

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("palgrave-journals.com/register"));
    }

    final long rnum = randomNumber();
    String email = "quickstep" + rnum + "@mailinator.com";

    public void completeStep1Registration() {

        ensure().element(By.name("email")).seconds(15);
        emailPalgrave().sendKeys(email);
        confirmEmailPalgrave().sendKeys(email);
        passwordPalgrave().sendKeys("password");
        confirmPasswordPalgrave().sendKeys("password");

        name1Palgrave().sendKeys("Cucumber");
        name2Palgrave().sendKeys("Jvm" + rnum);

        palceOfWorkPalgrave("Other");
        positionPalgrave("Other");
        companyPalgrave().sendKeys("TEST");
    }

    public WebElement emailPalgrave() {
        return browser().findElement(By.name("email"));
    }

    public WebElement confirmEmailPalgrave() {
        return browser().findElement(By.name("emailConfirm"));
    }

    public WebElement passwordPalgrave() {
        return browser().findElement(By.name("password"));
    }

    public WebElement confirmPasswordPalgrave() {
        return browser().findElement(By.name("passwordConfirm"));
    }

    public WebElement name1Palgrave() {
        return browser().findElement(By.name("firstname"));
    }

    public WebElement name2Palgrave() {
        return browser().findElement(By.name("lastname"));
    }

    public void palceOfWorkPalgrave(String workplace) {
        Select sele = new Select(browser().findElement(By.name("place")));
        sele.selectByVisibleText(workplace);
    }

    public void positionPalgrave(String position) {
        Select sele = new Select(browser().findElement(By.name("position")));
        sele.selectByVisibleText(position);
    }

    public WebElement companyPalgrave() {
        return browser().findElement(By.name("company"));
    }

    public WebElement continuePalgrave() {

        String elementSelector = "input[type=\"image\"]";
        ensure().element(By.cssSelector(elementSelector)).seconds(15);
        return browser().findElement(By.cssSelector(elementSelector));
    }

    public long randomNumber() {
        Date dt = new Date();
        long milliseconds = dt.getTime();
        return milliseconds;
    }

}
