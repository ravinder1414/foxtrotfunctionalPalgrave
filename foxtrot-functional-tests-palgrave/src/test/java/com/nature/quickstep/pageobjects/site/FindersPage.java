package com.nature.quickstep.pageobjects.site;

import static org.junit.Assert.assertEquals;

import com.nature.quickstep.pageobjects.PageObject;

public class FindersPage extends PageObject {

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void navigateTo() {
        // TODO Auto-generated method stub

    }

    public void navigateToFinder(String finder, String doi) throws Exception {
        browser().get(context().getURL("palgrave-journals.com/" + finder + "/" + doi));
    }

    public void verifyArticlePage(String article) throws Exception {
        assertEquals(context().getURL("palgrave-journals.com/" + article), browser().getCurrentUrl());
    }

}
