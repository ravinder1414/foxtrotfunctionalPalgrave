package com.nature.quickstep.pageobjects.site;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class SendToFriendPage extends PageObject {

    private final String ARTICLE_URL = "/abm/journal/v11/n2/abs/abm20123a.html";
    private final String FRIEND_EMAIL = "quickstepuser9@mailinator.com";
    private final String SENDER_EMAIL = "quickstepuser4@mailinator.com";

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void navigateTo() {
    }

    public void navigateToABMJournalArticle() throws Exception {
        browser().get(context().getURL("palgrave-journals.com" + ARTICLE_URL));
        validateABMJournalArticle();
    }

    public WebElement linkSendToAFriend() {
        return browser().findElement(By.id("articlenav")).findElement(By.linkText("Send to a friend"));
    }

    public void clickOnSendToAFriendLink() {
        ensure().element(By.linkText("Send to a friend")).seconds(15);
        linkSendToAFriend().click();
    }

    public WebElement inputBoxFriendEmail() {
        return browser().findElement(By.id("email"));
    }

    public WebElement inputBoxSenderEmail() {
        return browser().findElement(By.id("youremail"));
    }

    public WebElement inputBoxSubject() {
        return browser().findElement(By.id("subject"));
    }

    public WebElement btnSendToAFriend() {
        return browser().findElement(By.className("friend"));
    }

    public WebElement fldErrorFriendEmail() {
        return browser().findElement(By.id("content")).findElements(By.tagName("span")).get(1);
    }

    public WebElement fldErrorSenderEmail() {
        return browser().findElement(By.id("content")).findElements(By.tagName("span")).get(2);
    }

    public WebElement fldEmailSentConfirmationMsg() {
        return browser().findElement(By.id("content")).findElement(By.tagName("h1"));
    }

    public WebElement fldFriendEmailConfirmation() {
        return browser().findElement(By.id("content")).findElements(By.tagName("p")).get(3)
                .findElement(By.tagName("a"));
    }

    public WebElement linkBackToArticle() {
        return browser().findElement(By.className("back-to-article"));
    }

    public void clickOnBackToArticleLink() {
        linkBackToArticle().click();
    }

    public void submitIncompleteForm() {
        ensure().element(By.className("friend")).seconds(15);
        btnSendToAFriend().click();
    }

    public void submitCompleteSendToFriendEmailForm() {
        ensure().element(By.className("friend")).seconds(15);
        ensure().element(By.id("email")).seconds(15);
        ensure().element(By.id("youremail")).seconds(15);
        inputBoxFriendEmail().sendKeys(FRIEND_EMAIL);
        inputBoxSenderEmail().sendKeys(SENDER_EMAIL);
        btnSendToAFriend().click();
    }

    public void validateSendToFriendFormPage() throws Exception {
        ensure().element(By.id("subject")).seconds(15);
        assertEquals("WTO accession and equity-based entry modes in Vietnam", inputBoxSubject().getAttribute("value"));
    }

    public void validateSendToFriendErrorMessages() throws Exception {
        assertEquals("Invalid your friend's e-mail address format.", fldErrorFriendEmail().getText());
        assertEquals("Invalid sender e-mail address format.", fldErrorSenderEmail().getText());
        assertEquals(context().getURL("palgrave-journals.com/foxtrot/svc/mailafriend?file=" + ARTICLE_URL), browser()
                .getCurrentUrl());
    }

    public void validateEmailSentConfirmation() throws Exception {
        assertEquals("Confirmation your email has been sent", fldEmailSentConfirmationMsg().getText());
        assertEquals(FRIEND_EMAIL, fldFriendEmailConfirmation().getText());
        assertEquals(context().getURL("palgrave-journals.com/foxtrot/svc/mailafriend?file=" + ARTICLE_URL), browser()
                .getCurrentUrl());

    }

    public void validateABMJournalArticle() throws Exception {
        assertEquals(context().getURL("palgrave-journals.com" + ARTICLE_URL), browser().getCurrentUrl());
    }

}
