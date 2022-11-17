package com.availity.bdd.steps;

import com.availity.bdd.pages.AvailityLoginPage;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigateTo {
    private final Logger LOG = LoggerFactory.getLogger(NavigateTo.class);
    AvailityLoginPage availityLoginPage;


    @Step("Login to Availity home page")
    public void theAvilityLoginPage() {
        LOG.info("Open Availity Application");
        availityLoginPage.open();
        LOG.info("Enter User Details");
        availityLoginPage.enterUserName();
        availityLoginPage.enterPassword();
        LOG.info("Click on SignOn");
        availityLoginPage.clickLogin();
    }
}
