package com.nature.quickstep.pageobjects.accesscontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class RegistrationEalertPage extends PageObject {

    @Override
    public void navigateTo() {
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement continuepage2Palgrave() {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/"
                + "tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/input[2]";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));
    }

    public WebElement confirmPalgrave() {

        String elementXpath = "html/body/table[2]/tbody/tr[2]/td[3]/table/"
                + "tbody/tr/td/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/form/table/tbody/tr/td[1]/p[2]/table/tbody/tr[27]/td/input";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));
    }

}
